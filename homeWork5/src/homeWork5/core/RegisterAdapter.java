package homeWork5.core;

import homeWork5.Google.GoogleRegister;

public class RegisterAdapter implements GoogleRegisterService {

	@Override
	public void registerToSystem(String message) {
		 GoogleRegister googleRegister = new GoogleRegister();
		 googleRegister.register("Sisteme google ile kayýt olundu.");
		
	}

}
