package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private Boolean gender; // true for male
        private Human parent;
        private HairColor hairColor;
        private EyeColor eyeColor;

        public enum HairColor {
            BROWN, RED, BLONDE, BLACK
        }
        public enum EyeColor { BLUE, BROWN, GREEN, BLACK }

        public Human(String name) {

        }
        public Human(String name, int age) {

        }
        public Human(String name, int age, Boolean gender) {

        }
        public Human(String name, Human parent) {

        }
        public Human(String name, int age, Boolean gender, Human parent, HairColor hairColor, EyeColor eyeColor){
        }
        public Human(HairColor hairColor, EyeColor eyeColor) {

        }
        public Human(Boolean gender, HairColor hairColor, EyeColor eyeColor) {

        }
        public Human(Human parent) {

        }
        public Human() {

        }
        public Human(Boolean gender) {

        }
    }
}
