package book.chapter7.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class PreGreetAspect {
	@Before("execution(* serveTo(..))")
	public void beforeGreet(){
		System.out.println("hello fuckers");
	}
}
