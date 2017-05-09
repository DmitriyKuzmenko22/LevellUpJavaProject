package testFrame.frame2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Дмитрий on 06.05.2017.
 */
public class TestFrame {
    static int counter = 0;

    private JFrame frame;
    private JTextField textField;
    private JOptionPane dialog;

    public static void main(String[] args) {
        JFrame frame = new JFrame("This is my title");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout layout = new BorderLayout();

        LabelPanel labelPanel = new LabelPanel();
        Menu menu = new Menu();

        layout.addLayoutComponent(menu, BorderLayout.PAGE_START);
        layout.addLayoutComponent(labelPanel, BorderLayout.CENTER);


        frame.add(menu);
        frame.add(labelPanel);

        JLabel label = new JLabel();
        label.setText("1");

        layout.addLayoutComponent(label, BorderLayout.LINE_START);
        frame.add(label);


        JButton button = new JButton("Click me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText((++counter) + "");
            }
        });

        JPanel btnPanel = new JPanel();
        btnPanel.setPreferredSize(new Dimension(155, 125));

        btnPanel.add(button);

        layout.addLayoutComponent(btnPanel, BorderLayout.CENTER);

        frame.add(btnPanel);

        frame.setLayout(layout);
        frame.pack();
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
//        Thread.sleep(2000);
//
//        frame.setState(Frame.ICONIFIED);
//
//        Thread.sleep(2000);
//
//        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
//
//        Thread.sleep(2000);
//
//        frame.setExtendedState(Frame.NORMAL);
    }
}


