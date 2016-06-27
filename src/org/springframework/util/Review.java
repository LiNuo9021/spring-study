package org.springframework.util;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import book.chapter3.di.Car;

public class Review {
	public static void main(String[] args) {
		
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		BeanFactory bf = 
				new XmlBeanFactory(resolver.getResource("classpath:book/chapter3/di/ioc.xml"));
	
		Car car = (Car)bf.getBean("car");
		System.out.println(car.getBrand());
	}
}
