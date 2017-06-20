/**
 * Created by Дмитрий on 15.06.2017.
 */
import com.google.gson.Gson;
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

        Message bean1= (Message) context.getBean("printMessage");
        Message bean2= (Message) context.getBean("printMessage");
        Message bean3= (Message) context.getBean("printMessage");

        Message bean4= (Message) context.getBean("printMessageProt");
        Message bean5= (Message) context.getBean("printMessageProt");
        Message bean6= (Message) context.getBean("printMessageProt");

        System.out.println(bean1+": ");
        bean1.print();


        System.out.println(bean2+": ");
        bean2.print();

        System.out.println(bean3+": ");
        bean3.print();

        System.out.println(bean4+": ");
        bean4.print();

        System.out.println(bean5+": ");
        bean5.print();

        System.out.println(bean6+": ");
        bean6.print();

        System.out.println("______________________________");

    /*    UserServeciImpl userServeciImpl =context.getBean(UserServeciImpl.class);
        System.out.println(userServeciImpl);


       UserServeciImpl userServeciImpl1 = context.getBean(UserServeciImpl.class);
        userServeciImpl1.doMagic();*/

        context.close();

    }
}
