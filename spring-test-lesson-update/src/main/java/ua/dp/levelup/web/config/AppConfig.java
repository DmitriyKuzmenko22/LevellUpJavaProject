package ua.dp.levelup.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by java on 04.07.2017.
 */
@Configuration //класс с джава конфигом (конфигурационній класс) сюда бежит наша настройка бнов
@ImportResource("WEB-INF/application-context.xml") // увидеть єто и побежить читать єтот контекст
public class AppConfig {

}
