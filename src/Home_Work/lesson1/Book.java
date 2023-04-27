package Home_Work.lesson1;

import java.util.Objects;

public class Book {
    private String bookName;
    private Author bookAuthor;
    private int bookYear;

    public Book(String bookName, Author bookAuthor, int bookYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getBookAuthor() {
        return this.bookAuthor;
    }

    public int getBookYear() {
        return this.bookYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        // Вариант сгенерированный автоматически
        //return bookYear == book.bookYear && Objects.equals(bookName, book.bookName) && Objects.equals(bookAuthor, book.bookAuthor);

        // Мой вариант
        // Можно использовать такой вариант? Если да, то в чем разница между моим и автоматически сгенерированным?
        return bookYear == book.bookYear && bookName.equals(book.bookName) && bookAuthor.equals(book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuthor, bookYear);
    }

    @Override
    public String toString() {
        return "Книга: " + bookName +
                "\nАвтор: " + bookAuthor +
                "\nГод выпуска: " + bookYear;
    }
}
