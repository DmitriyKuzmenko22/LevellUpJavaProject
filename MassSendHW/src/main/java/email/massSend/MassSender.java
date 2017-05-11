package email.massSend;

import email.DAO.PacketDAO;
import email.DAO.UsersDAO;
import email.frameApp.UserAndPass;
import email.sender.EmailMessage;
import email.sender.EmailSenderFromFileList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Дмитрий on 09.05.2017.
 */
public class MassSender extends JFrame {

    public final UsersDAO usersDAO;
    private final JPanel panel = new JPanel();
    public final JScrollPane jScrollPane;
    public final JTable jTable;
    private final MassTableModel massTableModel;
    private final PacketDAO packetDAO;
    private final EmailSenderFromFileList emailSenderFromFileList;

    public MassSender(UsersDAO usersDAO, PacketDAO packetDAO) throws IOException {
        this.usersDAO = usersDAO;
        this.packetDAO = packetDAO;
        this.massTableModel = new MassTableModel();
        this.jTable = new JTable(massTableModel);
        this.emailSenderFromFileList = new EmailSenderFromFileList();
        jScrollPane = new JScrollPane(jTable);
        add(panel);
        panel.add(jScrollPane);
        setSize(900, 500);
        panel.setSize(new Dimension(200, 400));
        JButton listMessage = new JButton("Add list message");
        JButton sendMessage = new JButton("Send message");
        JButton createPacket = new JButton("Create packet");
        setLocationRelativeTo(null);
        panel.add(listMessage);
        panel.add(sendMessage);
        panel.add(createPacket);
        readPaket();

        createPacket.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File fileTest = new File("testFile.csv");


                PacketSend packetSend = new PacketSend(fileTest.getName(), new Date(), usersDAO.mainUser.getId(), fileTest);
                packetDAO.create(packetSend);
                readPaket();

                //emailSenderFromFileList.startSender(fileTest);


            }
        });

        sendMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    SendPacket();
                } catch (IOException e1) {
                    e1.printStackTrace();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        });


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public void SendPacket() throws IOException, InterruptedException {
        PacketSend packetSend=massTableModel.getSelectedRowData(jTable.getSelectedRow());
        emailSenderFromFileList.startSender(packetSend.getFile());
    }


    public void readPaket() {
        massTableModel.setPacketSend(packetDAO.read());
        revalidate();
        jTable.updateUI();
        revalidate();
    }
}
