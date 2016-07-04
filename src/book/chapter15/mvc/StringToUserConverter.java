package book.chapter15.mvc;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.core.convert.converter.Converter;

public class StringToUserConverter implements Converter<String, User>{
	@Override
	public User convert(String source) {
		User user = new User();
		if(source != null){
			String[] items = source.split(":");
			user.setName(items[0]);
			user.setAge(Integer.parseInt(items[1]));
			user.setSalary(Long.valueOf(items[2]));
			try {
				user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(items[3]));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		System.out.println("StringToUserConverter.convert()");
		return user;
	}
}
