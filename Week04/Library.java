package Week04;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // View All Books
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Common Method (Refactoring)
    private Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    // Update Book
    public void updateBook(int id, String title,
                           String author, String isbn,
                           int year) {

        Book book = findBookById(id);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        book.setTitle(title);
        book.setAuthor(author);
        book.setIsbn(isbn);
        book.setPublicationYear(year);

        System.out.println("Book updated successfully!");
    }

    // Delete Book
    public void deleteBook(int id) {

        Book book = findBookById(id);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        books.remove(book);
        System.out.println("Book deleted successfully!");
    }
}