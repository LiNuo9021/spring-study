package book.chapter6.aop.advise;

public class NaiveWaiter implements Waiter {

	@Override
	public void greetTo() {
		System.out.println("hello");
	}

	@Override
	public void serveTo() {
		System.out.println("serve for you");
		throw new RuntimeException();
	}

}
