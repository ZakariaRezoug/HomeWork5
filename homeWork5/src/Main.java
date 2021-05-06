import homeWork5.business.concretes.UserManager;
import homeWork5.dataAcces.concretes.AbcUserDao;
import homeWork5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User( "Zakaria", "Rezoug", "abc@gmail.com", "123456");
		UserManager manager = new UserManager(new AbcUserDao());
		
		User user2 = new User("Ahmet","Mehmet","abd@gmail.com","12345675");
		System.out.println(user1.getId());
		System.out.println(user2.getId());
		
		manager.register(user1);
		manager.register(user2);
		manager.login("abd@gmail.com","12345675");
		
		
	}

}
