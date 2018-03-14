//package com.javarush.task.task04.task0416;
//
///*
//Переходим дорогу вслепую
//*/
//
//import java.io.*;
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        //напишите тут ваш код
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String t = reader.readLine();
//        Double a = Double.parseDouble(t);
//
//        colorabc(a);
//
//        System.out.println(a);
//
//    }
//
//    public static void colorabc(Double a){
//        if (a >= 0 && a <=3){
//            System.out.println("зелёный");
//        }else if(a >= 6 && a <=8){
//            System.out.println("зелёный");
//        }else if(a >= 11 && a <=13){
//            System.out.println("зелёный");
//        }else if(a >= 16 && a <=18){
//            System.out.println("зелёный");
//        }else if(a >= 21 && a <=23){
//            System.out.println("зелёный");
//        }else if(a >= 26 && a <=28){
//            System.out.println("зелёный");
//        }else if(a >= 31 && a <=33){
//            System.out.println("зелёный");
//        }else if(a >= 36 && a <=38){
//            System.out.println("зелёный");
//        }else if(a >= 41 && a <=43){
//            System.out.println("зелёный");
//        }else if(a >= 46 && a <=48){
//            System.out.println("зелёный");
//        }else if(a >= 51 && a <=53){
//            System.out.println("зелёный");
//        }else if(a >= 56 && a <=58){
//            System.out.println("зелёный");
//        }else if(a == 4){
//            System.out.println("жёлтый");
//        }else if(a == 9){
//            System.out.println("жёлтый");
//        }else if(a == 19){
//            System.out.println("жёлтый");
//        }else if(a == 24){
//            System.out.println("жёлтый");
//        }else if(a == 29){
//            System.out.println("жёлтый");
//        }else if(a == 34){
//            System.out.println("жёлтый");
//        }else if(a == 39){
//            System.out.println("жёлтый");
//        }else if(a == 44){
//            System.out.println("жёлтый");
//        }else if(a == 49){
//            System.out.println("жёлтый");
//        }else if(a == 54){
//            System.out.println("жёлтый");
//        }else if(a == 59){
//            System.out.println("жёлтый");
//        }else if(a == 5){
//            System.out.println("красный");
//        }else if(a == 10){
//            System.out.println("красный");
//        }else if(a == 15){
//            System.out.println("красный");
//        }else if(a == 20){
//            System.out.println("красный");
//        }else if(a == 25){
//            System.out.println("красный");
//        }else if(a == 30){
//            System.out.println("красный");
//        }else if(a == 35){
//            System.out.println("красный");
//        }else if(a == 40){
//            System.out.println("красный");
//        }else if(a == 45){
//            System.out.println("красный");
//        }else if(a == 50){
//            System.out.println("красный");
//        }else if(a == 55){
//            System.out.println("красный");
//        }else if(a == 60){
//            System.out.println("красный");
//        }
//        return a;
//    }
//}