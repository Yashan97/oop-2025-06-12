import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame {
    private JButton btnAddCustomerForm;
    private  JButton btnSearchForm;
    private  JButton btndeleteForm;
    private  JButton btnupdateForm;
    private  JButton btnViewForm;
    private  JLabel mainTopic;
    HomePage(){

        JPanel mainTopicPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        mainTopic = new JLabel("ICET Student Registration Form");
        mainTopic.setFont(new Font("",1,30));
        mainTopicPanel.add(mainTopic);
        add(mainTopicPanel);


        JPanel allButtonePanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnAddCustomerForm = new JButton("Add Student ");
        btnAddCustomerForm.setFont(new Font("",1,18));
        btnAddCustomerForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentAddFrome student  = new StudentAddFrome();
                student.setSize(400,400);
                student.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                student.setTitle("Add Customer Form");
                student.setLocationRelativeTo(null);
                student.setVisible(true);
            }
        });
        allButtonePanel.add(btnAddCustomerForm);

        btnupdateForm = new JButton("Update Student ");
        btnupdateForm.setFont(new Font("",1,18));
        btnupdateForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UpdateStudentForm update = new UpdateStudentForm();
                update.setSize(400,400);
                update.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                update.setTitle("Search Student Form");
                update.setLocationRelativeTo(null);
                update.setVisible(true);
            }
        });
        allButtonePanel.add(btnupdateForm);

        btnSearchForm = new JButton("Search Student ");
        btnSearchForm.setFont(new Font("",1,18));
        btnSearchForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchStudent search = new SearchStudent();
                search.setSize(400,400);
                search.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                search.setTitle("Search Student Form");
                search.setLocationRelativeTo(null);
                search.setVisible(true);
            }
        });
        allButtonePanel.add(btnSearchForm);

        btndeleteForm= new JButton("Delete Student ");
        btndeleteForm.setFont(new Font("",1,18));
        btndeleteForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DeleteStudentForm delete = new DeleteStudentForm();
                delete.setSize(400,400);
                delete.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                delete.setTitle("Search Student Form");
                delete.setLocationRelativeTo(null);
                delete.setVisible(true);

            }
        });
        allButtonePanel.add(btndeleteForm);

        btnViewForm= new JButton("View Student Form ");
        btnViewForm.setFont(new Font("",1,18));
        btnViewForm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewStudentForm view = new ViewStudentForm();
                view.setSize(400,400);
                view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                view.setTitle("Search Student Form");
                view.setLocationRelativeTo(null);
                view.setVisible(true);

            }
        });
        allButtonePanel.add(btnViewForm);
        add("South",allButtonePanel);
    }
}
