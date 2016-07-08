package book.chapter15.mvc;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ImageDownloadController {
	@ResponseBody
	@RequestMapping("/responseImg")
	public byte[] printImg() throws IOException{
		Resource image = new ClassPathResource("decorator.png");
		
		byte[] imageBytes = FileCopyUtils.copyToByteArray(image.getInputStream());
		
		return imageBytes;
	}
	
//	@ResponseBody
//	@RequestMapping(value = "/responseImg2", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
//	public byte[] printImg2() throws IOException {
//	    InputStream in = servletContext.getResourceAsStream("/images/no_image.jpg");
//	    return IOUtils.toByteArray(in);
//	}
}








