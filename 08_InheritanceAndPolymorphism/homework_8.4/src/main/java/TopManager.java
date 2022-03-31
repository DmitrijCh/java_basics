public class TopManager implements Employee {
    public static int FIX_SALARY = 1500000;
    private Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    public int getMonthSalary() {
        return FIX_SALARY + Company.getIncome() > 10000000 ? (int) (FIX_SALARY * 1.5) : 0;
    }
}