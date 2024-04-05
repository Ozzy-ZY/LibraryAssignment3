package Library;
import  java.util.ArrayList;
import java.util.Collections;
public class Library {
    private ArrayList<Book>books = new ArrayList<>();
    public Library(Book[]books){
        Collections.addAll(this.books, books);
    }
    public Library(){};
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(Book book){
        books.remove(book);
    }
    public Book getBook(String title){
        for (Book book:books){
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }
    public Book getBookByAuthor(String author){
        author= author.toLowerCase();
        for (Book book:books){
            if (book.getAuthor().toLowerCase().equals(author)) return book;
        }
        return null;
    }
    public Book getBookByAuthor(String author, String title){
        author = author.toLowerCase();
        title = title.toLowerCase();
        for (Book book:books){
            if (book.getAuthor().toLowerCase().equals(author) && book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }
    /**
     * @param author of the book
     * @return Book[] an array containing all the books by the author
     */
    public Book[] getAllBooksByAuthor(String author){
        author = author.toLowerCase();
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for(Book book:books){
            if(book.getAuthor().toLowerCase().equals(author)){
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor.toArray(new Book[0]);
    }
    public void displayAvailableBooks(){
        for (Book book:books){
            if (book.getAvailabilityStatus()){
                System.out.println("-------------------------");
                System.out.println(book);
                System.out.println("-------------------------");
            }
        }
    }
}