package com.example.springtest.service;

import com.example.springtest.dto.UserDTO;
import com.example.springtest.entity.User;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springtest.repo.UserRepo;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;
    public UserDTO saveUser(UserDTO userDTO){

        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }
}
