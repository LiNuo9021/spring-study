package book.chapter15.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exception")
public class ExceptionController {
	
	@RequestMapping("/500")
	public String to500(){
		int i = 1/0;
		return "register";
	}
}
