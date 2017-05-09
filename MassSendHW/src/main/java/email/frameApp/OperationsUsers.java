package email.frameApp;

import email.DAO.UsersDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Дмитрий on 09.05.2017.
 */
public class OperationsUsers extends JFrame {

    private JTextField nameUsers;
    private JTextField passwordUsers;
    private JCheckBox adminRole;
    private JCheckBox usersRole;
    private JLabel jLabel;
    private UsersDAO usersDAO;
    private JComboBox comboBox;
    private final UserTableModel userTableModel;


    public OperationsUsers(UsersDAO usersDAO, UserTableModel userTableModel){ //todo добавил в конструктор юзертаблмодель
        this.usersDAO=usersDAO;
        this.userTableModel = userTableModel;

        String items[]={
                "saf",
                "user"

        };
        comboBox=new JComboBox(items);
        setSize(500,500);
        setTitle("Operations on users");
        nameUsers=new JTextField();
        passwordUsers=new JTextField();
        adminRole=new JCheckBox("Admin");
        usersRole=new JCheckBox("Users");

        JLabel nameLabel= new JLabel("Name users");
        JLabel passwordLabel = new JLabel("Passwords users");
        JButton submit = new JButton("Submit users");
        JButton back = new JButton("Back to admin");
        JPanel jPanel=new JPanel(new GridLayout(5,1));

        jPanel.add(nameLabel);
        jPanel.add(nameUsers);
        jPanel.add(passwordLabel);
        jPanel.add(passwordUsers);
        jPanel.add(comboBox);
        jPanel.add(submit);
        //jPanel.add(back);

               add(jPanel);

               submit.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                      UserAndPass userAndPass1=createUser();
                      usersDAO.create(userAndPass1);
                      userTableModel.getUserList().add(userAndPass1);

                   }
               });



//        back.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//
//
//                setVisible(false);
//
//
//            }
//        });

    }
    private UserAndPass createUser(){
        String name= nameUsers.getText();
        String pass=passwordUsers.getText();
        String role= (String) comboBox.getSelectedItem();
        return new UserAndPass(name,pass,role);
    }



    }

