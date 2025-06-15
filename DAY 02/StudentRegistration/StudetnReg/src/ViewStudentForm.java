import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewStudentForm extends JFrame {
        private  JButton  btnReload;
        private JButton btnCancel;
        private  JTable tblViewStudent;
        private DefaultTableModel dtm;

        private  JLabel lblTopic;

    ViewStudentForm(){

        lblTopic = new JLabel("View Student Form");
        lblTopic.setFont(new Font("",1,30));
        lblTopic.setHorizontalAlignment(JLabel.CENTER);
        lblTopic.setBackground(Color.blue);
        add("North",lblTopic);


        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnReload = new JButton("Reaload");
        btnReload.setFont(new Font("",1,15));
        btnReload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dtm.setRowCount(0);
                for (int i=0; i<StudentDB.studentArray.length; i++){
                   Student student = StudentDB.studentArray[i];
                   Object [] rowData ={student.getId(),student.getName(),student.getAddress(),student.getSalary()};
                    dtm.addRow(rowData);
                }

            }
        });
        buttonPanel.add(btnReload);

        btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("",1,15));
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        buttonPanel.add(btnCancel);

        add("South",buttonPanel);

        String []colName = {"ID","Name","Address","Salary"};
        dtm = new DefaultTableModel(colName,0);
        tblViewStudent = new JTable(dtm);
        JScrollPane tblpane = new JScrollPane(tblViewStudent);
        add("Center",tblpane);



    }
}
