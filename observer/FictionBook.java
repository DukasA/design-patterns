public class FictionBook implements Book {
    @Override
    public void displayInfo() {
        System.out.println("Fiction Book: A tale of wonder.");
    }

    @Override
    public String getCategory() {
        return "Fiction";
    }
}
