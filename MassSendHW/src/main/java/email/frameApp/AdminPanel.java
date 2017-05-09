package email.frameApp;

import email.DAO.UsersDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Дмитрий on 08.05.2017.
 */
public class AdminPanel extends JFrame {

    private static final int ACTION_BTN_W = 75;
    private static final int ACTION_BTN_H = 50;
    private static final int BTN_Y = 310;
    private static final int BTN_X_STEP = 100;
    public final UsersDAO usersDAO;

    private final JPanel panel = new JPanel();
    public final JScrollPane jScrollPane;
    public final JTable jTable;
    private final UserTableModel userTableModel;

    public AdminPanel(UsersDAO usersDAO){
        this.usersDAO = usersDAO;
        this.userTableModel=new UserTableModel();
        this.jTable=new JTable(userTableModel);
        jScrollPane=new JScrollPane(jTable);
        add(panel);
        panel.add(jScrollPane);
        setSize(900,500);
        panel.setSize(new Dimension(200,400));
        JButton addUsers = new JButton("Add users");
        setLocationRelativeTo(null);
        panel.add(addUsers);
        readUsers();

        addUsers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                OperationsUsers operationsUsers=new OperationsUsers(usersDAO, userTableModel);
                operationsUsers.setLocationRelativeTo(null);
                operationsUsers.setVisible(true);
                setVisible(false);

                operationsUsers.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });

        createActionButtons();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    private void createActionButtons() {
        JButton[] actionButtons = new JButton[]{new JButton("create"),
                new JButton("read"),
                new JButton("update"),
                new JButton("delete")};
        ActionListener[] listeners = {createListener(),
                readListener(),
                updateListener(),
                deleteListener()};

        for (int i = 0; i < actionButtons.length; i++) {
            JButton button = actionButtons[i];
            button.addActionListener(listeners[i]);
           // button.setBounds(200 + BTN_X_STEP * i, BTN_Y, ACTION_BTN_W, ACTION_BTN_H);
            panel.add(button);
        }

    }

    public void readUsers(){
        userTableModel.setUserList(usersDAO.read());
        revalidate();
        jTable.updateUI();
        revalidate();
    }

    public void deleteUsers(){
        UserAndPass userAndPass=userTableModel.getSelectedRowData(jTable.getSelectedRow());
        userTableModel.getUserList().remove(userAndPass);
        usersDAO.delete(userAndPass);
        jTable.updateUI();
    }

    public void updateUsers(){
        UserAndPass userAndPass=userTableModel.getSelectedRowData(jTable.getSelectedRow()); //берем сначала поля изначального вида таблицы а потом то , что мы сами изменили во фрейеме
        usersDAO.update(userAndPass);
    }




    private ActionListener deleteListener() {
        return e -> deleteUsers();
    }

    private ActionListener updateListener() {
        return e -> updateUsers();
    }

    private ActionListener readListener() {
        return e->readUsers();
        }


    private ActionListener createListener() {
        return null;
    }


}
