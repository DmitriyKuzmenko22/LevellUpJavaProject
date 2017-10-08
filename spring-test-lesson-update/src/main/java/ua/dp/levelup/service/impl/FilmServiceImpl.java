package ua.dp.levelup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dp.levelup.core.model.Film;
import ua.dp.levelup.dao.FilmDao;
import ua.dp.levelup.service.FilmService;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

  @Autowired
  private FilmDao filmDao;

  public void setFilmDao(final FilmDao filmDao) {
    this.filmDao = filmDao;
  }



  @Override
  public List<Film> getAllFilms() {
    return filmDao.getAllFilms();
  }

  @Override
  public Film getAllFilmById(Long id) {
    return filmDao.getFilmById(id);
  }

  @Override
  public void createFilm(Film film) {
    filmDao.createFilm(film);

  }

  @Override
  public void updateFilm(Film film) {
    filmDao.updateFilm(film);

  }

  @Override
  public void deleteFilm(Film film) {
    filmDao.deleteFilm(film);
  }
}
