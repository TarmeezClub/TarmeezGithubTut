public class Tester {
    public static void main(String[] args) {
        //Student Class Test
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

        //Exam Class Test
        // --------- Create instances of entity classes ---------
        Exam exam1 = new Exam("E1", "Math", "2023-10-4");
        Exam exam2 = new Exam("E2", "Programming", "2023-10-5");

        // --------- Create instances of manager classes ---------
        ExamManager examManager = new ExamManager();

        // --------- Add entities using manager classes ---------
        examManager.add(exam1);
        examManager.add(exam2);

        // --------- List entities using manager classes ---------
        System.out.println("\nList of Exams:");
        for (Exam exam : examManager.list()) {
            System.out.println(exam);
        }

         //Course Class Test
        // --------- Create instances of entity classes ---------
        Course course1 = new Course("1001", "Math", "Dr.Hamza",3);
        Course course2 = new Course("1002", "Programming", "Dr.Ziyad", 4);

        // --------- Create instances of manager classes ---------
        CourseManager courseManager = new CourseManager();

        // --------- Add entities using manager classes ---------
        courseManager.add(course1);
        courseManager.add(course2);

        // --------- List entities using manager classes ---------
        System.out.println("\nList of Course:");
        for (Course course : courseManager.list()) {
            System.out.println(course);
        }
    }

}