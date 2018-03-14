package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        int cycles=0;
        for (int i=0;i<cycles+1;i++){
            int a=Integer.parseInt(reader.readLine());
            if(a==-1){
                System.out.println((double)sum/cycles);
                break;
            }
            cycles++;
            sum=sum+a;
        }
    }
}

