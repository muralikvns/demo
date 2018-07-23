package com.example.validator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.domains.Login;
import com.example.domains.unique;
import com.example.repositories.LoginRepository;

public class Uniquevalidator implements ConstraintValidator<unique, String> {

	
	@Autowired
	private LoginRepository loginRepo;
	
	@Override
	public boolean isValid(String email, ConstraintValidatorContext cxt) {
		
	   // System.out.println(email+"email in the validator");
		Login log=loginRepo.findByemail(email);
		if(log==null)
		{
			return true;
		}
		return false;
		
	}

	@Override
	public void initialize(unique arg0) {
		// TODO Auto-generated method stub
		
	}

	
}
