package ua.dp.levelup.web.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ua.dp.levelup.core.model.MovieSession;

import java.util.Date;

/**
 * Created by Дмитрий on 06.07.2017.
 */
@Controller
@RequestMapping("/cinema")
public class Cinema {

    @RequestMapping("/today")
    @ResponseBody
    public MovieSession session(){
        return new MovieSession(33L,new Date(),new Date(),22,55.6,88.9);
    }

    @RequestMapping("/calc")
    public ModelAndView getCalcPage() {
        return new ModelAndView("calc");
    }
}
