package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        System.out.println("insert n ");
//        int n = Integer.parseInt(reader.readLine());
//        System.out.println("insert M");
//        int m = Integer.parseInt(reader.readLine());
//
//        ArrayList<String> list = new ArrayList<>();
//        //напишите тут ваш код
//
//        for (int i=0;i<n;i++){
//            list.add(i, reader.readLine());
//        }
//        for (int i=0;i<m;i++){
//            String a = list.get(i);
//            list.remove(i);
//            list.add(a);
//        }
//        for (int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList ();
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            list.add(reader.readLine());
        }
        for (int i = 0; i < M; i++) {
            list.add(list.get(0)); list.remove(0);
        }
        for (int i = 0; i < list.size(); i++)
        {System.out.println(list.get(i));
        }

    }
}
