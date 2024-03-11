public class HistoryBookFactory extends BookFactory {
    @Override
    public Book createBook() {
        return new HistoryBook();
    }
}
