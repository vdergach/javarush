package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        for (int i=0;i<10;i++){
            Cat cat = new Cat("catName"+i);
            map.put("Cat"+i,cat);
        }




//        map.put("Cat0", cat);
//        map.put("Cat1", cat);
//        map.put("Cat2", cat);
//        map.put("Cat3", cat);
//        map.put("Cat4", cat);
//        map.put("Cat5", cat);
//        map.put("Cat6", cat);
//        map.put("Cat7", cat);
//        map.put("Cat8", cat);
//        map.put("Cat9", cat);

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet hashset = new HashSet();
        hashset.addAll(map.values());
        return hashset;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
