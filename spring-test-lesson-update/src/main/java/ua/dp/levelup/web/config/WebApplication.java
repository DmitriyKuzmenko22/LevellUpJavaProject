package ua.dp.levelup.web.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by java on 04.07.2017.
 */
public class WebApplication implements WebApplicationInitializer {
    private WebApplicationContext context;

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //у нас есть апликетион контекс (делаем тоже самое что и в мєйне)
        WebApplicationContext context = getContext();//("WEB-INF/application-context.xml");

        servletContext.addListener(new ContextLoaderListener(context));
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/*");

    }

    public WebApplicationContext getContext() {
        AnnotationConfigWebApplicationContext context=new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("ua.dp.levelup");

        return context;
    }
}
