package org.academiadecodigo.variachis;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Januário", 1200);


        person.depositInWallet(800);


        person.getWallet().withdraw(500);

        person.getWallet().deposit(100);

        person.getWallet().getCurrentAccount().withdraw(5.9);

        person.getWallet().getCurrentAccount().deposit(5);

        person.getWallet().getCurrentAccount().getSavingsAccount().withdraw(2.5);

    }

}