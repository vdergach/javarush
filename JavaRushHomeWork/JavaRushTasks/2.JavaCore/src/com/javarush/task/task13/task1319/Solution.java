package com.javarush.task.task13.task1319;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            File file = new File(reader.readLine());
//            if (!file.exists()){
//                file.createNewFile();
//            }
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            while(true){
                String s = reader.readLine();
                writer.write(s);
                if (s.equals("exit")){
                    break;
                }
                writer.newLine();
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
