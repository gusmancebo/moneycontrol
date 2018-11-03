package org.academiadecodigo.variachis;

public abstract class Account {

    protected double amount;


    public double getAmount() {
        return this.amount;
    }


    public void deposit(double cash){
    }


    public abstract void withdraw(double cash);


    protected boolean withdrawValidation(double cash) {
        if (cash > this.amount) {
            System.out.println("There's not enough money to be withdrawn.\n");
            return false;
        }
        return true;
    }


}