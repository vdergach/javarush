package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        HashMap<Integer, String> map = new HashMap<Integer, String>();

//        while (true){
//            String line = reader.readLine();
//            if (line.isEmpty()){
//                break;
//            }
//            int id = Integer.parseInt(line);
//            String name =  reader.readLine();
//            map.put(id,name);
//        }
//
//        for (Map.Entry entry : map.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (true) {
            String line = reader.readLine();
            if (line.isEmpty()) {
                break;
            }
            int id = Integer.parseInt(line);
            String name = reader.readLine();
            map.put(name, id);
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }

    }
}
