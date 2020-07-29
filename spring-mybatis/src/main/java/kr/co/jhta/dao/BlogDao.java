package kr.co.jhta.dao;

import java.util.List;

import kr.co.jhta.vo.Blog;

public interface BlogDao {
	
	void insertBlog(Blog blog);
	
	void updateBlog(Blog blog);
	
	void deleteBlogByNo(int blogNo);
	
	void deleteBlogsByWriter(String writer);
	
	Blog getBlogByNo(int blogNo);
	
	List<Blog> getAllBlogs();
	
	List<Blog> getBlogsByWriter(String writer);
	
	
}
