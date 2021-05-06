package homeWork5.dataAcces.concretes;



import homeWork5.dataAcces.abstracts.UserDao;
import homeWork5.entities.concretes.User;

public class AbcUserDao implements UserDao{
	

	@Override
	public void add(User user) {
		
		System.out.println(user.getFirstName() +" Abc ile eklendi.");
		
	}

	@Override
	public void add(User[] user) {
		// TODO Auto-generated method stub
		
	}

	
}
