import javax.swing.*;
import java.awt.*;





public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);

        JPanel mainpanel = new JPanel(new GridLayout(5, 4, 5, 5));
        frame.add(mainpanel);

        calc.text.setEditable(false);

        //frame.setLayout(null);






        JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17;





         btn1 = new JButton("/");
         btn2 = new JButton("*");
         btn3 = new JButton("+");
         btn4 = new JButton("-");
         btn5 = new JButton("=");
         btn6 = new JButton("0");
         btn7 = new JButton("1");
         btn8 = new JButton("2");
         btn9 = new JButton("3");
         btn10 = new JButton("4");
         btn11 = new JButton("5");
         btn12 = new JButton("6");
         btn13 = new JButton("7");
         btn14 = new JButton("8");
         btn15 = new JButton("9");
         btn16 = new JButton("C");
         btn17 = new JButton(".");


        mainpanel.add(calc.text);
        mainpanel.add(btn1);
        mainpanel.add(btn2);
        mainpanel.add(btn3);
        mainpanel.add(btn4);
        mainpanel.add(btn5);
        mainpanel.add(btn6);
        mainpanel.add(btn7);
        mainpanel.add(btn8);
        mainpanel.add(btn9);
        mainpanel.add(btn10);
        mainpanel.add(btn11);
        mainpanel.add(btn12);
        mainpanel.add(btn13);
        mainpanel.add(btn14);
        mainpanel.add(btn15);
        mainpanel.add(btn16);
        mainpanel.add(btn17);


        btn1.addActionListener(calc);
        btn2.addActionListener(calc);
        btn3.addActionListener(calc);
        btn4.addActionListener(calc);
        btn5.addActionListener(calc);
        btn6.addActionListener(calc);
        btn7.addActionListener(calc);
        btn8.addActionListener(calc);
        btn9.addActionListener(calc);
        btn10.addActionListener(calc);
        btn11.addActionListener(calc);
        btn12.addActionListener(calc);
        btn13.addActionListener(calc);
        btn14.addActionListener(calc);
        btn15.addActionListener(calc);
        btn16.addActionListener(calc);
        btn17.addActionListener(calc);

        frame.setVisible(true);





    }
}