package kr.co.jhta.di.step1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.jhta.di.SmsMessageSender;

public class Main {

	public static void main(String[] args) {
		String conf = "classpath:/spring/context-step1.xml";
		
		ApplicationContext ctx = new GenericXmlApplicationContext(conf);
		
		//SmsMessageSender sms = ctx.getBean(SmsMessageSender.class);
		EventNotificationServiceImpl ens = ctx.getBean(EventNotificationServiceImpl.class);
		
		ens.notice("홍보부","창고대방출", "우리 사장님 망했대요!");

	}

}
