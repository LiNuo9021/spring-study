package book.chapter3.di;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 每次注入不同的car bean
 * 
 * @author linuo
 *
 */
public class Boss implements ApplicationContextAware{
	private ApplicationContext ac;
	
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		this.ac = arg0;
	}
	
	private Car car;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	public Car getCar2(){//不好的方案，紧耦合
		return (Car)ac.getBean("car");
	}
}
