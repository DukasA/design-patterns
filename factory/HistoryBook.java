public class HistoryBook implements Book {
    @Override
    public void displayInfo() {
        System.out.println("History Book: Learning from the past.");
    }

    @Override
    public String getCategory() {
        return "History";
    }
}
