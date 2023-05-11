package aaj.reactivestreamsbasicsdemo.handler;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public interface Handler {
  Mono<ServerResponse> getUser(ServerRequest request);

  Mono<ServerResponse> postUser(ServerRequest request);

  Mono<ServerResponse> putUser(ServerRequest request);

  Mono<ServerResponse> deleteUser(ServerRequest request);
}
