package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
— Имя,
— Имя, вес, возраст
— Имя, возраст (вес стандартный)
— вес, цвет, (имя, адрес и возраст – неизвестные. Кот — бездомный)
— вес, цвет, адрес (чужой домашний кот)

Задача конструктора – сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat {
    //напишите тут ваш код
    String name,address,color;
    int weight, age;

    public Cat(String name) {
        this.name = name;
        this.weight=1;
        this.age=1;
        this.color="gray";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color="gray";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight=1;
        this.color="gray";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age=1;
    }
    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age=1;
    }

    public static void main(String[] args) {

    }
}
