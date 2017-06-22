package dao.cinemaDao;

import dao.cinema.MovieSession;

import java.util.List;

/**
 * Created by Дмитрий on 22.06.2017.
 */
public interface MovieSessionDao {
    List<MovieSession> getAllMovieSession();

    MovieSession getMovieSession(Long id);

    void createMovieSession(MovieSession movieSession);

    void deleteMovieSession(MovieSession movieSession);

    void updateMovieSession(MovieSession movieSession);
}
