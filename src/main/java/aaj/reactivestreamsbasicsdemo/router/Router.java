package aaj.reactivestreamsbasicsdemo.router;

import aaj.reactivestreamsbasicsdemo.handler.Handler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration(proxyBeanMethods = false)
public class Router {
  @Bean
  public RouterFunction<ServerResponse> route(Handler handler) {
    return RouterFunctions
        .route(GET("/reactive-streams-basics-demo/api/v1/user"), handler::getUser)
        .andRoute(POST("/reactive-streams-basics-demo/api/v1/user").and(accept(MediaType.APPLICATION_JSON)), handler::postUser)
        .andRoute(PUT("/reactive-streams-basics-demo/api/v1/user").and(accept(MediaType.APPLICATION_JSON)), handler::putUser)
        .andRoute(DELETE("/reactive-streams-basics-demo/api/v1/user").and(accept(MediaType.APPLICATION_JSON)), handler::deleteUser)
        ;
  }
}
