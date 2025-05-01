package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithBooks {
    String title;
    String author;
    int year;

    public ArrayListWithBooks(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "ArrayListWithBooks{title= '" + title + "',author='" + author + "',year=" + year + "}";
    }

    public static void main(String[] args) {
        List<ArrayListWithBooks> books = new ArrayList<>();
        books.add(new ArrayListWithBooks("Harry Potter", "Harry", 2012));
        books.add(new ArrayListWithBooks("Finance", "B.R.Ambedkar", 1950));
        books.add(new ArrayListWithBooks("Marketing", "C", 2000));
        System.out.println(books);

    }
}