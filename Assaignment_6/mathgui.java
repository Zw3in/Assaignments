package Assaignments.Assaignment_6;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mathgui extends JFrame {

    public mathgui() {
        setTitle("math gui");
        setSize(800, 500);
        setLocation(500, 10);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextField num1 = new JTextField();
        num1.setBounds(10, 10, 200, 30);
        add(num1);

        JTextField num2 = new JTextField();
        num2.setBounds(250, 10, 200, 30);
        add(num2);

        JTextArea output = new JTextArea();
        output.setBounds(10, 80, 450, 450);
        add(output);

        JButton add = new JButton("add");
        add.setBounds(10, 50, 100, 30);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(num1.getText());
                int y = Integer.parseInt(num2.getText());
                output.append("\n" + x + " + " + y + " = " + (x + y));
            }
        });
        add(add);

        JButton subtract = new JButton("subtract");
        subtract.setBounds(160, 50, 100, 30);
        subtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(num1.getText());
                int y = Integer.parseInt(num2.getText());
                output.append("\n" + x + " - " + y + " = " + (x - y));
            }
        });
        add(subtract);

        JButton clear = new JButton("clear");
        clear.setBounds(310, 50, 100, 30);
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                output.setText(null);
            }
        });

        add(clear);

    }

    public static void main(String[] args) {
        new mathgui();

    }
}
