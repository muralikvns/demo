package com.example.web;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;

import com.example.domains.Course;
import com.example.domains.Education;
import com.example.domains.Experience;
import com.example.domains.Login;
import com.example.domains.Registration;
import com.example.domains.Technologies;
import com.example.repositories.CourseRepository;
import com.example.repositories.EducationRepository;
import com.example.repositories.RegistrationRepository;
import com.example.repositories.TechnologiesRepository;
import com.example.session.SpringSession;
import com.example.validator.LoginValidator;
import com.example.repositories.ExperienceRepository;
import com.example.repositories.LoginRepository;
import javax.validation.Valid;


@Controller
public class IndexController {
		
	@Autowired
	private CourseRepository courseRepo;
	
	@Autowired
	private RegistrationRepository registerRepo;
	
	@Autowired
	private ExperienceRepository expRepo;
	
	@Autowired
	private TechnologiesRepository techRepo;
	
	@Autowired
	private EducationRepository educationRepo;
	
	@Autowired
	private LoginRepository loginRepo;
	
	@Autowired
	private LoginValidator loginValid;
	
	@Autowired
	private SpringSession session;
	
		
	@RequestMapping("/index")
	public String index(ModelMap model)
	{
		List<Course> courses=courseRepo.findAll();
		model.put("theCourses", courses);
		int data=(int) courseRepo.count();
		model.put("key", data);
		return "index";	
	}

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("login", new Login());
        return "login";
    }
 
    @PostMapping("/login")
    public String loginSubmit(@Valid @ModelAttribute("login") Login login,BindingResult bindingResult) {
    	
    	Login log=new Login();
    	log=loginRepo.findByemail(login.getEmail());
    	if ((bindingResult.hasErrors())||(log==null)) {
            return "login";
        }
    	else if( (log!=null)&&(loginValid.isValid(login.getEmail(), null))){
    		 if(login.getRemember()==null)
    		 login.setRemember("0");
    		 loginRepo.save(login);
    	 return "success";
    		 }
    	else 
    		return "login";
    	}
     
    
    @GetMapping("/register")
    public String registerForm(Model model ,@ModelAttribute("register") Registration register,BindingResult bindingResult) {
    	  List<Experience> exp = expRepo.findAll();
          model.addAttribute("exp",exp);
          List<Technologies> tech = techRepo.findAll();  
          model.addAttribute("tech",tech);
          List<Education> education =educationRepo.findAll();
          model.addAttribute("education",education);
          model.addAttribute("tech",tech);
          model.addAttribute("register", new Registration());
        return "registration";
    }
	
	@GetMapping("/registerDuplicate")
    public String registerDuplicateForm(Model model ,@ModelAttribute("register") Registration register,BindingResult bindingResult) {
    	  List<Experience> exp = expRepo.findAll();
          model.addAttribute("exp",exp);
          List<Technologies> tech = techRepo.findAll();  
          model.addAttribute("tech",tech);
          List<Education> education =educationRepo.findAll();
          model.addAttribute("education",education);
          model.addAttribute("tech",tech);
          model.addAttribute("register", new Registration());
        return "registration";
    }
    
     @PostMapping("/register")  
    public String registerSubmit(@Valid @ModelAttribute("register") Registration register,BindingResult bindingResult) 
     {
    	
    	  
    	  if(!register.getEmail().isEmpty()){
    	  Registration reg=registerRepo.findByemail(register.getEmail());
    	  register.setEmail(register.getEmail());
    	  register.setGender(register.getGender());
    	  register.setFirstName(register.getFirstName());
    	  register.setLastName(register.getLastName());
    	  register.setExperience(register.getExperience());
    	  if((reg==null)){
    		  registerRepo.save(register);
    		  return "success";
    	  }
    	  else 	if ((bindingResult.hasErrors())||(reg!=null)) {
    		    return "redirect:/register";
    		  //  return "registration";
    	  }
    	  }
    	  return "registration";
    }
    
}

