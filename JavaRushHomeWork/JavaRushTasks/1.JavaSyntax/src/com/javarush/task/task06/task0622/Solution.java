package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<Integer> values = new ArrayList<>();
        int val,res=0;
        for (int i=0;i<5;i++){
            int a = Integer.parseInt(reader.readLine());
            values.add(a);
        }
        Collections.sort(values);
        for(int i=0;i<5;i++){
            System.out.println(values.toArray()[i]);
        }

    }
}
