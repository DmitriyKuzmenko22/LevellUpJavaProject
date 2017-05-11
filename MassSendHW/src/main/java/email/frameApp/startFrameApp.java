package email.frameApp;

import email.DAO.PacketDAO;
import email.DAO.UsersDAO;

import org.hibernate.query.Query;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by Дмитрий on 08.05.2017.
 */


public class startFrameApp extends JFrame {
    UsersDAO usersDAO=new UsersDAO();
    private final PacketDAO packetDAO=new PacketDAO();

    private JTextField logintxt;
    private JPasswordField pwdtxt;
    public boolean flagStartFrame=false;


    public startFrameApp() throws IOException {
        //todo ubral pustou constructor


        setSize(250, 200);
        setTitle("Enter Login/Pass");
        logintxt = new JTextField();
        pwdtxt = new JPasswordField();
        final JLabel loginlbl = new JLabel("Login:");
        JLabel pwdlbl = new JLabel("Password:");
        JButton submitbtn = new JButton("Submit");
        JPanel formPanel = new JPanel(new GridLayout(5, 1));
        formPanel.add(loginlbl);
        formPanel.add(logintxt);
        formPanel.add(pwdlbl);
        formPanel.add(pwdtxt);
        formPanel.add(submitbtn);
        add(formPanel);


        submitbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

                Query<UserAndPass> andPassQuery = usersDAO.session.createQuery("from UserAndPass where name =:name and password=:password", UserAndPass.class);
                andPassQuery.setParameter("name", logintxt.getText());
                andPassQuery.setParameter("password", new String(pwdtxt.getPassword()));
                UserAndPass userAndPass1 = andPassQuery.uniqueResult();
                if (null == userAndPass1) {
                    loginlbl.setText("пользователь не найден");
                    loginlbl.setForeground(Color.red);
                    System.out.println("пользователь не найден");
                }
                if (null != userAndPass1) {
                    usersDAO.setMainUser(userAndPass1);
                    WorkFrame WorkFrame = null;
                    try {
                        WorkFrame = new WorkFrame(usersDAO,packetDAO);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    WorkFrame.setLocationRelativeTo(null);
                    WorkFrame.setVisible(true);
                    flagStartFrame=true;
                    setVisible(false);
                    WorkFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }

                System.out.println(pwdtxt.getPassword());
                System.out.println(logintxt.getText());

            }
        });

    }

}
