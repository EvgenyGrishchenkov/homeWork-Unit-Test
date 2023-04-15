package accounts;

import moneyTarget.MoneyTarget;
public abstract class Account implements MoneyTarget{
    public long balance;

    Account(long balance) {
        this.balance = balance;
    }

    public boolean pay(long amount) {
        balance -= amount;
        return true;
    }

    public boolean add(long amount) {
        balance += amount;
        return true;
    }

    public boolean transfer(Account accountTo, int amount) {
        if (pay(amount)) {
            if (accountTo.add(amount)) {
                System.out.println("Перевод выполнен");
                return true;
            } else {
                add(amount);
                System.out.println("Перевод невозможен");
                return false;
            }
        } else {
            System.out.println("Перевод невозможен");
            return false;
        }
    }

    public boolean accept(int money) {
        if (add(money)) {
            System.out.println("Пополнение возможно");
            pay(money);
            return true;
        } else {
            System.out.println("Пополнение невозможно");
            return false;
        }
    }
}
