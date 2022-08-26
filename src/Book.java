public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    private String getBookString() {
        return String.format("%s %s: %s: %d",
                author.getLastName(), author.getName(), title, publicationYear);
    }

    private String getInfoString() {
        return String.format("%s by %s %s was published in %d",
                title, author.getName(), author.getLastName(), publicationYear);
    }

    public void printBook() {
        System.out.println(getBookString());
    }

    public void printInfo() {
        System.out.println(getInfoString());
    }

}
