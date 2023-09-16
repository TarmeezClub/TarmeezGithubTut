public class Tester {
    public static void main(String[] args) {

        // --------- Create instances of entity classes ---------
        Student student1 = new Student("S1", "John", "Doe", "1995-01-15", "john@example.com");
        Student student2 = new Student("S2", "Alice", "Smith", "1998-05-20", "alice@example.com");


        // --------- Create instances of manager classes ---------
        StudentManager studentManager = new StudentManager();

        // --------- Add entities using manager classes ---------
        studentManager.add(student1);
        studentManager.add(student2);

        // --------- List entities using manager classes ---------
        System.out.println("\nList of Students:");
        for(Student student: studentManager.list()) {
            System.out.println(student);
        }
    }
}