Student.java

public class Student {
    private int id;
    private String name;
    private String grade;

    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}


StudentView.java

public class StudentView {

    public void displayStudentDetails(Student student) {

        System.out.println("Student Details");
        System.out.println("----------------");
        System.out.println("ID : " + student.getId());
        System.out.println("Name : " + student.getName());
        System.out.println("Grade : " + student.getGrade());
    }

}

StudentController.java

public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public void setStudentGrade(String grade){
        model.setGrade(grade);
    }

    public void updateView(){
        view.displayStudentDetails(model);
    }
}


MVCPatternExample.java

public class MVCPatternExample {
    public static void main(String[] args){

        Student model = new Student(101, "Prousika", "A");
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);
        System.out.println("Original Details");
        controller.updateView();

        System.out.println();

        controller.setStudentName("Shree");
        controller.setStudentGrade("B");

        System.out.println("updated Details");
        controller.updateView();
    }
}

/*
output
Original Details
Student Details
----------------
ID : 101
Name : Prousika
Grade : A

updated Details
Student Details
----------------
ID : 101
Name : Shree
Grade : B
*/

