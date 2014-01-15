package contacts;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.SpringBootServletInitializer;

public class ContactsServletInitializer extends SpringBootServletInitializer {

    @Override
    protected void configure(SpringApplicationBuilder application) {
        application.sources(Application.class);
    }

}