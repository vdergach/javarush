package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (; true; ) {
            String s = reader.readLine();
            int a = Integer.parseInt(s);
            sum = sum + a;
            if (a==-1){
                System.out.println(sum);
                break;
            }
        }
    }
}