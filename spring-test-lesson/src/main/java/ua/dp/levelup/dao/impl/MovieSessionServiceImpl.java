package ua.dp.levelup.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dp.levelup.core.model.MovieSession;
import ua.dp.levelup.dao.MovieSessionDao;
import ua.dp.levelup.service.MovieSessionService;

/**
 * Created by java on 27.06.2017.
 */
@Service
public class MovieSessionServiceImpl implements MovieSessionService {

    private MovieSessionDao movieSessionDao;

    @Autowired
    public void setMovieSessionDao(final MovieSessionDao movieSessionDao) {
        this.movieSessionDao = movieSessionDao;
    }

    @Override
    public void createMovieSession(MovieSession movieSession) {
        movieSessionDao.createMovieSession(movieSession);
    }
}
