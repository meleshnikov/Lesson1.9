import java.util.Arrays;

public class Library {
    private Book[] lib;

    public Library(int size) {
        lib = new Book[size];
    }

    public int getLibSize() {
        return lib.length;
    }

    public void addBook(Book book) {
        for (int i = 0; i < lib.length; i++) {
            if (isEmpty(lib[i])) {
                lib[i] = book;
                return;
            }
        }

        // если в массиве нет свободных ячеек
        // увеличиваем размер массива на 1
        // добавляем елемент в конец массива
        increaseLibSize();
        lib[lib.length - 1] = book;
    }

    // метод увеличивает размер массива lib на 1
    private void increaseLibSize() {
        lib = Arrays.copyOf(lib, lib.length + 1);
    }

    public void printBooks() {
        for (Book book : lib) {
            if (!isEmpty(book))
                book.printBook();
        }
    }

    private Book searchBook(String str) {
        for (Book book : lib) {
            if (!isEmpty(book)) {
                if (str.equals(book.getTitle()))
                    return book;
            }
        }
        return null;
    }

    public void printBookInfo(String title) {
        Book book = searchBook(title);
        if (!isEmpty(book)) {
            book.printInfo();
        } else
            System.out.println("Книга не найдена");
    }

    public void changePublicationYear(String title, int year) {
        Book book = searchBook(title);
        if (!isEmpty(book)) {
            book.setPublicationYear(year);
        } else
            System.out.println("Книга не найдена");
    }

    private boolean isEmpty(Book book) {
        return book == null;
    }
}
