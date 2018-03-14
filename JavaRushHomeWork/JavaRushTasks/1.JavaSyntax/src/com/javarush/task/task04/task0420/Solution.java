package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        int[] testInt = {Integer.parseInt(reader.readLine(),Integer.parseInt(reader.readLine(),Integer.parseInt(reader.readLine())))};
        String[] strings = {reader.readLine(),reader.readLine(),reader.readLine()};
        Arrays.sort(strings, Collections.<String>reverseOrder());
        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        int c = Integer.parseInt(strings[2]);
        System.out.println(a +" "+b+" "+c);

//        for (int i=0;i<strings.length;i++) {
//            System.out.print(strings[i] + " ");
//        }
    }
}
