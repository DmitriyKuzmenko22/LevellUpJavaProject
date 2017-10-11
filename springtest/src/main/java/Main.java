/**
 * Created by Дмитрий on 15.06.2017.
 */
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import dao.User;
import dao.cinema.MovieSession;
import dao.impl.cinema.CinemaServiceDaoImpl;
import dao.impl.cinema.MovieSessionDaoImpl;
import dao.service.impl.UserServiceImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.*;

/**
 * Created by java on 13.06.2017.
 */
public class Main {


    public static void main(String[] args) throws JSONException {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");*/
        // Greeting greetingBean = context.getBean(Greeting.class);
        // greetingBean.sayHello();

     /*   Car car=(Car) context.getBean("CarAMG");
        car.whatModel();

        Car carsAmgTwo=(Car) context.getBean("carsAmgTwo");
        carsAmgTwo.whatModel();

        Gson gson=new Gson();
        String s = gson.toJson(carsAmgTwo);

        System.out.println(s);
        System.out.println();*/

        /*PC pc = context.getBean(PC.class);
        pc.whatPC();*/

        Gson gson = new Gson();

/*
        String s = gson.toJson(pc);
*/

        /*System.out.println(s);*/

        System.out.println("____________________________");
        /*Message message= (Message) context.getBean("printMessage");
        message.setMessage("This is first object");
        System.out.println(message.getMessage());

        Message oneMoreMessage= (Message) context.getBean("printMessage");
        System.out.println(oneMoreMessage.getMessage());*/

       /* Message bean1 = (Message) context.getBean("singleton-message");
        Message bean2 = (Message) context.getBean("singleton-message");
        Message bean3 = (Message) context.getBean("singleton-message");

        Message bean4 = (Message) context.getBean("prototype-message");
        Message bean5 = (Message) context.getBean("prototype-message");
        Message bean6 = (Message) context.getBean("prototype-message");

        System.out.print(bean1 + ": ");
        bean1.print();*/


      /*  System.out.print(bean2 + ": ");
        bean2.print();// f

        System.out.print(bean3 + ": ");
        bean3.print();

        System.out.print(bean4 + ": ");
        bean4.print();

        System.out.print(bean5 + ": ");
        bean5.print();

        System.out.print(bean6 + ": ");
        bean6.print();*/

        System.out.println("______________________________");

 /*       MovieSessionDaoImpl movies=context.getBean(MovieSessionDaoImpl.class);
        movies.soutMovies();*/
/*
        CinemaServiceDaoImpl cinemaServiceDao = context.getBean(CinemaServiceDaoImpl.class);
*/
     /*   MovieSession movieSession = cinemaServiceDao.getMovieSession(1L);
        String ps = gson.toJson(movieSession);
        System.out.println(ps);*/
        //System.out.println(cinemaServiceDao);



    /*    UserServeciImpl userServeciImpl =context.getBean(UserServeciImpl.class);
        System.out.println(userServeciImpl);


       UserServeciImpl userServeciImpl1 = context.getBean(UserServeciImpl.class);
        userServeciImpl1.doMagic();*/

       /* UserServiceImpl userService = context.getBean(UserServiceImpl.class);
        userService.doMagic();
        System.out.println("UserServiceImpl 777 = " + userService);
*/
        String ii="{\"name\" : \"abc\" ,\"email\" : {\"tip\" :\"abc@gmail.com\", \"kiss\": \"def@gmail.com\"}}";

        Map<String, Object> retMap = new Gson().fromJson(
                ii, new TypeToken<HashMap<String, Object>>() {}.getType()
        );
        System.out.println(retMap.get("email"));

        System.out.println("**********************************");

        JsonElement root = new JsonParser().parse(ii);
        String value1 = root.getAsJsonObject().get("email").getAsJsonObject().get("tip").getAsString();


        System.out.println(value1);

        System.out.println("**********************************");

        try {
            HashMap<String,Object> result =
                    new ObjectMapper().readValue(ii, HashMap.class);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("***********Jackson");
        ObjectMapper mapper = new ObjectMapper();

        try {
            String jsonInString = "{\"atp.age\":33,\"messages\":[\"msg 1\",\"msg 2\"],\"name\":\"mkyong\"}";
            String jsonInString1 = "{\"zalypa\":{\"atp.age\":33,\"messages\":[\"msg 1\",\"msg 2\"],\"name\":\"mkyong\",\"lastName\":\"Ivanov\",\"firstName\":\"Petya\"}}";
            String jsonInString2 = "{\"atp.age\":33,\"messages\":[\"msg 1\",\"msg 2\"],\"lastName\":\"Ivanov\"}";
            User user1 = mapper.readValue(jsonInString1, User.class);
            JsonNode jsonNode=mapper.readTree(jsonInString1);
            System.out.println(jsonNode.get("zalypa"));
            User user = mapper.readValue(String.valueOf(jsonNode.get("zalypa")),User.class);
            System.out.println("***********zap****");
            System.out.println(user);
            System.out.println(user.getName());
            System.out.println("***********zap****");
            System.out.println(user1);
            System.out.println(user1.getAge());
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }




        /*context.close();*/

    }



