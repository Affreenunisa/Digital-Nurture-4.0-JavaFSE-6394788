package EcommerceSearchSystem;

public class TestSearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Mouse", "Electronics"),
            new Product("P002", "Keyboard", "Electronics"),
            new Product("P003", "Shoes", "Footwear"),
            new Product("P004", "Book", "Stationery")
        };

        System.out.println(" Linear Search:");
        Product result1 = LinearSearch.search(products, "Shoes");
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("\n Binary Search:");
        Product result2 = BinarySearch.search(products, "Shoes");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
