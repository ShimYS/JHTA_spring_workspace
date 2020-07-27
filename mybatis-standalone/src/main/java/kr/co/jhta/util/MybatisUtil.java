package kr.co.jhta.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	
	/*
	 * mybatis의 주요 API
	 * 		- SqlSession
	 * 			매퍼파일에 정의된 SQL문을 실행하는 객체다.
	 * 			Object 	insert(String id)
	 * 			Object 	insert(String id, Object parameter)
	 * 			int 	update(String id)
	 * 			int 	update(String id, Object parameter)
	 * 			int		delete(String id)
	 * 			int 	delete(String id, Object parameter)
	 * 			Object 	selectOne(String id)
	 * 			Object 	selectOne(String id, Object parameter)
	 * 			List 	selectList(String id)
	 * 			List 	selectList(String id, Object parameter)
	 * 			void 	close()
	 * 			void 	commit()
	 * 			void 	rollback()
	 * 			쿼리를 한 번 실행할 때 마다 SqlSessionFactory로 부터 새로운
	 * 			SqlSession객체를 획득해서 사용하고 폐기한다.
	 * 			
	 * 		
	 * 		- SqlSessionFactory => 'Connection Pool이라고 생각하면 된다'
	 * 			쿼리 실행에 필요한 SqlSession객체를 제공하는 객체다
	 * 			애플리케이션이 실행되는 동안 딱 한번만 생성해서 계속 사용한다.
	 * 			SqlSession openSession()
	 * 				* 새로운 SqlSession객체를 반환한다.
	 * 		
	 * 		- SqlSessionFactoryBuilder
	 * 			mybatis 환경설정 정보를 이용해서 SqlSessionfactory객체를 생성한다.
	 * 			SqlSessionFactory build(InputStream inputStream)
	 * 
	 * 		
	 */
	
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			
			String resource = "mybatis/mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
