package ua.dp.levelup.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.dp.levelup.core.model.Ticket;
import ua.dp.levelup.dao.TicketDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by java on 27.06.2017.
 */
@Repository
@Transactional
public class TicketDaoImpl implements TicketDao {


    @Autowired
    private HibernateTemplate template;

    @Override
    public void createTicket(Ticket ticket) {
        template.save(ticket);
    }

    @Override
    public void deleteTicket(Ticket ticket) {
        template.delete(Ticket.class);
    }

    @Override
    public void updateTicket(Ticket ticket) {
        template.update(Ticket.class);

    }

    @Override
    public List<Ticket> getAllTickets() {
        return template.loadAll(Ticket.class);
    }

    @Override
    public List<Ticket> getTicketsOfMovieSession(Long sessionId) {

        List<Ticket> allTickets = getAllTickets();
        List<Ticket> ticketsOfMovieSession=new ArrayList<>();

        for (Ticket t :
                allTickets) {
            if (t.getMovieSessionId()==sessionId){
                ticketsOfMovieSession.add(t);
            }
            
        }
        return ticketsOfMovieSession;
    }
}
