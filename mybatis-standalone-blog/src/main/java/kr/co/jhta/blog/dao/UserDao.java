package kr.co.jhta.blog.dao;

import org.apache.ibatis.session.SqlSession;

import kr.co.jhta.blog.util.MybatisUtil;
import kr.co.jhta.blog.vo.User;

public class UserDao {
	
	public User getUserById(String userId) {
		SqlSession sqlSession = MybatisUtil.getSqlSession();
		try {
			User user = sqlSession.selectOne("getUserById", userId);
			sqlSession.commit();
			return user;
		} finally {
			sqlSession.close();
		}
	}
	
	
}
