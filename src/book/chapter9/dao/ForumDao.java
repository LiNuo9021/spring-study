package book.chapter9.dao;



public interface ForumDao {
   void addForum(Forum forum);
   void updateForum(Forum forum);
   Forum getForum(int forumId);
   int getForumNum();
}
