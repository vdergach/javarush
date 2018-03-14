package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String side1 = reader.readLine();
        int a = Integer.parseInt(side1);
        String side2 = reader.readLine();
        int b = Integer.parseInt(side2);
        String side3 = reader.readLine();
        int c = Integer.parseInt(side3);
        triangle (a, b, c);
    }

    public static void triangle (int a, int b, int c){
        if ((a + b) > c && (a + c) > b && (b + c) > a ){
            System.out.println("Треугольник существует.");
        }else{
            System.out.println("Треугольник не существует.");
        }
    }
}
