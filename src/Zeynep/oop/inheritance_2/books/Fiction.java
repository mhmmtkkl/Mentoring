package oop.inheritance_2.books;

public class Fiction  extends Book{

    public String genre;

    public Fiction(int page, String author, String language) {
        super(page, author, language);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
