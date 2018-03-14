package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int b = Integer.parseInt(a);
        int result = b%2;
        int length = String.valueOf(b).length();

        if(b >= 1 && b <= 999){
            if(result == 0 && length == 1){
                System.out.println("четное однозначное число");
            }else if(result != 0 && length == 1){
                System.out.println("нечетное однозначное число");
            }else if(result == 0 && length == 2){
                System.out.println("четное двузначное число");
            }else if(result != 0 && length == 2){
                System.out.println("нечетное двузначное число");
            }else if(result == 0 && length == 3){
                System.out.println("четное трехзначное число");
            }else if(result != 0 && length == 3){
                System.out.println("нечетное трехзначное число");
            }
        }
    }
}
