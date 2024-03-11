public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        catalog.addBook(new ScienceBook());
        catalog.addBook(new FictionBook());
        catalog.addBook(new HistoryBook());

        catalog.displayBooks();
    }
}
