package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int q=5;
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<5;i++){
            list.add(i, reader.readLine());
        }
        list.remove(2);
        Collections.sort(list, Collections.reverseOrder());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}


