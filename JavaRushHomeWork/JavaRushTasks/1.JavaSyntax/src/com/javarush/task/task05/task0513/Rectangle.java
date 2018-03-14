package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
Примеры:
— заданы 4 параметра: left, top, width, height
— ширина/высота не задана (оба равны 0)
— высота не задана (равно ширине) создаём квадрат
— создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle {
    //напишите тут ваш код
    int top, left, width, height;
    public void initialize(int top, int left, int width, int height){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=height;
    }
    public void initialize(int top, int left){
        this.top=top;
        this.left=left;
        this.width=0;
        this.height=0;
    }
    public void initialize(int top, int left, int width){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=width;
    }
    public void initialize(Rectangle another){
        this.top=another.top;
        this.left=another.left;
        this.width=another.width;
        this.height=another.height;
    }
    public static void main(String[] args) {

    }
}
