package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
//        for (int i=0;i<array.length;i++){
//            for (int j=0;j<array.length;j++){
//                if (isNumber(array[i])&& isNumber(array[j])){
//                    if (Integer.parseInt(array[i]) < Integer.parseInt(array[j])){
//                        String tempString = array[i];
//                        array[i] = array[j];
//                        array[j] = tempString;
//                    }
//                }
//                if (!isNumber(array[i]) && !isNumber(array[j])){
//                    if (isGreaterThan(array[i],array[j])){
//                        String tempString = array[i];
//                        array[i] = array[j];
//                        array[j] = tempString;
//
//                    }
//                }
//            }
//        }

        for (int i = array.length-1; i >=0 ; i--) {
            boolean flag= isNumber(array[i]) ? true :  false;
            for (int j = 0; j < i; j++) {
                if (flag && !isNumber(array[j]))
                    continue;
                if (!flag && isNumber(array[j]))
                    continue;
                if ((flag && Integer.parseInt(array[i])>Integer.parseInt(array[j])) || (!flag && isGreaterThan(array[j],array[i]))) {
                    String s=array[i];
                    array[i]=array[j];
                    array[j]=s;
                }
            }
        }


    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
