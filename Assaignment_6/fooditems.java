package Assaignments.Assaignment_6;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class fooditems extends JFrame implements ActionListener
{
    int BurgerPrice = 5;
    int HotDogPrice = 7;
    int PizzaPrice = 10;

    JLabel fooditems = new JLabel("Select food items");
    JCheckBox Burger = new JCheckBox("Burger $" + BurgerPrice);
    JCheckBox HotDog = new JCheckBox("HotDog $" + HotDogPrice);
    JCheckBox Pizza = new JCheckBox("Pizza $" + PizzaPrice);
    JLabel Bill = new JLabel("Bill Amount is $0");

    Color DarkTheme_Black = new Color(30,30,30);
    Color DarkTheme_Gray = new Color(200, 200, 200);

    fooditems()
    {
        this.setTitle("Food Items");
        this.setSize(250, 250);
        this.setLocation(500, 200);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(DarkTheme_Black);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        fooditems.setBounds(50, 20, 300, 30);
        this.add(fooditems);
        fooditems.setForeground(DarkTheme_Gray);

        Burger.setBounds(100, 50, 300, 30);
        Burger.setBackground(DarkTheme_Black);
        Burger.setForeground(DarkTheme_Gray);
        Burger.addActionListener(this);
        this.add(Burger);
        
        HotDog.setBounds(100, 80, 300, 30);
        HotDog.setBackground(DarkTheme_Black);
        HotDog.setForeground(DarkTheme_Gray);
        HotDog.addActionListener(this);
        this.add(HotDog);
        
        Pizza.setBounds(100, 110, 300, 30);
        Pizza.setBackground(DarkTheme_Black);
        Pizza.setForeground(DarkTheme_Gray);
        Pizza.addActionListener(this);
        this.add(Pizza);

        Bill.setBounds(50, 140, 300, 30);
        Bill.setForeground(DarkTheme_Gray);
        this.add(Bill);
    }

    public static void main(String[] args) 
    {
        new fooditems();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int BillAmount = 0;
        if (Burger.isSelected())  { BillAmount += BurgerPrice; }
        if (HotDog.isSelected())  { BillAmount += HotDogPrice; }
        if (Pizza.isSelected())   { BillAmount += PizzaPrice;  }
        Bill.setText("Bill Amount is $" + BillAmount);
    }

}
