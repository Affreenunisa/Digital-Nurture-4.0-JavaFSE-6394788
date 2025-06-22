package EmployeeManagementSystem;
public class TestEmployeeSystem {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(5);

        manager.addEmployee(new Employee(101, "Alice", "Manager", 80000));
        manager.addEmployee(new Employee(102, "Bob", "Developer", 60000));
        manager.addEmployee(new Employee(103, "Charlie", "Analyst", 50000));

        System.out.println("\n All Employees:");
        manager.listEmployees();

        System.out.println("\n Searching for Employee ID 102:");
        Employee e = manager.searchEmployee(102);
        System.out.println(e != null ? e : "Not found");

        System.out.println("\n Deleting Employee ID 102:");
        manager.deleteEmployee(102);

        System.out.println("\n Updated Employee List:");
        manager.listEmployees();
    }
}

