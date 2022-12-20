package pro.sky.java.course1.HW12;

public class Book {
    private String bookTitle;
    private Author authorName;
    private int publicationYear;


    public Book(String title, Author author, int year) {
        this.bookTitle = title;
        this.authorName = author;
        this.publicationYear = year;
    }


    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getBookAuthorName() {
        return this.authorName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear() {
        this.publicationYear = publicationYear;
    }
}
