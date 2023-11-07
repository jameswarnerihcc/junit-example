package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Person person = new Person(14, "James");
        person.setName("James");
    }

    public static double calcTotal(double cost, double taxRate) {
        if(taxRate < 0) {
            taxRate = 0;
        }
        return cost * (1 + taxRate);
    }
}