package com.kayiranga.restws.repos;

import org.springframework.data.jpa.repository.JpaRepository;


import com.kayiranga.restws.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
