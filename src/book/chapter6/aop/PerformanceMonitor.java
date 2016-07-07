package book.chapter6.aop;

public class PerformanceMonitor {
	private static ThreadLocal<MethodPerformance> methodPerformance = new ThreadLocal<MethodPerformance>();
	
	public static void begin(String method){
		System.out.println(method + " begin");
		
		MethodPerformance mp = new MethodPerformance(method);
		
		methodPerformance.set(mp);
	}
	
	public static void end(String method){
		MethodPerformance mp = methodPerformance.get();
		
		mp.printPerformance();
		
		System.out.println(method + " end");
	}
}
