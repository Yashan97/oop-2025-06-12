import javax.swing.*;
import java.awt.*;

public class Calculator  extends JFrame {
    JButton exitButton;
    JButton cancelBtn;
    JTextField name;
    Calculator(){

        setLayout( new FlowLayout(FlowLayout.CENTER));
        name = new JTextField(10);
        name.setText("name");
        name.setFont(new Font("",10,15));
        add(name);

        setLayout((new FlowLayout(FlowLayout.CENTER)));
        exitButton = new JButton();
        exitButton.setText("Save");
        add(exitButton);
    }
}
