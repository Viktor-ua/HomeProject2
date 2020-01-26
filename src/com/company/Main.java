package com.company;

public class Main {


    public static void main(String[] args) {

//        Person p1 = new Person("John", "Snow", 1);
//        Person p2 = new Person("Tyrion", "Lannister", 2);

        Developer d1 = new Developer("Linus", "Torvalds", 5);
        Developer d2 = new Developer("Ivan", "Smith", 10);

//        System.out.println(p1.getFirstName() + " " + p2.getLastName());
//        System.out.println(d1.getFirstName() + " " + d2.getLastName());
        d1.changeId();
        d1.delelop("Write code");
    }
}
