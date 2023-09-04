public class Bank {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //getters n setters


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //bank method
    public Bank() {

    }

    public void depositFunds(double amount) {
        System.out.println("Starting Balance: $" + accountBalance);
        accountBalance += amount;
        System.out.println("");
        System.out.println("Funds added: $" + amount);
        System.out.println("New Balance: $" + accountBalance);
    }
    public void withdrawFunds(double amount) {
        if (accountBalance - amount <- 0) {
        System.out.println("");
        System.out.println("No overdraft protection");
        } else {
            accountBalance -= amount;
            System.out.println("");

            System.out.println("Funds withdrawn: $" + amount);
            System.out.println("New Balance: $" + accountBalance);
        }
    }


}
