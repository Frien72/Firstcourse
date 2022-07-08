package lesson3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp3 {
    public static void main(String[] args) {
//        arrayFirst();
//        arrayThroughCycle();
//        arrayMultiplication();
//        arraySquare();
//        arrayThird();

    }


    private static void arrayFirst() {
        int[] arr = new int[22];
        Random rndm = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rndm.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i]++;
            } else {
                arr[i]--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void arrayThroughCycle() {
        int[] arr = new int[100];
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            value++;
            arr[i] = value;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void arrayMultiplication() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void  arraySquare() {
        int[][] arr = new int[4][4];
        final int VALUE = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ( i == j) {
                    arr [i][j] = VALUE;
                    }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%3d ", arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void arrayThird() {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int initalValue = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initalValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}