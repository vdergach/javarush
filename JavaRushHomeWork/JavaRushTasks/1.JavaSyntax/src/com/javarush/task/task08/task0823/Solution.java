package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
//        for (int i=0;i<s.length();i++){
//            s.toUpperCase();
//            for (char c : s.toCharArray()){
//                if (Character.isWhitespace(c)){
//                    break;
//                }
//            }
//        }

        StringTokenizer st = new StringTokenizer(s, " ");
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken().toUpperCase());
//            System.out.println(s.substring(0,1).toUpperCase() + s.substring(1));
//        }
        ArrayList<String> list = new ArrayList<String>();
        while(st.hasMoreTokens()){
            list.add(st.nextToken());
        }
        for (String str : list){
            System.out.print(str.substring(0,1).toUpperCase() + str.substring(1) + " ");
        }
    }
}
