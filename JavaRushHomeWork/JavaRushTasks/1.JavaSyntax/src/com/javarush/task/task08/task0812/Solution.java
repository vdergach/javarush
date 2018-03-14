package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            array.add(Integer.valueOf(reader.readLine()));
        }
        int max = 1, count = 1, xLast, xCurr;
        for (int i=0;i <10; i++) {
            if (i>0) {
                xCurr = array.get(i);
                xLast = array.get(i-1);
                if (xLast == xCurr) {
                    count++;
                }else{
                    count=1;
                }
                if (count>max) {
                    max=count;
                }
            }
        }
        System.out.println(max);
    }
}