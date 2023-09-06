public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("1234", 100, "Bob", "bob@me.com", "555-555-5555");

        Customer customer = new Customer("Bob", 1000, "bob@me.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmail());

    }
}

