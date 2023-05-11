package aaj.reactivestreamsbasicsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:development.properties")
public class ReactiveStreamsBasicsDemoApplication {
  public static void main(String[] args) {
    SpringApplication.run(ReactiveStreamsBasicsDemoApplication.class, args);
  }
}
