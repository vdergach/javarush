package com.javarush.task.task09.task0904;

/* 
Стек-трейс длиной 10 вызовов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
//        method2();
//        return Thread.currentThread().getStackTrace();
        return method2();
    }

    public static StackTraceElement[] method2() {
        //напишите тут ваш код
     return    method3();
//        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3() {
        //напишите тут ваш код
        return method4();
//        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        //напишите тут ваш код
        return method5();
//        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        return method6();
//        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method6() {
        //напишите тут ваш код
        return method7();
//        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method7() {
        return method8();
        //напишите тут ваш код

//        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method8() {
        //напишите тут ваш код
     return    method9();
//        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method9() {
        return method10();
//        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method10() {
//        System.out.println(Thread.currentThread().getStackTrace().length);
        return Thread.currentThread().getStackTrace();
    }
}
