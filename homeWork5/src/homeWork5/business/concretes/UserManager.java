package homeWork5.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import homeWork5.business.abstracts.UserService;
import homeWork5.core.abstracts.LoginWithGoogleService;
import homeWork5.core.concretes.LoginWithGoogleManager;
import homeWork5.dataAcces.abstracts.UserDao;
import homeWork5.dataAcces.concretes.AbcUserDao;
import homeWork5.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userdao;
	private LoginWithGoogleService loginWithGoogle;

	public UserManager(LoginWithGoogleService loginWithGoogle) {
		
		this.loginWithGoogle = loginWithGoogle;
	}

	private List<String>  eMailList = new ArrayList<String>(); 
	private List<String>  paswordList = new ArrayList<String>();
   
	
	public static boolean isEmailValid(String email) {
	    final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(email).matches();
	}
	
	public static boolean isEmailValidOnClick() {
		return true;
	}


	public UserManager(UserDao userdao) {
		super();
		this.userdao = userdao;
	}
	
	@Override
	public void register(User user) {
		if(user.getPasword().length()< 6) {
			System.out.println("Parola en az 6 karakterden olu�mal�d�r.");
			return;
		}
		if((eMailList.contains(user.getEmail()))) {
			System.out.println("Bu email adresi sistemde kay�tl�.L�tfen ba�ka bir email adresi giriniz.");
			return;
		}
		if(isEmailValid(user.getEmail()) != true){
			System.out.println("Ge�ersiz bir email adresi girdiniz.L�tfen ge�erli bir email adresi giriniz.");
			return;
		}
		if(user.getFirstName().length()< 2 && user.getLastName().length()<2) {
			System.out.println("Ad ve Soyad en az 2 karakterden olu�mal�d�r.");
			return;
		}
		else {
			System.out.println(user.getEmail() + " adresinize do�rulama maili g�nderilmi�tir.");
			
			if(isEmailValidOnClick() != true) {
				System.out.println("L�tfen mail adresinizi kontrol ediniz.");
			}
			else {
				System.out.println("Ba�ar�yla sisteme kay�t oldunuz.");
				userdao.add(user);
				eMailList.add(user.getEmail());
				paswordList.add(user.getPasword());
			}
			
		}
		
	}

	@Override
	public void login(String email, String pasword) {
		
		if(eMailList.contains(email)&& paswordList.contains(pasword)) {
			
		System.out.println("Ba�ar�yla giri� yapt�n�z..");
		return;
		
			
		}
		else {
		System.out.println("Email ya da �ifreniz yanl�� l�tfen tekrar deneyiniz.");
		
	}}
    @Override
	public void loginWithGoogle(String email,String pasword) {
    	if(isEmailValid(email) != true) {
    		
    		System.out.println("Ge�ersiz bir email adresi girdiniz.");
    	}else {
    		this.loginWithGoogle.login(email, pasword);
    		
    	}
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
