package com.company;

public class Developer extends Person {

    public Developer(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }

    public void delelop(String task){
        System.out.println("I'm doing the task: " + task + " now!");
    }

    @Override
    public void changeId(){
        System.out.println("Developer!");
    }
}
