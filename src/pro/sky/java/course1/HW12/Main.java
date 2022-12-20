package pro.sky.java.course1.HW12;

public class Main {
    public static void main(String[] args) {

        Author itAuthor = new Author("Stephen", "King");
        Author darkStarAuthor = new Author("Вера", "Камша");
        System.out.println("itAuthor.getAuthorName() = " + itAuthor.getAuthorName());
        System.out.println("darkStarAuthor.getAuthorName() = " + darkStarAuthor.getAuthorName());
        String itAuthorNew = itAuthor.getAuthorName();
        System.out.println("itAuthorNew = " + itAuthorNew);

        Book bookIt = new Book("IT", itAuthor, 1986);
        System.out.println("bookIt.bookTitle = " + bookIt.getBookTitle());
        System.out.println("bookIt.authorName = " + bookIt.getBookAuthorName());
        System.out.println("bookIt.publicationYear = " + bookIt.getPublicationYear());

        Book bookDarkStar = new Book("Тёмная звезда", darkStarAuthor, 2001);
        System.out.println("bookDarkStar.bookTitle = " + bookDarkStar.getBookTitle());
        System.out.println("bookDarkStar.bookName = " + bookDarkStar.getBookAuthorName());
        System.out.println("bookDarkStar.publicationYear = " + bookDarkStar.getPublicationYear());
    }




}