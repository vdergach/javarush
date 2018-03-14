package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int intSize = 0;
        String stringSize = "";
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<5;i++){
            list.add(i,reader.readLine());
        }
        for(int i=0;i<5;i++){
            if(intSize<list.get(i).length()){
                intSize=list.get(i).length();
                stringSize = list.get(i);
            }
        }
        for(int j=0;j<5;j++){
            if(intSize==list.get(j).length()){
                System.out.println(list.get(j));
            }
        }
    }
}
