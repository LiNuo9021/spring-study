package review;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class GreetIntroductionAdvise extends DelegatingIntroductionInterceptor{
	@Override
	protected Object doProceed(MethodInvocation mi) throws Throwable {

		
		return super.doProceed(mi);
	}
}
