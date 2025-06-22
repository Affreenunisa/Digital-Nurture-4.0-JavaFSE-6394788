package DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(String id) {
        // Simulate fetching from DB
        return "Customer[ID=" + id + ", Name=Affreen Unisa]";
    }
}