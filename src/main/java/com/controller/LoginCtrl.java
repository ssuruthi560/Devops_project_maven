package com.controller;

import com.mindsphere.mindsphere.MindsphereApplication;
import com.repository.Login;
import com.service.LoginService;

import ch.qos.logback.core.model.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginCtrl {

    private final MindsphereApplication mindsphereApplication;
@Autowired
private LoginService service;

    LoginCtrl(MindsphereApplication mindsphereApplication) {
        this.mindsphereApplication = mindsphereApplication;
    }
@Getmapping("/")
public String showloginpage(){
       return "login";
}
@PostMapping("login")
public String processlogin(@RequestParam String username,@RequestParam String password,Model mod, hhb entity) {
    Login user2=service.login(username,password);
    if(user2!=null){
         return "redirect:/welcome";
    }
    else{
    }
    return entity;
}


}
