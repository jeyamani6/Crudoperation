package com.example.project.controller;

import com.example.project.Common.ApiResponse;
import com.example.project.Common.GlobalExceptionHandling;
import com.example.project.model.User;
import com.example.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    ApiResponse obj=new ApiResponse();


    @GetMapping("/user")
    public List<User> allUsers(){
        return userService.gettingAllUsers();
    }

    @GetMapping("user/{id}")
    public User getId(@PathVariable("id") int id) throws GlobalExceptionHandling {

      return userService.gettingUserById(id);
    }

/*
@RequestMapping("/book")
public List<User> getByValue(@RequestParam(value="userName") String name){
        return userService.getByValue(name);
}
*/


    @PostMapping("/user")

    public void addUser(@RequestBody User user){
       userService.addingUser(user);
    }




    @PutMapping("user/{id}")
    public void updateUser(@RequestBody User user,@PathVariable("id") int id){
         userService.updatingUser(user,id);
    }

    @DeleteMapping("user/{id}")
    public void deleteUser(@PathVariable("id") int id){
       userService.deletingUser(id);
    }
    /*@GetMapping("/caught")
    public ApiResponse getcaught(@RequestParam(value="mani") Integer yop){
        return userService.getcaughtException(yop);
    }*/
}
