import javax.swing.*;
import java.awt.*;

public class AddCustomer extends JFrame {
     private    JLabel addCustomerForm;
     private  JButton addbtn;
     private  JButton cancelbtn;
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
    }
}
