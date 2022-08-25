public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Война и мир", author1, 1867);
        Author author2 = new Author("Александр", "Пушкин");
        Book book2 = new Book("Капитанская дочка", author2, 1836);
        System.out.println("book2.getPublicationYear() = " + book2.getPublicationYear());
        book2.setPublicationYear(1845);
        System.out.println("book2.getPublicationYear() = " + book2.getPublicationYear());
    }

}