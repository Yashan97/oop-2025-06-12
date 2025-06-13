import javax.swing.*;
import java.awt.*;

public class Calculator  extends JFrame {
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btn10;
    JButton btn11;
    JButton btn12;
    JButton btn13;
    JButton btn14;
    JButton btn15;
    JButton btn16;
    JButton cancelBtn;
    JTextField name;
    Calculator() throws FontFormatException {

        JPanel calTxt = new JPanel();
        calTxt.setLayout(new GridLayout(1,1));
        name = new JTextField(10);
        name.setFont(new Font("",1,20));
        calTxt.add(name);
        add("North",calTxt);


        JPanel calbutton = new JPanel();
        calbutton.setLayout(new GridLayout(4,4));
        btn1 = new JButton("7");
        btn1.setFont(new Font(" ",1,10));
        calbutton.add(btn1);

        calbutton.setLayout(new GridLayout(4,4));
        btn2 = new JButton("8");
        btn2.setFont(new Font(" ",1,10));
        calbutton.add(btn2);

        calbutton.setLayout(new GridLayout(4,4));
        btn3 = new JButton("9");
        btn3.setFont(new Font(" ",1,10));
        calbutton.add(btn3);

        calbutton.setLayout(new GridLayout(4,4));
        btn4 = new JButton("/");
        btn4.setFont(new Font(" ",1,10));
        calbutton.add(btn4);

        calbutton.setLayout(new GridLayout(4,4));
        btn5 = new JButton("4");
        btn5.setFont(new Font(" ",1,10));
        calbutton.add(btn5);

        calbutton.setLayout(new GridLayout(4,4));
        btn6 = new JButton("5");
        btn6.setFont(new Font(" ",1,10));
        calbutton.add(btn6);

        calbutton.setLayout(new GridLayout(4,4));
        btn7 = new JButton("6");
        btn7.setFont(new Font(" ",1,10));
        calbutton.add(btn7);

        calbutton.setLayout(new GridLayout(4,4));
        btn8 = new JButton("*");
        btn8.setFont(new Font(" ",1,10));
        calbutton.add(btn8);

        calbutton.setLayout(new GridLayout(4,4));
        btn9 = new JButton("1");
        btn9.setFont(new Font(" ",1,10));
        calbutton.add(btn9);

        calbutton.setLayout(new GridLayout(4,4));
        btn10 = new JButton("2");
        btn10.setFont(new Font(" ",1,10));
        calbutton.add(btn10);

        calbutton.setLayout(new GridLayout(4,4));
        btn11 = new JButton("3");
        btn11.setFont(new Font(" ",1,10));
        calbutton.add(btn11
        );

        calbutton.setLayout(new GridLayout(4,4));
        btn12 = new JButton("-");
        btn12.setFont(new Font(" ",1,10));
        calbutton.add(btn12);

        calbutton.setLayout(new GridLayout(4,4));
        btn13 = new JButton("+");
        btn13.setFont(new Font(" ",1,10));
        calbutton.add(btn13);

        calbutton.setLayout(new GridLayout(4,4));
        btn14 = new JButton("=");
        btn14.setFont(new Font(" ",1,10));
        calbutton.add(btn14);

        calbutton.setLayout(new GridLayout(4,4));
        btn15 = new JButton(".");
        btn15.setFont(new Font(" ",1,10));
        calbutton.add(btn15);

        calbutton.setLayout(new GridLayout(4,4));
        btn16 = new JButton("0");
        btn16.setFont(new Font(" ",1,10));
        calbutton.add(btn16);

        add("Center",calbutton);





    }
}
