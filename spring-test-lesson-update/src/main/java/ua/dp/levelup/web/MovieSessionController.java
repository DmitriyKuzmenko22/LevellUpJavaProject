package ua.dp.levelup.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ua.dp.levelup.core.model.Film;
import ua.dp.levelup.core.model.MovieSession;
import ua.dp.levelup.service.MovieSessionService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created by java on 04.07.2017.
 */
@Controller
@RequestMapping("/movie")
public class MovieSessionController {

    @Autowired
    private MovieSessionService movieSessionService;

    @RequestMapping("/")
    @ResponseBody
    public Film film() {
        return new Film("Bla", "Bla-bla", 24D);
    }

    @RequestMapping(value = "/add-session",method = RequestMethod.GET)
    public ModelAndView getAddMovieSessionPage(){
        return new ModelAndView("add-movie-session");
    }

    @RequestMapping(value = "/add-session", method = RequestMethod.POST)
    public String addMovieSession(
            @RequestParam("filmId") long filmId,
            @RequestParam int hallNumber,
            @RequestParam double standardTicketPrice,
            @RequestParam double comfortTicketPrice
    ){

        movieSessionService.createMovieSession(new MovieSession(filmId,new Date(),new Date(),hallNumber,
                standardTicketPrice,comfortTicketPrice));
        return "redirect:list";
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

    @RequestMapping(value = "/update-session",method = RequestMethod.GET)
    public ModelAndView updateAddMovieSessionPage(){
        return new ModelAndView("update-session");
    }

    @RequestMapping(value = "/update-session", method = RequestMethod.POST)
    public String updateMovieSession(
            @RequestParam String movieSessionId,
            @RequestParam String filmId,
            @RequestParam String sessionStartDate,
            @RequestParam String sessionStartTime,
            @RequestParam String hallNumber,
            @RequestParam String standardTicketPrice,
            @RequestParam String comfortTicketPrice
    ) throws ParseException {
        Date dateStart = new SimpleDateFormat( "yyyy-dd-MM" ).parse(sessionStartDate);
        Date dateSessionStart = new SimpleDateFormat( "HH:mm" ).parse(sessionStartTime);
        MovieSession movieSessionById = movieSessionService.getMovieSessionById(Long.parseLong(movieSessionId));
        movieSessionById.setFilmId(Long.parseLong(filmId));
        movieSessionById.setSessionStartDate(dateStart);
        movieSessionById.setSessionStartTime(dateSessionStart);
        movieSessionById.setHallNumber(Integer.parseInt(hallNumber));
        movieSessionById.setStandardTicketPrice(Double.parseDouble(standardTicketPrice));
        movieSessionById.setComfortTicketPrice(Double.parseDouble(comfortTicketPrice));
        movieSessionService.updateMovieSession(movieSessionById);

        return "redirect:list";
    }

    @RequestMapping(value = "/delete-session",method = RequestMethod.GET)
    public ModelAndView deleteMovieSessionPage(){
        return new ModelAndView("delete-session-page");
    }

    @RequestMapping(value = "/delete-session",method = RequestMethod.POST)
    public String deleteMovieSession(@RequestParam String movieSessionId){
        MovieSession movieSessionById = movieSessionService.getMovieSessionById(Long.parseLong(movieSessionId));
        movieSessionService.deleteMovieSession(movieSessionById);

        return "redirect:list";
    }


}
