package book.chapter3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextSample {
	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(CarBean.class);
		Car car = (Car)ac.getBean("car", Car.class);
	
		System.out.println(car.getBrand());
		
	}
}
