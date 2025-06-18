package DependencyInjectionExample;


public class CustomerService {
    private CustomerRepository repository;

    // Constructor injection
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void showCustomer(String id) {
        String customer = repository.findCustomerById(id);
        System.out.println("Customer details: " + customer);
    }
}

