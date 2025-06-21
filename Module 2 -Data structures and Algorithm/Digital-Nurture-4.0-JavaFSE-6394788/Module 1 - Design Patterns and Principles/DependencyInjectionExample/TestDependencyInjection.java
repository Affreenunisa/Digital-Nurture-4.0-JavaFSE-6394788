package DependencyInjectionExample;

// File: TestDependencyInjection.java
public class TestDependencyInjection {
    public static void main(String[] args) {
        // Step 1: Create repository
        CustomerRepository repo = new CustomerRepositoryImpl();

        // Step 2: Inject into service
        CustomerService service = new CustomerService(repo);

        // Step 3: Use service
        service.showCustomer("C101");
    }
}
