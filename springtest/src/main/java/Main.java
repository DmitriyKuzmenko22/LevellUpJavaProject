/**
 * Created by Дмитрий on 15.06.2017.
 */
import com.google.gson.Gson;
import dao.cinema.MovieSession;
import dao.impl.cinema.CinemaServiceDaoImpl;
import dao.impl.cinema.MovieSessionDaoImpl;
import dao.service.impl.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by java on 13.06.2017.
 */
public class Main {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
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

        PC pc=context.getBean(PC.class);
        pc.whatPC();

        Gson gson=new Gson();

        String s=gson.toJson(pc);

        System.out.println(s);

        System.out.println("____________________________");
        /*Message message= (Message) context.getBean("printMessage");
        message.setMessage("This is first object");
        System.out.println(message.getMessage());

        Message oneMoreMessage= (Message) context.getBean("printMessage");
        System.out.println(oneMoreMessage.getMessage());*/

        Message bean1= (Message) context.getBean("singleton-message");
        Message bean2= (Message) context.getBean("singleton-message");
        Message bean3= (Message) context.getBean("singleton-message");

        Message bean4= (Message) context.getBean("prototype-message");
        Message bean5= (Message) context.getBean("prototype-message");
        Message bean6= (Message) context.getBean("prototype-message");

        System.out.print(bean1 +": ");
        bean1.print();


        System.out.print(bean2+": ");
        bean2.print();// f

        System.out.print(bean3+": ");
        bean3.print();

        System.out.print(bean4+": ");
        bean4.print();

        System.out.print(bean5+": ");
        bean5.print();

        System.out.print(bean6+": ");
        bean6.print();

        System.out.println("______________________________");

 /*       MovieSessionDaoImpl movies=context.getBean(MovieSessionDaoImpl.class);
        movies.soutMovies();*/
        CinemaServiceDaoImpl cinemaServiceDao = context.getBean(CinemaServiceDaoImpl.class);
        MovieSession movieSession=cinemaServiceDao.getMovieSession(1L);
        String ps=gson.toJson(movieSession);
        System.out.println(ps);
        //System.out.println(cinemaServiceDao);



    /*    UserServeciImpl userServeciImpl =context.getBean(UserServeciImpl.class);
        System.out.println(userServeciImpl);


       UserServeciImpl userServeciImpl1 = context.getBean(UserServeciImpl.class);
        userServeciImpl1.doMagic();*/

        UserServiceImpl userService=context.getBean(UserServiceImpl.class);
        userService.doMagic();
        System.out.println("UserServiceImpl 777 = " + userService);

        context.close();

    }
}
