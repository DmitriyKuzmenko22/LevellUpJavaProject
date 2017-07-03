package dao.impl.cinema;

import dao.User;
import dao.cinema.Film;
import dao.cinemaDao.FilmDao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Дмитрий on 22.06.2017.
 */
public class FilmDaoImpl implements FilmDao {

    private Map<Long,Film> filmMapById =new HashMap<>();
    private Map<String,Long> filmIdMapByName = new HashMap<>();

    public void init(){
        List<Film> films= Arrays.asList(new Film(0,"CarsMovie","history of cars"),
                new Film(1,"MagicWomen","history of magic women"),
                new Film(2,"Transformers","history of people and robots "));

        for (Film m :
                films) {
            createFilm(m);

            System.out.println("Init method happened");
        }
    }


    @Override
    public List<Film> getAllFilms() {
        return (List<Film>) filmMapById.values();
    }

    @Override
    public Film getFilmById(Long id) {

        return filmMapById.get(id);
    }

    @Override
    public Film getFilmByName(String film) {
        Long filmId=filmIdMapByName.get(film);
        return filmMapById.get(filmId);
    }

    @Override
    public void createFilm(Film film) {
        filmMapById.put(film.getIdFilms(),film);
        filmIdMapByName.put(film.getFilmNames(),film.getIdFilms());
    }

    @Override
    public void deleteFilm(Film film) {
        filmMapById.remove(film.getIdFilms());
        filmIdMapByName.remove(film.getFilmNames());
    }

    @Override
    public void updateFilm(Film film) {
        filmMapById.put(film.getIdFilms(),film);
        filmIdMapByName.put(film.getFilmNames(),film.getIdFilms());
    }
}
