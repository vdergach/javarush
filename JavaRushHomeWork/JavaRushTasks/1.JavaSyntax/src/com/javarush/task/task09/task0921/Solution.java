package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (;true;){
            try {
                int digit = Integer.parseInt(reader.readLine());
                list.add(digit);
            }catch (Exception e) {
                for (Integer aList : list) {
                    System.out.println(aList);
                }
//                e.printStackTrace();
                break;
            }
        }
    }
}
