package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
1. вводит с консоли число N, которое должно быть больше 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;
            int a = Integer.parseInt(reader.readLine());
            if (a>0){
                for (int i=0;i<a;i++){
                    int b = Integer.parseInt(reader.readLine());
                    if(b>=maximum){
                        maximum = b;
                    }
                }
            }
        //напишите тут ваш код
        System.out.println(maximum);
    }
}
