package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
//    public static void main(String[] args) {
//        //напишите тут ваш код
//
//        Human child1 = new Human("son1", true, 13);
//        Human child2 = new Human("son2", true, 12);
//        Human child3 = new Human("daughter", false, 11);
//
//        ArrayList<Human> childrens = new ArrayList<Human>();
//        childrens.add(child1);
//        childrens.add(child2);
//        childrens.add(child3);
//
//        Human papa = new Human("Papa", true, 43, childrens);
//        Human mama = new Human("Mama", false, 41, childrens);
//
//        ArrayList<Human> childP = new ArrayList<Human>();
//        childP.add(papa);
//        ArrayList<Human> childM = new ArrayList<Human>();
//        childM.add(mama);
//
//        ArrayList<Human> parents1 = new ArrayList<>();
//        parents1.add(papa);
//        ArrayList<Human> parents2 = new ArrayList<>();
//        parents2.add(mama);
//
//        Human ded1 = new Human("Ded1", true, 85, childM);
//        Human baba1 = new Human("Baba1", false, 83, childP);
//        parents1.add(papa);
//        Human ded2 = new Human("Ded2", true, 86, childM);
//        Human baba2 = new Human("Baba2", false, 84, childP);
//        parents2.add(mama);
//
//        System.out.println(ded1);
//        System.out.println(baba1);
//        System.out.println(ded2);
//        System.out.println(baba2);
//        System.out.println(papa);
//        System.out.println(mama);
//        System.out.println(child1);
//        System.out.println(child2);
//        System.out.println(child3);
//    }
//
//    public static class Human {
//        //напишите тут ваш код
//        String name;
//        boolean sex;
//        int age;
//        ArrayList<Human> children = new ArrayList<Human>();
//
//        public Human(String name, Boolean sex, int age)
//        {
//            this.name = name;
//            this.sex = sex;
//            this.age = age;
//        }
//
//        public Human(String name, boolean sex, int age, ArrayList<Human> parent) {
//            this.name = name;
//            this.sex = sex;
//            this.age = age;
//            this.children = children;
//        }
//
//
//        public String toString() {
//            String text = "";
//            text += "Имя: " + this.name;
//            text += ", пол: " + (this.sex ? "мужской" : "женский");
//            text += ", возраст: " + this.age;
//
//            int childCount = this.children.size();
//            if (childCount > 0) {
//                text += ", дети: " + this.children.get(0).name;
//
//                for (int i = 1; i < childCount; i++) {
//                    Human child = this.children.get(i);
//                    text += ", " + child.name;
//                }
//            }
//            return text;
//        }
//    }
//*****

    public static void main(String[] args)
{
    //напишите тут ваш код
    Human child1 = new Human("Vano", true, 12);
    Human child2 = new Human("Gano", true, 12);
    Human child3 = new Human("Pano", true, 12);

    List<Human> childrens = new ArrayList<Human>();
    childrens.add(child1);
    childrens.add(child2);
    childrens.add(child3);

    Human mother = new Human("Mam", false, 28, childrens);
    Human father = new Human("Pa", true, 30, childrens);

    List<Human> childrenM = new ArrayList<Human>();
    childrenM.add(mother);
    List<Human> childrenP = new ArrayList<Human>();
    childrenP.add(father);

    Human grandfather1 = new Human("GPa1", true, 44, childrenM);
    Human grandfather2 = new Human("GPa2", true, 44, childrenP);

    Human grandmother1 = new Human("GMam1", false, 48, childrenM);
    Human grandmother2 = new Human("GMam2", false, 48, childrenP);

    System.out.println(grandfather1);
    System.out.println(grandfather2);
    System.out.println(grandmother1);
    System.out.println(grandmother2);
    System.out.println(father);
    System.out.println(mother);
    System.out.println(child1);
    System.out.println(child2);
    System.out.println(child3);


}

    public static class Human
    {
        //напишите тут ваш код
        String name;
        Boolean sex;
        int age;
        List<Human> children = new ArrayList<Human>();


        public Human(String name, Boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, Boolean sex, int age, List<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }
            return text;
        }
    }

}


