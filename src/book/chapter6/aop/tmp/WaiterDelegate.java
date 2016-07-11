package book.chapter6.aop.tmp;

public class WaiterDelegate {
	private Waiter waiter;
	public void setWaiter(Waiter waiter){
		this.waiter = waiter;
	}
	
	public void service(String name){
		waiter.greetTo(name);
		waiter.serveTo(name);
	}
}
