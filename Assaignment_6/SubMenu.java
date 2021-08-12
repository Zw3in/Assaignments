package Assaignments.Assaignment_6;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SubMenu extends JFrame
{
    JMenuBar menubar = new JMenuBar();
    JMenu File = new JMenu("File");

    JMenuItem New = new JMenuItem("New");

    JMenuItem Open = new JMenuItem("Open");

    JMenuItem Save = new JMenuItem("Save");

    JMenuItem Import = new JMenuItem("Import");
    JPopupMenu Import_Popup = new JPopupMenu();
    JMenuItem Import_Pop_1 = new JMenuItem("Import newsfeed list...");
    JMenuItem Import_Pop_2 = new JMenuItem("Import bookmarks...");
    JMenuItem Import_Pop_3 = new JMenuItem("Import mail...");

    JMenuItem Exit = new JMenuItem("Exit");

    SubMenu()
    {
        setTitle("SubMenu");
        setSize(500, 500);
        setLocation(200, 200);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        menubar.setBounds(0, 0, 2000, 30);
        
        File.setIcon(new ImageIcon("Assaignments\\Assaignment_6\\Resources\\file_icon.png"));
        New.setIcon(new ImageIcon("Assaignments\\Assaignment_6\\Resources\\new_icon.png"));
        Open.setIcon(new ImageIcon("Assaignments\\Assaignment_6\\Resources\\open_icon.png"));
        Save.setIcon(new ImageIcon("Assaignments\\Assaignment_6\\Resources\\save_icon.png"));
        Import.setIcon(new ImageIcon("Assaignments\\Assaignment_6\\Resources\\import_icon.png"));
        Exit.setIcon(new ImageIcon("Assaignments\\Assaignment_6\\Resources\\exit_icon.png"));

        add(menubar);
        menubar.add(File);

        File.add(New);
        File.add(Open);
        File.add(Save);
        File.add(new JSeparator());
        File.add(Import);
        File.add(new JSeparator());
        File.add(Exit);

        add(Import_Popup);
        Import_Popup.add(Import_Pop_1);
        Import_Popup.add(Import_Pop_2);
        Import_Popup.add(Import_Pop_3);

        Import.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                Import_Popup.show(Import, Import.getWidth(), 0);
            }
        });
        
    }// Constructor
    public static void main(String[] args) 
    {
        new SubMenu();
    }
}
