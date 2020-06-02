package oop.inheritance_2.books;

public class BooksApp {

    public static void main(String[] args) {

        Fiction fiction = new Fiction(328, "George Orwell", "English");
        fiction.setGenre(" dystopian novel");

        System.out.println(fiction);
        System.out.println("------------");

        Non_fiction non_fiction = new Non_fiction(352, "Tara Westover", "English", "Educated");
        System.out.println(non_fiction);


    }
}
