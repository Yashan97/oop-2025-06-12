import com.sun.source.tree.IfTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateStudentForm extends JFrame {
    private JLabel addStudentForm;
    private JButton updatebtn;
    private JButton cancelbtn;

    private JLabel lblID;
    private JLabel lblName;
    private JLabel lblAddress;
    private JLabel lblSalary;

    private JTextField txtid;
    private JTextField txtName;
    private JTextField txtAddress;
    private JTextField txtSalary;

     UpdateStudentForm(){
         addStudentForm = new JLabel("Update Student Form");
         addStudentForm.setFont(new Font("", 1, 30));
         addStudentForm.setHorizontalAlignment(JLabel.CENTER);
         addStudentForm.setBackground(Color.blue);
         add("North", addStudentForm);

         JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
         updatebtn = new JButton("Update");
         updatebtn.setFont(new Font("", 1, 15));
         updatebtn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 int index =searchStudent(txtid.getText());
                 if (index!= -1){
                     String id = txtid.getText();
                     String name = txtName.getText();
                     String address = txtAddress.getText();
                     Double salary = Double.parseDouble(txtSalary.getText());

                     Student student = new Student(id,name,address,salary);
                     StudentDB.studentArray[index]=student;
                     JOptionPane.showMessageDialog(null,"Update Success ");
                 }else {
                     JOptionPane.showMessageDialog(null,"is Not Exist");
                 }


             }
         });
         buttonPanel.add(updatebtn);

         cancelbtn = new JButton("Cancel");
         cancelbtn.setFont(new Font("", 1, 15));
         cancelbtn.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 dispose();
             }
         });
         buttonPanel.add(cancelbtn);

         add("South", buttonPanel);

         JPanel lblPanel = new JPanel(new GridLayout(4, 1));

         lblID = new JLabel("ID");
         lblID.setFont(new Font("", 1, 15));
         JPanel jPid = new JPanel(new FlowLayout(FlowLayout.RIGHT));
         jPid.add(lblID);
         lblPanel.add(jPid);

         lblName = new JLabel("Name");
         lblName.setFont(new Font("", 1, 15));
         JPanel jPName = new JPanel(new FlowLayout(FlowLayout.RIGHT));
         jPName.add(lblName);
         lblPanel.add(jPName);

         lblAddress = new JLabel("Address");
         lblAddress.setFont(new Font("", 1, 15));
         JPanel jPaddress = new JPanel(new FlowLayout(FlowLayout.RIGHT));
         jPaddress.add(lblAddress);
         lblPanel.add(jPaddress);

         lblSalary = new JLabel("Salary");
         lblSalary.setFont(new Font("", 1, 15));
         JPanel jPsalary = new JPanel(new FlowLayout(FlowLayout.RIGHT));
         jPsalary.add(lblSalary);
         lblPanel.add(jPsalary);

         add("West", lblPanel);

         JPanel txtJpanel = new JPanel(new GridLayout(4, 1));
         txtid = new JTextField(10);
         txtid.setFont(new Font("", 1, 20));
         txtid.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String id = txtid.getText();
                 int index = searchStudent(id);
                 if(index!=-1){
                     Student student =StudentDB.studentArray[index];
                     txtName.setText(student.getName());
                     txtAddress.setText(student.getAddress());
                     txtSalary.setText(student.getSalary()+"");
                 }

             }
         });
         JPanel txtJpanelId = new JPanel(new FlowLayout(FlowLayout.LEFT));
         txtJpanelId.add(txtid);
         txtJpanel.add(txtJpanelId);

         txtName = new JTextField(15);
         txtName.setFont(new Font("", 1, 18));
         //txtName.setEditable(false);
         JPanel txtJname = new JPanel(new FlowLayout(FlowLayout.LEFT));
         txtJname.add(txtName);
         txtJpanel.add(txtJname);

         txtAddress = new JTextField(15);
         txtAddress.setFont(new Font("", 1, 18));
        // txtAddress.setEditable(false);
         JPanel txtJAddress = new JPanel(new FlowLayout(FlowLayout.LEFT));
         txtJAddress.add(txtAddress);
         txtJpanel.add(txtJAddress);

         txtSalary = new JTextField(15);
         txtSalary.setFont(new Font("", 1, 18));
         //txtSalary.setEditable(false);
         JPanel txtJSalary = new JPanel(new FlowLayout(FlowLayout.LEFT));
         txtJSalary.add(txtSalary);
         txtJpanel.add(txtJSalary);

         add(txtJpanel);
         pack();


         txtName.requestFocus();
     }

    private int searchStudent(String id) {
        for (int i = 0; i < StudentDB.studentArray.length; i++) {
            if (StudentDB.studentArray[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}
