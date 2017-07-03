package ua.dp.levelup.service;

import ua.dp.levelup.core.model.Film;

import java.util.List;

/**
 * @author Alexandr Shegeda on 23.06.17.
 */
public interface FilmService {
    List<Film> getAllFilms();

    Film getAllFilmById(Long id);

    void createFilm(Film film);

    void updateFilm(Film film);

    void deleteFilm(Film film);
}
