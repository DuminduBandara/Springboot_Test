package com.example.springtest.controllers;

import com.example.springtest.dto.UserDTO;
import com.example.springtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getRequest(){
        return "Hello world";
    }

    @PostMapping("/saveUser")
    public UserDTO saveRequest(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public String updateRequest(){
        return "Data Updated";
    }

    @DeleteMapping("/deleteUser")
    public String deleteRequest(){
        return "Data Deleted";
    }
}
