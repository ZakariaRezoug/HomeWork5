package homeWork5.core.concretes;

import homeWork5.Google.GoogleRegister;
import homeWork5.core.abstracts.GoogleRegisterService;

public class RegisterAdapter implements GoogleRegisterService {

	@Override
	public void registerToSystem(String message) {
		 GoogleRegister googleRegister = new GoogleRegister();
		 googleRegister.register("Sisteme google ile kayýt olundu.");
		
	}

}
