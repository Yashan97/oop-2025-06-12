import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws FontFormatException {

        Calculator  c1 = new Calculator();
        c1.setSize(300, 400);
        c1.setTitle("calculator");
        c1.setLocationRelativeTo(null);
        c1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        c1.setVisible(true);


    }
}