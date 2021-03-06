package ua.dp.levelup.dao;

import ua.dp.levelup.core.model.Ticket;

import java.util.List;

/**
 * @author Alexandr Shegeda on 23.06.17.
 */
public interface TicketDao {
    void createTicket(Ticket ticket);

    void deleteTicket(Ticket ticket);

    void updateTicket(Ticket ticket);
    List<Ticket> getAllTickets();

    List<Ticket> getTicketsOfMovieSession(Long sessionId);
}
