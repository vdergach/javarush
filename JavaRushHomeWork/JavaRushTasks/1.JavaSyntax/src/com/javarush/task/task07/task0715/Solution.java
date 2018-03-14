package com.javarush.task.task07.task0715;

import java.util.ArrayList;/*
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        for (int i=0;i<list.size();i++){
            if (list.get(i)=="мама"){
                list.add(i+1,"именно");
            }else if(list.get(i)=="мыла"){
                list.add(i+1,"именно");
            }else if(list.get(i)=="раму"){
                list.add(i+1, "именно");
            }
        }
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
