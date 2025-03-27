package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.Login;

@Service
public class LoginService {
@Autowired  //---- any object creation we should have the autowired annotation
private Login repo;
public Login login(String username, String password)
{
    Login user1=repo.findByUsernameAndPassword(username, password);
    return user1;
}
}
