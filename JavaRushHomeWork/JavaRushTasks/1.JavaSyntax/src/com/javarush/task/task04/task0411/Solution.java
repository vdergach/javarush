package com.javarush.task.task04.task0411;

/* 
Времена года на Терре

Реализовать метод checkSeason.

По номеру месяца,

метод должен определить время года
(зима, весна, лето, осень)

и вывести на экран.

*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //::CODE:
        if (month == 12 || month == 1 || month == 2){
            System.out.println("зима");
        }else if(month >=3 && month<=5){
            System.out.println("весна");
        }else if(month >=6 && month <=8){
            System.out.println("лето");
        }else{
            System.out.println("осень");
        }
    }
}