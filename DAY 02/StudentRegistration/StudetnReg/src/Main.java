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

    }
}