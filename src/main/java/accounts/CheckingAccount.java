package accounts;

public class CheckingAccount extends Account {
    public CheckingAccount(long balance) {
        super(balance);
    }

    @Override
    public boolean pay(long amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
