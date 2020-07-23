package kr.co.jhta.step1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.jhta.sender.KakaotalkMessageSender;
import kr.co.jhta.sender.MessageSender;
import kr.co.jhta.service.EventService;
import kr.co.jhta.service.EventServiceImpl;

@Configuration
public class JavaConfig {
	
	/*
	 * 아래의 spring bean configuration 파일의 설정과 동일
	 * 자바코드로 정의한 것이다.
	 * <bean id="kakao" class="kr.co.jhta.sender.kakaotalkMessageSender" />
	 */
	@Bean
	public MessageSender kakao() {
		return new KakaotalkMessageSender();
	}
	
	/*
	 * <bean id="eventService" class="kr.co.jhta.service.EventServiceImpl">
	 * 		<property name="messageSender" ref="messageSender"
	 * </bean>
	 */
	@Bean
	public EventService eventService(MessageSender messageSender) {
		EventServiceImpl eventServiceImpl = new EventServiceImpl();
		eventServiceImpl.setMessageSender(messageSender);
		return eventServiceImpl;
	}
}

