package com.masai.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entities.Users;
import com.masai.Exceptions.ResourcesNotFoundException;
import com.masai.Services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserServices userServices;
	
	@PostMapping
	public ResponseEntity<?> registerUser(@RequestBody Users user) {
		Users registeredUser = userServices.registerUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(registeredUser);
		
	}
	
	@GetMapping("/{email}")
	public ResponseEntity<?> getUserByUserEmail(@PathVariable String email) throws ResourcesNotFoundException {
		Users savedUser = userServices.getUserByEmail(email);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
		
	}
	
	@GetMapping
	public ResponseEntity<?> getAllUser() throws ResourcesNotFoundException {
		List<Users> users = userServices.getAllUsers();
		return ResponseEntity.status(HttpStatus.CREATED).body(users);
		
	}
}	
