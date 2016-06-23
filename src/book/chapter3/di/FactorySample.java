package book.chapter3.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import book.chapter3.Car;

public class FactorySample {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("book/chapter3/di/factory.xml");
	
		Car car = (Car)ac.getBean("BMW");
	
		System.out.println(car.getBrand());
		
		Car audi = (Car)ac.getBean("Audi");
		
		System.out.println(audi.getBrand());
	}
}
