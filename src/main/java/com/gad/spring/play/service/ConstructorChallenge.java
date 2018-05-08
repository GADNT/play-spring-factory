package com.gad.spring.play.service;

public class ConstructorChallenge {

    public static void main(String... doyo) {
        Simpson simpson = new Simpson("Bart", 8);
        System.out.println(simpson.name + "," + simpson.age);
    }

    static class Dot{

        static {
            System.out.println("dot");
        }
    }
    static class Character extends Dot{

        String name;
        int age = 35;

        static {
            System.out.println("Dóh");
        }
Character(){}
        Character(String name, int age) {
            this.name = "Homer";
            this.age = age;
            System.out.println("c2");
        }
    }

    static class Simpson extends Character {
        Simpson(String name, int age) {
            super(name, age);
            System.out.println("c1");
        }
    }


}
