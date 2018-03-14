package com.javarush.task.task07.task0712;

/*
Самые-самые
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        int intBig=0;
//        int intSmall=0;
//        ArrayList<String> list = new ArrayList<>();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        for (int i=0;i<10;i++){
//            list.add(i,reader.readLine());
//        }
//        intSmall=list.get(0).length();
//        intBig=list.get(0).length();
//        for(int i=0;i<list.get(i).length();i++){
//            if(intSmall>list.get(i).length()){
//                intSmall=list.get(i).length();
//            }else if(intBig<list.get(i).length()){
//                intBig=list.get(i).length();
//            }
//        }
//        for(int i=0;i<10;i++){
//            if(intBig==list.get(i).length() || intSmall==list.get(i).length()){
//                if(intBig==list.get(i).length()){
//                    System.out.println(list.get(i));
//                }else if(intSmall==list.get(i).length()){
//                    System.out.println(list.get(i));
//                }
//            }
//        }
        ArrayList< String > strings = new ArrayList<>();
        int[] strMin = new int[2];
        int[] strMax = new int[2];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        strMax[0] = strings.get(0).length();
        strMax[1] = 0;
        strMin[0] = strings.get(0).length();
        strMax[1] = 0;

        for (int i = 0; i < strings.size(); i++) {
            if (strMax[0] < strings.get(i).length()) {
                strMax[0] = strings.get(i).length();
                strMax[1] = i;
            }

            if (strMin[0] > strings.get(i).length()) {
                strMin[0] = strings.get(i).length();
                strMin[1] = i;
            }
        }

        if (strMax[1] < strMin[1]) System.out.println(strings.get(strMax[1]));
        else System.out.println(strings.get(strMin[1]));

    }
}
