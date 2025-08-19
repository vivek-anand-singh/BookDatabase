import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataSetReader extends Reader 
{
    @Override
    ReaderReturnType readBooks() 
    {
        String filePath = "bestsellers_with_categories.csv";
        String line;
        List<Book> books = new ArrayList<>();
        HashMap<String, Author> authors = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
        {
            // Skip the header row
            br.readLine();
            
            while ((line = br.readLine()) != null) 
            {
                String[] values = parseCSVLine(line);
                if (values.length >= 7) {
                    String title = values[0].trim();
                    String author = values[1].trim();
                    double userRating = Double.parseDouble(values[2].trim());
                    int reviews = Integer.parseInt(values[3].trim());
                    int price = Integer.parseInt(values[4].trim());
                    int year = Integer.parseInt(values[5].trim());
                    String genre = values[6].trim();
                    Author authorObj = authors.getOrDefault(author, new Author(author));
                    Book book = new Book(title, authorObj, userRating, reviews, price, year, genre);
                    books.add(book);
                    authorObj.addBook(book);
                    authors.put(author, authorObj);
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return new ReaderReturnType(authors, books);
    }
    
    private String[] parseCSVLine(String line) {
        List<String> result = new ArrayList<>();
        boolean inQuotes = false;
        StringBuilder currentField = new StringBuilder();
        
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            
            if (c == '"') {
                inQuotes = !inQuotes;
            } else if (c == ',' && !inQuotes) {
                result.add(currentField.toString());
                currentField = new StringBuilder();
            } else {
                currentField.append(c);
            }
        }
        
        // Add the last field
        result.add(currentField.toString());
        
        return result.toArray(new String[0]);
    }
}
