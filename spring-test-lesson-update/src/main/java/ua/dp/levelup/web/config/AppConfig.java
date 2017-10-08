package ua.dp.levelup.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by java on 04.07.2017.
 */
@EnableScheduling
@Configuration
@ImportResource("WEB-INF/applicationContext.xml")
@ComponentScan(basePackages = "ua.dp.levelup")
public class AppConfig extends WebMvcConfigurerAdapter {

}
