package com.javarush.task.task04.task0413;

/* 
День недели

Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
«понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше 7 или меньше 1 – вывести «такого дня недели не существует».

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        Integer x = Integer.valueOf(input);

        if(x==1){
            System.out.println("понедельник");
        }else if(x==2){
            System.out.println("вторник");
        }else if(x==3){
            System.out.println("среда");
        }else if (x==4){
            System.out.println("четверг");
        }else if (x==5){
            System.out.println("пятница");
        }else if (x==6){
            System.out.println("суббота");
        }else if (x==7){
            System.out.printf("воскресенье");
        }else{
            System.out.println("такого дня недели не существует");
        }
    }
}