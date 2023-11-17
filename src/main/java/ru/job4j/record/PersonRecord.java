package ru.job4j.record;

public record PersonRecord(String name, int age) {
    private static int maxAge = 100;

    public PersonRecord {
        if (age > 101) {
            throw new IllegalArgumentException("Возраст должен быть меньше 101");
        }
    }

    public static int getMaxAge() {
        return maxAge;
    }

    public void info() {
        System.out.println("Напечатать информцию");
    }

    @Override
    public String toString() {
        return "PersonRecord{"
                + "name='" + name + '\''
                + ", age=" + age
                + '}';
    }
}
