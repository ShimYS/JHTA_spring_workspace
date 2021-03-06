package kr.co.jhta.service;

import java.util.List;

import kr.co.jhta.dto.BlogDetailDto;
import kr.co.jhta.vo.Blog;
import kr.co.jhta.vo.Comment;

/**
 * 게시글 등록, 전체조회, 상세조회, 수정, 삭제 서비스를 정의한다.
 * @author sim55
 *
 */
public interface BlogService {
	
	void addNewBlog(Blog blog);
	List<Blog> getAllBlogs();
	BlogDetailDto getBlogDetail(int blogNo);
	void modifyBlog(Blog blog);
	void removeBlog(int blogNo);
	
	void addNewcomment(Comment comment);
	void removeComment(int commentNo);
	
}
