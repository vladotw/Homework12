package pro.sky.java.course1.HW12;

public class Author {
    private String firstName;
    private String lastName;


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String toString() {
        return getFirstName() + " " + getLastName();
    }

//    public String getAuthorName() {
//        return firstName + " " + lastName;
//    }


}
