import com.study.dubbo.userapi.entity.User;
import com.study.dubbo.userapi.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/3/30.
 */
public class consumerMain {
    public static void main(String[] args) {
        //Prevent to get IPV6 address,this way only work in debug mode
        //But you can pass use -Djava.net.preferIPv4Stack=true,then it work well whether in debug mode or not
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("classpath:spring.xml");
        cpx.start();

        UserService userService = (UserService) cpx.getBean("userService");
        //Integer integer = new Integer(1);
        User userById = userService.getUserById(1);
        System.out.println(userById);
    }
}
