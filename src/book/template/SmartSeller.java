package book.template;

public class SmartSeller implements Seller{
	@Override
	public void sellTo(String name) {
		System.out.println("sell to " + name);
	}
}
