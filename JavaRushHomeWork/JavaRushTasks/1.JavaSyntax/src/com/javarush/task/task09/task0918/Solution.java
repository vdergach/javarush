package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

public class Solution {
    public static void main(String[] args) throws Exception{
    }
    
    static class MyException extends Exception{
    }

    static class MyException2 extends MyException{
    }

    static class MyException3 extends NullPointerException{
    }

    static class MyException4 extends IndexOutOfBoundsException{
    }
}
