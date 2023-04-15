package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingAccountTest {
Account SavingAccount = new SavingAccount(100, 50);
    @Test
    void test_pay_savingAccount() {
        long param = 70;
        long expected = 100;
        SavingAccount.pay(param);
        Assertions.assertEquals(expected, SavingAccount.balance);
    }
}