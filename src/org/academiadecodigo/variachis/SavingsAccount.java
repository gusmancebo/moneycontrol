package org.academiadecodigo.variachis;

public class SavingsAccount extends Account {

    CurrentAccount currentAccount;

    public SavingsAccount(CurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
    }


    @Override
    public void withdraw(double cash) {
        if (!withdrawValidation(cash)) {
            return;
        }
        amount -= cash;
        currentAccount.amount += cash;
        System.out.println("You withdrew $" + amount + " of your Savings Account.");
        System.out.println("You have now the total amount of $" + amount + " in your Savings Account and $" + currentAccount.amount + " in your Current Account. \n");
    }


}
