import javax.swing.*;
import javax.swing.plaf.metal.MetalIconFactory;
import java.awt.*;

/**
 * Created by java on 27.12.2016.
 */
public class LabelPanel extends JPanel {
    public LabelPanel(){
        JLabel plainLabel = new JLabel("Plain small label");
        add(plainLabel);

        JLabel fancyLabel = new JLabel("Fancy Big label");
        Font fancyFont = new Font("Serif",Font.BOLD|Font.ITALIC,32);

        Icon tigerIcon=new ImageIcon("img.jpg");
        fancyLabel.setIcon(tigerIcon);

        fancyLabel.setFont(fancyFont);

        fancyLabel.setHorizontalAlignment(JLabel.RIGHT);
        add(fancyLabel);
    }
}
