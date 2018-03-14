package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int cycles=0;
        for (int i=0;i<cycles+1;i++){
            String a = reader.readLine();
            if(Objects.equals(a, "сумма")){
                System.out.println(sum);
                break;
            }
            int b = Integer.parseInt(a);
            sum = sum + b;
            cycles++;
        }
    }
}
