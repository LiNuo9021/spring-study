package book.chapter3.di;

import book.chapter3.Car;

public class CarFactory {
	public Car createBMW(){
		Car car = new Car();
		car.setBrand("BMW");
		return car;
	}
}
