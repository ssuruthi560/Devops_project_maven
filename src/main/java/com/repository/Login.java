package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Login extends JpaRepository<Login,String> {
Login findByUsernameAndPassword(String username, String passwordString );
}
