package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> resultCats = new HashSet<Cat>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        resultCats.add(cat1);
        resultCats.add(cat2);
        resultCats.add(cat3);
        resultCats.add(cat4);

        //напишите тут ваш код

        return resultCats;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> resultDogs = new HashSet<Dog>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        resultDogs.add(dog1);
        resultDogs.add(dog2);
        resultDogs.add(dog3);

        return resultDogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet pets = new HashSet();
        pets.addAll(dogs);
        pets.addAll(cats);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
//        HashSet<Cat> resultCats = new HashSet<Cat>();
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object x : pets){
            System.out.println(x);
        }
    }

    //напишите тут ваш код
    public static class Cat{

    }
    public static class Dog{

    }
}
