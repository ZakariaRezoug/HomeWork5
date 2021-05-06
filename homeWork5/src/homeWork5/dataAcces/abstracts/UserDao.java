package homeWork5.dataAcces.abstracts;

import java.util.ArrayList;

import homeWork5.entities.concretes.User;

public interface UserDao {
	void add(User user);
	
	void add(User[] user);
	

}
