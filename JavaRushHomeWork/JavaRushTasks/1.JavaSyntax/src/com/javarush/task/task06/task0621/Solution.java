package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat grandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat grandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat father = new Cat(fatherName, grandFather, null);

        String motherName = reader.readLine();
        Cat mother = new Cat(motherName, (Cat) null, grandMother);

        String sonName = reader.readLine();
        Cat son = new Cat(sonName, mother, father);

        String daughterName = reader.readLine();
        Cat daughter = new Cat(daughterName, mother, father);

        System.out.println(grandFather);
        System.out.println(grandMother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);

    }

    public static class Cat {
        private String name;
        private Cat parent1;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent1, Cat parent2) {
            this.name = name;
            this.parent1 = parent1;
            this.parent2 = parent2;
        }

//        public Cat(String fatherName, Cat parent1, String grandFatherName) {
//        }
        public Cat(Object o, Cat parent1, Cat parent2){
        }
        public Cat(String motherName, String grandMotherName, Object o) {
        }
        public Cat(String sonName, String motherName, String fatherName) {
        }

        @Override
            public String toString() {
                if (parent1 == null && parent2 == null)
                    return "Cat name is " + name + ", no mother" + ", no father";
                else if (parent2 == null)
                    return "Cat name is " + name + ", no mother, " + "father is " + parent1.name;
                else if (parent1 == null)
                    return "Cat name is " + name + ", mother is " + parent2.name + ", no father";
                else
                    return "Cat name is " + name + ", mother is " + parent1.name + ", father is " + parent2.name;
            }
    }
}