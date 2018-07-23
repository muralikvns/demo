package com.example.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.domains.Registration;
import com.example.domains.UniqueRegistration;
import com.example.repositories.RegistrationRepository;

public class RegistrationValidator implements ConstraintValidator<UniqueRegistration, String> {

	@Autowired
	private RegistrationRepository regRepo;
	
	@Override
	public void initialize(UniqueRegistration arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String email, ConstraintValidatorContext cxt) {
	
		if(!email.isEmpty()||(email!=null)){
	    System.out.println(email);
		Registration reg=regRepo.findByemail(email);
		if(reg==null)
		{
			System.out.println("null");
			return true;
		}
		}
		System.out.println("returning false");
		return false;
	}
}