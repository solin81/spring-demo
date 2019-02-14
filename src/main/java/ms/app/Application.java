package ms.app;

import ms.car.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;


/**
 * @author Maciej Solinski <a href="mailto:maciej.solinski@ts.fujitsu.com">maciej.solinski@ts.fujitsu.com</a>
 */
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    private ApplicationContext context;

    public Application() {
        context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }

    private void run() {
        Environment environment = context.getBean(Environment.class);
        LOGGER.info("applicationName = " + environment.getProperty("application.version"));
        LOGGER.info("applicationName = " + environment.getProperty("application.name"));

        Car car = context.getBean(Car.class);
        car.drive();

    }

}
