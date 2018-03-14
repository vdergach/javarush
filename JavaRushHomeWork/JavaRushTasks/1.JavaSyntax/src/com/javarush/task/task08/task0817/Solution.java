package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
//        for (int i=0;i<5;i++){
//            map.put("Surname"+i,"name");
//        }
//        for (int i=5;i<10;i++){
//            map.put("Surname"+i,"name"+i);
//        }
        map.put("a","d");
        map.put("b","d");
        map.put("c","d");
        map.put("d","d");
        map.put("i","i");
        map.put("z","i");
        map.put("f","o");
        map.put("g","o");
        map.put("h","o");
        map.put("j","p");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String,String>(map);
        for (Map.Entry s : copy.entrySet()){
            for (Map.Entry s2 : copy.entrySet()){
                if (s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey())){
                    removeItemFromMapByValue(map, (String) s.getValue());
                }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map = createMap();
        removeTheFirstNameDuplicates(map);
//        System.out.println(map);
    }
}
