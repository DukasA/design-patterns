public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        BookFactory scienceBookFactory = new ScienceBookFactory();
        BookFactory fictionBookFactory = new FictionBookFactory();
        BookFactory historyBookFactory = new HistoryBookFactory();

        library.addBook(scienceBookFactory.createBook());
        library.addBook(fictionBookFactory.createBook());
        library.addBook(historyBookFactory.createBook());

        library.displayAllBooks();
        library.displayBooksByCategory("Science");
    }
}
