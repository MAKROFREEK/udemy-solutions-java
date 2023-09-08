public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public boolean getIsRetired() {
        return isRetired;
    }

}
