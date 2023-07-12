package com.example.springtest.controllers;

import com.example.springtest.dto.UserDTO;
import com.example.springtest.entity.User;
import com.example.springtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public List<UserDTO> getRequest(){
        return userService.getAllUsers();
    }

    @PostMapping("/saveUser")
    public UserDTO saveRequest(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public UserDTO updateRequest(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteUser")
    public boolean deleteRequest(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
    }


    @GetMapping("/getUserById/{userId}")
    public UserDTO getUserById(@PathVariable String userId){
        return userService.getUserByUserId(userId);
    }


    @GetMapping("/getUserByIdAndAddress/{userId}/{address}")
    public UserDTO getUserByIdAndAddress(@PathVariable String userId, @PathVariable String address){
        return userService.getUserByUserIdAndAddress(userId,address);
    }



}
