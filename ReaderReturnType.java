import java.util.HashMap;
import java.util.List;

public class ReaderReturnType
{
    HashMap<String, Author> authors;
    List<Book> books;

    public ReaderReturnType(HashMap<String, Author> authors, List<Book> books) 
    {
        this.authors = authors;
        this.books = books;
    }
}
