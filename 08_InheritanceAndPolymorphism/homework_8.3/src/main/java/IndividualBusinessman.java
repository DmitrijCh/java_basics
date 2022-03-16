public class IndividualBusinessman extends Client {
    public final double COMMISSION_WITHDRAWAL = 0.01;
    public final double COMMISSION_ADDITION1 = 0.01;
    public final double COMMISSION_ADDITION2 = 0.005;

    public double put(double amountToPut) {
        if (amountToPut > 0) {
            setAmount(super.put(amountToPut));
            if (amountToPut < 1000) {
                setAmount(getAmount() - amountToPut * COMMISSION_ADDITION1);
            } else {
                setAmount(getAmount() - amountToPut * COMMISSION_ADDITION2);
            }
        }
        return getAmount();
    }

    public double take(double amountToTake) {
        double preliminaryAmount = getAmount() - amountToTake - (amountToTake * COMMISSION_WITHDRAWAL);
        if (preliminaryAmount >= 0) {
            setAmount(preliminaryAmount);
        }
        return getAmount();
    }

    @Override
    public void printBankTerms() {
        System.out.println("Пополнение счета производится c комиссией 1% за каждую операцию, " + System.lineSeparator() +
                "если сумма пополнения меньше 1000 р. " + System.lineSeparator() +
                "Пополнение счета производится c комиссией 0,5% за каждую операцию, " + System.lineSeparator() +
                "если сумма пополнения от 1000 р" + System.lineSeparator() +
                "Баланс вашего счета: " + getAmount());
    }
}
