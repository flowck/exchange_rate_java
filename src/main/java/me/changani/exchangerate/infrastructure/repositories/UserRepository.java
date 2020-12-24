package me.changani.exchangerate.infrastructure.repositories;

import me.changani.exchangerate.domain.user.IUserRepository;
import me.changani.exchangerate.domain.user.User;

import java.util.List;
import java.util.Optional;

public class UserRepository implements IUserRepository {
  @Override
  public List<User> findByLastName(String lastName) { return null; }

  @Override
  public User findById(long id) { return null; }

  @Override
  public <S extends User> S save(S s) { return null; }

  @Override
  public <S extends User> Iterable<S> saveAll(Iterable<S> iterable) { return null; }

  @Override
  public Optional<User> findById(Long aLong) { return Optional.empty(); }

  @Override
  public boolean existsById(Long aLong) { return false; }

  @Override
  public Iterable<User> findAll() { return null; }

  @Override
  public Iterable<User> findAllById(Iterable<Long> iterable) { return null; }

  @Override
  public long count() {  return 0; }

  @Override
  public void deleteById(Long aLong) { }

  @Override
  public void delete(User user) { }

  @Override
  public void deleteAll(Iterable<? extends User> iterable) { }

  @Override
  public void deleteAll() { }
}
