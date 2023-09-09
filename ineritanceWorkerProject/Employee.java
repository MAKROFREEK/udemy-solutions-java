public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate, hireDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }
}