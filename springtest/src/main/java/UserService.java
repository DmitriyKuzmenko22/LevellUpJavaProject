import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by java on 16.06.2017.
 */
public class UserService implements InitializingBean, DisposableBean {

    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void destroy() throws Exception {
        System.out.println("Spring Container is destroy! Customer clean up");
    }

    public void afterPropertiesSet() throws Exception {
        doMagic();
        System.out.println("Init method after properties are set : " + message);
    }

    @Profiling
    public void doMagic(){
        System.out.println("UserService does magic");
    }


}
//bean factory
//@postcontract
//proxy object - копия нашего обьекта но с какой-то доп.функциональностью либо мы сами назначаем ему функциональность
//singleton