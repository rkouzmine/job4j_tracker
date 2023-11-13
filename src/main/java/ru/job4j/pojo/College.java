package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Роман Готовченко");
        student.setGroup("i81430");
        student.setDate(2013);

        System.out.println(student.getFullName() + " поступил в группу "
                + student.getGroup() + " в " + student.getDate() + " году");
    }
}