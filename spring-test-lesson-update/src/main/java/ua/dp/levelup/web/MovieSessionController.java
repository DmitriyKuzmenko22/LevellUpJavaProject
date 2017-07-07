package ua.dp.levelup.web;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ua.dp.levelup.core.model.Film;
import ua.dp.levelup.core.model.MovieSession;
import ua.dp.levelup.dao.impl.MovieSessionDaoImpl;
import ua.dp.levelup.service.MovieSessionService;

import java.util.Date;
import java.util.List;

/**
 * Created by java on 04.07.2017.
 */
@Controller
@RequestMapping("/movie")
public class MovieSessionController {

    @Autowired
    private  MovieSessionService movieSessionService;

    @RequestMapping("/")
    @ResponseBody
    public Film film() {
        return new Film("Bla", "Bla-bla", 24D);
    }


    @RequestMapping("/welcome")
    public ModelAndView welcome() {
        return new ModelAndView("welcome");
    }

    @RequestMapping("/list")
    public ModelAndView getAllMovieSessions() {

        List<MovieSession> allMovieSessions = movieSessionService.getAllMovieSessions();
        ModelAndView modelAndView=new ModelAndView("movie-session-page"); //создаем обьект на основе муви сессион пєйдж
        //ModelAndView  обьект которіе передает страницу с данніми

        modelAndView.addObject("allMovieSessions",allMovieSessions);
        return modelAndView;
    }


}
