package book.chapter15.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/model")
public class ModelController {
	@RequestMapping("/para")
	public String transPara(@ModelAttribute User user){
		user.setAge(12);
		return "createSuccess";
	}
	
	@ModelAttribute
	public User transMethodFrom(){
		User user = new User();
		user.setAge(11);
		user.setName("li");
		return user;
	}

	@RequestMapping("/method")
	public String transMethod(){
		return "createSuccess";
	}
	
	@RequestMapping("/modelOrMap")
	public String modelOrMap(ModelMap modelMap){
		User user = (User)modelMap.get("user");
		user.setAge(100);
		return "createSuccess";
	}

}
