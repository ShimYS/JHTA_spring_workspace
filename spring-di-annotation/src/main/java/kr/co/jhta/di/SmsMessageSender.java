package kr.co.jhta.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sms")
public class SmsMessageSender implements MessageSender {
	// 통신사
	@Value("${message.sender.sms.company}")
	private String company;
	
	// 통신사 주입받기
	public void setCompany(String company) {
		this.company = company;
	}
	
	public SmsMessageSender() {}
	
	@Override
	public void send(String from, String to, String subject, String content) {
		System.out.println(company + " 통신사를 이용합니다.");
		System.out.println("SMS 발신자 : " + from);
		System.out.println("SMS 수신자 : " + to);
		System.out.println("SMS 제목 : " + subject);
		System.out.println("SMS 내용 : " + content);
		System.out.println("-------------------------------");
	}
}
