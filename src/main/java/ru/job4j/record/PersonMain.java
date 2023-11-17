package ru.job4j.record;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Елена", 18);
        System.out.println("Имя: " + person.getName() + ", Возраст: " + person.getAge());
        System.out.println(person);
        PersonRecord record = new PersonRecord("Руслан", 31);
        System.out.println("Имя: " + record.name() + ", Возраст: " + record.age());
        System.out.println(record);
        PersonRecord personRecord = new PersonRecord("Руслан", 31);
        System.out.println(record.equals(personRecord));
        PersonRecord newRecord = new PersonRecord(record.name(), 20);
    }
}
