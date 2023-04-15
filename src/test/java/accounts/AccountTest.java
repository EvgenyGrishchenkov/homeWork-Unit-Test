package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account CreditAccount = new CreditAccount(-100);
    Account SavingAccount = new SavingAccount(200, 100);
    Account CheckingAccount = new CheckingAccount(500);

    @Test
    void test_transfer_accounts() {
        int param = 150;
        boolean expected = false;
        boolean expected2 = true;
        SavingAccount.transfer(CheckingAccount, param);
        Assertions.assertFalse(expected);

        CheckingAccount.transfer(CreditAccount, param);
        Assertions.assertFalse(expected);

        CheckingAccount.transfer(SavingAccount, param);
        Assertions.assertTrue(expected2);

    }

    @Test
    void test_accept_accounts() {
        int param = 250;
        boolean expected = false;
        CreditAccount.accept(param);
        Assertions.assertFalse(expected);
    }
}