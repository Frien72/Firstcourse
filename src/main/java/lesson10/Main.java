package lesson10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] arraySwapTest = new String[]{"a", "b", "c",};
        swap(arraySwapTest, 0, 2);
        System.out.println(Arrays.toString(arraySwapTest));
        System.out.println();
        fruitsTest();

    }

    private static void fruitsTest() {
        Box<Apple> boxApples = new Box<>(
                new Apple(),
                new Apple(),
                new Apple()
        );

        Box<Orange> boxOranges = new Box<>(
                new Orange(),
                new Orange()
        );

        System.out.println("Равны ли коробки по весу ?  " + boxApples.compare(boxOranges));

        System.out.println("Перемещаем яблоки в другую коробку = " + boxApples.getSize());
        Box<Apple> anotherBoxApples = new Box<>();
        anotherBoxApples.shiftAllFruits(boxApples);
        System.out.println("Количество яблок после перемещения = " + boxApples.getSize());
        System.out.println("Количество яблок в новой коробке = " + anotherBoxApples.getSize());




    }

    public static <T> void swap(T[] array, int firstIndex, int secondIndex) {

        if (firstIndex < 0 || array.length <= firstIndex) {
            throw new IllegalArgumentException("Некорректный индекс");
        }

        if (secondIndex < 0 || array.length <= secondIndex) {
            throw new IllegalArgumentException("Некорректный индес");
        }

        if (firstIndex == secondIndex) {
            return;
        }
        T temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
