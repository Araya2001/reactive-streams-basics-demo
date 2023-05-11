package aaj.reactivestreamsbasicsdemo.service;

import aaj.reactivestreamsbasicsdemo.document.User;
import aaj.reactivestreamsbasicsdemo.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserDocumentServiceImpl implements UserDocumentService {
  private final UserRepository userRepository;

  public UserDocumentServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public Mono<Void> delete(Flux<User> userFlux) {
    return userRepository.deleteAll(userFlux);
  }

  @Override
  public Mono<User> findFirstById(String id) {
    return userRepository.findById(id);
  }

  @Override
  public Flux<User> findAll() {
    return userRepository.findAll();
  }

  @Override
  public Flux<User> insert(Flux<User> userFlux) {
    return userRepository.insert(userFlux);
  }

  @Override
  public Flux<User> update(Flux<User> userFlux) {
    return userRepository.saveAll(userFlux);
  }
}
