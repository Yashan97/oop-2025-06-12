import javax.swing.*;
import java.awt.*;

public class AddCustomer extends JFrame {
     private    JLabel addCustomerForm;
     private  JButton addbtn;
     private  JButton cancelbtn;

     private  JLabel lblID;
     private  JLabel lblName;
     private  JLabel lblAddress;
     private  JLabel lblSalary;

     private JTextField txtid;
     private JTextField txtName;
     private JTextField txtAddress;
     private JTextField txtSalary;

    AddCustomer(){

        addCustomerForm = new JLabel("Add Customer Form");
        addCustomerForm.setFont(new Font("",1,30));
        addCustomerForm.setHorizontalAlignment(JLabel.CENTER);
        addCustomerForm.setBackground(Color.blue);
        add("North",addCustomerForm);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        addbtn = new JButton("Add");
        addbtn.setFont(new Font("",1,15));
        buttonPanel.add(addbtn);

        cancelbtn = new JButton("Cancel");
        cancelbtn.setFont(new Font("",1,15));
        buttonPanel.add(cancelbtn);

        add("South",buttonPanel);

        JPanel lblPanel = new JPanel(new GridLayout(4,1));

        lblID = new JLabel("ID");
        lblID.setFont(new Font("",1,15));
        JPanel jPid = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jPid.add(lblID);
        lblPanel.add(jPid);

        lblName = new JLabel("Name");
        lblName.setFont(new Font("",1,15));
        JPanel jPName = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jPName.add(lblName);
        lblPanel.add(jPName);

        lblAddress = new JLabel("Address");
        lblAddress.setFont(new Font("",1,15));
        JPanel jPaddress = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jPaddress.add(lblAddress);
        lblPanel.add(jPaddress);

        lblSalary = new JLabel("Salary");
        lblSalary.setFont(new Font("",1,15));
        JPanel jPsalary = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        jPsalary.add(lblSalary);
        lblPanel.add(jPsalary);

        add("West",lblPanel);

        JPanel txtJpanel = new JPanel(new GridLayout(4,1));
        txtid = new JTextField(10);
        txtid.setFont(new Font("",1,20));
        JPanel txtJpanelId = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtJpanelId.add(txtid);
        txtJpanel.add(txtJpanelId);

        txtName = new JTextField(15);
        txtName.setFont(new Font("",1,18));
        JPanel txtJname = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtJname.add(txtName);
        txtJpanel.add(txtJname);

        txtAddress = new JTextField(15);
        txtAddress.setFont(new Font("",1,18));
        JPanel txtJAddress = new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtJAddress.add(txtAddress);
        txtJpanel.add(txtJAddress);

        txtSalary = new JTextField(15);
        txtSalary.setFont(new Font("",1,18));
        JPanel txtJSalary =  new JPanel(new FlowLayout(FlowLayout.LEFT));
        txtJSalary.add(txtSalary);
        txtJpanel.add(txtJSalary);

        add(txtJpanel);
        pack();
    }
}
