public class Main 
{
    public static void main(String[] args) 
    {
        driver bookDriver = new driver();
        
        System.out.println("=== Amazon Bestsellers Dataset Analysis ===\n");
        
        // Task 1: Total number of books by an author
        System.out.println("1. Total books by author:");
        bookDriver.totalBooksByAuthor("Stephen King");
        bookDriver.totalBooksByAuthor("JJ Smith");
        System.out.println();
        
        // Task 2: All authors in the dataset
        System.out.println("2. All authors in the dataset:");
        bookDriver.getAllAuthors();
        System.out.println();
        
        // Task 3: Names of all books by an author
        System.out.println("3. Books by author:");
        bookDriver.getBooksByAuthor("George Orwell");
        System.out.println();
        
        // Task 4: Classify with user rating
        System.out.println("4. Books with rating 4.7:");
        bookDriver.getBooksByRating(4.7);
        System.out.println();
        
        // Task 5: Price of all books by an author
        System.out.println("5. Books and prices by author:");
        bookDriver.getBooksPriceByAuthor("Jordan B. Peterson");
        System.out.println();
        
        // Demonstrate printDetails method
        System.out.println("6. Sample book details:");
        if (!bookDriver.books.isEmpty()) {
            bookDriver.books.get(0).printDetails();
            if (bookDriver.books.size() > 1) {
                bookDriver.books.get(1).printDetails();
            }
        }
        
        System.out.println("=== Analysis Complete ===");
    }
}
