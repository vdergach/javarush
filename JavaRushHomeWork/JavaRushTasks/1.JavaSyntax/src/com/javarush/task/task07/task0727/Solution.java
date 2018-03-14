package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        int chet = 0, nechet=0;
        for (int i=0;i<list.size();i++){
            if (list.get(i).length()%2==0){
                chet=2;
            }else if(list.get(i).length()%2==1){
                nechet=3;
            }
        }

        for (int i=0;i<list.size();i++){
            if(list.get(i).length()%2==0){
                for (int j=0;j<chet;j++){
                    System.out.print(list.get(i)+" ");
                }
                System.out.println();
            }else if(list.get(i).length()%2==1){
                for (int j=0;j<nechet;j++){
                    System.out.print(list.get(i)+" ");
                }
                System.out.println();
            }
        }

//        ArrayList<String> listUpperCase = new ArrayList<String>();
//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            listUpperCase.add(s.toUpperCase());
//        }
//        for (int i = 0; i < listUpperCase.size(); i++) {
//            if(list.get(i).length()%2==0){
//                for (int j=0;j<chet;j++){
//                    System.out.print(listUpperCase.get(i)+" ");
//                }
//                System.out.println();
//            }else if(list.get(i).length()%2==1){
//                for (int j=0;j<nechet;j++){
//                    System.out.print(listUpperCase.get(i)+" ");
//                }
//                System.out.println();
//            }
//
//        }
    }
}
