public class Book 
{
    private String title;
    private Author author;
    private double userRating;
    private int reviews;
    private int price;
    private int year;
    private String genre;

    public Book(String title, Author author, double userRating, int reviews, int price, int year, String genre) 
    {
        this.title = title;
        this.author = author;
        this.userRating = userRating;
        this.reviews = reviews;
        this.price = price;
        this.year = year;
        this.genre = genre;
    }
    
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Author getAuthor() { return author; }
    public void setAuthor(Author author) { this.author = author; }

    public double getUserRating() { return userRating; }
    public void setUserRating(double userRating) { this.userRating = userRating; }
    
    public int getReviews() { return reviews; }
    public void setReviews(int reviews) { this.reviews = reviews; }
    
    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
    
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public void printDetails()
    {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author.getName());
        System.out.println("User Rating: " + userRating);
        System.out.println("Reviews: " + reviews);
        System.out.println("Price: " + price);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("-----------------------------");
    }
}
