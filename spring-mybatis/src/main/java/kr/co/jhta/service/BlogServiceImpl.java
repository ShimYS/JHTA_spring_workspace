package kr.co.jhta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kr.co.jhta.dao.BlogCommentDao;
import kr.co.jhta.dao.BlogDao;
import kr.co.jhta.dto.BlogDetailDto;
import kr.co.jhta.vo.Blog;
import kr.co.jhta.vo.Comment;

public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogDao blogDao;
	@Autowired
	private BlogCommentDao blogCommentDao;
	
	@Override
	public void addNewBlog(Blog blog) {
		blogDao.insertBlog(blog);
	}

	@Override
	public List<Blog> getAllBlogs() {
		return blogDao.getAllBlogs();
	}

	@Override
	public BlogDetailDto getBlogDetail(int blogNo) {
		Blog blog = blogDao.getBlogByNo(blogNo);
		List<Comment> comments = blogCommentDao.getCommentByBlogNo(blogNo);
		// 반환값은 하나만 가능. DTO만들어서 하나로 합한후 보내준다.
		BlogDetailDto blogDetailDto = new BlogDetailDto(blog, comments);
		return blogDetailDto;
	}

	@Override
	public void modifyBlog(Blog blog) {
//		Blog savedBlog = blogDao.getBlogByNo(blog.getNo());

//		savedBlog.setTitle(blog.getTitle());
//		savedBlog.setContent(blog.getContent());
//		savedBlog.setLikes(blog.getLikes());
//		savedBlog.setCommentCounts(blog.getCommentCounts());	
		
		blogDao.updateBlog(blog);
	}

	@Override
	public void removeBlog(int blogNo) {
		blogCommentDao.deleteCommentsByBlogNo(blogNo);
		blogDao.deleteBlogByNo(blogNo);
	}

	@Override
	public void addNewcomment(Comment comment) {
		blogCommentDao.insertComment(comment);
	}

	@Override
	public void removeComment(int commentNo) {
		blogCommentDao.deleteCommentByNo(commentNo);
	}
	
}
