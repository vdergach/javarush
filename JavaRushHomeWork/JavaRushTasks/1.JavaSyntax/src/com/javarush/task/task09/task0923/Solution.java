package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        ArrayList vowelList = new ArrayList();
//        ArrayList nonVowelList = new ArrayList();

//        String s = reader.readLine();
//        for (int i=0;i<s.length();i++){
//            if (isVowel(s.charAt(i))){
//                vowelList.add(s.charAt(i));
//            }else{
//                nonVowelList.add(s.charAt(i));
//            }
//        }
//        for (int i=0;i<nonVowelList.size();i++){
//            if (nonVowelList.get(i)==" "){
//                nonVowelList.remove(i);
//            }
//        }
//        for (int i=0;i<vowelList.size();i++){
//            System.out.print(vowelList.get(i)+" ");
//        }
//        System.out.println();
//
//        for (int i=0;i<nonVowelList.size();i++){
//
//            if (nonVowelList.get(i)==""){
//            }else{
//                System.out.print(nonVowelList.get(i)+" ");
//            }
//        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] chArray = s.toCharArray();

        ArrayList<Character> list1 = new ArrayList<Character>();
        ArrayList<Character> list2 = new ArrayList<Character>();

        for (int i=0;i<chArray.length;i++){
            if (isVowel(chArray[i])){
                list1.add(chArray[i]);
            }else if (chArray[i]!=' '){
                list2.add(chArray[i]);
            }
        }
        for (int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        for (int i=0;i<list2.size();i++){
            System.out.print(list2.get(i)+" ");
        }



    }
    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}