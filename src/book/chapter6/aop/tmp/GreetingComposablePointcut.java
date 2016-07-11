package book.chapter6.aop.tmp;

import org.springframework.aop.Pointcut;
import org.springframework.aop.support.ComposablePointcut;
import org.springframework.aop.support.ControlFlowPointcut;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class GreetingComposablePointcut {
	private ComposablePointcut composablePointcut;
	
	public Pointcut getComposablePointcut(){
		
		ComposablePointcut cp = new ComposablePointcut();
		
		NameMatchMethodPointcut nmmp = new NameMatchMethodPointcut();
		nmmp.addMethodName("greetTo");
		
		Pointcut cfp = new ControlFlowPointcut(WaiterDelegate.class, "service");
		
		return cp.intersection(cfp).intersection((Pointcut)nmmp);
	}
}
