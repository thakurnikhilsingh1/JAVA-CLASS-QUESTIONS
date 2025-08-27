class Book {
    String title;
    String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("The Lord of the Rings", "J.R.R. Tolkien");
        books[1] = new Book("Pride and Prejudice", "Jane Austen");
        books[2] = new Book("1984", "George Orwell");
        System.out.println("Titles of the books:");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].title);
        }
    }
}
