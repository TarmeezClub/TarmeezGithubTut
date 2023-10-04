import java.util.ArrayList;
import java.util.List;

public class Project implements Manageable<Project> {
    private String projectID;
    private String name;
    private String description;
    private List<Project> projectList;

    public Project() {
        projectList = new ArrayList<>();
    }

    public Project(String projectID, String name, String description) {
        this.projectID = projectID;
        this.name = name;
        this.description = description;
        projectList = new ArrayList<>();
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void add(Project item) {
        projectList.add(item);
    }

    @Override
    public void delete(Project item) {
        projectList.remove(item);
    }

    @Override
    public List<Project> list() {
        return projectList;
    }

    public static void main(String[] args) {
        Project projectManager = new Project();

        Project project1 = new Project("1", "Project A", "Description A");
        Project project2 = new Project("2", "Project B", "Description B");

        projectManager.add(project1);
        projectManager.add(project2);

        List<Project> projects = projectManager.list();
        for (Project project : projects) {
            System.out.println("Project ID: " + project.getProjectID());
            System.out.println("Name: " + project.getName());
            System.out.println("Description: " + project.getDescription());
        }
    }
}