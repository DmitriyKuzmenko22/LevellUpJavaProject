package email.DAO;

import email.frameApp.PacketSend;
import email.sender.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static email.hiber.HibernateUtil.getSessionFactory;

/**
 * Created by Дмитрий on 09.05.2017.
 */
public class PacketDAO extends AbstractDAO<PacketSend> {

    public static SessionFactory sessionFactory=getSessionFactory();
    public File currentPacket=null;
    public EmailSenderFromFileList emailSenderFromFileList = new EmailSenderFromFileList();

    ArrayBlockingQueue<EmailMessage> queue=new ArrayBlockingQueue<EmailMessage>(500);
    public EmailProducer emailProducer= new EmailProducer(queue);
    private ExecutorService executorService= Executors.newFixedThreadPool(3);
    public static Session session=sessionFactory.openSession();
    public Transaction transaction=session.getTransaction();

    public PacketDAO() throws IOException {
        executorService.execute(new EmailConsumer(queue));
        executorService.execute(new EmailConsumer(queue));
        executorService.execute(new EmailConsumer(queue));
    }

    @Override
    public void create(PacketSend packetSend) {
        transaction.begin();
        session.save(packetSend);
        transaction.commit();

    }

    @Override
    public ArrayList<PacketSend> read() {
        Query packQuery = session.createQuery("from PacketSend", PacketSend.class);
        ArrayList<PacketSend> arrayList= (ArrayList<PacketSend>) packQuery.getResultList();
        return arrayList;
    }

    @Override
    public void update(PacketSend packetSend) {
        transaction.begin();
        session.update(packetSend);
        transaction.commit();
    }

    @Override
    public void delete(PacketSend packetSend) {
        transaction.begin();
        session.delete(packetSend);
        transaction.commit();
    }
}
