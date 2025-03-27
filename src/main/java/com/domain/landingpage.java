package com.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class landingpage {
  @Id
  private String username;
  private String password;
public landingpage() {
}
public landingpage(String username, String password) {
    this.username = username;
    this.password = password;
}

public String getUsername() {
    return username;
}
public String getPassword() {
    return password;
}
public void setUsername(String username) {
    this.username = username;
}
public void setPassword(String password) {
    this.password = password;
}



  
}
