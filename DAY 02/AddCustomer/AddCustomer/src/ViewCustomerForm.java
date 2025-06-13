import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewCustomerForm extends JFrame {
    private JLabel lblTitle;
    private JButton btnReload;
    private JTable tblCustomer;
    private DefaultTableModel dtm;


    ViewCustomerForm(){

        lblTitle = new JLabel("View Customer Form");
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setFont(new Font("",1,30));
        add("North",lblTitle);

        JPanel btnRelaodPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnReload = new JButton("Relaod");
        btnReload.setFont(new Font("",1,15));
        btnReload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnRelaodPanel.add(btnReload);
        add("South",btnRelaodPanel);

        String [] columeName = {"ID","NAME","ADDRESS","SALARY"};
        dtm = new DefaultTableModel(columeName,0);//-->0 Row Count
        tblCustomer = new JTable(dtm);
        JScrollPane tablePane = new JScrollPane(tblCustomer);
        add("Center",tablePane);



    }

}
