package book.chapter6.aop;

public class TestForumService {
	public static void main(String[] args) {
		ForumService fs = new ForumServiceImpl();
		fs.removeTopic(3000);
	}
}
