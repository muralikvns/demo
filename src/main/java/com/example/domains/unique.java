package com.example.domains;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import javax.validation.Constraint;
import javax.validation.Payload;

import com.example.validator.Uniquevalidator;


@Documented
@Constraint(validatedBy = Uniquevalidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)

public @interface unique {
	   String message() default "email id entered already exists";
       Class<?>[] groups() default {};
	   Class<? extends Payload>[] payload() default {};
	
}
