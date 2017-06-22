package dao.cinemaDao;

import dao.User;
import dao.cinema.Film;

import java.util.List;

/**
 * Created by Дмитрий on 22.06.2017.
 */
public interface FilmDao {
    List<Film> getAllFilms();

    Film getFilmById(Long id);

    Film getFilmByName(String film);

    void createFilm(Film film);

    void deleteFilm(Film film);

    void updateFilm(Film film);
}
