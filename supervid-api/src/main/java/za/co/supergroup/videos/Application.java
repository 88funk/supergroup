package za.co.supergroup.videos;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import za.co.supergroup.video.configuration.SwaggerConfiguration;
import za.co.supergroup.videos.entity.Movies;
import za.co.supergroup.videos.entity.Users;

@SpringBootApplication
@Import(SwaggerConfiguration.class)
@EnableAutoConfiguration
@EntityScan(basePackageClasses = {Movies.class, Users.class})
public class Application extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}
