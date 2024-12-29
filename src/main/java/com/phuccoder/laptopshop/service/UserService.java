package com.phuccoder.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.phuccoder.laptopshop.domain.User;
import com.phuccoder.laptopshop.repository.UserRepository;

@Service
public class UserService {
    final private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // thêm user
    public User saveUser(User user) {
        return this.userRepository.save(user);
    }

    // lấy toàn bộ user
    public List<User> getListUser() {
        return this.userRepository.findAll();
    }
}
