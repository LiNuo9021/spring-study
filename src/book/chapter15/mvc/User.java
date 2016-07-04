package book.chapter15.mvc;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

public class User {
	private String name;
	private int age;
//	@NumberFormat(pattern="#,###.##")
	private long salary;
//	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "My name is " + name + " , I'm " + age + " years old";
	}
}
