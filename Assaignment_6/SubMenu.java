package Assaignments.Assaignment_6;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class SubMenu extends JFrame
{
    JMenuBar menubar = new JMenuBar();
    JMenu File = new JMenu("File");
    JMenuItem New = new JMenuItem("New");
    JMenuItem Open = new JMenuItem("Open");
    JMenuItem Save = new JMenuItem("Save");
    JMenuItem Import = new JMenuItem("Import");
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
        
        File.setIcon(new ImageIcon("file_icon.png"));
        New.setIcon(new ImageIcon("new_icon.png"));
        Open.setIcon(new ImageIcon("open_icon.png"));
        Save.setIcon(new ImageIcon("save_icon.png"));
        Import.setIcon(new ImageIcon("import_icon.png"));
        Exit.setIcon(new ImageIcon("exit_icon.png"));

        add(menubar);
        menubar.add(File);
        File.add(New);
        File.add(Open);
        File.add(Save);
        File.add(new JSeparator());
        File.add(Import);
        File.add(new JSeparator());
        File.add(Exit);
    }
    public static void main(String[] args) 
    {
        new SubMenu();
    }
}
