package com.javarush.task.task04.task0435;

/* 
Четные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a = 1;
        for (int i=0;i<100;i++){
            if(a%2==0){
                System.out.println(a);
            }
            a++;
        }
    }
}
