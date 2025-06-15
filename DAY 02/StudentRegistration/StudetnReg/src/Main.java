import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentAddFrome student  = new StudentAddFrome();
        student.setSize(400,400);
        student.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        student.setTitle("Add Customer Form");
        student.setLocationRelativeTo(null);
        student.setVisible(true);


        SearchStudent search = new SearchStudent();
        search.setSize(400,400);
        search.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        search.setTitle("Search Student Form");
        search.setLocationRelativeTo(null);
        search.setVisible(true);

        DeleteStudentForm delete = new DeleteStudentForm();
        delete.setSize(400,400);
        delete.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        delete.setTitle("Search Student Form");
        delete.setLocationRelativeTo(null);
        delete.setVisible(true);


        UpdateStudentForm update = new UpdateStudentForm();
        update.setSize(400,400);
        update.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        update.setTitle("Search Student Form");
        update.setLocationRelativeTo(null);
        update.setVisible(true);
    }
}