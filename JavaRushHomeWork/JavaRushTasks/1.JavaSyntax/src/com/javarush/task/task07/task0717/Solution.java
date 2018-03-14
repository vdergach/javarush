package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        int q=10;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i=0;i<q;i++){
            list.add(i, reader.readLine());
        }
        ArrayList<String> result = doubleValues(list);
        // Вывести на экран result
//        for (String s : list) System.out.println(s);
        for (int i=0;i<list.size();i++){
            System.out.println(result.get(i));
        }
    }

    public static ArrayList doubleValues(ArrayList list) {
        for (int i=0;i<list.size();i+=2) {
            list.add(i+1,list.get(i));
        }return list;
    }
}
