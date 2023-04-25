package Home_Work.lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Имя1", "Фамилия1");
        Book book1 = new Book("Название книги 1", author1, 2020);
        Author author2 = new Author("Имя2", "Фамилия2");
        Book book2 = new Book("Название книги 2", author2, 2030);
        book2.setBookYear(2050);
    }
}
