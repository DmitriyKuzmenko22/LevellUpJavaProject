package ua.dp.levelup.service;

import ua.dp.levelup.core.model.Ticket;

import java.util.List;

/**
 * Created by Дмитрий on 14.07.2017.
 */
public interface TicketService {
    void createTicket(Ticket ticket);
    void updateTicket(Ticket ticket);
    List<Ticket> getAllOrders();
    List<Ticket> getTicketsOfMovieSession(Long sessionId);
}
