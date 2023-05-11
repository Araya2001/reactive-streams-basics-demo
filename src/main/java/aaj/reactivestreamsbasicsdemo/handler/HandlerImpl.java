package aaj.reactivestreamsbasicsdemo.handler;

import aaj.reactivestreamsbasicsdemo.document.User;
import aaj.reactivestreamsbasicsdemo.service.UserDocumentService;
import lombok.extern.log4j.Log4j2;
import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@Log4j2
public class HandlerImpl implements Handler {
  private final UserDocumentService userDocumentService;

  @Autowired
  public HandlerImpl(UserDocumentService userDocumentService) {
    this.userDocumentService = userDocumentService;
  }

  @Override
  public Mono<ServerResponse> getUser(ServerRequest request) {
    log.info("GET USER!!!");
    String id = request.queryParam("id").orElse("");
    Publisher<User> userPublisher;
    userPublisher = id.isBlank() || id.isEmpty() ? userDocumentService.findAll() : userDocumentService.findFirstById(id);
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(userPublisher, User.class);
  }

  @Override
  public Mono<ServerResponse> postUser(ServerRequest request) {
    log.info("POST USER!!!");
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
        .body(userDocumentService.insert(request.bodyToFlux(User.class)), User.class);
  }

  @Override
  public Mono<ServerResponse> putUser(ServerRequest request) {
    log.info("PUT USER!!!");
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
        .body(userDocumentService.update(request.bodyToFlux(User.class)), User.class);
  }

  @Override
  public Mono<ServerResponse> deleteUser(ServerRequest request) {
    log.info("DELETE USER!!!");
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
        .body(userDocumentService.delete(request.bodyToFlux(User.class)), Void.class);
  }
}
