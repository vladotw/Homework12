package pro.sky.java.course1.HW12;

public class Author {
    private String firstName;
    private String lastName;


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

//    public String getAuthorName() {
//        return firstName + " " + lastName;
//    }


}
