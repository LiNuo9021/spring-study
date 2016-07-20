package book.chapter7.aspectj.advise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AspectJTest {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:book/chapter7/aspectj/advise/beans.xml");
		
		Waiter waiter = (Waiter)ac.getBean("waiter");
		waiter.greetTo("li");
		waiter.serveTo("nuo");
		
		Seller seller = (Seller)waiter;//引介增强
		seller.sellTo("linuo");
	}
}
