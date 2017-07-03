package ua.dp.levelup.dao;

import ua.dp.levelup.core.model.Film;

import java.util.List;

/**
 * @author Alexandr Shegeda on 23.06.17.
 */
public interface FilmDao {



    List<Film> getAllFilms();

    Film getFilmById(Long id);

    void createFilm(Film film);

    void deleteFilm(Film film);

    void updateFilm(Film film);
}
