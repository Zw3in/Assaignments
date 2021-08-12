package Assaignments.Assaignment_6;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Combo extends JFrame
{
    JLabel Select_State = new JLabel("Select a State");
    JLabel Select_Pet = new JLabel("Select a Pet");
    JLabel Select_Vehicals = new JLabel("Select several vehicals");

    String[] States = { "Alabama", "Alaska", "Arizona", "Arkansas", "California",
                        "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", 
                        "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa",
                        "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland",
                        "Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri",
                        "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey",
                        "New Mexico", "New York", "North Carolina", "North Dakota", "Ohio",
                        "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina",
                        "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia",
                        "Washington", "West Virginia", "Wisconsin", "Wyoming"};
    JComboBox<String> States_Box = new JComboBox<String>(States);

    String[] Pets = {"Dog", "Cat", "Bird", "Fish", "Horse", "Donkey", "Hamster"};
    JList<String> Pets_List = new JList<String>(Pets);
    JScrollPane Pets_Pane = new JScrollPane(Pets_List);

    String[] Vehicals = {"Van", "Truck", "SUV", "Wagon", "Sedan", "Motorbike", "Boat"};
    JList<String> Vehicals_List = new JList<String>(Vehicals);
    JScrollPane Vehicals_Pane = new JScrollPane(Vehicals_List);

    JLabel State_Selected = new JLabel("Alabama");
    JLabel Pet_Selected = new JLabel("None");
    JLabel Vehicals_Selected = new JLabel("None");

    Combo()
    {
        setTitle("GUICombo");
        setVisible(true);
        setSize(600, 300);
        setLocation(200, 200);
        setLayout(new GridLayout(3, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        States_Box.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                State_Selected.setText((String) States_Box.getSelectedItem());
            }
        });

        Pets_List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Pets_List.addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                Pet_Selected.setText("One " + Pets_List.getSelectedValue());
            }
        });

        Vehicals_List.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        Vehicals_List.addListSelectionListener(new ListSelectionListener()
        {
            @Override
            public void valueChanged(ListSelectionEvent e)
            {
                Vehicals_Selected.setText(listToString(Vehicals_List.getSelectedValuesList()));
            }

            private String listToString(List<String> list) {
                String output = "";
                if (list.size() > 0)
                {
                    output += list.get(0);
                    for (int x = 1; x < list.size(); x++)
                    {
                        output += ", " + list.get(x);
                    }
                }
                return output;
            }
        });
        add(Select_State);
        add(Select_Pet);
        add(Select_Vehicals);
        add(States_Box);
        add(Pets_Pane);
        add(Vehicals_Pane);
        add(State_Selected);
        add(Pet_Selected);
        add(Vehicals_Selected);
    }
    public static void main(String[] args) 
    {
        new Combo();
    }
}
