package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckingAccountTest {
    Account CheckingAccount = new CheckingAccount(100);

    @Test
    void test_pay_checkingAccount() {
        long param = 50;
        long expected = 50;
        CheckingAccount.pay(param);
        Assertions.assertEquals(expected, CheckingAccount.balance);

    }
}