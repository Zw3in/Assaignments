package Assaignments.Assaignment_9;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class SubMenu extends JFrame {
    JMenuBar menubar = new JMenuBar();
    JMenu File = new JMenu("File");

    JMenuItem New = new JMenuItem("New");

    JMenuItem Open = new JMenuItem("Open");

    JMenuItem Save = new JMenuItem("Save");

    JMenu Import = new JMenu("Import");
    JMenuItem Import_Pop_1 = new JMenuItem("Import newsfeed list...");
    JMenuItem Import_Pop_2 = new JMenuItem("Import bookmarks...");
    JMenuItem Import_Pop_3 = new JMenuItem("Import mail...");

    JMenuItem Exit = new JMenuItem("Exit");

    SubMenu() {
        setTitle("SubMenu");
        setSize(500, 500);
        setLocation(200, 200);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        menubar.setBounds(0, 0, 2000, 30);

        // Icons
        File.setIcon(new ImageIcon("Assaignments\\Assaignment_9\\Resources\\file_icon.png"));
        New.setIcon(new ImageIcon("Assaignments\\Assaignment_9\\Resources\\new_icon.png"));
        Open.setIcon(new ImageIcon("Assaignments\\Assaignment_9\\Resources\\open_icon.png"));
        Save.setIcon(new ImageIcon("Assaignments\\Assaignment_9\\Resources\\save_icon.png"));
        Import.setIcon(new ImageIcon("Assaignments\\Assaignment_9\\Resources\\import_icon.png"));
        Exit.setIcon(new ImageIcon("Assaignments\\Assaignment_9\\Resources\\exit_icon.png"));

        // MenuBar >> File
        add(menubar);
        menubar.add(File);
        File.add(New);
        File.add(Open);
        File.add(Save);
        File.add(new JSeparator());
        File.add(Import);
        File.add(new JSeparator());
        File.add(Exit);

        // Import >> PopupMenu
        Import.add(Import_Pop_1);
        Import.add(Import_Pop_2);
        Import.add(Import_Pop_3);
    }// Constructor

    public static void main(String[] args) {
        new SubMenu();
    }
}
