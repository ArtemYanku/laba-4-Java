import java.util.Arrays;
import java.util.Comparator;

class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int pageCount;
    private double price;
    private String coverType;

    public Book(int id, String title, String author, String publisher, int year, int pageCount, double price, String coverType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
        this.coverType = coverType;
    }

    // Getters and setters
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getCoverType() {
        return coverType;
    }

    public static Book[] createBookArray() {
        Book[] books = new Book[3]; // Assuming 3 books for demonstration
        books[0] = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", "Scribner", 1925, 180, 9.99, "Hardcover");
        books[1] = new Book(2, "To Kill a Mockingbird", "Harper Lee", "J.B. Lippincott & Co.", 1960, 281, 7.99, "Paperback");
        books[2] = new Book(3, "1984", "George Orwell", "Secker & Warburg", 1949, 328, 12.99, "Hardcover");
        return books;
    }

    // Method to sort books by author
    public static void sortBooksByAuthor(Book[] books) {
        Arrays.sort(books, Comparator.comparing(Book::getAuthor));
    }

    public static void printBooks(Book[] books) {
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Publisher: " + book.getPublisher());
            System.out.println("Year: " + book.getYear());
            System.out.println("Page Count: " + book.getPageCount());
            System.out.println("Price: $" + book.getPrice());
            System.out.println("Cover Type: " + book.getCoverType());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create an array of books
        Book[] books = Book.createBookArray();

        Book.sortBooksByAuthor(books);

        Book.printBooks(books);
    }
}
