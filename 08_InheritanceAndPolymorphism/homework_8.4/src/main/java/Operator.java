public class Operator implements Employee {
    private static final int FIX_SALARY = 30000;
    private Company company;

    public Operator(Company company) {
        this.company = company;
    }

    public int getMonthSalary() {
        return FIX_SALARY;
    }
}
