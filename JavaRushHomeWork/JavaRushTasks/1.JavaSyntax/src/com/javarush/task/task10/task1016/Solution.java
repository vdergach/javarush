package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        //напишите тут ваш код
//        String a=null;
//        int count=0;
//        a=list.get(0);
//        for (int i=0;i<list.size();i++){
//            if (Objects.equals(list.get(i), a)){
//                result.put(list.get(i), i);
//                count++;
//            }
//        }
        for (int i = 0; i < list.size(); i++){
            int count = 0;
            String str = list.get(i);
            for (int j = 0; j < list.size(); j++){
                if (str.equals(list.get(j))) {
                    count = count + 1;
                }
            }
            result.put(str, count);
        }
        return result;
    }
}

