package MVCPatternExample;

public class TestMVC {
    public static void main(String[] args) {
       
        Student student = new Student();
        student.setName("Affreen");
        student.setId("A1001");
        student.setGrade("A");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Display initial data
        controller.updateView();

        // Update data
        controller.setStudentName("Affreen Unisa");
        controller.setStudentGrade("A+");

        // Display updated data
        controller.updateView();
    }
}
