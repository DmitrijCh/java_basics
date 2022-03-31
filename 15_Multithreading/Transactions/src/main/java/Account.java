public class Account implements Comparable<Account> {

    private long money;

    private String accNumber;

    private boolean isBlocked;

    public Account(long money, String accNumber, boolean isBlocked) {
        this.money = money;
        this.accNumber = accNumber;
        this.isBlocked = isBlocked;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public synchronized void amountAdd(long amount) {//пополнение счета
        this.money += amount;
    }

    public synchronized void amountWithdrawal(long amount) {//снятие со счета
        this.money -= amount;
    }

    @Override
    public int compareTo(Account o) {
        return this.getAccNumber().compareTo(o.getAccNumber());
    }
}
