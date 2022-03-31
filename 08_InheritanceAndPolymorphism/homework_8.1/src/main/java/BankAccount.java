public class BankAccount {
  public double amount = 0;

  public double getAmount() {
    return amount;
  }

  public void put(double amountToPut) {
    if (amountToPut > 0) {
      amount = amount + amountToPut;
    }
  }

  public double take(double amountToTake) {
    if (amountToTake <= amount) {
      amount = amount - amountToTake;
    }
    return amount;
  }

  boolean send(BankAccount receiver, double amount) {
    receiver.take(amount);
    return receiver.getAmount() > 0;
  }
}
