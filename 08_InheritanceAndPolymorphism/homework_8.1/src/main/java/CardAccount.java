public class CardAccount extends BankAccount {
    public final double COMMISSION_PERCENT = 0.01;

    public double take(double amountToTake) {
        double preliminaryAmount = amount - amountToTake - (amountToTake * COMMISSION_PERCENT);

        if (preliminaryAmount >= 0) {
            amount = preliminaryAmount;
        }
        return amount;
    }
}
