package kr.co.jhta.blog.dao;

import java.util.List;

import javax.xml.stream.events.Comment;

import org.apache.ibatis.session.SqlSession;

import kr.co.jhta.blog.dto.BlogDto;
import kr.co.jhta.blog.util.MybatisUtil;

public class CommentDao {
	public void insertComment(Comment comment) {
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		try {
			sqlSession.insert("insertComment");
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	public List<Comment> getCommentByBlogNo(int blogNo) {
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		try {
			List<Comment> comments = sqlSession.selectList("getCommentDtoByBlogNo", blogNo);
			sqlSession.commit();
			return comments;
		} finally {
			sqlSession.close();
		}
	}
}
