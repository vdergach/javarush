package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        for (int i=0;i<10;i++){
            map.put("Surname"+i,"Name"+i);
        }
        return (HashMap<String, String>) map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count=0;
        for( String values : map.values()) {
            if(values.equals(name)) {
                count++; }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry pair : map.entrySet()) {
            String keys = (String) pair.getKey();
            if (keys.equals(lastName)) {
                count++; }
        }
        return count;
    }

    public static void main(String[] args) {
//        System.out.println(createMap());
//        System.out.println(getCountTheSameFirstName(createMap(), "Пётр"));
//        System.out.println(getCountTheSameLastName(createMap(), "Петров"));

    }
}
