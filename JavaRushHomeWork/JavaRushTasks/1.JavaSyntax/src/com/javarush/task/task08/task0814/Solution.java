package com.javarush.task.task08.task0814;

import java.util.HashSet;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i=0;i<20;i++){
            set.add(i);
        }
        return set;
    }

    public static HashSet removeAllNumbersMoreThan10(HashSet set) {
        //напишите тут ваш код
        HashSet res = (HashSet) set.clone();
        for (Object num : set){
            if ((Integer) num > 10) res.remove(num); }
            return res;
    }

    public static void main(String[] args) {
    }
}
