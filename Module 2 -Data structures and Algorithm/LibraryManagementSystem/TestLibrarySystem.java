package LibraryManagementSystem;

public class TestLibrarySystem {
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "The Alchemist", "Paulo Coelho"),
            new Book(102, "Wings of Fire", "A.P.J. Abdul Kalam"),
            new Book(103, "Clean Code", "Robert C. Martin"),
            new Book(104, "The Monk Who Sold His Ferrari", "Robin Sharma")
        };

        System.out.println(" Linear Search for 'Clean Code':");
        Book linearResult = BookSearch.linearSearch(books, "Clean Code");
        System.out.println(linearResult != null ? linearResult : "Not found");

        System.out.println("\n Binary Search for 'Clean Code':");
        Book binaryResult = BookSearch.binarySearch(books, "Clean Code");
        System.out.println(binaryResult != null ? binaryResult : "Not found");
    }
}

