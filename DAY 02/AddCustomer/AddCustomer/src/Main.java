import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AddCustomer customer = new AddCustomer();
        customer.setSize(600,600);
        customer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        customer.setTitle("Add Customer Form");
        customer.setLocationRelativeTo(null);
        customer.setVisible(true);


    }
}