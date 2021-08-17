package Assaignments.Assaignment_6;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Info");
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label_username = new JLabel("Username");
        label_username.setBounds(10, 10, 100, 30);
        frame.add(label_username);

        JTextField username = new JTextField();
        username.setBounds(100, 10, 200, 30);
        frame.add(username);

        JLabel label_password = new JLabel("Password");
        label_password.setBounds(10, 50, 100, 30);
        frame.add(label_password);

        JPasswordField password = new JPasswordField();
        password.setBounds(100, 50, 200, 30);
        frame.add(password);

        JButton login = new JButton("login");
        login.setBounds(50, 100, 100, 50);
        frame.add(login);
    }
}