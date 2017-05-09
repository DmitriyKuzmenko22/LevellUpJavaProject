package email.frameApp;



import javax.swing.*;


/**
 * Created by Дмитрий on 08.05.2017.
 */


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

      /*  UserTableModel userTableModel=new UserTableModel();

        AdminPanel adminPanel=new AdminPanel(userTableModel);
        adminPanel.setVisible(true);*/

        startFrameApp mainwin = new startFrameApp();
        mainwin.setLocationRelativeTo(null);
        mainwin.setVisible(true);


        mainwin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


        /*SessionFactory sessionFactory = getSessionFactory();
        Session session = sessionFactory.openSession();


        Transaction transaction = session.getTransaction();

        UserAndPass userAndPass = new UserAndPass("as","asf","saf");
        transaction.begin();
        session.save(userAndPass);
        transaction.commit();*/


    }

