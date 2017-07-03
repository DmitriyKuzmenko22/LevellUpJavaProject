package ua.dp.levelup.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.dp.levelup.core.model.Film;
import ua.dp.levelup.dao.FilmDao;

import java.util.List;

/**
 * @author Alexandr Shegeda on 23.06.17.
 */
@Transactional
@Repository
public class FilmDaoImpl implements FilmDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public List<Film> getAllFilms() {
        return hibernateTemplate.loadAll(Film.class);
    }

    @Override
    public Film getFilmById(Long id) {
        return hibernateTemplate.get(Film.class,id);
    }

    @Override
    public void createFilm(Film film) {
        hibernateTemplate.save(film);
    }

    @Override
    public void deleteFilm(Film film) {
        hibernateTemplate.delete(Film.class);
    }

    @Override
    public void updateFilm(Film film) {
        hibernateTemplate.update(Film.class);
    }
}
