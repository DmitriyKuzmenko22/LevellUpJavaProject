package testFrame.frame2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Дмитрий on 06.05.2017.
 */
public class LabelPanel extends JPanel {
    public LabelPanel() {
        JLabel plainLabel = new JLabel("Plain small label");
        add(plainLabel);

        JLabel fancyLabel = new JLabel("Fancy Big label");
        Font font = new Font("Serif", Font.BOLD | Font.ITALIC, 12);

        fancyLabel.setFont(font);

//        Icon folderIcon = new ImageIcon("sw.gif");
//        fancyLabel.setIcon(folderIcon);

        fancyLabel.setHorizontalAlignment(JLabel.CENTER);
        add(fancyLabel);
    }
}

