package book.chapter3.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanRelationSample {
	public static void main(String[] args) {
		ApplicationContext ac = 
				new GenericXmlApplicationContext("book/chapter3/di/beanRelation.xml");
	
		Car myCar = (Car)ac.getBean("myCar");
		Car herCar = (Car)ac.getBean("herCar");
		
		System.out.println("myCar: " + myCar.getBrand() + "-" + myCar.getColor());
		System.out.format("herCar: %s-%s", herCar.getBrand(), herCar.getColor());
		
		System.out.println("====================");
		
		CarRef carRef = (CarRef)ac.getBean("carRef");
		System.out.format("%s-%s", carRef.getCarName(), carRef.getCar().getColor());
		
		
		
	}
}
