package book.chapter15.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

@Controller
@RequestMapping("/exception")
public class ExceptionController {
	
	@RequestMapping("/500")
	public String to500() throws MissingServletRequestPartException{
		System.out.println("500 method");
		
//		int i = 1/0;
		if(2>1){
			throw new MissingServletRequestPartException("fuck");
		}
		
		return "register";
	}
	
	@RequestMapping("/5001")
	public String to5001(){
		System.out.println("5001 method");
		
		if(2>1){
			throw new RuntimeException();
		}
		
		return "register";
	}
	
	@ExceptionHandler(RuntimeException.class)
	public String handlerException(RuntimeException e, HttpServletRequest request){
		System.out.println("handlerException");
		return "error";
	}
	
}
