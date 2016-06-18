package book.chapter3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarBean {
	@Bean(name="car")
	public Car buildCar(){
		Car car = new Car();
		car.setBrand("BWM");
		car.setColor("red");
		car.setMaxSpeed(10000);
		return car;
	}
}
