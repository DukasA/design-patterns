import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooksByCategory(String category) {
        List<Book> booksInCategory = books.stream()
                .filter(book -> book.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
        if (booksInCategory.isEmpty()) {
            System.out.println("No books found in category: " + category);
        } else {
            System.out.println("Books in " + category + ":");
            booksInCategory.forEach(Book::displayInfo);
        }
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("All books in the library:");
            books.forEach(Book::displayInfo);
        }
    }
}
