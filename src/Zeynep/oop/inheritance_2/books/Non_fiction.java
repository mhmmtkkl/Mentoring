package oop.inheritance_2.books;

public class Non_fiction extends Book {

    public String title;



    public Non_fiction(int page, String author, String language, String title) {
        super(page, author, language);
        this.title = title;
    }

//    @Override
//    public String toString() {
//        return "Book{" +
//                "page=" + page +
//                ", author='" + author + '\'' +
//                ", language='" + language + '\'' +
//                " title= " + title +
//                '}';
//    }

    public String toString() {
        return "NonFiction{" + super.toString() +
                "title='" + title
        ;
    }
}
