public class Teacher {
    private String teacherID;
    private String firstName;
    private String lastName;
    private String email;

    // Constructor to initialize the attributes
    public Teacher(String teacherID, String firstName, String lastName, String email) {
        this.teacherID = teacherID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Getter methods for accessing the attributes
    public String getTeacherID() {
        return teacherID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    // Override toString method to provide a formatted string representation
    @Override
    public String toString() {
        return "Teacher ID: " + teacherID + "\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Email: " + email;
    }
}
