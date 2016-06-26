package book.chapter3.di;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanofCar implements FactoryBean<Car>{
	private String carInfo;

	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}

	@Override
	public Car getObject() throws Exception {

		Car car = new Car();
		String[] info = carInfo.split(",");
		car.setBrand(info[0]);
		car.setColor(info[1]);
		
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
	
	
	
}
