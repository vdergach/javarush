package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int minus = 0;
        int plus = 0;
        if (a<0){
            minus++;
        }else if(a == 0){
        }else{
            plus++;
        }
        if(b<0){
            minus++;
        }else if (b == 0){
        }else{
            plus++;
        }
        if (c<0){
            minus++;
        }else if(c == 0){
        }else{
            plus++;
        }
        System.out.println("количество отрицательных чисел: " + minus);
        System.out.println("количество положительных чисел: " + plus);
    }
}
