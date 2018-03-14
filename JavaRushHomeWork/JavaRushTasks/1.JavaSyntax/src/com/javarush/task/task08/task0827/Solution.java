package com.javarush.task.task08.task0827;

/*
Работа с датой
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 2 2000"));
    }

    public static boolean isDateOdd(String date) {
        Date dDate = new Date(date);
        SimpleDateFormat format = new SimpleDateFormat("D");
        int dayInTheYear = Integer.parseInt(format.format(dDate));
        if(dayInTheYear%2==0){
            return false;
        }else{
            return true;
        }
    }
}
