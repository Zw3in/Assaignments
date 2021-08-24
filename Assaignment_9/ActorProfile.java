package Assaignments.Assaignment_9;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActorProfile extends JFrame 
{
    JLabel title = new JLabel("Actor Profile");

    JLabel firstname_Label = new JLabel("First Name :");
    JTextField firstname_TextField = new JTextField();
    
    JLabel lastname_Label = new JLabel("Last Name :");
    JTextField lastname_TextField = new JTextField();
    
    JButton query_Button = new JButton("Query");
    
    String column[] = { "Actor ID", "First Name", "Last Name", "Last Updated" };
    String data[][] = { 
            { "1", "Jack", "Black", "2006-02-15 04:34:34" },
            { "2", "Chris", "Evans", "2006-02-15 04:34:34" }, 
            { "3", "Jack", "Brown", "2006-02-15 04:34:34" },
            { "4", "Mark", "Ruffalo", "2006-02-15 04:34:34" }, 
            { "5", "Jack", "Black", "2006-02-15 04:34:34" },
            { "6", "Scarlett", "Johansson", "2006-02-15 04:34:34" },
            { "7", "Tom", "Hiddleston", "2006-02-15 04:34:34" }, 
            { "8", "Chris", "Hemsworth", "2006-02-15 04:34:34" },
            { "9", "Samuel", "L. Jackson", "2006-02-15 04:34:34" },
            { "10", "Elizabeth", "Olsen", "2006-02-15 04:34:34" },
            { "11","Tom", "Holland", "2006-02-15 04:34:34" }
        };
    DefaultTableModel model = new DefaultTableModel(data, column);
    JTable actors_Table = new JTable(model);
    JScrollPane actors_ScrollPane = new JScrollPane(actors_Table);
    
    ActorProfile()
    {
        
        setSize(600, 300);
        setLocation(200, 200);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        title.setFont(new Font("Calibri", Font.PLAIN, 36));
        title.setBounds(200, 20, 200, 40);
        add(title);
        
        firstname_Label.setBounds(10, 60, 70, 30);
        add(firstname_Label);
        
        firstname_TextField.setBounds(90, 60, 150, 30);
        add(firstname_TextField);
        
        lastname_Label.setBounds(260, 60, 70, 30);
        add(lastname_Label);
        
        lastname_TextField.setBounds(340, 60, 150, 30);
        add(lastname_TextField);
        
        query_Button.setBounds(510, 60, 70, 30);
        query_Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstname_Input = firstname_TextField.getText().toLowerCase();
                String lastname_Input = lastname_TextField.getText().toLowerCase();
                
                if ( firstname_Input == "" && lastname_Input == "") { return; }

                if (firstname_Input != "" && lastname_Input != "") {
                    clearRows();
                    for (int x = 0; x < data.length; x++) {
                        if (data[x][1].toLowerCase().contains(firstname_Input) && data[x][2].toLowerCase().contains(lastname_Input)) {
                            model.addRow(data[x]);
                        }
                    }
                }

                else if ( firstname_Input != "") {
                    clearRows();
                    for (int x = 0; x < data.length; x++) {
                        if (data[x][1].toLowerCase().contains(firstname_Input)) {
                            model.addRow(data[x]);
                        }
                    }
                }

                else if ( lastname_Input != "") {
                    clearRows();
                    for (int x = 0; x < data.length; x++) {
                        if (data[x][2].toLowerCase().contains(lastname_Input)) {
                            model.addRow(data[x]);
                        }
                    }
                }
            }
        });
        add(query_Button);
        
        actors_ScrollPane.setBounds(10, 100, 580, 150);
        add(actors_ScrollPane);
    }

    public static void main(String[] args)
    {
        new ActorProfile();
    }

    public void clearRows() {
        // ripped this off of StackOverflow
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
}
