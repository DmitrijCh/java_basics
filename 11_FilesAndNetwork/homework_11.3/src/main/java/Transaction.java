import java.util.Date;

public class Transaction {
    private String type;
    private String number;
    private String currency;
    private Date dateOfTransaction;
    private String referenceOfTransaction;
    private String description;
    private double income;
    private double expense;


    public double getExpense() {
        return expense;
    }

    public double getIncome() {
        return income;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder{
        private Transaction transaction;

        public Builder(){
            transaction = new Transaction();
        }

        public Builder withType(String type){
            transaction.type = type;
            return this;
        }

        public Builder withNumber(String number){
            transaction.number = number;
            return this;
        }

        public Builder withCurrency(String currency){
            transaction.currency = currency;
            return this;
        }

        public Builder withDate(Date dateOfTransaction){
            transaction.dateOfTransaction = dateOfTransaction;
            return this;
        }

        public Builder withReferenceOfTransaction(String referenceOfTransaction){
            transaction.referenceOfTransaction = referenceOfTransaction;
            return this;
        }

        public Builder withDescription(String description){
            transaction.description = description;
            return this;
        }

        public Builder withIncome(double income){
            transaction.income = income;
            return this;
        }

        public Builder withExpense(double expense){
            transaction.expense = expense;
            return this;
        }

        public Transaction build(){
            return transaction;
        }
    }
}
