package com.javarush.task.task07.task0703;

/*
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] list = new String[10];
        int[] numbers = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<list.length;i++){
            list[i] = reader.readLine();
        }
        for(int i=0;i<numbers.length;i++){
            numbers[i]=list[i].length();
//            System.out.println(list[i].charAt(i));
            System.out.println(numbers[i]);
        }
    }
}
