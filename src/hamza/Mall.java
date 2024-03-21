package Mall;

import java.util.ArrayList;

public class Mall {

    private final String name;

    public final ArrayList<Customer> customers = new ArrayList<>();

    Mall(String name) {

        this.name = name;
    }

    ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    void show() {
        System.out.println(customers);
    }
}
