package book.chapter15.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;


public class ValidBean {
	@Pattern(regexp="w{4,30}",message="名字长度要在4-30之间")
	private String user;
	
	@Min(value=18l)
	@Max(value=40l,message="超出年龄范围")
	private int age;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
