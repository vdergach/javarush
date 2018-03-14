package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i = 1;
        int j = 1;
        int max = 11;

        while(i<max){
            while (j<max){
                System.out.print(j*i);
                System.out.print(" ");
                j++;
            }
            j=1;
            System.out.println();
            i++;
        }
    }
}
