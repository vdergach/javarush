package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(Integer.valueOf(reader.readLine()));
        }
        Collections.sort(list);
        Collections.reverse(list);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
