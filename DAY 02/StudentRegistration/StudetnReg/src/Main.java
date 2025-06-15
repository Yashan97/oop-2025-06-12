import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HomePage home  = new HomePage();
        home.setSize(800,400);
        home.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        home.setTitle("Search Student Form");
        home.setLocationRelativeTo(null);
        home.setVisible(true);
    }
}