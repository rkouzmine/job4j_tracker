package ru.job4j.exercises.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterObject {

    public static class User {

        private String name;

        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "User{"
                    + "name='" + name + '\''
                    + ", age=" + age
                    + '}';
        }
    }

    public static List<User> filter(List<User> users) {
        return users.stream()
                .filter(n -> n.getName().startsWith("B"))
                .filter(n -> n.getAge() > 18)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Bob", 20));
        users.add(new User("Pavel", 18));
        users.add(new User("Maria", 16));
        users.add(new User("Alex", 21));
        users.add(new User("Bobby", 25));
        users.add(new User("Tom", 43));

        System.out.println(filter(users));
    }
}