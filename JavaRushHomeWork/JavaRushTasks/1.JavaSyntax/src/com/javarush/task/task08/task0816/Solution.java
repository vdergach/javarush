package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JULY 1 1980"));
        map.put("Stallone3", new Date("AUGUST 1 1980"));
        map.put("Stallone4", new Date("MARCH 1 1980"));
        map.put("Stallone5", new Date("MARCH 1 1980"));
        map.put("Stallone6", new Date("MARCH 1 1980"));
        map.put("Stallone7", new Date("MARCH 1 1980"));
        map.put("Stallone8", new Date("MARCH 1 1980"));
        map.put("Stallone9", new Date("MARCH 1 1980"));
        map.put("Stallone10", new Date("MARCH 1 1980"));
        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
//        for (Date values : map.values()){
//            if (values.equals("JUNE") || values.equals("JULY") || values.equals("AUGUST")){
//                map.remove();
//            }
//        }
//        Iterator iter = map.entrySet().iterator();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            HashMap.Entry pair = (HashMap.Entry) it.next();
            Date d = (Date) pair.getValue();
            if ((d.getMonth() > 4) && (d.getMonth() < 8)) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
