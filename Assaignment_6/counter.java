package Assaignments.Assaignment_6;

import java.awt.TextField;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.Label;

import java.awt.event.ActionEvent;

public class counter extends Frame implements ActionListener {
    TextField counter;
    Button add;
    Label l1;

    counter() {

        counter = new TextField("0");
        counter.setBounds(150, 50, 100, 30);

        add = new Button("Count");
        add.setBounds(300, 50, 100, 30);
        add.addActionListener(this);

        l1 = new Label("Counter");
        l1.setBounds(50, 50, 80, 30);

        add(l1);
        add(counter);
        add(add);
        setTitle("Counter");
        setSize(500, 150);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new counter();
    }

    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt(counter.getText());
        num++;
        counter.setText(Integer.toString(num));
    }
}
