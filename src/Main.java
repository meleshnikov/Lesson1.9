import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Война и мир", author1, 1867);

        Author author2 = new Author("Александр", "Пушкин");
        Book book2 = new Book("Капитанская дочка", author2, 1836);

        Author author3 = new Author("Stephen", "King");
        Book book3 = new Book("The Stand", author3, 1978);

        Book[] b = new Book[4];

        addBook(book1, b);
        addBook(book2, b);
        addBook(book3, b);

        printAllBooks(b);

    }

    public static Book[] increaseArraySize(Book[] books) {
        Book[] tmp = Arrays.copyOf(books, books.length + 1);
        books = tmp;
        return books;
    }

    public static void addBook(Book book, Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (isEmpty(books[i])) {
                books[i] = book;
                return;
            }
        }

        books = increaseArraySize(books);
        books[books.length - 1] = book;
    }

    public static boolean isEmpty(Book book) {
        if (book == null)
            return true;
        return false;
    }

    public static String getFormatString(Book book) {
        if (isEmpty(book))
            return "Книга отсутвует";

        String authorName = book.getAuthor().getName();
        String lastName = book.getAuthor().getLastName();
        String title = book.getTitle();
        String year = String.valueOf(book.getPublicationYear());
        return String.format("%s %s: %s: %s", lastName, authorName, title, year);
    }

    public static void printBook(Book book) {
        System.out.println(getFormatString(book));
    }

    public static void printAllBooks(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (!isEmpty(books[i]))
                printBook(books[i]);
        }
    }

}