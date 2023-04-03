package com.tienda.dami.TiendaDami.controller;

import com.tienda.dami.TiendaDami.controller.request.UserRequest;
import com.tienda.dami.TiendaDami.model.User;
import com.tienda.dami.TiendaDami.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.PostRemove;

@RestController
@RequestMapping(value = "/api")
public class UserController {

}
