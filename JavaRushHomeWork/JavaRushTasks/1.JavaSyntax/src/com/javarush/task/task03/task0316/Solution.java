package com.javarush.task.task03.task0316;

/* 
Экранирование символов
Про экранирование символов в Java читай в дополнительном материале к лекции.

Вывести на экран следующий текст — две строки:
It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's Java string: "C:\\Program Files\\Java\\jdk1.7.0\\bin\"
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String str1 = "It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"";
        String str2 = "It's Java string: \"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"";
        System.out.println(str1);
        System.out.print(str2);
    }
}
