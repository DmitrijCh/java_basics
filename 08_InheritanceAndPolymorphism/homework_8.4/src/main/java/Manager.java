import java.util.ArrayList;
import java.util.List;

public final class Manager implements Employee {
    private  static  final  int FIX_SALARY = 50000;
    private final int earningsForCompany;
    private Company company;

    public Manager(Company company) {
        this.company = company;
        this.earningsForCompany = (int) (Math.random() * 2500) + 115000;
    }

    public int getMonthSalary() {
        return FIX_SALARY + (int) (earningsForCompany * 0.05);
    }
}