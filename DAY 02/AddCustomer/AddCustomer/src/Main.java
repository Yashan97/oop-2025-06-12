import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AddCustomer customer = new AddCustomer();
        customer.setSize(400,400);
        customer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        customer.setTitle("Add Customer Form");
        customer.setLocationRelativeTo(null);
        customer.setVisible(true);

       /* ViewCustomerForm custoemrView = new ViewCustomerForm();
        custoemrView.setSize(400,400);
        custoemrView.setTitle("View Customer Form");
        custoemrView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        custoemrView.setLocationRelativeTo(null);
        custoemrView.setVisible(true); */
    }
}