package book.chapter9.dao;

public interface BbtForum {
//	void addTopic(Topic topic) throws Exception;
	void updateForum(Forum forum);
	Forum getForum(int forumId);
	int getForumNum();
}
