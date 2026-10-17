
import java.util.ArrayList;


interface Printable{
    void printDetails();

}

class Book implements Printable{
    private String title;
    private String author;
    private String isbn;

    private static int bookCount = 0;

    public Book(String title,String author, String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;

        bookCount++;
    }

    public static int getBookCount(){
        return bookCount;
    }

    public void displayDetails() {
        System.out.println(title + " by " + author);
    }

    @Override
    public void printDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("isbn: "+isbn);
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getisbn(){
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{title='" + title
                + "', author='" + author
                + "', isbn='" + isbn + "'}";
    }
}

class Library {

    private final String libraryName = "SVCE Library";

    public void displayLibraryName() {
        System.out.println(libraryName);
    }

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            book.displayDetails();
        }
    }
}

class EBook extends Book{
    private double fileSize;
    public EBook(String title,String author, String isbn,double fileSize){
        super(title,author,isbn);
        this.fileSize=fileSize;
    }
    @Override
    public String toString() {
        return "Book{title='" + getTitle()
                + "', author='" + getAuthor()
                + "', isbn='" + getisbn() 
                + "', Size='" + fileSize + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.displayLibraryName();

       EBook EB1=new EBook("Atomic Habits","James","ISBN01",45.8);
       Book B1=new Book("AI Enginnering", "Someone", "ISBN02");
       library.addBook(EB1);
       library.addBook(B1);
       library.displayBooks();
       EB1.printDetails();

       System.out.println(Book.getBookCount());
    }
}
