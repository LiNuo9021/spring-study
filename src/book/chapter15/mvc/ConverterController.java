package book.chapter15.mvc;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/convert")
public class ConverterController {
	
	@RequestMapping(value="/requestbody")
	public String convertRequest(@RequestBody String requestBody){
		System.out.println("requestBody");
		return "requestbody";
	}
	
	@RequestMapping("/user")
	public void convertUser(@RequestParam("user") User user, @RequestParam("user") User users){
		System.out.println("convertUser-user: " + user);
		System.out.println("convertUser-users: " + users);
	}
	
	@ResponseBody
	@RequestMapping("/responseImg")
	public byte[] printImg() throws IOException{
		Resource image = new ClassPathResource("decorator.png");
		
		byte[] imageBytes = FileCopyUtils.copyToByteArray(image.getInputStream());
		
		return imageBytes;
	}
	
}
