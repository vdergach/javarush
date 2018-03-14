package com.javarush.task.task04.task0428;

/* 
Положительное число
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

        int result = 0;

        if (a<0){
        }else{
            result = result + 1;
        }
        if (b<0){
        }else{
            result = result + 1;
        }
        if(c<0){
        }else{
            result = result + 1;
        }
        System.out.println(result);
    }
}
