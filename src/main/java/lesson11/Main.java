package lesson11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String[] words = new String[]{"Привет", "Хелоу", "Бонжур", "Привет", "Хай", "Ола", "Ку", "Йо",
                "Йоу", "Хеллоуин", "Приветик"};
        System.out.println("Обычный не отсортированный массив:" + Arrays.toString(words));

        Map<String, Integer> sortedWords = new HashMap<>();
        for (String word : words) {
            if (sortedWords.containsKey(word)) {
                int count = sortedWords.get(word);
                sortedWords.put(word, ++count);
            } else {
                sortedWords.put(word, 1);
            }
        }
        System.out.println("Сортировка массива с помощью коллекции Мар: " + sortedWords);



        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов" , "+792123123123");
        phoneBook.add("Иванова", "+7923123123");
        phoneBook.add("Иванов", "+712381283123");
        phoneBook.add("Блинов", "+792123123123");

        System.out.println(phoneBook.get("Иванов"));
    }
}
