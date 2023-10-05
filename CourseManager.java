import java.util.ArrayList;
import java.util.List;

public class CourseManager implements Manageable<Course>{
        private List<Course> courseList;

    public CourseManager() {
        // Initialize the examList as an empty list
        courseList = new ArrayList<>();
    }

    @Override
    public void add(Course course) {
        courseList.add(course);
        System.out.println("[+] Course added: " + course.getName());
    }

    @Override
    public void delete(Course course) {
        courseList.remove(course);
        System.out.println("[-] Course deleted: " + course.getName());
    }

    @Override
    public List<Course> list() {
        return courseList;
    }
}

class Course{
private String courseID , name , teacher ;
private int credit ;

public Course(String courseID, String name, String teacher, int credit) {
    this.courseID = courseID;
    this.name = name;
    this.teacher = teacher;
    this.credit = credit;
}

public String getCourseID() {
    return courseID;
}

public void setCourseID(String courseID) {
    this.courseID = courseID;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getTeacher() {
    return teacher;
}

public void setTeacher(String teacher) {
    this.teacher = teacher;
}

public int getCredit() {
    return credit;
}

public void setCredit(int credit) {
    this.credit = credit;
}

@Override
public String toString() {
    return "Course [courseID=" + courseID + ", name=" + name + ", teacher=" + teacher + ", credit=" + credit + "]";
}

}