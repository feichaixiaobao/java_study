public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void updatePrice() {
        if (price > 150) {
            price = 150;
        } else if (price > 100) {
            price = 100;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", 180);
        Book book2 = new Book("Data Structures", "Jane Doe", 90);

        book1.updatePrice();
        book2.updatePrice();

        System.out.println(book1.getTitle() + "的价格为：" + book1.getPrice());
        System.out.println(book2.getTitle() + "的价格为：" + book2.getPrice());
    }
}
