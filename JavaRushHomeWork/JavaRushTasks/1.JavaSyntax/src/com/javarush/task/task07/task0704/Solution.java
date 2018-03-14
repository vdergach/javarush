package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] numbers = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<numbers.length;i++){
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        int[] reversed = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            System.out.println(reversed[i] = numbers[numbers.length - i - 1]);
        }
    }
}

