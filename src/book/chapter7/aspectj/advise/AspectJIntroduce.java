package book.chapter7.aspectj.advise;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class AspectJIntroduce {
	
	@DeclareParents(value = "book.chapter7.aspectj.advise.NaiveWaiter", defaultImpl=SmartSeller.class)
	public Seller seller;
	
}
