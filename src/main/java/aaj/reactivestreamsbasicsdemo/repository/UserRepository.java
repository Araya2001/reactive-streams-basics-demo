package aaj.reactivestreamsbasicsdemo.repository;

import aaj.reactivestreamsbasicsdemo.document.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
}
