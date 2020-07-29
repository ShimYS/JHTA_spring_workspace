package kr.co.jhta.service;

import java.util.List;

import kr.co.jhta.vo.Blog;
import kr.co.jhta.vo.Comment;
import kr.co.jhta.vo.User;

/**
 * 신규가입, 로그인, 내가 작성한 게시글/댓글 조회, 내정보 변경, 계정삭제 서비스를 정의한다.
 * @author sim55
 *
 */
public interface UserService {
	
	void addNewUser(User user);
	User login(String id, String password);
	List<Blog> getMyBlogs(String userId);
	List<Comment> getMyComments(String userId);
	void updateUserInfo(User user);
	void deleteMyAccount(String userId);
}
