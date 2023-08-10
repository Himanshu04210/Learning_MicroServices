package com.masai.Services;

import com.masai.Dao.UserRepository;
import com.masai.Entities.Users;
import com.masai.Exceptions.ResourcesNotFoundException;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServicesImple implements UserServices {

    @Autowired
    private UserRepository userRepository;
    @Override
    public Users registerUser(Users user) {

        return userRepository.save(user);
    }

    @Override
    public Users getUserById(Integer userId) throws ResourcesNotFoundException {
        Users user = userRepository.findById(userId).orElseThrow(() -> new ResourcesNotFoundException("No user with this user id"));
        return user;
    }

    @Override
    public List<Users> getAllUsers() {
        return null;
    }
}
