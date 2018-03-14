package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();

        if (Objects.equals(a, b) && !Objects.equals(a,c)){
            System.out.println(3);
        }else if(Objects.equals(a,c)&&!Objects.equals(a,b)){
            System.out.println(2);
        }else if(Objects.equals(b,c)&&!Objects.equals(b,a)){
            System.out.println(1);
        }
    }
}