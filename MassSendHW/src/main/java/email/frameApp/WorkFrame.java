package email.frameApp;

import email.DAO.UsersDAO;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Дмитрий on 08.05.2017.
 */


public class WorkFrame extends JFrame {
    private JTextField email;
    private JTextField subject;
    private JTextField message;
    private UsersDAO usersDAO;



    public WorkFrame(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
        setSize(500, 500);
        setTitle("Message");
        email = new JTextField();
        subject = new JTextField();
        message = new JTextField();
        JLabel emailLabel = new JLabel("Adress email");
        JLabel subjectLabel = new JLabel("Subject email");
        JLabel messageLabel = new JLabel("Message email");
        JButton endMessage = new JButton("Send message");
        final JButton admin = new JButton("Admin role");
        JPanel formPanel = new JPanel(new GridLayout(5, 1));
        if (usersDAO.mainUser.getRoleAccount().equals("user")){
            admin.setEnabled(false);
        }
        JButton massSend=new JButton("Mass Send");
        formPanel.add(emailLabel);
        formPanel.add(email);
        formPanel.add(subjectLabel);
        formPanel.add(subject);
        formPanel.add(messageLabel);
        formPanel.add(message);
        formPanel.add(endMessage);
        formPanel.add(admin);
        formPanel.add(massSend);
        add(formPanel);

        endMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(email.getText());
            }
        });

        massSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MassSender massSender=new MassSender(usersDAO);
                massSender.setVisible(true);
                setVisible(false);
            }
        });

        admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

                AdminPanel adminPanel=new AdminPanel(usersDAO);
                adminPanel.setVisible(true);
                setVisible(false);


            }
        });


    }
}
