package me.changani.exchangerate.domain.user;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Long> {
  List<User> findByLastName(String lastName);
  User findById(long id);
}