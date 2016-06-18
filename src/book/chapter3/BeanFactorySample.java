package book.chapter3;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

public class BeanFactorySample {
	public static void main(String[] args) {
		ResourceLoader resoureLoader = new PathMatchingResourcePatternResolver();
		Resource resource = resoureLoader.getResource("classpath:book/chapter3/bean.xml");
	
		XmlBeanFactory beanFactory = new XmlBeanFactory(resource);

		System.out.println("beanFactory");
		
//		Car car = (Car)beanFactory.getBean("car", Car.class);
//		
//		System.out.println(car.getBrand());
		
		((ConfigurableBeanFactory)beanFactory).addBeanPostProcessor(new MyBeanPostProcessor());
		((ConfigurableBeanFactory)beanFactory).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());
		
		CarBetter carBetter = (CarBetter)beanFactory.getBean("carBetter", CarBetter.class);
		carBetter.introduce();
		
		((XmlBeanFactory)beanFactory).destroySingletons();
		
		System.out.println(carBetter.getBrand());
	}
}
