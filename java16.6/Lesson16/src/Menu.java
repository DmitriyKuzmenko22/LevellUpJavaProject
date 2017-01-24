import javax.swing.*;

/**
 * Created by java on 27.12.2016.
 */
public class Menu extends JMenuBar {


    public Menu(){
        JMenu menuFile = new JMenu("File");
        JMenu fileOpen = new JMenu("FileOpen");
        JMenu fileClose = new JMenu("FileClose");

        menuFile.add(fileOpen);
        menuFile.add(fileClose);
        add(menuFile);

        JMenu menuEdit = new JMenu("Edit");
        JMenu editCopy = new JMenu("Copy");
        JMenu editPaste = new JMenu("Paste");
        menuEdit.add(editCopy);
        menuEdit.add(editPaste);
        add(menuEdit);

    }
}
