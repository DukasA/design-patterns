public class FictionBookFactory extends BookFactory {
    @Override
    public Book createBook() {
        return new FictionBook();
    }
}
