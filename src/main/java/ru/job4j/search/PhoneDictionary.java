package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> predicateName = name -> name.getName().contains(key);
        Predicate<Person> predicateSurname = surname -> surname.getSurname().contains(key);
        Predicate<Person> predicatePhone = phone -> phone.getPhone().contains(key);
        Predicate<Person> predicateAddress = address -> address.getAddress().contains(key);
        Predicate<Person> combine = predicateName
                .or(predicateSurname)
                .or(predicatePhone)
                .or(predicateAddress);
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
