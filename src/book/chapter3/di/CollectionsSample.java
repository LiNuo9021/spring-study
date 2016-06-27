package book.chapter3.di;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionsSample {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("book/chapter3/di/collections.xml");
		
		Boss boss = (Boss)ac.getBean("boss");
		
		List<Car> cars = boss.getCars();
		
		for(Car car : cars){
			System.out.println(car.getBrand());
		}
		
		Map map = boss.getChild();
		Set set = map.entrySet();
		System.out.println(set);
	}
}
