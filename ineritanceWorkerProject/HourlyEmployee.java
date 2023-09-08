public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(long employeeId, String hireDate, double hourlyPayRate, boolean isRetired) {
        super(employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

}
