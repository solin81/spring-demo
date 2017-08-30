package solin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author Maciej Solinski <a href="mailto:maciej.solinski@ts.fujitsu.com">maciej.solinski@ts.fujitsu.com</a>
 */
public class Application {

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
        System.out.println("applicationName = " + environment.getProperty("application.version"));
        System.out.println("applicationName = " + environment.getProperty("application.name"));
    }

}
