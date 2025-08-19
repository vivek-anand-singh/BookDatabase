public class Main 
{
    public static void main(String[] args) 
    {
        driver bookDriver = new driver();
        
        System.out.println("=== Amazon Bestsellers Dataset Analysis ===\n");
        
        System.out.println("1. Total books by author:");
        bookDriver.totalBooksByAuthor("Stephen King");
        bookDriver.totalBooksByAuthor("JJ Smith");
        System.out.println();
        
        System.out.println("2. All authors in the dataset:");
        bookDriver.getAllAuthors();
        System.out.println();
        
        System.out.println("3. Books by author:");
        bookDriver.getBooksByAuthor("George Orwell");
        System.out.println();
        
        System.out.println("4. Books with rating 4.7:");
        bookDriver.getBooksByRating(4.7);
        System.out.println();
        
        System.out.println("5. Books and prices by author:");
        bookDriver.getBooksPriceByAuthor("Jordan B. Peterson");
        System.out.println();
        
        System.out.println("6. Sample book details:");
        if (!bookDriver.getBooks().isEmpty()) {
            bookDriver.getBooks().get(0).printDetails();
            if (bookDriver.getBooks().size() > 1) {
                bookDriver.getBooks().get(1).printDetails();
            }
        }
        
        System.out.println("=== Analysis Complete ===");
    }
}
