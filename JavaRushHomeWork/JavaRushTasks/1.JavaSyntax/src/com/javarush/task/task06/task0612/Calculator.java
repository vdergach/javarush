package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int result = a+b;
        return result;
    }
    public static int minus(int a, int b) {
        //напишите тут ваш код
        int result=a-b;
        return result;
    }
    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int result=a*b;
        return result;
    }
    public static double division(int a, int b) throws Exception {
        //напишите тут ваш код
        double a1 = (double)(a);
        double b1 = (double)(b);
        return a1 / b1;

    }
    public static double percent(int a, int b) {
        //напишите тут ваш код
        double a1 = (double)(a);
        double b1 = (double)(b);
        double result=(a1/100)*b1;
        return result;
    }
    public static void main(String[] args) {
    }
}