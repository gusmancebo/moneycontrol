package org.academiadecodigo.variachis;

public class Person {

    private String name;
    private double salary;
    private Wallet wallet = new Wallet();


    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Wallet getWallet(){
        return wallet;
    }


    public void depositInWallet(double cash) {
        if (!depositValidation(cash)) {
            System.out.println("There's not enough money to be withdrawn.\n");
            return;
        }
        wallet.amount += cash;
        salary -= cash;
        System.out.println("You deposited $" + cash + " in your wallet.");
        System.out.println("Now you have a $" + salary + " remaining salary and $" + wallet.getAmount() + " in your wallet.\n");
    }


    private boolean depositValidation(double cash) {
        if (cash > this.salary) {
            return false;
        }
        return true;
    }

}