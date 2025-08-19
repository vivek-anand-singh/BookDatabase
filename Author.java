import java.util.ArrayList;
import java.util.List;

public class Author 
{
    private String name;
    private List<Book> books;
    
    public Author(String name)
    {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Book> getBooks() { return books; }

    public void addBook(Book book) { books.add(book); }

    public int getBookCount() { return books.size(); }

    public List<Integer> priceOfBooks() 
    {
        List<Integer> prices = new ArrayList<>();
        for (Book book : books) 
        {
            prices.add(book.getPrice());
        }
        return prices;
    }

    public List<String> getBookNames() 
    {
        List<String> names = new ArrayList<>();
        for (Book book : books) 
        {
            names.add(book.getName());
        }
        return names;
    }
}
