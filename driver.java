import java.util.HashMap;
import java.util.List;

public class driver 
{
    private HashMap<String, Author> authors;
    private List<Book> books;
    public driver()
    {
        Reader reader = new DataSetReader();
        ReaderReturnType data = reader.readBooks();
        this.authors = data.getAuthors();
        this.books = data.getBooks();
    }

    // Getter methods for private fields
    public HashMap<String, Author> getAuthors() {
        return authors;
    }
    
    public List<Book> getBooks() {
        return books;
    }

    public void totalBooksByAuthor(String authorName)
    {
        Author author = authors.get(authorName);
        if (author != null) 
        {
            System.out.println("Total books by " + authorName + ": " + author.getBookCount());
        } 
        else 
        {
            System.out.println("Author not found");
        }
    }

    public void getAllAuthors()
    {
        System.out.println("Authors in the dataset:");
        for (String authorName : authors.keySet()) 
        {
            System.out.println(authorName);
        }
    }

    public void getBooksByAuthor(String authorName)
    {
        Author author = authors.get(authorName);
        if (author != null)
        {
            System.out.println("Books by " + authorName + ":");
            for (String bookName : author.getBookNames())
            {
                System.out.println(bookName);
            }
        }
        else
        {
            System.out.println("Author not found");
        }
    }
    
    public void getBooksByRating(double rating)
    {
        for(Book book : books)
        {
            if(book.getUserRating() == rating)
            {
                System.out.println(book.getTitle());
            }
        }
    }

    public void getBooksPriceByAuthor(String authorName)
    {
        Author author = authors.get(authorName);
        if (author != null) 
        {
            System.out.println("Books by " + authorName + " with their prices:");
            for(Book book : author.getBooks())
            {
                System.out.println(book.getTitle() + " " + book.getPrice());
            }
        }
        else
        {
            System.out.println("Author not found");
        }
    }
}
