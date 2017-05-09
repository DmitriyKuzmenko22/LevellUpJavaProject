package testFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Дмитрий on 06.05.2017.
 */

    public class MainFrame {

        private JFrame frame;
        private JTextField textField;
        private JOptionPane dialog;
        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {

                        MainFrame window = new MainFrame();
                        window.frame.setVisible(true);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        public MainFrame() {
            loginpass();
        }

        private void loginpass() {
            frame = new JFrame();
            frame.setBounds(100, 100, 846, 729);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            GridBagLayout gridBagLayout = new GridBagLayout();
            gridBagLayout.columnWidths = new int[]{115, 101, 99, 171, 180, 256, 208, 285, -76, 0};
            gridBagLayout.rowHeights = new int[]{0, 0, 26, 42, 30, 44, 28, 51, 42, 0, 0};
            gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
            gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
            frame.getContentPane().setLayout(gridBagLayout);

            textField = new JTextField();
            GridBagConstraints gbc_textField = new GridBagConstraints();
            gbc_textField.gridwidth = 2;
            gbc_textField.insets = new Insets(0, 0, 5, 5);
            gbc_textField.fill = GridBagConstraints.HORIZONTAL;
            gbc_textField.gridx = 4;
            gbc_textField.gridy = 4;
            frame.getContentPane().add(textField, gbc_textField);
            textField.setColumns(10);
            String str = textField.getText() ;

            JButton btnNewButton = new JButton("Вход");
            GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
            gbc_btnNewButton.fill = GridBagConstraints.BOTH;
            gbc_btnNewButton.gridwidth = 2;
            gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
            gbc_btnNewButton.gridx = 4;
            gbc_btnNewButton.gridy = 8;
            frame.getContentPane().add(btnNewButton, gbc_btnNewButton);

            Listener login = new Listener(str);
            btnNewButton.addActionListener(login);
        }

    }

