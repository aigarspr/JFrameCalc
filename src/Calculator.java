import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {



    public JTextField text = new JTextField();



    String s0, s1, s2;


     Calculator()
    {
        s0 = s1 = s2 = "";
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        text.setEditable(false);
        String s = e.getActionCommand();
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            if (!s1.equals(""))
                s2 = s2 + s;
            else
                s0 = s0 + s;
            text.setText(s0 + s1 + s2);
        } else if (s.charAt(0) == 'C') {
            double te;
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
            text.setText(s0 + s1 + s2 + "=" + te);

            s0 = Double.toString(te);
            s1 = s2 = "";
        } else {
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            else {
                double te;
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));

                s0 = Double.toString(te);
                s1 = s;
                s2 = "";
            }
            text.setText(s0 + s1 + s2);

        }

    }
    }



