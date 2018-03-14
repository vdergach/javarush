package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date dateI = new Date();
        long date = Date.parse(reader.readLine());
        SimpleDateFormat formatNew = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        String sDate = (formatNew.format(date));
        System.out.println(sDate.toUpperCase());
    }
}
