package book.chapter6.aop.advise.introduce;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class ControlleableMonitor extends DelegatingIntroductionInterceptor implements Monitor{

	ThreadLocal<Boolean> tl = new ThreadLocal<Boolean>();
	
	@Override
	public void setMonitor(boolean active) {
		tl.set(true);
	}
	
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		
		Object obj = null;
		
		if(tl.get() != null && tl.get()){
			System.out.println("monitor begin");
			
			obj = mi.proceed();
			
			System.out.println("monitor end");
		
			return obj;
		}
		else{
			return super.invoke(mi);
		}
	}
	
}
