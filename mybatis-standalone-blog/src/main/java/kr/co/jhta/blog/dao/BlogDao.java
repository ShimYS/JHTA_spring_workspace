package kr.co.jhta.blog.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.jhta.blog.dto.BlogDto;
import kr.co.jhta.blog.util.MybatisUtil;
import kr.co.jhta.blog.vo.Blog;

public class BlogDao {
	public void insertBlog(Blog blog) {
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		try {
			sqlSession.insert("insertBlog", blog);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	public List<BlogDto> getAllBlogs() {
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		try {
			List<BlogDto> blogDtos = sqlSession.selectList("getAllBlogs");
			sqlSession.commit();
			return blogDtos;
		} finally {
			sqlSession.close();
		}
	}
	public BlogDto getBlogByNo(int blogNo) {
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		try {
			BlogDto blogDto = sqlSession.selectOne("getBlogByNo", blogNo);
			sqlSession.commit();
			return blogDto;
		} finally {
			sqlSession.close();
		}
	}
	public void updateBlog(Blog blog) {
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		try {
			sqlSession.update("updateBlog", blog);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
}
