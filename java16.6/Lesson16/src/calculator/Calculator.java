package calculator;

import javax.swing.*;
import java.awt.*;

/**
 * Created by java on 27.12.2016.
 */
public class Calculator {


        public static JTextField textField = new JTextField();
    public static void main(String[] args) {
    JFrame frame = new JFrame();
        frame.setSize(250,300);
        frame.setTitle("Calculator");

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout borderLayout = new BorderLayout();
        borderLayout.addLayoutComponent(textField, BorderLayout.NORTH);
        frame.add(textField);

        MainPanel mainPanel = new MainPanel();

        borderLayout.addLayoutComponent(mainPanel, BorderLayout.CENTER);
        frame.add(mainPanel);


        frame.setLayout(borderLayout);
        frame.setVisible(true);
    }
}
