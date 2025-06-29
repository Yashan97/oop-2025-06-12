import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCustomer extends JFrame {



     private  JLabel addCustomerForm;
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

     //Customer [] customerArray = new Customer[0];

    AddCustomer(){

        addCustomerForm = new JLabel("Add Customer Form");
        addCustomerForm.setFont(new Font("",1,30));
        addCustomerForm.setHorizontalAlignment(JLabel.CENTER);
        addCustomerForm.setBackground(Color.blue);
        add("North",addCustomerForm);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        addbtn = new JButton("Add");
        addbtn.setFont(new Font("",1,15));
        addbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = txtid.getText();
                String name = txtName.getText();
                String address = txtAddress.getText();
                Double salary = Double.parseDouble(txtSalary.getText());

                Customer c1 = new Customer(id,name,address,salary);
                Customer []tempCustomerArray = new Customer[CustomerDB.customerArray.length+1];

                for (int i = 0; i<CustomerDB.customerArray.length; i++){
                    tempCustomerArray[i]= CustomerDB.customerArray[i];
                    }
                CustomerDB.customerArray = tempCustomerArray;
                // System.out.println(c1);
                CustomerDB.customerArray[CustomerDB.customerArray.length-1]=c1;
                // System.out.println(customerArray[0]);
                JOptionPane.showMessageDialog(null,"Added Success");
                generateID();
                txtName.setText(" ");
                txtAddress.setText(" ");
                txtSalary.setText(" ");
              //  System.out.println(customerArray[0].getId());
            }
        });
        buttonPanel.add(addbtn);

        cancelbtn = new JButton("Cancel");
        cancelbtn.setFont(new Font("",1,15));
        cancelbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
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
        txtid.setEditable(false);
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

        generateID();
        txtName.requestFocus();
    }
    private void generateID(){

        if (CustomerDB.customerArray.length<=0){
            txtid.setText("C001");
        }else{
        String lastID = CustomerDB.customerArray[CustomerDB.customerArray.length-1].getId();
        int lastIdnumber = Integer.parseInt(lastID.substring(1));
            String newID = String.format("C%03d",(lastIdnumber+1));
            txtid.setText(newID);
        }
    }
}
