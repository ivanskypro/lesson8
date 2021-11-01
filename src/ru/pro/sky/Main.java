package ru.pro.sky;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void printIsYearLeap (int currentYear) {
    int year = currentYear;
    if (year % 400 == 0 || year % 4 == 0 && (year != 100)) {
        System.out.println(year + " Високосный год");
    } else System.out.println(year + " Невисокосный год");
}

    public static void determineIos(int year, int iosType) {
        if (year < 2015 && iosType < 1) {
            System.out.println("Установите облегченную версию приложения Android по ссылке");
        }
        if (year >= 2015 && iosType < 1) {
            System.out.println("Установите версию для Android по ссылке");
        }
        if (year < 2015 && iosType == 1) {
            System.out.println("Установите облегченную версию для IOS по ссылке");
        }
        if (year >= 2015 && iosType == 1) {
            System.out.println("Установите версию для IOS по ссылке");
        } else {
            System.out.println("Обратитесь в службу поддержки");
        }
    }

    public static int countDistance(int distance) {
        int daysForDelivery = ((20 + distance) / 40);
        int gap = daysForDelivery + 1;
        if (distance <= 19) {
            System.out.println("Потребуется дней 1");
        }
        if (distance >= 20 && distance <= 59) {
            System.out.println("Потребуется дней 2");
        }
        if (distance >= 60 && distance <= 99) {
            System.out.println("Потребуется дней 3");
        }
        if (distance >= 100) {
            System.out.println("Потребуется дней " + gap);
        }
        return distance;
    }

    public static void findOutDuplicates(String inner) {
        char[] text = inner.toCharArray();
        for (int i = 0; i < text.length; i++) {
            for (int j = i + 1; j < text.length; j++) {
                if (text[i] == text[j]) {
                    System.out.println("имеются дубликаты");
                    return;
                }
            }
        }System.out.println("дубликатов нет");
    }

    public static void reverseArray(int[] arr) {
        int head = 0;
        int back = arr.length - 1;
        while (head < back) {
            int temp = arr[head];
            arr[head++] = arr[back];
            arr[back--] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int leapYear = 1400;
        printIsYearLeap(leapYear);
        System.out.println();

        System.out.println("Задание 2");
        int ios = 0;
        int currentYear = LocalDate.now().getYear();
        determineIos(currentYear,ios);
        System.out.println();

        System.out.println("Задание 3");
        int deliveryDistance = 95;
        countDistance(deliveryDistance);
        System.out.println();

        System.out.println("Задание 4");
        String str = "abbbccc";
        findOutDuplicates(str);
        System.out.println();

        System.out.println("Задание 5");
        int[] array = {3, 2, 1, 6, 5};
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }
}

