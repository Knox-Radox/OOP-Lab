class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean isAvailable;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.yearPublished = 0;
        this.isAvailable = true;
        System.out.println("Default book created: " + this.title);
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.yearPublished = 0;
        this.isAvailable = true;
        System.out.println("Book created: " + this.title + " by " + this.author);
    }

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = true;
        System.out.println("Book created: " + this.title + " by " + this.author + " (" + this.yearPublished + ")");
    }

    public Book(String title, String author, int yearPublished, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = isAvailable;
        System.out.println("Book created: " + this.title + " by " + this.author + " (" + this.yearPublished + "), Available: " + this.isAvailable);
    }

    public void displayBookDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is not available.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned: " + title);
        } else {
            System.out.println("This book is already available.");
        }
    }
}

public class ConstructorOverloading_1 {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book3 = new Book("1984", "George Orwell", 1949);
        Book book4 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, false);

        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();
        book4.displayBookDetails();

        book2.borrowBook();
        book4.borrowBook(); 
        book4.returnBook();
        book4.borrowBook(); 
    }
}
