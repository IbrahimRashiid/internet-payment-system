package com.software.Phase2.registeration;


import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RegisterationController {
    private RegisterOperations registerOperations =new RegisterOperations();
 
 @PostMapping(value="/signup")
 public String signup(@RequestBody User user){
     return registerOperations.signUp(user);
 }
 @GetMapping(value ="/signin")
 public String getPerson(@PathParam("email") String  email ,@PathParam("password") String  password){
     return registerOperations.signIn(email,password) ;
 }
    @GetMapping(value ="/adminLogin")
    public String adminLogin(@PathParam("email") String  email ,@PathParam("password") String  password){
        return registerOperations.adminLogin(email,password) ;
    }
	
}
