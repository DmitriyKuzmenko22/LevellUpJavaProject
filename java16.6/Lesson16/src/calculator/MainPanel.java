package calculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by java on 27.12.2016.
 */
public class MainPanel extends JPanel {
    public MainPanel() {
        GridLayout gridLayout = new GridLayout(1,2);

        NumberPanel numberPanel = new NumberPanel();
        gridLayout.addLayoutComponent("NumberPanel", numberPanel);
        add(numberPanel);

        OperationPenal operationPenal = new OperationPenal();

        gridLayout.addLayoutComponent("OperationPenal", operationPenal);
        add(operationPenal);


        setLayout(gridLayout);
    }
}
