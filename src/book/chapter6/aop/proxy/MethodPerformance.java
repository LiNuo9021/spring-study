package book.chapter6.aop.proxy;

import java.lang.reflect.Method;

public class MethodPerformance {
	private long begin;
	private long end;
	private String serviceMethod;
	
	public MethodPerformance(String method) {
		this.serviceMethod = method;
		this.begin = System.currentTimeMillis();
	}
	
	public void printPerformance(){
		this.end = System.currentTimeMillis();
		
		System.out.println(serviceMethod + " duration: " + (end - begin)/1000 + "s");
	}
	
}
