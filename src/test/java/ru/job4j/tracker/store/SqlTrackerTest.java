package ru.job4j.tracker.store;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.SqlTracker;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static org.assertj.core.api.Assertions.*;

public class SqlTrackerTest {

    private static Connection connection;

    @BeforeAll
    public static void initConnection() {
        try (InputStream in = SqlTracker.class.getClassLoader().getResourceAsStream(
                "db/liquibase_test.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            connection = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")

            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @AfterAll
    public static void closeConnection() throws SQLException {
        connection.close();
    }

    @AfterEach
    public void wipeTable() throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("delete from items")) {
            statement.execute();
        }
    }

    @Test
    public void whenSaveItemAndFindByGeneratedIdThenMustBeTheSame() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("item");
        tracker.add(item);
        assertThat(tracker.findById(item.getId())).isEqualTo(item);
    }

    @Test
    public void whenReplaceItemThenReturnTrue() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("item");
        tracker.add(item);
        assertThat(tracker.replace(item.getId(), new Item("item_test"))).isTrue();
    }

    @Test
    public void whenDeleteItemThenTrackerIsEmpty() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("item");
        tracker.add(item);
        tracker.delete(item.getId());
        assertThat(tracker.findAll()).isEmpty();
    }

    @Test
    public void whenFindAllThenReturnAllItems() {
        SqlTracker tracker = new SqlTracker(connection);
        List<Item> items = new ArrayList<>();
        Item itemFirst = new Item("itemFirst");
        Item itemSecond = new Item("itemSecond");
        Item itemThird = new Item("itemThird");
        tracker.add(itemFirst);
        tracker.add(itemSecond);
        tracker.add(itemThird);
        items.add(itemFirst);
        items.add(itemSecond);
        items.add(itemThird);
        assertThat(tracker.findAll()).isEqualTo(items);
    }

    @Test
    public void whenFindByNameThenReturnMatchingItems() {
        SqlTracker tracker = new SqlTracker(connection);
        List<Item> items = new ArrayList<>();
        Item item = new Item("item");
        tracker.add(item);
        items.add(item);
        assertThat(tracker.findByName(item.getName())).isEqualTo(items);
    }

    @Test
    public void whenFindByIdThenReturnCorrectItem() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("item");
        tracker.add(item);
        assertThat(tracker.findById(item.getId())).isEqualTo(item);
    }

}