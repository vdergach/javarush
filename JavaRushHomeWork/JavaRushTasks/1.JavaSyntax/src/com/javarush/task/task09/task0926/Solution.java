package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[5]);
        list.add(new int[2]);
        list.add(new int[4]);
        list.add(new int[7]);
        list.add(new int[0]);
//        int[] a = new int[5];
//        int[] b = new int[2];
//        int[] c = new int[4];
//        int[] d = new int[7];
//        int[] e = new int[0];
//        for (int i=0;i<a.length;i++){
//            a[i]=1+i;
//        }
//        for (int i=0;i<b.length;i++){
//            b[i]=1+i;
//        }
//        for (int i=0;i<c.length;i++){
//            c[i]=1+i;
//        }
//        for (int i=0;i<d.length;i++){
//            d[i]=1+i;
//        }
//        for (int i=0;i<e.length;i++){
//            e[i]=1+i;
//        }
//
//        for (int i=0;i<list.size();i++){
//            list.add(i, a);
//        }
//        for (int i=0;i<list.size();i++){
//            list.add(i, b);
//        }
//        for (int i=0;i<list.size();i++){
//            list.add(i, c);
//        }
//        for (int i=0;i<list.size();i++){
//            list.add(i, d);
//        }
//        for (int i=0;i<list.size();i++){
//            list.add(i, e);
//        }
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
