package dao.impl.cinema;

import dao.cinema.Film;
import dao.cinema.MovieSession;
import dao.cinema.Order;
import dao.cinemaDao.CinemaServiceDao;
import dao.cinemaDao.FilmDao;
import dao.cinemaDao.MovieSessionDao;

import java.util.List;

/**
 * Created by Дмитрий on 22.06.2017.
 */
public class CinemaServiceDaoImpl implements CinemaServiceDao {

    private FilmDao filmDao;
    private MovieSessionDao movieSessionDao;
    private OrderDaoImpl orderDao;

    public void setFilmDao(FilmDao filmDao) {
        this.filmDao = filmDao;
    }

    public void setMovieSessionDao(MovieSessionDao movieSessionDao) {
        this.movieSessionDao = movieSessionDao;
    }

    public void setOrderDao(OrderDaoImpl orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public List<Film> getAllFilms() {
        return filmDao.getAllFilms();
    }

    @Override
    public Film getFilmById(Long id) {
        return filmDao.getFilmById(id);
    }

    @Override
    public Film getFilmByName(String film) {
        return filmDao.getFilmByName(film);
    }

    @Override
    public void createFilm(Film film) {
        filmDao.createFilm(film);
    }

    @Override
    public void deleteFilm(Film film) {
        filmDao.deleteFilm(film);

    }

    @Override
    public void updateFilm(Film film) {
        filmDao.createFilm(film);
    }

    @Override
    public List<MovieSession> getAllMovieSession() {
        return movieSessionDao.getAllMovieSession();
    }

    @Override
    public MovieSession getMovieSession(Long id) {
        return movieSessionDao.getMovieSession(id);
    }

    @Override
    public void createMovieSession(MovieSession movieSession) {
        movieSessionDao.createMovieSession(movieSession);
    }

    @Override
    public void deleteMovieSession(MovieSession movieSession) {
        movieSessionDao.deleteMovieSession(movieSession);

    }

    @Override
    public void updateMovieSession(MovieSession movieSession) {
        movieSessionDao.createMovieSession(movieSession);
    }

    @Override
    public List<Order> getAlOrders() {
        return orderDao.getAlOrders();
    }

    @Override
    public Order getOrderById(Long id) {
        return orderDao.getOrderById(id);
    }

    @Override
    public void createOrder(Order order) {
        orderDao.createOrder(order);

    }

    @Override
    public void deleteOrder(Order order) {
        orderDao.deleteOrder(order);

    }

    @Override
    public void updateOrder(Order order) {
        orderDao.createOrder(order);
    }
}
