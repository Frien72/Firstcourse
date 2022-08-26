package lesson14;

import java.util.ArrayList;
import java.util.Collections;


public class HomeWorkApp {
    public Integer[] convertArray(Integer... intArray) {
        if (intArray == null || intArray.length == 0) throw new RuntimeException("Заполните массив");

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, intArray);
        if (!list.contains(4)) throw new RuntimeException("Массив должен содержать 4");

        int lastIndex4 = list.lastIndexOf(4);
        return list.subList(lastIndex4 + 1, list.size()).toArray(Integer[]::new);
    }

    public boolean checkArray(Integer... intArray) {
        if (intArray == null || intArray.length == 0) return false;

        for (Integer integer : intArray) if (integer != 1 || integer != 4) return false;

        return true;
    }
}