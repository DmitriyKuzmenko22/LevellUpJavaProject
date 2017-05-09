package email.frameApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Дмитрий on 06.05.2017.
 */
public class frame extends JFrame {

    private JTextField email;
    private JTextField subject;
    private JTextField message;

    public  frame(){
        setSize(500,500);
        setTitle("Message");
        email=new JTextField();
        subject=new JTextField();
        message=new JTextField();
        JLabel emailLabel=new JLabel("Adress email");
        JLabel subjectLabel=new JLabel("Subject email");
        JLabel messageLabel=new JLabel("Message email");
        JButton endMessage= new JButton("End message");
        JPanel formPanel = new JPanel(new GridLayout(5,1));
        formPanel.add(emailLabel);
        formPanel.add(email);
        formPanel.add(subjectLabel);
        formPanel.add(subject);
        formPanel.add(messageLabel);
        formPanel.add(message);
        formPanel.add(endMessage);
        add(formPanel);

        endMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(email.getText());
            }
        });
    }

}
