public class ScienceBookFactory extends BookFactory {
    @Override
    public Book createBook() {
        return new ScienceBook();
    }
}
