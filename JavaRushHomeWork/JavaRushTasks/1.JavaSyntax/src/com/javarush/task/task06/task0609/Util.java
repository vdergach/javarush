package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

import static java.lang.Math.sqrt;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        int a = x1-x2;
        int b = y1-y2;
        double c = (a*a)+b*b;
        return Math.sqrt(c);
    }

    public static void main(String[] args) {

    }
}
