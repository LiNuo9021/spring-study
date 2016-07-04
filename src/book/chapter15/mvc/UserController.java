package book.chapter15.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	
	@RequestMapping(value="/register")
//	public ModelAndView register(){
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("register");
//		return mav;
	public String register(){
		return "register";
	}
	
	@RequestMapping(value="/get/{name}")
	public ModelAndView getUser(@PathVariable(value="name") String name){
		
		ModelAndView mav = new ModelAndView("userInfo");
		User user = new User();
		user.setName(name);
		mav.addObject(user);
		return mav;
	}
	
//	@RequestMapping(value="/add",method=RequestMethod.POST)
	@RequestMapping(value="/add")
	public ModelAndView addUser(User user){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("createSuccess");
		mav.addObject(user);
		return mav;
	}
	
	@RequestMapping("/getRequest")
	public void getRequest(HttpServletRequest request){
		int i = 1;
	}
	
	@RequestMapping("/getCookie")
	public void getCookie(@CookieValue String sessionid){
		int i = 1;
	}
	
	@RequestMapping("/getHeader")
	public void getCookie(@RequestHeader("User-Agent") String userAgent, @RequestHeader(value="Content-Length",required=false) Integer length){
		System.out.format("user-agent: %s\ncontent-length: %s", userAgent, length);
	}
	
	
	
	//自动绑定
	@RequestMapping("/save")
	public void save(String name, int age){
		System.out.format("%s-%d", name, age);
	}
	
	//@RequestParam:可以省略
	@RequestMapping("/save2")
	public void save2(@RequestParam("name") String name, @RequestParam("age") int age){
		System.out.format("%s-%d", name, age);
	}
	
	@RequestMapping("/formatUser")
	public String formatUser(@RequestParam("user") User user){
		return "userInfo";
	}
	
	
}
