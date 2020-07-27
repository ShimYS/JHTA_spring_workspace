package kr.co.jhta.blog.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			// mybatis 환경설정파일의 경로 및 파일명 지정
			String resource = "mybatis/mybatis-config.xml";
			// mybatis 환경설정파일을 읽어오는 스트림 생성
			InputStream inputStream = Resources.getResourceAsStream(resource);
			// 스트림을 이용해서 mybatis 환경설정 파일을 읽어서 SqlSessionFactory객체 획득
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * SqlSessionFactory 객체를 반환한다.
	 * @return SqlSessionFactory객체
	 */
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	
	/**
	 * SQL 구문을 실행하는 SqlSession 객체를 반환한다.
	 * @return SqlSession 객체 (INSERT/UPDATE/DELETE/SELECT, 트랜잭션 기능 제공)
	 */
	public static SqlSession getSqlSession() {
		return sqlSessionFactory.openSession();
	}
	
}




























