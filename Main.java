public class Main {
    public static void main(String[] args) {
        // Create a store
        Store store = new Store();
        
        // Create an author
        Author author = new Author("Ray Bradbury", "1920-08-22");
        
        // Create a book and a movie
        Book book = new Book("Fahrenheit 451", 17.29, "Ballatine Books", author);
        Movie movie = new Movie("Oppenheimer", 14.99, "Christopher Nolan", 180);
        
        // Add items to the store
        store.addItem(book);
        store.addItem(movie);
        
        // Test creator method
        System.out.println("Creator of 'Oppenheimer': " + store.creator("Oppenheimer"));

        // Test author method
        System.out.println("Creator of 'Fahrenheit 451': " + store.creator("Fahrenheit 451"));

        // Show items available for sale
        System.out.println("Items available for sale:");
        store.showItems();
        
        // Test selling a book
        System.out.println("Selling book 'Fahrenheit 451':");
        store.sellItem("Fahrenheit 451");
        System.out.println("Total profit after selling the book: " + store.getProfit());

        
        // Show items after selling
        System.out.println("Items available for sale after selling '1984':");
        store.showItems();

        // Test selling a movie
        System.out.println("Selling movie 'Oppenheimer':");
        store.sellItem("Oppenheimer");
        System.out.println("Total profit after selling the movie: " + store.getProfit());

        // Show item after selling
        System.out.println("Items available for sale after selling '1984':");
        store.showItems();
        
        // Test instance check
        System.out.println("Is the book instance of ItemForSale? " + (book instanceof ItemForSale));
        System.out.println("Is the movie instance of ItemforSale? " + (movie instanceof ItemForSale));
    }
}
