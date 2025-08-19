import java.util.HashMap;
import java.util.List;

public class ReaderReturnType
{
    private HashMap<String, Author> authors;
    private List<Book> books;

    public ReaderReturnType(HashMap<String, Author> authors, List<Book> books) 
    {
        this.authors = authors;
        this.books = books;
    }
    
    public HashMap<String, Author> getAuthors() {
        return authors;
    }
    
    public List<Book> getBooks() {
        return books;
    }
}
