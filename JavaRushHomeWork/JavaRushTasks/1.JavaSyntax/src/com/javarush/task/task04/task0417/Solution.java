package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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
        if (a == b && a == c && b == c){
            System.out.println(a + " " + b + " " + c);
        }else if (b == c){
            System.out.println(b + " " + c);
        }else if(a == c){
            System.out.println(a + " " + c);
        }else if(a == b){
            System.out.print(a + " " + b );
        }
    }
}