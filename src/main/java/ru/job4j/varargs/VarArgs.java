package ru.job4j.varargs;

public class VarArgs {

    public static String text(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String s : strings) {
            builder.append(s);
        }
        return builder + " - Колличество соединенных элементов: " + strings.length;
    }

    public static String text(int z, String... strings) {
        StringBuilder builder = new StringBuilder();
        builder.append(z);
        for (String s : strings) {
            builder.append(s);
        }
        return builder.toString();
    }

    public static String text(int x, int y, Object... objects) {
        StringBuilder builder = new StringBuilder();
        builder.append(x);
        builder.append(y);
        for (Object o : objects) {
            builder.append(o);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(text("Hello, ", "Java! ", "Hello,", " Word!"));
        System.out.println(text(8, " Java"));
        System.out.println(text(12, 36, " Java", 'c', 5));
    }
}
