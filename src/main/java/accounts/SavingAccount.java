package accounts;

public class SavingAccount extends Account {
    private int minBalance;

    public SavingAccount(long balance, int minBalance) {
        super(balance);
        this.minBalance = minBalance;
    }

    @Override
    public boolean pay(long amount) {
        if ((balance - amount) >= minBalance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
