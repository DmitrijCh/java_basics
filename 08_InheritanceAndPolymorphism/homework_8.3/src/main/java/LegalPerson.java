public class LegalPerson extends Client {
    public final double COMMISSION_PERCENT = 0.01;

    public double take(double amountToTake) {
        double preliminaryAmount = getAmount() - amountToTake - (amountToTake * COMMISSION_PERCENT);

        if (preliminaryAmount >= 0) {
            setAmount(preliminaryAmount);
        }
        return getAmount();
    }

    @Override
    public void printBankTerms() {
        System.out.println("Пополнение и списание денег со счета производится c комиссией 1%. " +
                "Баланс вашего счета: " + getAmount());
    }
}
