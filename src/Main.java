public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Cay", "Horstmann");
        Book book1 = new Book("Core Java: Fundamentals", author1, 2018);

        Author author2 = new Author("Joshua", "Bloch");
        Book book2 = new Book("Effective Java", author2, 2022);

        Author author3 = new Author("Stephen", "King");
        Book book3 = new Book("The Stand", author3, 1978);

        Library booksLib = new Library(5);
        booksLib.addBook(book1);
        booksLib.addBook(book2);
        booksLib.addBook(book3);

        booksLib.printBooks();
        booksLib.printBookInfo("Core Java: Fundamentals");
        booksLib.changePublicationYear("The Stand", 2002);
        booksLib.printBookInfo("The Stand");
        booksLib.printBookInfo("Война и мир");
    }
}