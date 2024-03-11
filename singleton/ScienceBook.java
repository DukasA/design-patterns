public class ScienceBook implements Book {
    @Override
    public void displayInfo() {
        System.out.println("Science Book: A journey through knowledge.");
    }

    @Override
    public String getCategory() {
        return "Science";
    }
}
