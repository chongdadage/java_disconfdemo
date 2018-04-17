import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("classpath:disconf.xml");
        SimpleConfig  redis = (SimpleConfig )factory.getBean("simpleConfig");
        System.out.println(redis.getHost() + "\t================>\t" + redis.getPort());
    }

}
