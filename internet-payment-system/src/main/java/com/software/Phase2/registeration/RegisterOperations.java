package com.software.Phase2.registeration;
import java.util.ArrayList;
import java.util.List;

import com.software.Phase2.Database.DataBaseAdmin;
import com.software.Phase2.Database.DataBaseUser;
import org.springframework.stereotype.Component;
@Component
public class RegisterOperations {
	

	public String signIn(String email,String password)
	{
		for(User account: DataBaseUser.getUser())
		{
			if(account.getEmail().equals(email)&&account.getPassword().equals(password))
			{
				return"Login successfully ";
			}
		}
		return "You should SignUp first!";
		
	}
	public String signUp(User user)
	{
		if(!DataBaseUser.checkUser(user))
		{
			DataBaseUser.addUser(user);
			return "register is completed successfully";
		}
		else
			return "this account is already exists";
	}
	public String adminLogin(String email,String password)
	{
		if (DataBaseAdmin.login(email,password)){
			return "Login successfully";
		}
		else
			return "Email or Password is Wrong !";
	}


}
