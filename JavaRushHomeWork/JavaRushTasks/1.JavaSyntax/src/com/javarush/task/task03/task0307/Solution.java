package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
Создать 10 зергов, 5 протоссов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        Zerg zerg6 = new Zerg();
        Zerg zerg7 = new Zerg();
        Zerg zerg8 = new Zerg();
        Zerg zerg9 = new Zerg();
        Zerg zerg10 = new Zerg();
        zerg1.name = "Zerg1";
        zerg2.name = "Zerg2";
        zerg3.name = "Zerg3";
        zerg4.name = "Zerg4";
        zerg5.name = "Zerg5";
        zerg6.name = "Zerg6";
        zerg7.name = "Zerg7";
        zerg8.name = "Zerg8";
        zerg9.name = "Zerg9";
        zerg10.name = "Zerg10";

        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        Protoss protoss4 = new Protoss();
        Protoss protoss5 = new Protoss();
        protoss1.name = "Protoss1";
        protoss2.name = "Protoss2";
        protoss3.name = "Protoss3";
        protoss4.name = "Protoss4";
        protoss5.name = "Protoss5";

        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        Terran terran5 = new Terran();
        Terran terran6 = new Terran();
        Terran terran7 = new Terran();
        Terran terran8 = new Terran();
        Terran terran9 = new Terran();
        Terran terran10 = new Terran();
        Terran terran11 = new Terran();
        Terran terran12 = new Terran();
        terran1.name = "Terran1";
        terran2.name = "Terran2";
        terran3.name = "Terran3";
        terran4.name = "Terran4";
        terran5.name = "Terran5";
        terran6.name = "Terran6";
        terran7.name = "Terran7";
        terran8.name = "Terran8";
        terran9.name = "Terran9";
        terran10.name = "Terran10";
        terran11.name = "Terran11";
        terran12.name = "Terran12";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
