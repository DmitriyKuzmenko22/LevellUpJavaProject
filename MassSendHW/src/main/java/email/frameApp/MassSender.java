package email.frameApp;

import email.DAO.UsersDAO;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Дмитрий on 09.05.2017.
 */
public class MassSender extends JFrame {

    public final UsersDAO usersDAO;
    private final JPanel panel = new JPanel();
    public final JScrollPane jScrollPane;
    public final JTable jTable;
    private final UserTableModel userTableModel;

    public MassSender(UsersDAO usersDAO){
        this.usersDAO=usersDAO;
        this.userTableModel=new UserTableModel();
        this.jTable=new JTable(userTableModel);
        jScrollPane=new JScrollPane(jTable);
        add(panel);
        panel.add(jScrollPane);
        setSize(900,500);
        panel.setSize(new Dimension(200,400));
        JButton listMessage = new JButton("Add list message");
        JButton sendMessage = new JButton("Send message");
        setLocationRelativeTo(null);
        panel.add(listMessage);
        panel.add(sendMessage);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
