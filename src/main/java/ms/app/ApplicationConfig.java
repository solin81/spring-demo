package ms.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Maciej Solinski <a href="mailto:maciej.solinski@ts.fujitsu.com">maciej.solinski@ts.fujitsu.com</a>
 */
@Configuration
@PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = false)
@ComponentScan("ms")
class ApplicationConfig {

}
