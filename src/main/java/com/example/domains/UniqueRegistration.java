package com.example.domains;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.example.validator.RegistrationValidator;



@Documented
@Constraint(validatedBy = RegistrationValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueRegistration {

	   String message() default "Already Registered";
       Class<?>[] groups() default {};
	   Class<? extends Payload>[] payload() default {};
	
}
