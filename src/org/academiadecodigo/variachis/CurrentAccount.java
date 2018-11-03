package org.academiadecodigo.variachis;

public class CurrentAccount extends Account {

    private Wallet wallet;
    private SavingsAccount savingsAccount;

    public CurrentAccount(Wallet wallet) {
        this.wallet = wallet;
        savingsAccount = new SavingsAccount(this);
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    @Override
    public void deposit(double cash) {
        if (!withdrawValidation(cash)) {
            return;
        }
        savingsAccount.amount += cash;
        amount -= cash;
        System.out.println("You deposited $" + cash + " in your Savings Account.");
        System.out.println("You have now the total amount of $" + amount + " in your Current Account and $" + savingsAccount.amount + " in your Savings Account.\n");
    }


    @Override
    public void withdraw(double cash) {
        if (!withdrawValidation(cash)) {
            return;
        }
        amount -= cash;
        wallet.amount += cash;
        System.out.println("You withdrew $" + cash + " of your Current Account.");
        System.out.println("You have now the total amount of $" + amount + " in your Current Account and $" + wallet.amount + " in your wallet.\n");
    }


}