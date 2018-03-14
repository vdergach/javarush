package com.javarush.task.task08.task0819;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        //напишите тут ваш код. step 3 - пункт 3
        cats.remove("cat1");

        printCats(cats);
    }


        public static Set createCats() {
            //напишите тут ваш код. step 2 - пункт 2
            HashSet cats = new HashSet(3);
            Cat cat1 = new Cat();
            Cat cat2 = new Cat();
            Cat cat3 = new Cat();
            cats.add(cat1);
            cats.add(cat2);
            cats.add(cat3);


            return cats;
        }


    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Object cat : cats){
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1
    public static class Cat{

    }
}
