package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        int chet = a%2;
//        int nechet = a%3;
        if(chet == 0 && a < 0 ){
            System.out.println("отрицательное четное число");
        }else if(chet != 0 && a < 0){
            System.out.println("отрицательное нечетное число");
        }else if(a == 0){
            System.out.println("ноль");
        }else if(chet == 0 && a > 0){
            System.out.println("положительное четное число");
        }else if(chet != 0 && a > 0){
            System.out.println("положительное нечетное число");
        }
    }
}
