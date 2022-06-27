package lt.vtmc.FOApp.controllers;

//import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lt.vtmc.FOApp.models.User;
import lt.vtmc.FOApp.services.UserService;

@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class UserController {

	public final UserService userService;
	
//	@Autowired
//	private UserRepository userRepository;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/{email}")
	public User getUserByEmail(@PathVariable String email){
		return userService.getUserByEmail(email).get();
	}
	
	
}
