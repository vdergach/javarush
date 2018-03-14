package com.javarush.task.task07.task0723;

/* 
Обратный отсчёт
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //напишите тут ваш код
        for (int i = 30; i >= 0; i--) {
            if (i != 0) {
                for (int j = 0; j < 10; j++) {
                    Thread.sleep(100);
                }
                System.out.println(i);
            }else{
                for (int j = 0; j < 10; j++) {
                    Thread.sleep(100);
                }
                System.out.println(i);
                for (int j = 0; j < 10; j++) {
                    Thread.sleep(100);
                }
                System.out.println("Бум!");
            }
        }
    }
}
