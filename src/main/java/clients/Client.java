package clients;

import accounts.Account;

import moneyTarget.MoneyTarget;
public class Client implements MoneyTarget {
    private String name;
    private Account[] accounts;

    public Client(String name, int maxAccounts) {
        this.name = name;
        this.accounts = new Account[maxAccounts];
    }

    public void addAccount(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return;
            }
        }
        System.out.println("Используется максимальное количество счетов :)");
    }

    public String toString() {
        return name + " " + accounts;
    }

    public boolean pay(int amount) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].pay(amount)) {
                System.out.println("Операция платежа выполнена со счета: " + (i + 1));
                return true;
            }
        }
        System.out.println("Операция платежа не выполнена");
        return false;
    }

    public boolean accept(int money) {
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("На счет № " + (i + 1));
            if (accounts[i] != null && accounts[i].accept(money)) {
                return true;
            }
        }
        return false;
    }

}
