package review;

import org.springframework.aop.ThrowsAdvice;

public class GreetExceptionAdvise implements ThrowsAdvice{
	public void afterThrowing(RuntimeException e){
		System.out.println("afterThrowing");
	}
}
