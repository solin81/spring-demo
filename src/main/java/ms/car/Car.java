package ms.car;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Maciej Solinski <a href="mailto:maciej.solinski@ts.fujitsu.com">maciej.solinski@ts.fujitsu.com</a>
 */
@Component
public class Car {

    private static final Logger LOGGER = LoggerFactory.getLogger(Car.class);

    private Engine engine;

    public Car() {
        LOGGER.info("Trying to initialize engine from Car() constuctor");
        engine.init();
    }

    @Autowired
    public Car(Engine engine) {
        LOGGER.info("Trying to initialize engine from Car(Engine) constuctor");
        this.engine = engine;
        engine.init();
    }

    public void drive() {
        LOGGER.info("Wrrrrrrrrrrrrrrummmmmmmmmmmm");
    }

    @PostConstruct
    private void init() {
        LOGGER.info("Trying to initialize engine from init()");
        engine.init();
    }

}
