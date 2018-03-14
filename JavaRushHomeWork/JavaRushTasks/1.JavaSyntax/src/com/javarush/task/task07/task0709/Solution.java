package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;/*
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int q=5;
        int intSize = 0;
        String stringSize = "";
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<q;i++){
            list.add(i,reader.readLine());
        }
        intSize=list.get(0).length();
        stringSize=list.get(0);
        for (int i=1;i<q;i++){
            if(intSize>list.get(i).length()){
                intSize=list.get(i).length();
                stringSize=list.get(i);
            }
        }
        for (int i=0;i<q;i++){
            if(intSize==list.get(i).length()){
                System.out.println(list.get(i));
            }
        }
    }
}
