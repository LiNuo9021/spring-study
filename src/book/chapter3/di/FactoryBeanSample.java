package book.chapter3.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class FactoryBeanSample {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("book/chapter3/di/factoryBean.xml");
	
		Car car = (Car)ac.getBean("car");
	
		System.out.println(car.getBrand() + "-" + car.getColor());
	}
}
