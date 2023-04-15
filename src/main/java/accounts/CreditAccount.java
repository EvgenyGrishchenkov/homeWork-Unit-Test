package accounts;

public class CreditAccount extends Account {
    private long maxBalance = 0;

    public CreditAccount(long balance) {
        super(balance);
    }

    @Override
    public boolean add(long amount) {
        if ((balance + amount) <= maxBalance) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }
}
