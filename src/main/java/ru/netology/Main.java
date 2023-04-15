package ru.netology;

import accounts.Account;

import accounts.CheckingAccount;

import accounts.CreditAccount;

import accounts.SavingAccount;

import clients.Client;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Васёк", 3);

        client.addAccount(new CreditAccount(-500_000_000));
        client.addAccount(new SavingAccount(300_000_000, 100_000_000));
        client.addAccount(new CheckingAccount(200_000_000));
        client.addAccount(new CheckingAccount(100_000_000));

        client.pay(250_000_000);
        client.accept(800_000_000);
        //System.out.println(accounts[1].balance);

        Account savingAccount = new SavingAccount(100_000_000, 50_000_000);
        Account creditAccount = new CreditAccount(-50_000);
        Account checkingAccount = new CheckingAccount(200_000_000);

        System.out.println(savingAccount.balance);
        System.out.println(creditAccount.balance);
        System.out.println(checkingAccount.balance);
        boolean b = savingAccount.transfer(creditAccount, 40_000);
        System.out.println(b);

        creditAccount.accept(10_000);

        System.out.println(savingAccount.balance);
        System.out.println(creditAccount.balance);
        System.out.println(checkingAccount.balance);
    }

}
