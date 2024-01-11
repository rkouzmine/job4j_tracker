package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class PhoneDictionaryTest {

    @Test
    void whenFindByName() {
        var phone = new PhoneDictionary();
        phone.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phone.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    void whenFindBySurname() {
        var phone = new PhoneDictionary();
        phone.add(
                new Person("Ruslan", "Kuzmin", "812585", "Saint-Petersburg")
        );
        ArrayList<Person> persons = phone.find("Kuzmin");
        assertThat(persons.get(0).getSurname()).isEqualTo("Kuzmin");
    }

    @Test
    void whenFindByPhone() {
        var phone = new PhoneDictionary();
        phone.add(
                new Person("Ruslan", "Kuzmin", "812585", "Saint-Petersburg")
        );
        ArrayList<Person> persons = phone.find("812159");
        assertThat(persons).isEmpty();
    }

    @Test
    void whenFindByAddress() {
        var phone = new PhoneDictionary();
        phone.add(
                new Person("Ruslan", "Kuzmin", "812585", "Saint-Petersburg")
        );
        ArrayList<Person> persons = phone.find("Moscow");
        assertThat(persons).isEmpty();
    }
}