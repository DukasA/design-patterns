import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog implements Subject {
    private List<Book> books;
    private List<Observer> observers;
    private static LibraryCatalog instance;

    private LibraryCatalog() {
        books = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObservers(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Library catalog is empty.");
        } else {
            books.forEach(Book::displayInfo);
        }
    }
}
