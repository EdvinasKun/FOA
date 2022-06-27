package lt.vtmc.FOApp.services;

import java.util.Optional;
import org.springframework.stereotype.Service;
import lt.vtmc.FOApp.models.User;
import lt.vtmc.FOApp.repositories.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepo) {
		this.userRepository = userRepo;
	}
	
	public Optional<User> getUserByEmail(String email) {
		return this.userRepository.findByEmail(email);
	}

}
