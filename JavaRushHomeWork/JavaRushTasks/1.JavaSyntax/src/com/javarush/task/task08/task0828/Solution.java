package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"January");
        map.put(2,"Fabruary");
        map.put(3,"March");
        map.put(4,"April");
        map.put(5,"May");
        map.put(6,"June");
        map.put(7,"July");
        map.put(8,"August");
        map.put(9,"September");
        map.put(10,"October");
        map.put(11,"November");
        map.put(12,"December");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        for (Map.Entry<Integer,String> pair : map.entrySet()) {
            Integer key = pair.getKey();
            String value = pair.getValue();
            if (s.equals(value)) {
                System.out.println(value + " is " + key + " month");
            }
        }
    }
}
