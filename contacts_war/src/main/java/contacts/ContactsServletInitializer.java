package contacts;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

public class ContactsServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(
    	    SpringApplicationBuilder application) {
        application.sources(Application.class);
        return application;
    }

}