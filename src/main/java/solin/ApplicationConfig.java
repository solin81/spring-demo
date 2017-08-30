package solin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author Maciej Solinski <a href="mailto:maciej.solinski@ts.fujitsu.com">maciej.solinski@ts.fujitsu.com</a>
 */
@Configuration
@PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = false)
class ApplicationConfig {

    @Autowired
    Environment environment;

}
