package kr.co.jhta.dao;

import java.util.List;

import kr.co.jhta.vo.Comment;

public interface BlogCommentDao {
	
	void insertComment(Comment comment);
	List<Comment> getCommentByBlogNo(int blogNo);
	List<Comment> getCommentByWriter(String writer);
	void deleteCommentByNo(int commentNo);
	void deleteCommentsByBlogNo(int blogNo);
	void deleteCommentsByWriter(String writer);
}
