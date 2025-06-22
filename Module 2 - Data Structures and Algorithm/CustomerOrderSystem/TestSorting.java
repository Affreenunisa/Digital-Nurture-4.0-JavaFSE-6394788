package CustomerOrderSystem;

public class TestSorting {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 750.0),
            new Order("O002", "Bob", 1500.0),
            new Order("O003", "Charlie", 300.0),
            new Order("O004", "David", 1200.0)
        };

        // Bubble Sort
        System.out.println("🔃 Bubble Sort by Total Price:");
        BubbleSort.sort(orders);
        for (Order o : orders) System.out.println(o);

        // Reset orders array
        orders = new Order[]{
            new Order("O001", "Alice", 750.0),
            new Order("O002", "Bob", 1500.0),
            new Order("O003", "Charlie", 300.0),
            new Order("O004", "David", 1200.0)
        };

        // Quick Sort
        System.out.println("\n⚡ Quick Sort by Total Price:");
        QuickSort.sort(orders, 0, orders.length - 1);
        for (Order o : orders) System.out.println(o);
    }
}
