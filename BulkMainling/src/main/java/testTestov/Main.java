package testTestov;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Дмитрий on 06.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        LoginPanel message = new LoginPanel();
        if (JOptionPane.showOptionDialog(null, message, "Авторизация", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Вход", "Отмена"}, "Вход") == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, String.format("Логин: %s\nПароль: %s", message.getLogin(), message.getPassword()));
        } else {
            JOptionPane.showMessageDialog(null, "Действие отменено!");
        };
    }

    private static class LoginPanel extends JPanel {

        private JTextField login;
        private JPasswordField password;

        public LoginPanel() {
            GridBagLayout l = new GridBagLayout();
            l.columnWeights = new double[] {.3, 1};
            setLayout(l);
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridwidth = 30;
            gbc.anchor = GridBagConstraints.WEST;
            add(new JLabel("Логин:"), gbc);
            gbc.gridy = 1;
            add(new JLabel("Пароль:"), gbc);

            gbc.gridx = 1;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.BOTH;
            login = new JTextField();
            add(login, gbc);

            password = new JPasswordField();
            gbc.gridy = 1;
            add(password, gbc);
        }

        public String getLogin() {
            return login.getText();
        }
        public String getPassword() {
            return new String(password.getPassword());
        }
    }
}
