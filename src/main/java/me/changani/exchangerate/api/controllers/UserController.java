package me.changani.exchangerate.api.controllers;

import me.changani.exchangerate.domain.user.IUserRepository;
import me.changani.exchangerate.domain.user.User;
import me.changani.exchangerate.infrastructure.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends BaseController {
  @Autowired
  IUserRepository repository;

  @PostMapping(path = "/users")
  public User createUser(@RequestBody User user) {
    return repository.save(user);
  }
}
