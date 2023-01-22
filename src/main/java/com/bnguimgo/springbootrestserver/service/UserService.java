package com.bnguimgo.springbootrestserver.service;

import com.bnguimgo.springbootrestserver.exceptions.BusinessResourceException;
import com.bnguimgo.springbootrestserver.model.User;

import java.util.Collection;
import java.util.Optional;

public interface UserService {

    Collection<User> getAllUsers();

    Optional<User> getUserById(Long id) throws BusinessResourceException;

    Optional<User> findByLogin(String login) throws BusinessResourceException;

    User saveOrUpdateUser(User user) throws BusinessResourceException;

    void deleteUser(Long id) throws BusinessResourceException;

    Optional<User> findByLoginAndPassword(String login, String password) throws BusinessResourceException;

}
