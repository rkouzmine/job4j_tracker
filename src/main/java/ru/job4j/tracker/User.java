package ru.job4j.tracker;

public class User {
    private int id;
    private String username;
    private String passport;

    public User(int id, String username, String passport) {
        this.id = id;
        this.username = username;
        this.passport = passport;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassport() {
        return passport;
    }

    @Override
    public String toString() {
        return "User{"
                + "id=" + id
                + ", username='" + username + '\''
                + ", passport='" + passport + '\''
                + '}';
    }
}
