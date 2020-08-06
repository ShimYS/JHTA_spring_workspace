package kr.co.jhta.service;

import kr.co.jhta.vo.User;

public interface UserService {
	
	void addNewUser(User user);
	User getUserDetail(String userId);
	User login(String userId, String userPwd);
}
