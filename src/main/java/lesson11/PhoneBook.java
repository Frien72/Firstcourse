package lesson11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class PhoneBook {
    private final Map<String, List<String>> book = new HashMap<>();

    public void add(String surname, String phone) {
        List<String> phones = book.getOrDefault(surname, new ArrayList<>());
        phones.add(phone);
        book.put(surname, phones);
    }

    public List<String> get(String surname) {
        return book.get(surname);

        }


    }
//    public String get(String surname) {
//        Set<Map.Entry<String, String>> entries = BOOK.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            return (entry.getKey() + entry.getValue());
//        }
//        return ;
//    }

