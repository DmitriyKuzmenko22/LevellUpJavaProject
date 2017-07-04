package ua.dp.levelup.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by java on 04.07.2017.
 */
@Controller //когда спринг будет создавать бині и увидеть єту анотацию , он должен зарегистрировать єтот класс в нашем диспечере

public class MovieSessionController {


    @RequestMapping("/movies")
    public ModelAndView getAllMovieSessions(){
        return new ModelAndView("movie-session-page");
    }
}
