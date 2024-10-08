
public class Book extends ItemForSale {
    private String publisher;
    private Author author;
    
    public Book(String name, double price, String publisher, Author author) {
        super(name, price);
        this.publisher = publisher;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
}
