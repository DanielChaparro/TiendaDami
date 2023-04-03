package com.tienda.dami.TiendaDami.service.impl;

import com.tienda.dami.TiendaDami.exception.UserException;
import com.tienda.dami.TiendaDami.model.User;
import com.tienda.dami.TiendaDami.repository.UserRepository;
import com.tienda.dami.TiendaDami.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {

    }



}
