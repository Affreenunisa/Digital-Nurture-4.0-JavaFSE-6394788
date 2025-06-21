package InventoryManagementSystem;

public class TestInventorySystem {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product("P001", "Mouse", 50, 299.0));
        manager.addProduct(new Product("P002", "Keyboard", 30, 549.0));

        System.out.println("Initial Inventory:");
        manager.viewAllProducts();

        manager.updateProduct("P002", 40, 529.0);

        System.out.println("\nAfter Update:");
        manager.viewAllProducts();

        manager.deleteProduct("P001");

        System.out.println("\nAfter Deletion:");
        manager.viewAllProducts();
    }
}
