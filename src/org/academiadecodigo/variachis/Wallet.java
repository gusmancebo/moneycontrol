package org.academiadecodigo.variachis;

public class Wallet extends Account {

    private CurrentAccount currentAccount;

    public Wallet() {
        currentAccount = new CurrentAccount(this);
    }

    public CurrentAccount getCurrentAccount() {
        return this.currentAccount;
    }


    @Override
    public void deposit(double cash) {
        if (!withdrawValidation(cash)) {
            return;
        }
        currentAccount.amount += cash;
        this.amount -= cash;
        System.out.println("You deposited $" + cash + " in your Current Account.");
        System.out.println("You have now the total amount of $" + currentAccount.amount + " in your Current Account and $" + amount + " in your wallet.\n");
    }


    @Override
    public void withdraw(double cash) {
        if (!withdrawValidation(cash)) {
            return;
        }
        amount -= cash;
        System.out.println("You withdrew $" + cash + " of your wallet.");
        System.out.println("You have now the total amount of $" + amount + " in your wallet.\n");
    }

}