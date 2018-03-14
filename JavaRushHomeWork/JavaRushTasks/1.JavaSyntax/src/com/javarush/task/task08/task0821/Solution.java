package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String,String>();
//        for (int i=0; i<10;i++){
//            map.put("Surname","Name"+ i % 3);
////            map.put("Иванов " + i % 4, "Дмитрий " + i % 3);
//        }
        map.put("Fam1", "IM1");
        map.put("Fam1", "IM1");
        map.put("Fam3", "IM3");
        map.put("Fam4", "IM4");
        map.put("Fam5", "IM5");
        map.put("Fam6", "IM6");
        map.put("Fam7", "IM7");
        map.put("Fam8", "IM8");
        map.put("Fam9", "IM9");
        map.put("Fam10", "IM1");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
