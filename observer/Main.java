public class Main {
    public static void main(String[] args) {
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        Observer newArrivalObserver = new NewArrivalNotification();
        
        catalog.addObserver(newArrivalObserver);

        catalog.addBook(new ScienceBook());
        catalog.addBook(new FictionBook());
        catalog.addBook(new HistoryBook());
    }
}
