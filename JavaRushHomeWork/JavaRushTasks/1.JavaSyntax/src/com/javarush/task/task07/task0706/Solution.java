package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int even = 0,odd = 0;
        int[] numbers = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<numbers.length;i++){
            numbers[i]=Integer.parseInt(reader.readLine());
        }
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0 || numbers[i]==0){
                even=even + numbers[i];
            }else if(numbers[i]%2!=0){
                odd=odd + numbers[i];
            }
        }
        if(odd>even){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }else{
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
