package book.chapter15.mvc;

import org.springframework.core.convert.converter.Converter;

public class StringToUserConverter implements Converter<String, User>{
	@Override
	public User convert(String source) {
		User user = new User();
		if(source != null){
			String[] items = source.split(":");
			user.setName(items[0]);
			user.setAge(Integer.parseInt(items[1]));
		}
		System.out.println("StringToUserConverter.convert()");
		return user;
	}
}
