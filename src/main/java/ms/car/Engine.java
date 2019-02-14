package ms.car;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Maciej Solinski <a href="mailto:maciej.solinski@ts.fujitsu.com">maciej.solinski@ts.fujitsu.com</a>
 */
@Component
public class Engine {

    private static final Logger LOGGER = LoggerFactory.getLogger(Engine.class);

    public void init() {
        LOGGER.info("Engine initialized");
    }

}
