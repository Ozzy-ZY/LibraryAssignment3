package Library;
public class Book {
    private String
            title,
            author,
            genre;
    private boolean AvailabilityStatus;
    public Book(String title, String author, String genre, boolean AvailabilityStatus){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.AvailabilityStatus = AvailabilityStatus;
    }
    public Book(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.genre = "Unknown";
        this.AvailabilityStatus = false;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author= author;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void setAvailabilityStatus(boolean AvailabilityStatus){
        this.AvailabilityStatus = AvailabilityStatus;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }
    public boolean getAvailabilityStatus(){
        return AvailabilityStatus;
    }
    @Override
    public String toString(){
        return "Title: "+title+"\nAuthor: "+author+"\nGenre: "+genre+
                "\nAvailability: "+(AvailabilityStatus?"Available":"Not available");
    }
}