package book.chapter15.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/json")
public class JsonController {
	@RequestMapping("/render")
	public String renderJSON(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "linuo");
		return "json";
	}
}
