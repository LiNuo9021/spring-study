package book.chapter3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ApplicationContextSample {
	public static void main(String[] args) {

		//加载注解定义的bean
		ApplicationContext ac = new AnnotationConfigApplicationContext(CarBean.class);
		Car car = (Car)ac.getBean("car", Car.class);
		System.out.println(car.getBrand());
	
		System.out.println("====================");
		
		//加载xml定义的bean，自动加载后处理器
		ApplicationContext ac2 = new GenericXmlApplicationContext("book/chapter3/bean.xml");
		CarBetter carBetter = (CarBetter)ac2.getBean("carBetters");
		System.out.println("ApplicationContext's brand: " + carBetter.getBrand());
		
	}
}
