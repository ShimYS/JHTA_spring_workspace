package kr.co.jhta.sender;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KakaotalkMessageSender implements MessageSender{
	
	@Value("${message.sender.kakao.username}")
	private String username;
	@Value("${message.sender.kakao.password}")
	private String password;
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@PostConstruct
	public void connect () {
		System.out.println(username + ", " + password + "로 카톡서버에 접속됨..");
	}
	
	@PreDestroy
	public void disconnect () {
		System.out.println(username + " 계정 연결 해제됨..");
	}
	
	
	@Override
	public void send(String from, String to, String subject, String content) {
		System.out.println("카톡 메세지 발송");
		System.out.println("카톡 메세지 발신자 : " + from);
		System.out.println("카톡 메세지 수신자 : " + to);
		System.out.println("카톡 메세지 제  목 : " + subject);
		System.out.println("카톡 메세지 내  용 : " + content);
	}
}
