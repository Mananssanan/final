import java.util.ArrayList;

class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
class Job {
    private String position;
    private int empID;
    
    public Job(String position, int empID) {
        this.position = position;
        this.empID = empID;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getEmpID() {
        return empID;
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }
}

 




class Employee {
    private String name;
    private String position;
    private int empid;
    private ArrayList<Project> projects;

    public Employee(String name, String position, int empid) {
        this.name = name;
        this.position = position;
        this.empid = empid;
        this.projects = new ArrayList<>();
    }

    public void addProject(Project project) {
        this.projects.add(project);
    }

    public void getEmployeeDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Position: " + this.position);
        System.out.println("EmpID: " + this.empid);
        System.out.println("Projects:");
        for (Project project : this.projects) {
            System.out.println(project.getProjectName() + project.getProjectDescription());
        }
    }
}

class Project {
    private String projectName;
    private String projectDescription;

    public Project(String projectName, String projectDescription) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public String getProjectDescription() {
        return this.projectDescription;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tom", "UX/UI", 0001);
        employee1.addProject(new Project("Web A", "Developing a web application"));
        employee1.addProject(new Project("Mobile app A", "Developing a mobile app"));

        Employee employee2 = new Employee("Tim", "FrontEnd", 0002);
        employee2.addProject(new Project("Web A", "Developing a web application"));

        employee1.getEmployeeDetails();
        employee2.getEmployeeDetails();
    }
}