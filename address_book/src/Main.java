import view.impl.CitizenTablePanel;
import view.impl.CreateCitizenDialog;

import javax.swing.*;

/**
 * Created by java on 10.01.2017.
 */
public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(600,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        CitizenTablePanel panel = new CitizenTablePanel();
        panel.setVisible(true);

        frame.add(panel);
        frame.setVisible(true);
    }
    //hh
}