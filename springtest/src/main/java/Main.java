/**
 * Created by Дмитрий on 15.06.2017.
 */
import com.google.gson.Gson;
import org.springframework.context.ApplicationContext;
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

        UserService userService=context.getBean(UserService.class);
        System.out.println(userService);


       UserService userService1= context.getBean(UserService.class);
        userService1.doMagic();

        context.close();

    }
}
