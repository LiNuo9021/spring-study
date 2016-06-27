package book.chapter3.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class LookUpSample {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("book/chapter3/di/lookup.xml");
	
		Boss boss = (Boss)ac.getBean("boss");
		Car car = boss.getCar();
		System.out.println(boss);
		System.out.println(car);

		Boss boss2 = (Boss)ac.getBean("boss");
		Car car2 = boss2.getCar();
		System.out.println(boss2);
		System.out.println(car2);
		
		System.out.println("boss == boss2? " + (boss == boss2));
		System.out.println("car == car2? " + (car == car2));
		
		
		System.out.println("=============================");
		
		Boss newBoss = (Boss)ac.getBean("newBoss");
		System.out.println(boss);
		Car newCar = newBoss.getCar();//A
		System.out.println(newCar);
		Car newCar2 = newBoss.getCar();//此处与A get到的已经不同了
		System.out.println(newCar2);

		
		System.out.println("=============================");
		
		Car newCarFromAC = newBoss.getCar2();//实现需求，但是不好的方案
		Car newCarFromAC2 = newBoss.getCar2();
		System.out.println(newCarFromAC == newCarFromAC2);
		
	}
}
