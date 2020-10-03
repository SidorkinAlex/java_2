package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Phonebook {
    public HashMap<String, Set<String>> phoneBook = new HashMap<>();

    /**
     * добавление в справочник
     * @param lastName Фамилия
     * @param phone телефонный номер
     */
    public void add(String lastName, String phone){
        Set<String> setPhone = phoneBook.getOrDefault(lastName,new HashSet<>());
        setPhone.add(phone);
        phoneBook.put(lastName,setPhone);
    }

    /**
     * Возвращает коллекцию номеров по Фамилии
     * @param lastName фамилия, по которой ищется номер
     * @return Set<String> номера телефона
     */
    public Set<String> get(String lastName){
        return phoneBook.get(lastName);
    }
}
