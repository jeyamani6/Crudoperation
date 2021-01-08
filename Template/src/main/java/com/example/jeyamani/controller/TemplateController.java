package com.example.jeyamani.controller;

import com.example.jeyamani.ModelUser.UserTemplate;
import com.example.jeyamani.Service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TemplateController {

    @Autowired
    TemplateService service;

    
    /**
     * This method calls createUser method and adds the objects in the List.
     * @param template : User object
     */
    @PostMapping("/user")
    public void createUser(@RequestBody UserTemplate template)
    {
       service.createUser(template);
    }


    /**
     * This method calls retrieveUserById method and returns UserTemplate object..
     * @param id : users id
     * @return : UserTemplate(which contanis  userId,userName,emailId,totalBalance)
     *
     */
    @GetMapping("user/{id}")
    public UserTemplate retrieveUserById(@PathVariable("id") int id)
    {
        return service.retreiveUserById(id);
    }


    /**
     * This method calls retreiveAllUsers method and return List of UserTemplate objects.
     * @return : List of UserTemplate objects.
     */
    @GetMapping("/user")
    public List<UserTemplate> retrieveAllUsers()
    {

return service.retreiveAllUsers();
    }



}
