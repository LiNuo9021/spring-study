package book.chapter7.aspectj.advise;

public class SmartSeller implements Seller{
	@Override
	public void sellTo(String name) {
		System.out.println("sell to " + name);
	}
}
