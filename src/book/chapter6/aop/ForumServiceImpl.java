package book.chapter6.aop;

public class ForumServiceImpl implements ForumService {

	@Override
	public void removeTopic(int topicId) {
//		PerformanceMonitor.begin("removeTopic");
		
		System.out.println("removeTopic execution");
		try {
			Thread.sleep(topicId);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		PerformanceMonitor.end("removeTopic");
	}

}
