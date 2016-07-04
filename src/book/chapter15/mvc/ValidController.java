package book.chapter15.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/valid")
public class ValidController {
	
	@RequestMapping("/add")
	public void add(@Valid ValidBean bean, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			System.out.println(bindingResult.getFieldError().getDefaultMessage());
		}
		System.out.println("end");
	}
}
