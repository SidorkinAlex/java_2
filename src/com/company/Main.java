package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String[] wordsArray = {"car", "Like", "Wars", "Star", "Blood", "Plane", "Flanker", "Job", "Work", "Star", "Blood", "Plane", "car", "Like", "Wars", "Star", "Blood", "Plane", "Flanker", "Job"};

        HashMap<String, Integer> wordsCollection = new HashMap<>();
        for (String word : wordsArray) {
            wordsCollection.put(word, wordsCollection.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordsCollection);
        Phonebook phoneBook=new Phonebook();
        phoneBook.add("Поттер","+79208001020");
        phoneBook.add("Поттер","+79208001021");
        phoneBook.add("Блэк","+79208001030");
        phoneBook.add("Лонгботтом","+79208001040");
        phoneBook.add("Пэтигрю","+79208001050");
        phoneBook.add("Гренджер","+79208001060");
        phoneBook.add("Уизли","+79208001070");
        phoneBook.add("Уизли","+79208001071");
        phoneBook.add("Уизли","+79208001072");
        System.out.println(phoneBook.get("Уизли"));
    }
}
