package book.chapter3.di;

import book.chapter3.Car;

public class CarStaticFactory {
	public static Car createAudi(){
		Car car = new Car();
		
		car.setBrand("Audi");
		
		return car;
	}
}
