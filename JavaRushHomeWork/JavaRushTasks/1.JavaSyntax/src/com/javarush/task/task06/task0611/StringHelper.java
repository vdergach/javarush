package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

import java.io.IOException;

public class StringHelper {
    public static String multiply(String s) throws IOException {
        //напишите тут ваш код
        String result = s;
        if(s==null){
            result = "";
        }else{
            for (int i=1;i<5;i++){
                result = result+s;
            }
        }
        return result;
    }
    public static String multiply(String s, int count) throws IOException {
        String result = s;
        if (count<=0){
            result = "";
        }else{
            for (int i=1;i<count;i++){
                result = result + s;
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
    }
}
