package srp.fix;

public class Employee {
    // as Facade
    private EmployeePayCalculator employeePayCalculator;
    private EmployeeStore employeeStore;

    public double calculatePay() {
        return employeePayCalculator.calculatePay();
    }

    public void store() {
        employeeStore.store();
    }
}
