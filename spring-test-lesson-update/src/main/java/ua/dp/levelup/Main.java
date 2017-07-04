package ua.dp.levelup;

import org.hibernate.Hibernate;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.dp.levelup.core.model.Film;
import ua.dp.levelup.core.model.Order;
import ua.dp.levelup.core.model.Ticket;
import ua.dp.levelup.dao.OrderDao;
import ua.dp.levelup.dao.TicketDao;

import java.text.ParseException;
import java.util.List;

/**
 * @author Alexandr Shegeda on 13.06.2017.
 */
public class Main {


    public static void main(String[] args) throws ParseException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("WEB-INF/application-context.xml");

//        Message bean1 = (Message)context.getBean("singleton-message");
//        Message bean2 = (Message)context.getBean("singleton-message");
//        Message bean3 = (Message)context.getBean("singleton-message");
//
//        Message bean4 = (Message) context.getBean("prototype-message");
//        Message bean5 = (Message) context.getBean("prototype-message");
//        Message bean6 = (Message) context.getBean("prototype-message");
//
//        System.out.print(bean1 + ": ");
//        bean1.print();
//
//        System.out.print(bean2 + ": ");
//        bean2.print();
//
//        System.out.print(bean3 + ": ");
//        bean3.print();
//
//        System.out.print(bean4 + ": ");
//        bean4.print();
//
//        System.out.print(bean5 + ": ");
//        bean5.print();
//
//        System.out.print(bean6 + ": ");
//        bean6.print();
//
//
//        Greeting greetingBean = context.getBean(Greeting.class);
//        greetingBean.sayHello();
//
//        PC bean = context.getBean(PC.class);
//
//        System.out.println(bean);
//        UserService service = context.getBean(UserService.class);
//        System.out.println("Call method doMagic()");
//        service.doMagic();
//
//        User u = new User(24L, "john.snow@got.com", "John", "Snow");
//
//        System.out.println("Call method createUser()");
//        service.createUser(u);
//
//        u.setEmail("jsnow@gmail.com");
//
//        System.out.println("Call method updateUser()");
//        service.updateUser(u);

//        Film film = new Film("Transformers: The Last Knight", "Humans and Transformers are at war, Optimus Prime is gone. The key to saving our future lies buried in the secrets of the past, in the hidden history of ...", 2.29D);
//
//        FilmDao filmDao = context.getBean(FilmDao.class);
//
//        filmDao.createFilm(film);

//        MovieSessionService bean = context.getBean(MovieSessionService.class);
//        bean.createMovieSession(new MovieSession(1L, new Date(), new Date(), 5, 70, 120));

//        MovieSession movieSession = bean.getMovieSessionById(2L);

//        System.out.println(movieSession);
//        System.out.println(movieSession.getClass());

        OrderDao orderDao = context.getBean(OrderDao.class);
        TicketDao ticketDao = context.getBean(TicketDao.class);


        /*Order order = new Order(150D, 20L);
        Ticket ticket = new Ticket(40D, 55L, order);

        order.addTicket(ticket);

        orderDao.createOrder(order, ticket);
        ticketDao.createTicket(new Ticket(2.8,4L,order));*/

        Film film=new Film("fvf","tdbt4",33);

        /*FilmServiceImpl filmService=context.getBean(FilmServiceImpl.class);
        filmService.createFilm(film);*/

       /* MovieSessionServiceImpl movieSessionService=context.getBean(MovieSessionServiceImpl.class);
        movieSessionService.createMovieSession(new MovieSession(77,new Date(),new Date(),23,88.6,99.9));

        MovieSession bean= movieSessionService.getMovieSessionById(64L);
        List<MovieSession> allMovieSessions = movieSessionService.getAllMovieSessions();

        Gson gson=new Gson();
        String s=gson.toJson(allMovieSessions);
        System.out.println(s);
        System.out.println(bean);
        System.out.println(bean.getClass());

        System.out.println("_____________________");*/

        /*OrderServiceImpl orderService=context.getBean(OrderServiceImpl.class);
        Order order = new Order(400, 29L);
        Ticket ticket = new Ticket(25D, 77L, order);
        order.addTicket(ticket);
        orderService.createOrder(order,ticket);*/



        Long orderId = 75L;
        Order order = orderDao.getOrderById(orderId);


        List<Ticket> tickets = order.getTickets();
        Hibernate.initialize(tickets);


        System.out.println(String.valueOf(tickets));
        System.out.println("776 "+ tickets);

        System.out.println("777 "+ order);

       /* Date date = new SimpleDateFormat( "dd.MM.yyyy" ).parse( "28.12.2016" );
        System.out.println(date);

        Calendar instance = Calendar.getInstance();
        instance.set(2017,Calendar.MAY,8,14,6);
        Date date1 = instance.getTime();
        System.out.println(date1);

        SimpleDateFormat dayFormat = new SimpleDateFormat("02.12.2017", Locale.getDefault());
        String myString = dayFormat.format(instance.getTime());
        System.out.println(myString);*/



        context.close();
    }
}
