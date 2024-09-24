package ru.job4j.exercises.condition;

import java.util.ArrayList;
import java.util.List;

public class Task54 {
    public static void transform(int number) {
        String strNum = String.valueOf(Math.abs(number));
        List<Integer> list = new ArrayList<>();
        if (number % 2 == 0) {
            for (char ch : strNum.toCharArray()) {
                int num = Character.getNumericValue(ch);
                if (num % 2 == 0) {
                    if (num < 9) {
                        list.add(num + 1);
                    } else {
                        list.add(num);
                    }
                } else if (num % 2 != 0) {
                    if (num > 0) {
                        list.add(num - 1);
                    } else {
                        list.add(num);
                    }
                }
            }
        } else {
            for (char ch : strNum.toCharArray()) {
                int num = Character.getNumericValue(ch);
                if (num % 2 == 0) {
                    if (num > 0) {
                        list.add(num - 1);
                    } else {
                        list.add(num);
                    }
                } else if (num % 2 != 0) {
                    if (num < 9) {
                        list.add(num + 1);
                    } else {
                        list.add(num);
                    }
                }
            }
        }
        if (number < 0) {
            System.out.print("-");
        }
        if (list.get(0) == 0) {
            for (int i = 1; i < list.size(); i++) {
                System.out.print(list.get(i));
            }
            System.out.println();
        } else {
            for (int num : list) {
                System.out.print(num);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        transform(222); /* 333 */
        transform(390); /* 281*/
        transform(309); /* 409 */
        transform(-109); /*-209 */
        transform(100); /* 11 */
    }
}