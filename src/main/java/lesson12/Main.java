package lesson12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE/2;



    public static void main(String[] args) {
        firstMethood();
        secondMethood();
    }


    private static void firstMethood() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        long currentTimeMillis = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arr[i] = calculate(arr[i], i);
        }
        System.out.println("Время выполнения: " + (System.currentTimeMillis() - currentTimeMillis) + "мс." );
    }

    private static void secondMethood() {
        float[] arr = new float[SIZE];
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        long currentTimeMillis = System.currentTimeMillis();

        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < HALF; i++) a1[i] = calculate(a1[i], i);
        }, "HALF_SIZE1");
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < HALF; i++) a2[i] = calculate(a2[i], HALF + i);
            }, "HALF_SIZE2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        float[] arrayResult = new float[SIZE];
        System.arraycopy(a1, 0, arrayResult, 0, HALF);
        System.arraycopy(a2, 0, arrayResult, HALF, HALF);

        System.out.println("Время выполнения: " + (System.currentTimeMillis() - currentTimeMillis) + "мс.");

}
    private static float calculate(float n, int i) {
        return (float) (n * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    }
}
