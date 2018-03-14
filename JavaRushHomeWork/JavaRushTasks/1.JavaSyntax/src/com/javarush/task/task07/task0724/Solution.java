package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandFather1 = new Human("Дед1", true, 71);
        Human grandFather2 = new Human("Дед2", true, 70);
        Human grandMother1 = new Human("Баба1", false, 71);
        Human grandMother2 = new Human("Баба2", false, 71);
        Human father = new Human("Папа", true, 31, grandFather1, grandMother1);
        Human mother = new Human("Мама", false, 31, grandFather2, grandMother2);
        Human chilld1 = new Human("Ребёнок1", true, 11, father, mother);
        Human chilld2 = new Human("Ребёнок2", true, 9, father, mother);
        Human chilld3 = new Human("Ребёнок3", true, 8, father, mother);

        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(chilld1.toString());
        System.out.println(chilld2.toString());
        System.out.println(chilld3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father,mother;


        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;
            return text;
        }
    }
}






















