package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try{
            divisionByZero();
        }catch(ArithmeticException e){
//            System.out.println(e);
            e.printStackTrace();
        }


    }
    public static void divisionByZero(){
        int a = 1/0;
        System.out.println(a);
    }
}
