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


    private Book searchBookByTitle(String str) {
        for (Book book : lib) {
            if (!isEmpty(book)) {
                if (str.equals(book.getTitle()))
                    return book;
            }
        }
        return null;
    }

    public void changePublicationYear(String title, int year) {
        Book book = searchBookByTitle(title);
        if (!isEmpty(book)) {
            book.setPublicationYear(year);
        } else
            System.out.println("Книга не найдена");
    }

    private boolean isEmpty(Book book) {
        return book == null;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Book b : lib) {
            str.append(b.toString()).append('\n');
        }
        return str.toString();
    }
}
