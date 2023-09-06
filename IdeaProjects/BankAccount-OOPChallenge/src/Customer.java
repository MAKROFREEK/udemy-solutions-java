public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public Customer() {
//        System.out.println("No Args & Calls Other Constructor");
        this("no name", "no@email.org");
    }
    public Customer(String name, String email) {
//        System.out.println("Names & Emails");
        this(name, 1000, email);
    }
    public Customer(String name, double creditLimit, String email) {
        this.creditLimit = creditLimit;
        this.name = name;
        this.email = email;
    }
}
