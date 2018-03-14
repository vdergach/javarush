package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i=495;i<505;i++){
            map.put("Surname"+i,i);
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copyMap = new HashMap<String, Integer>(map);
        for (Map.Entry<String, Integer> pair: copyMap.entrySet()){
            if (pair.getValue()<500){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map = createMap();
        removeItemFromMap(map);
//        System.out.println(map);
    }
}