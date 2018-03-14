package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
//        ArrayList<String> arrlst = new ArrayList<>();
//        Arrays.sort(array);
//        for(int i=0;i<array.length;i++){
//            arrlst.add(String.valueOf(array));
//        }
//        Collections.reverse(arrlst);
//        for (int i=0;i<arrlst.size();i++){
//            array[i] = Integer.parseInt(arrlst.get(i));
//            System.out.println(array[i]);
//        }
//    }
        ArrayList arrlst = new ArrayList();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            arrlst.add(array[i]);
        }
        Collections.reverse(arrlst);
        for (int i = 0; i < arrlst.size();i++){
            array[i] = (int) arrlst.get(i);
        }


    }
}