package book.chapter9.dao;

public class BbtForumImpl implements BbtForum{
	private ForumDao forumDao;
	
	
	@Override
	public Forum getForum(int forumId) {
		return forumDao.getForum(forumId);
	}
	
	@Override
	public int getForumNum() {
		return forumDao.getForumNum();
	}
	
	@Override
	public void updateForum(Forum forum) {
		forumDao.updateForum(forum);		
	}
	
}
