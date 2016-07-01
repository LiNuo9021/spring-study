package book.chapter15.mvc;

import java.io.IOException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

public class ConverterSample {
	public void testRequest(){
		RestTemplate restTemplate = new RestTemplate();
		MultiValueMap<String, String> urlVariables = new LinkedMultiValueMap<String, String>();
		urlVariables.add("name", "linuo");
		urlVariables.add("age", "22");
		urlVariables.add("birthday", "1990-01-01");
		urlVariables.add("salary", "2000.00");
//		restTemplate.postForLocation("http://localhost:8080/spring-study/convert/requestbody", null);
		restTemplate.getForObject("http://localhost:8080/spring-study/convert/requestbody", String.class, new Object[]{});
	}
	
	
	public void testRequestImage() throws IOException{
		RestTemplate restTemplate = new RestTemplate();
		byte[] img = restTemplate.postForObject("http://localhost:8080/spring-study/convert/responseImg", null, byte[].class);
//		Resource outFile = new ClassPathResource("outImg.png");
		Resource outFile = new FileSystemResource("/Users/linuo/tmp/outImg.png");
		FileCopyUtils.copy(img, outFile.getFile());
	}
	
	public void testFormatUser(){
		RestTemplate restTemplate = new RestTemplate();
		MultiValueMap<String, String> urlVariables = new LinkedMultiValueMap<String, String>();
		urlVariables.add("name", "linuo");
		urlVariables.add("age", "22");
		urlVariables.add("birthday", "1990-01-01");
		urlVariables.add("salary", "2000.00");
		String html = restTemplate.postForObject("http://localhost:8080/spring-study/user/formatUser", 
				urlVariables, String.class);
	}
	
	
	public static void main(String[] args) throws IOException {
		ConverterSample sample = new ConverterSample();
//		sample.testRequest();
//		sample.testRequestImage();
		sample.testFormatUser();
	}
}
