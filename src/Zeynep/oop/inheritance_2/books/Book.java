package oop.inheritance_2.books;

public class Book {

    public int page;
    public String author;
    public String language;

    public Book(int page, String author, String language) {
        this.page = page;
        this.author = author;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Book{" +
                "page=" + page +
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
