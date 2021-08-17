package Assaignments.Temp;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UPF extends JFrame {
    JLabel PPE = new JLabel("Personal Profile Entry");

    JPanel Main_Panel = new JPanel();

    JLabel Name = new JLabel("Name");
    JTextField Name_Entry = new JTextField();

    JLabel NRC_Number = new JLabel("NRC Number");
    JTextField NRC_Number_Entry = new JTextField();

    JLabel Father_Name = new JLabel("Father Name");
    JTextField Father_Name_Entry = new JTextField();

    JLabel Date_of_Birth = new JLabel("Date of Birth");
    JPanel D_M_Y = new JPanel();
    JComboBox<Integer> Day = new JComboBox<Integer>(days_list_generator(31));
    String[] Months_List = { "January", "Febuary", "March", "April", "May", "June", "July", "Augest", "September",
            "October", "November", "December" };
    JComboBox<String> Month = new JComboBox<String>(Months_List);
    JComboBox<Integer> Year = new JComboBox<Integer>(years_list_generator(2021, 1800));

    JLabel Gender = new JLabel("Gender");
    JPanel Gender_Panel = new JPanel();
    ButtonGroup Gender_Group = new ButtonGroup();
    JRadioButton Male = new JRadioButton("Male");
    JRadioButton Female = new JRadioButton("Female");
    JRadioButton Non_Binary = new JRadioButton("Non Binary");
    JRadioButton Other = new JRadioButton("Other");

    JLabel Address = new JLabel("Address");
    JTextArea Address_Entry = new JTextArea();
    JScrollPane Address_SrollPane = new JScrollPane(Address_Entry);

    JLabel Phone = new JLabel("Phone");
    JTextField Phone_Entry = new JTextField();

    JPanel ButtonPanel = new JPanel();
    JButton Save = new JButton("Save");
    JButton Cancel = new JButton("Cancel");

    UPF() {
        setTitle("User Profile Information");
        setSize(500, 500);
        setLocation(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        PPE.setHorizontalAlignment(JLabel.CENTER);
        add(PPE, BorderLayout.NORTH);

        add(Main_Panel, BorderLayout.CENTER);
        add(Main_Panel);
        Main_Panel.setLayout(new GridLayout(8, 2));

        Main_Panel.add(Name);
        Name.setHorizontalAlignment(JLabel.CENTER);
        Main_Panel.add(Name_Entry);

        Main_Panel.add(NRC_Number);
        NRC_Number.setHorizontalAlignment(JLabel.CENTER);
        Main_Panel.add(NRC_Number_Entry);

        Main_Panel.add(Father_Name);
        Father_Name.setHorizontalAlignment(JLabel.CENTER);
        Main_Panel.add(Father_Name_Entry);

        Main_Panel.add(Date_of_Birth);
        Date_of_Birth.setHorizontalAlignment(JLabel.CENTER);
        Main_Panel.add(D_M_Y);
        D_M_Y.setLayout(new GridLayout(1, 3));
        D_M_Y.add(Day);
        D_M_Y.add(Month);
        D_M_Y.add(Year);

        Month.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (Month.getSelectedIndex() + 1) {
                    case 2: {
                        if ((int) Year.getSelectedItem() % 4 == 0) {
                            Day_List(29);
                        } else {
                            Day_List(28);
                        }
                        break;
                    }
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        Day_List(30);
                        break;
                    default:
                        Day_List(31);
                        break;
                }
            }
        });

        Year.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Month.getSelectedIndex() + 1 != 2) {
                    return;
                }
                if ((int) Year.getSelectedItem() % 4 == 0) {
                    Day_List(29);
                } else {
                    Day_List(28);
                }

            }
        });

        Main_Panel.add(Gender);
        Gender.setHorizontalAlignment(JLabel.CENTER);
        Main_Panel.add(Gender_Panel);
        Gender_Panel.setLayout(new GridLayout(2, 2));
        Gender_Panel.add(Male);
        Gender_Panel.add(Female);
        Gender_Panel.add(Non_Binary);
        Gender_Panel.add(Other);

        Gender_Group.add(Male);
        Gender_Group.add(Female);
        Gender_Group.add(Non_Binary);
        Gender_Group.add(Other);

        Main_Panel.add(Address);
        Address.setHorizontalAlignment(JLabel.CENTER);
        Main_Panel.add(Address_SrollPane);

        Main_Panel.add(Phone);
        Phone.setHorizontalAlignment(JLabel.CENTER);
        Main_Panel.add(Phone_Entry);

        add(ButtonPanel, BorderLayout.SOUTH);
        ButtonPanel.add(Save);
        ButtonPanel.add(Cancel);
    }

    public static void main(String[] args) {
        new UPF();
    }

    private Integer[] years_list_generator(Integer start, Integer end) {
        if (start < end) {
            return null;
        }
        Integer[] output = new Integer[start - end + 1];
        int index = 0;
        while (start >= end) {
            output[index] = start;
            index++;
            start--;
        }
        return output;
    }

    private void Day_List(Integer i) {
        Day.removeAllItems();
        for (Integer day : days_list_generator(i))
            Day.addItem(day);
    }

    private Integer[] days_list_generator(Integer end) {
        Integer[] output = new Integer[end];
        int index = 0;
        int x = 1;
        while (x <= end) {
            output[index] = x;
            index++;
            x++;
        }
        return output;
    }
}
