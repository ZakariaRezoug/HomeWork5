import homeWork5.business.concretes.UserManager;
import homeWork5.dataAcces.concretes.AbcUserDao;
import homeWork5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Zakaria", "Rezoug", "abc@gmail.com", "123456");
		User user2 = new User(2,"Mehmet","Yýlmaz","abc@gmail.com","123456");
		UserManager manager = new UserManager(new AbcUserDao());
		manager.register(user1);
		manager.login(user1);
		
	}

}
