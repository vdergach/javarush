//package com.javarush.task.task04.task0416;
//
///*
//Переходим дорогу вслепую
//*/
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Double userInput = Double.parseDouble(reader.readLine());
//        double result = userInput % 5;
//        if(result >=0 && result < 3){
//            System.out.println("зелёный");
//        }else if(result >= 3 && result < 4){
//            System.out.println("желтый");
//        }else if(result >= 4 && result < 5){
//            System.out.println("красный");
//        }
//    }
//}