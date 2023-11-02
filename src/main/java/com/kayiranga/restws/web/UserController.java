package com.kayiranga.restws.web;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kayiranga.restws.model.User;
import com.kayiranga.restws.repos.UserRepository;

@Controller
@RestController
@RequestMapping("/authentication")
public class UserController {
	
	@Autowired
	UserRepository repository;
	
	@GetMapping("/all")
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@GetMapping("/users/{id}")
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return  repository.findById(id).get();
	}

	 @PostMapping("/create")
	public User createUser(@RequestBody User user) {
		
		return repository.save(user);
	}

	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	
	
	/*@Autowired
    private UserRepository userRepo;
     
    @GetMapping("")
    public String viewHomePage() {
    	System.out.println("Hello");
        return "index";
    }
    
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {

    	user.setUsername("mutsindashyaka");
    	user.setPassword("philemon");
    	user.setPassword("mumu");
    	System.out.println("getUsername--->"+user.getUsername());
        System.out.println("getPassword--->"+user.getPassword());
    	userRepo.save(user);
        return ResponseEntity.ok("User registered successfully");
    }
    
    @GetMapping("/login")
    public ResponseEntity<?> login(User user) {

    	String username = "aimable1";
    	String password = "kayiranga";
        List<User> users = userRepo.findAll();
        System.out.println("getUsername--->"+users.get(0).getUsername());
        System.out.println("getPassword--->"+users.get(0).getPassword());
        ResponseEntity<String>  response = null;
        for (User user2 : users) {
			if(user2.getUsername().equals(username) && user2.getPassword().equals(password) ) {
				response = ResponseEntity.ok("Login successful");
			}else {
				response = ResponseEntity.ok("Login failed");
			}
			
        }
        return response;
    }
    
    @PostMapping("/process_register")
    public String processRegister(User user) {
    	user.setUsername("kayiranga");
        user.setPassword("aimable");
        userRepo.save(user);
         
        return "register_success";
    }*/
    

}
