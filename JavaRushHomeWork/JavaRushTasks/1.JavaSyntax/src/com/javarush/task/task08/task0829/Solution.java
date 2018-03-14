package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
//        List<String> addresses = new ArrayList<String>();
//        while (true) {
//            String family = reader.readLine();
//            if (family.isEmpty()) break;
//
//            addresses.add(family);
//        }

        //read home number
//        int houseNumber = Integer.parseInt(reader.readLine());


//        if (0 <= houseNumber && houseNumber < addresses.size()) {
//            String familySecondName = addresses.get(houseNumber);
//            System.out.println(familySecondName);
//        }

//        Map<String,String> map = new HashMap<String,String>();
//        map.put("Москва","Ивановы");
//        map.put("Киев","Петровы");
//        map.put("Лондон","Абрамовичи");
//        String s = reader.readLine();
//
//        for (Map.Entry<String,String> pair : map.entrySet()){
//            String key = pair.getKey();
//            String value = pair.getValue();
//            if (s.equals(key)){
//                System.out.println(value);
//            }
//        }
//list of addresses
        List<String> addresses = new ArrayList<String>();
        while (true)
        {
            //String city = reader.readLine();
            String family = reader.readLine();
            if (family.isEmpty()) break;
            //addresses.add(city);
            addresses.add(family);
        }

        //read home number
        /*
        int houseNumber = Integer.parseInt(reader.readLine());
        if (0 <= houseNumber && houseNumber < addresses.size())
        {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }
*/
        String cityname = reader.readLine();
        //System.out.println("-----------------");
        //System.out.println(addresses.size());
        //System.out.println("-----------------");
        for (int i = 0; i < addresses.size(); i=i+2)
        {
            //  System.out.println("START S = " + addresses.size() + " vs i = " + i);
            if (cityname.equals(addresses.get(i)))
            {
                System.out.println(addresses.get(i+1));
                // break;
            }
            //System.out.println("END  S = " + addresses.size() + " vs i = " + i);
        }




    }
}
