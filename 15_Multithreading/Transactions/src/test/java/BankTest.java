import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashMap;

public class BankTest extends TestCase {

    HashMap<String, Account> testAccounts = new HashMap<>();
    Bank bankTest = new Bank();

    long balanceFrom = 1000;
    long balanceTo = 2000;
    long amount = 100;
    String from = "01";
    String to = "02";

    @Override
    protected void setUp() throws Exception {

        testAccounts.put(from, new Account(from, balanceFrom));
        testAccounts.put(to, new Account(to, balanceTo));
    }

    @Test
    public void testGetBalance() {
        long actual = testAccounts.get(to).getMoney();
        long expected = 2000;
        assertEquals(actual, expected);
    }

    @Test
    public void testGetSumAllAccounts() {
        long actual = bankTest.getSumAllAccounts();
        long expected = 100000000;
        assertEquals(actual, expected);
    }

    @Test
    public void testTransfer() throws InterruptedException {
        testAccounts.get(from).amountWithdrawal(amount);
        testAccounts.get(to).amountAdd(amount);
        long actual = bankTest.getSumAllAccounts();
        long expected = 100000000;
        assertEquals(actual, expected);
    }

    @Override
    protected void tearDown() throws Exception {
    }
}

