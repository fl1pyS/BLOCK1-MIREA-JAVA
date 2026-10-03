package lab2_mirea;

import java.util.Arrays;
import java.util.Comparator;

public class Bookshelf {
    private Book[] books;
    private int count;

    public Bookshelf(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Книжная полка заполнена");
        }
    }

    public Book getEarliestBook() {
        if (count == 0) {
            return null;
        }

        Book earliest = books[0];

        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < earliest.getYear()) {
                earliest = books[i];
            }
        }

        return earliest;
    }

    public Book getLatestBook() {
        if (count == 0) {
            return null;
        }

        Book latest = books[0];

        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > latest.getYear()) {
                latest = books[i];
            }
        }

        return latest;
    }

    public void sortByYear() {
        Arrays.sort(
                books,
                0,
                count,
                Comparator.comparingInt(Book::getYear)
        );
    }

    public void printBooks() {
        if (count == 0) {
            System.out.println("Полка пустая");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
}