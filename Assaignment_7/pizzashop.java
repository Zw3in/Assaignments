package Assaignments.Assaignment_7;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pizzashop extends JFrame implements ActionListener {
    JLabel Welcome = new JLabel("Welcome to Home Style Pizza Shop");

    double Toppings_Price = 1.50;
    JPanel Toppings = new JPanel();
    JLabel Toppings_Label = new JLabel("  Each Topping: $" + Toppings_Price);
    JCheckBox Tomato = new JCheckBox("Tomato");
    JCheckBox Green_Pepper = new JCheckBox("Green Pepper");
    JCheckBox Black_Olives = new JCheckBox("Black Olives");
    JCheckBox Mushrooms = new JCheckBox("Mushrooms");
    JCheckBox Extra_Cheese = new JCheckBox("Extra Cheese");
    JCheckBox Pepperoni = new JCheckBox("Pepperoni");
    JCheckBox Sausage = new JCheckBox("Sausage");

    double Small_Price = 6.50;
    double Medium_Price = 8.50;
    double Large_Price = 10.00;
    JPanel Pizza_Size = new JPanel();
    JLabel Pizza_Size_Label = new JLabel("  Pizza Size");
    ButtonGroup Pizza_Size_Options = new ButtonGroup();
    JRadioButton Small = new JRadioButton("Small: $" + Small_Price);
    JRadioButton Medium = new JRadioButton("Medium: $" + Medium_Price, true);
    JRadioButton Large = new JRadioButton("Large: $" + Large_Price);

    JPanel Pizza_Type = new JPanel();
    JLabel Pizza_Type_Label = new JLabel("  Pizza Type");
    ButtonGroup Pizza_Type_Options = new ButtonGroup();
    JRadioButton Thin_Crust = new JRadioButton("Thin Crust");
    JRadioButton Medium_Crust = new JRadioButton("Medium Crust", true);
    JRadioButton Pan = new JRadioButton("Pan");

    JButton Process_Selection = new JButton("Process Selection");

    JLabel your_order = new JLabel("Your order :");

    JTextArea Checkout = new JTextArea();

    Color custom_Orange = new Color(255, 80, 0);

    pizzashop() {
        this.setTitle("Pizza Shop");
        this.setSize(600, 410);
        this.setLocation(500, 200);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        Welcome.setFont(new Font("Calibri", Font.PLAIN, 36));
        Welcome.setBounds(20, 20, 550, 35);
        Welcome.setForeground(custom_Orange);
        this.add(Welcome);

        // Toppings
        Toppings.setBounds(50, 60, 150, 190);
        Toppings.setBorder(BorderFactory.createLineBorder(custom_Orange));
        Toppings.setLayout(new BoxLayout(Toppings, BoxLayout.Y_AXIS));
        this.add(Toppings);

        Toppings_Label.setForeground(custom_Orange);
        Toppings.add(Toppings_Label);

        Toppings.add(Tomato);

        Toppings.add(Green_Pepper);

        Toppings.add(Black_Olives);

        Toppings.add(Mushrooms);

        Toppings.add(Extra_Cheese);

        Toppings.add(Pepperoni);

        Toppings.add(Sausage);

        // Pizza Size
        Pizza_Size.setBounds(250, 60, 105, 100);
        Pizza_Size.setBorder(BorderFactory.createLineBorder(custom_Orange));
        Pizza_Size.setLayout(new BoxLayout(Pizza_Size, BoxLayout.Y_AXIS));
        this.add(Pizza_Size);

        Pizza_Size_Options.add(Small);

        Pizza_Size_Options.add(Medium);

        Pizza_Size_Options.add(Large);

        Pizza_Size_Label.setForeground(custom_Orange);
        Pizza_Size.add(Pizza_Size_Label);

        Pizza_Size.add(Small);

        Pizza_Size.add(Medium);

        Pizza_Size.add(Large);

        // Pizza Type
        Pizza_Type.setBounds(400, 60, 150, 100);
        Pizza_Type.setBorder(BorderFactory.createLineBorder(custom_Orange));
        Pizza_Type.setLayout(new BoxLayout(Pizza_Type, BoxLayout.Y_AXIS));
        this.add(Pizza_Type);

        Pizza_Type_Options.add(Thin_Crust);

        Pizza_Type_Options.add(Medium_Crust);

        Pizza_Type_Options.add(Pan);

        Pizza_Type_Label.setForeground(custom_Orange);
        Pizza_Type.add(Pizza_Type_Label);

        Pizza_Type.add(Thin_Crust);

        Pizza_Type.add(Medium_Crust);

        Pizza_Type.add(Pan);

        // ze buton
        Process_Selection.setBounds(250, 220, 200, 30);
        Process_Selection.addActionListener(this);
        this.add(Process_Selection);

        // bill
        your_order.setBounds(20, 250, 80, 30);
        this.add(your_order);

        Checkout.setBounds(30, 280, 520, 70);
        Checkout.setEditable(false);
        this.add(Checkout);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double Total_Cost = 0;

        String Pizza_Type_Output = "";
        if (Thin_Crust.isSelected()) {
            Pizza_Type_Output = "Thin Crust";
        }
        if (Medium_Crust.isSelected()) {
            Pizza_Type_Output = "Medium Crust";
        }
        if (Pan.isSelected()) {
            Pizza_Type_Output = "Pan";
        }

        String Pizza_Size_Output = "";
        if (Small.isSelected()) {
            Pizza_Size_Output = "Small";
            Total_Cost += Small_Price;
        }
        if (Medium.isSelected()) {
            Pizza_Size_Output = "Medium";
            Total_Cost += Medium_Price;
        }
        if (Large.isSelected()) {
            Pizza_Size_Output = "Large";
            Total_Cost += Large_Price;
        }

        ArrayList<String> Toppings_List = new ArrayList<String>();
        if (Tomato.isSelected()) {
            Toppings_List.add("Tomato");
            Total_Cost += Toppings_Price;
        }
        if (Green_Pepper.isSelected()) {
            Toppings_List.add("Green Pepper");
            Total_Cost += Toppings_Price;
        }
        if (Black_Olives.isSelected()) {
            Toppings_List.add("Black Olives");
            Total_Cost += Toppings_Price;
        }
        if (Mushrooms.isSelected()) {
            Toppings_List.add("Mushrooms");
            Total_Cost += Toppings_Price;
        }
        if (Extra_Cheese.isSelected()) {
            Toppings_List.add("Extra Cheese");
            Total_Cost += Toppings_Price;
        }
        if (Pepperoni.isSelected()) {
            Toppings_List.add("Pepperoni");
            Total_Cost += Toppings_Price;
        }
        if (Sausage.isSelected()) {
            Toppings_List.add("Sausage");
            Total_Cost += Toppings_Price;
        }

        Checkout.setText(" Pizza type: " + Pizza_Type_Output + "\n Pizza size: " + Pizza_Size_Output + "\n Toppings: "
                + ArrtoString(Toppings_List) + "\n Amount Due: $" + Total_Cost);
    }

    private String ArrtoString(ArrayList<String> arr) {
        String output = "";
        if (arr.size() > 0) {
            output += arr.get(0);
            for (int x = 1; x < arr.size(); x++) {
                output += ", " + arr.get(x);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        new pizzashop();
    }
}
