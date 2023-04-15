package accounts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {
Account CreditAccount = new CreditAccount(-100);
    @Test
    void test_add_creditAccount() {
        long param = 200;
        long expected = -100;
        CreditAccount.add(param);
        Assertions.assertEquals(expected, CreditAccount.balance);
    }
}