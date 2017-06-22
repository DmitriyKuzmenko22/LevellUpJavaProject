package dao.impl.cinema;

import com.google.gson.Gson;
import dao.cinema.MovieSession;
import dao.cinemaDao.MovieSessionDao;

import java.util.*;

/**
 * Created by Дмитрий on 22.06.2017.
 */
public class MovieSessionDaoImpl implements MovieSessionDao {

    private Map<Long,MovieSession> movieSessionMap = new HashMap<>();

    public void init(){
        List<MovieSession> movieSessionDaoList= Arrays.asList(new MovieSession(0L,new Date(),9,150,350),
                new MovieSession(1L, new Date(),10,80,160),
                new MovieSession(2L,new Date(),11,700,1900));
        Random random=new Random();

        for (MovieSession m :
                movieSessionDaoList) {
            createMovieSession(m);
        }
    }

    @Override
    public List<MovieSession> getAllMovieSession() {
        return (List<MovieSession>) movieSessionMap.values();
    }

    @Override
    public MovieSession getMovieSession(Long id) {
        return movieSessionMap.get(id);
    }

    @Override
    public void createMovieSession(MovieSession movieSession) {
        movieSessionMap.put(movieSession.getIdMovieSession(),movieSession);

    }

    @Override
    public void deleteMovieSession(MovieSession movieSession) {
        movieSessionMap.remove(movieSession.getIdMovieSession());

    }

    @Override
    public void updateMovieSession(MovieSession movieSession) {
        movieSessionMap.put(movieSession.getIdMovieSession(),movieSession);
    }

    Gson gson=new Gson();

    public  void soutMovies(){
        for (Map.Entry<Long, MovieSession> entry: movieSessionMap.entrySet()) {
            String s = gson.toJson(entry.getKey());
            String p=gson.toJson(entry.getValue());
            System.out.println(s + p);
          //  System.out.println(p);
        }

          /*  System.out.println(entry.getKey() + " = " + entry.getValue());*/


    }
}
