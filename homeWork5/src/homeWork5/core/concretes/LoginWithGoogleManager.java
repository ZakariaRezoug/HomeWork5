package homeWork5.core.concretes;

import homeWork5.core.abstracts.LoginWithGoogleService;

public class LoginWithGoogleManager implements LoginWithGoogleService{

	@Override
	public void login(String email, String pasword) {
		System.out.println("Ba�ar�yla google ile giri� yapt�n�z.");
		
	}

}
