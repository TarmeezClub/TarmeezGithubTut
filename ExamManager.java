import java.util.ArrayList;
import java.util.List;

public class ExamManager implements Manageable<Exam> {
    private List<Exam> examList;

    public ExamManager() {
        // Initialize the examList as an empty list
        examList = new ArrayList<>();
    }

    @Override
    public void add(Exam exam) {
        examList.add(exam);
        System.out.println("[+] Exam added: " + exam.getSubject());
    }

    @Override
    public void delete(Exam exam) {
        examList.remove(exam);
        System.out.println("[-] Exam deleted: " + exam.getSubject());
    }

    @Override
    public List<Exam> list() {
        return examList;
    }
}

class Exam {
    private String examID;
    private String subject;
    private String date;

    public Exam(String examID, String subject, String date) {
        this.examID = examID;
        this.subject = subject;
        this.date = date;
    }

    // Getters and setters for the Exam class properties
    public String getExamID() {
        return examID;
    }

    public void setExamID(String examID) {
        this.examID = examID;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Exam ID: " + examID + "\n" +
                "Subject: " + subject + "\n" +
                "Date: " + date + "\n";
    }
}
