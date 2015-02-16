package hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Application {
	
	public static void main(String[] args) throws OutOfRangeException {
        SpringApplication.run(Application.class, args);
    }
	
}

