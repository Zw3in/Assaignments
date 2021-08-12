package Assaignments.Assaignment_6;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.Color;

public class scrollbars extends JFrame
{
    JLabel label = new JLabel("Control in action: Scrollbars");
    JLabel horizontal_pos = new JLabel("Horizontal: 0");
    JScrollBar horizontal = new JScrollBar(JScrollBar.HORIZONTAL);
    JLabel vertical_pos = new JLabel("Vertical: 0");
    JScrollBar vertical = new JScrollBar(JScrollBar.VERTICAL);
    scrollbars()
    {
        this.setTitle("Scrollbars");
        this.setSize(400, 400);
        this.setLocation(500, 200);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setForeground(Color.ORANGE);


        label.setBounds(100, 20, 300, 30);
        this.add(label);

        horizontal_pos.setBounds(120, 270, 100, 30);
        this.add(horizontal_pos);

        horizontal.setBounds(70, 220, 200, 30);
        horizontal.addAdjustmentListener(new AdjustmentListener()
        {
            public void adjustmentValueChanged(AdjustmentEvent e){
                horizontal_pos.setText("Horizontal: " + horizontal.getValue());
            }
        });
        this.add(horizontal);
        
        vertical_pos.setBounds(250, 270, 100, 30);
        this.add(vertical_pos);

        vertical.setBounds(270, 50, 30, 200);
        vertical.addAdjustmentListener(new AdjustmentListener()
        {
            public void adjustmentValueChanged(AdjustmentEvent e){
                vertical_pos.setText("Vertical: " + vertical.getValue());
            }
        });
        this.add(vertical);
    }
    public static void main(String[] args)
    {
        new scrollbars();
    }
}
