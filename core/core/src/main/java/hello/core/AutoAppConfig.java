package hello.core;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.*;
import static org.springframework.context.annotation.FilterType.*;

@Configuration
@ComponentScan(
        excludeFilters = @Filter(type = ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
}
