package com.masai.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Dao.UserRepository;
import com.masai.Entities.Users;
import com.masai.Exceptions.ResourcesNotFoundException;


@Service
public class UserServicesImple implements UserServices {

    @Autowired
    private UserRepository userRepository;
    @Override
    public Users registerUser(Users user) {
    	String reandomUserId = UUID.randomUUID().toString();
    	user.setUserId(reandomUserId);
        return userRepository.save(user);
    }

    @Override
    public Users getUserByEmail(String email) throws ResourcesNotFoundException {
        Users user = userRepository.findByEmail(email).orElseThrow(() -> new ResourcesNotFoundException("No user with this user id"));
        return user;
    }

    @Override
    public List<Users> getAllUsers() throws ResourcesNotFoundException {
       List<Users> users = userRepository.findAll();
       if(users.isEmpty()) throw new ResourcesNotFoundException("No data is present");
       return users;
    }
}
