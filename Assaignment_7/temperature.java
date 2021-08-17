package Assaignments.Assaignment_7;

import java.awt.event.*;
import java.awt.Color;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class temperature extends JFrame {
    JLabel InputLabel1 = new JLabel("Input");
    JLabel InputLabel2 = new JLabel("Input Scale");
    JTextField InputTF = new JTextField();
    private ButtonGroup Input = new ButtonGroup();
    JRadioButton I_Celcius = new JRadioButton("Celcius", true);
    JRadioButton I_Fahrenheit = new JRadioButton("Fahrenheit");
    JRadioButton I_Kelvin = new JRadioButton("Kelvin");

    JLabel OutputLabel1 = new JLabel("Output");
    JLabel OutputLabel2 = new JLabel("Output Scale");
    JTextField OutputTF = new JTextField("32.00");
    private ButtonGroup Output = new ButtonGroup();
    JRadioButton O_Celcius = new JRadioButton("Celcius");
    JRadioButton O_Fahrenheit = new JRadioButton("Fahrenheit", true);
    JRadioButton O_Kelvin = new JRadioButton("Kelvin");

    Color DarkTheme_Black = new Color(30, 30, 30);
    Color DarkTheme_Gray = new Color(200, 200, 200);

    /*
     * 1 - Celcius 2 - Fehrenheit 3 - Kelvin
     */
    int InputScale = 1;
    int OutputScale = 2;

    double InputTemp;
    double OutputTemp;

    private void setOutput() {
        try {
            InputTemp = Double.parseDouble(InputTF.getText());
        } catch (NumberFormatException e) {
            InputTemp = 0;
        }

        if (InputScale == OutputScale) {
            OutputTF.setText(Double.toString(InputTemp));
        } else {
            switch (InputScale) {
                case 1:
                    switch (OutputScale) {
                        case 2:
                            OutputTemp = (InputTemp * 9 / 5) + 32;
                            break;

                        case 3:
                            OutputTemp = InputTemp + 273.15;
                            break;
                    }
                    break;

                case 2:
                    switch (OutputScale) {
                        case 1:
                            OutputTemp = (InputTemp - 32) * 5 / 9;
                            break;

                        case 3:
                            OutputTemp = ((InputTemp - 32) * 5 / 9) + 273.15;
                            break;
                    }
                    break;

                case 3:
                    switch (OutputScale) {
                        case 1:
                            OutputTemp = InputTemp - 273.15;
                            break;

                        case 2:
                            OutputTemp = (InputTemp - 273.15) * 9 / 5 + 32;
                            break;
                    }
                    break;
            }
            OutputTF.setText(Double.toString(OutputTemp));
        }
    }

    public temperature() {
        this.setSize(300, 275);
        this.setLocation(500, 200);
        this.setTitle("Temperature Converter");
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(DarkTheme_Black);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        InputLabel1.setBounds(20, 15, 40, 30);
        InputLabel1.setForeground(DarkTheme_Gray);
        this.add(InputLabel1);

        InputTF.setBounds(70, 15, 200, 30);
        InputTF.setBackground(DarkTheme_Black);
        InputTF.setForeground(DarkTheme_Gray);
        InputTF.setCaretColor(DarkTheme_Gray);
        this.add(InputTF);
        InputTF.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                setOutput();
            }

            public void removeUpdate(DocumentEvent e) {
                setOutput();
            }

            public void insertUpdate(DocumentEvent e) {
                setOutput();
            }
        });

        InputLabel2.setBounds(20, 50, 100, 30);
        InputLabel2.setForeground(DarkTheme_Gray);
        this.add(InputLabel2);

        I_Celcius.setBounds(20, 75, 100, 30);
        I_Celcius.setBackground(DarkTheme_Black);
        I_Celcius.setForeground(DarkTheme_Gray);
        I_Celcius.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                InputScale = 1;
                setOutput();
            }
        });
        I_Fahrenheit.setBounds(20, 100, 100, 30);
        I_Fahrenheit.setBackground(DarkTheme_Black);
        I_Fahrenheit.setForeground(DarkTheme_Gray);
        I_Fahrenheit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                InputScale = 2;
                setOutput();
            }
        });

        I_Kelvin.setBounds(20, 125, 100, 30);
        I_Kelvin.setBackground(DarkTheme_Black);
        I_Kelvin.setForeground(DarkTheme_Gray);
        I_Kelvin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                InputScale = 3;
                setOutput();
            }
        });

        Input.add(I_Celcius);
        Input.add(I_Fahrenheit);
        Input.add(I_Kelvin);
        this.add(I_Celcius);
        this.add(I_Fahrenheit);
        this.add(I_Kelvin);

        OutputLabel2.setBounds(150, 50, 100, 30);
        OutputLabel2.setForeground(DarkTheme_Gray);
        this.add(OutputLabel2);

        O_Celcius.setBounds(150, 75, 100, 30);
        O_Celcius.setBackground(DarkTheme_Black);
        O_Celcius.setForeground(DarkTheme_Gray);
        O_Celcius.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OutputScale = 1;
                setOutput();
            }
        });

        O_Fahrenheit.setBounds(150, 100, 100, 30);
        O_Fahrenheit.setBackground(DarkTheme_Black);
        O_Fahrenheit.setForeground(DarkTheme_Gray);
        O_Fahrenheit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OutputScale = 2;
                setOutput();
            }
        });

        O_Kelvin.setBounds(150, 125, 100, 30);
        O_Kelvin.setBackground(DarkTheme_Black);
        O_Kelvin.setForeground(DarkTheme_Gray);
        O_Kelvin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OutputScale = 3;
                setOutput();
            }
        });

        Output.add(O_Celcius);
        Output.add(O_Fahrenheit);
        Output.add(O_Kelvin);
        this.add(O_Celcius);
        this.add(O_Fahrenheit);
        this.add(O_Kelvin);

        OutputLabel1.setBounds(20, 160, 40, 30);
        OutputLabel1.setForeground(DarkTheme_Gray);
        this.add(OutputLabel1);

        OutputTF.setEditable(false);
        OutputTF.setBounds(70, 160, 200, 30);
        OutputTF.setBackground(DarkTheme_Black);
        OutputTF.setForeground(DarkTheme_Gray);
        this.add(OutputTF);
    }

    public static void main(String[] args) {
        new temperature();
    }
}