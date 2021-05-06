package homeWork5.business.abstracts;

import java.util.List;

import homeWork5.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(String email, String pasword);
	List<User> getAll();
}
