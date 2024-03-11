import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private static LibraryCatalog instance;
    private List<Book> books;

    private LibraryCatalog() {
        books = new ArrayList<>();
    }

    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Library catalog is empty.");
        } else {
            books.forEach(book -> {
                System.out.println("[" + book.getCategory() + "] " + book.getClass().getSimpleName());
                book.displayInfo();
            });
        }
    }
}
