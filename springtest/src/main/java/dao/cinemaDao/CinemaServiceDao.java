package dao.cinemaDao;

import dao.cinema.Film;
import dao.cinema.MovieSession;
import dao.cinema.Order;

import java.util.List;

/**
 * Created by Дмитрий on 22.06.2017.
 */
public interface CinemaServiceDao {

    List<Film> getAllFilms();

    Film getFilmById(Long id);

    Film getFilmByName(String film);

    void createFilm(Film film);

    void deleteFilm(Film film);

    void updateFilm(Film film);



    List<MovieSession> getAllMovieSession();

    MovieSession getMovieSession(Long id);
    void createMovieSession(MovieSession movieSession);

    void deleteMovieSession(MovieSession movieSession);

    void updateMovieSession(MovieSession movieSession);



    List<Order> getAlOrders();

    Order getOrderById(Long id);
    void createOrder(Order order);

    void deleteOrder(Order order);

    void updateOrder(Order order);
}
