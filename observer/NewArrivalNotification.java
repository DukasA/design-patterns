public class NewArrivalNotification implements Observer {
    @Override
    public void update(Book book) {
        System.out.println("New book arrived: ");
        book.displayInfo();
    }
}
