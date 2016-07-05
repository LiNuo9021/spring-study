package book.chapter15.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/fileupload")
public class FileUploadController {
	@RequestMapping("/page")
	public String uploadPage(){
		return "upload";
	}
	
	@RequestMapping("/up")
	public String up(String name, MultipartFile file){
		System.out.println(file.getName());
		return "success";
	}
	
}
