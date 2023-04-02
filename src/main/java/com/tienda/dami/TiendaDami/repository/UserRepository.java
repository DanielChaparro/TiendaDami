package com.tienda.dami.TiendaDami.repository;

import com.tienda.dami.TiendaDami.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
