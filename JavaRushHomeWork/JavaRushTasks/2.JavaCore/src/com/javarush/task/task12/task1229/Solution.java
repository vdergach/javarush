package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

public class Solution {

    public static void main(String[] args) {
//        CTO cto = new CTO();
//        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }
    public class Worker{
        public void workHard(){
        }
    }

    private class CTO extends Worker implements Businessman {
    }
}
