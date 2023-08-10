package com.masai.Services;

import com.masai.Entities.Users;
import com.masai.Exceptions.ResourcesNotFoundException;

import java.util.List;

public interface UserServices {

    public Users registerUser(Users user);

    public Users getUserByEmail(String userId) throws ResourcesNotFoundException;
    public List<Users> getAllUsers() throws ResourcesNotFoundException;

}
