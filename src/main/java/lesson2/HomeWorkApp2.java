package lesson2;
import java.util.Scanner;

public class HomeWorkApp2 {
    public static void main(String[] args) {
          nubmerIncluded();
          checkPositiveNumber();
          checkAnotherPositiveNumber();
          printSetQuantity();
          leapYear();


    }

    private static void nubmerIncluded() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача на проверку, входит ли сумма чисел в диапазон от 10 до 20");
        System.out.println("напиши первое число");
        int firstNubmer = sc.nextInt();
        System.out.println("напиши второе число");
        int secondNumber = sc.nextInt();
        int sum = firstNubmer + secondNumber;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }

    }

    private static void checkPositiveNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача на проверку положительности числа");
        System.out.println("напиши число");
        int number = sc.nextInt();
        if (number >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");

        }
    }

    private static void checkAnotherPositiveNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача на проверку отрицательности числа, вывод boolean");
        System.out.println("напиши число");
        int number = sc.nextInt();
        if (number >= 0) {
            System.out.println("False");
        } else {
            System.out.println("True");

        }
    }

    private static void printSetQuantity() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача, печатающая фразу заданное количество раз");
        System.out.println("Напиши слова");
        String words = sc.nextLine();
        System.out.println("Напиши число");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println(words);
        }
    }

    private static void leapYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача на проверку високосности года");
        System.out.println("Введи год");
        int year = sc.nextInt();
        if (year >= 0) {
            if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("invalid year");


        }
    }

}

