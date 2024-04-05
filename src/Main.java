import Library.Library;
import Library.Book;
public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Title1", "Zyad", "Novel", true),
                new Book("Title2", "Zyad", "Fiction", true),
                new Book("Title3", "ozzy", "Horror", false),
                new Book("Title4", "Mohamed", "Romance", true),
                new Book("Title5", "Ahmed", "Action", true),
                new Book("Title6", "Ali", "Adventure", true),
        };
        Library library = new Library(books);
        library.displayAvailableBooks();
        library.addBook(new Book("Title7", "Ali", "Adventure", true));
        System.out.println(library.getBookByAuthor("Ali"));
        Book[] booksByAuthor = library.getAllBooksByAuthor("zyad");
        for(Book book:booksByAuthor){
            System.out.println(book);
        }
        library.removeBook(library.getBook("Title1"));
        library.displayAvailableBooks();

    }
}