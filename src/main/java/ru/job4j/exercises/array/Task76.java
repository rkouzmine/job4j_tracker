package ru.job4j.exercises.array;

public class Task76 {
    public static void array(int[] arr) {
        int count5 = 0, count4 = 0, count3 = 0, count2 = 0, count1 = 0;
        for (int num : arr) {
            switch (num) {
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    break;
                default:
                    break;
            }
        }
        System.out.printf("5: %d, 4: %d, 3: %d, 2: %d, 1: %d\n",
                count5, count4, count3, count2, count1);
    }
}