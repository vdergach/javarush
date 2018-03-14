package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число

Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String digit = reader.readLine();
        Integer x = Integer.valueOf(digit);

        if (x > 0){
            int sum = x*2;
            System.out.println(sum);
        }else if(x<0){
            int sum = x+1;
            System.out.println(sum);
        }else{
            System.out.println(0);
        }
    }
}