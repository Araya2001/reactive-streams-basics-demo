package aaj.reactivestreamsbasicsdemo.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface GenericDocumentService<T> {
  Mono<Void> delete(Flux<T> tFlux);

  Mono<T> findFirstById(String id);

  Flux<T> findAll();

  Flux<T> insert(Flux<T> tFlux);

  Flux<T> update(Flux<T> tFlux);
}
