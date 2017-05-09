package email.frameApp;

import email.DAO.UsersDAO;
import org.hibernate.query.Query;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


/**
 * Created by Дмитрий on 06.05.2017.
 */
public class StartingWindow {

    public static void main(String[] args){
        UsersDAO usersDAO=new UsersDAO();

        MainWin mainwin = new MainWin(usersDAO);
        mainwin.setVisible(true);
        mainwin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        frame frame=new frame();
//        frame.pack();
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
class MainWin extends JFrame {


    UsersDAO usersDAO;

    private JTextField logintxt;
    private JPasswordField pwdtxt;
    public MainWin(UsersDAO usersDAO){
        this.usersDAO = usersDAO;
        setSize(250, 200);
        setTitle("Enter Login/Pass");
        logintxt = new JTextField();
        pwdtxt = new JPasswordField();
        JLabel loginlbl = new JLabel("Login:");
        JLabel pwdlbl = new JLabel("Password:");
        JButton submitbtn = new JButton("Submit");
        JPanel formPanel = new JPanel(new GridLayout(5,1));
        formPanel.add(loginlbl);
        formPanel.add(logintxt);
        formPanel.add(pwdlbl);
        formPanel.add(pwdtxt);
        formPanel.add(submitbtn);
        add(formPanel);



        submitbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {

                Query<UserAndPass> andPassQuery =usersDAO.session.createQuery("from UserAndPass where name =:name and password=:password", UserAndPass.class);
                andPassQuery.setParameter("name",logintxt);
                andPassQuery.setParameter("name",pwdtxt);
                UserAndPass userAndPass1=andPassQuery.uniqueResult();
                if (null==userAndPass1){
                    loginlbl.setText("ne nauden");
                    System.out.println("пользователь не найден");
                }
                if (null!=userAndPass1){
                    usersDAO.setMainUser(userAndPass1);
                }

                System.out.println(pwdtxt.getText());
                System.out.println(logintxt.getText());


            }


        });
    }
}