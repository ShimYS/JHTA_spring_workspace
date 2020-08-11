package kr.co.jhta.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import kr.co.jhta.handler.ReplyEchoHandler;

public class WebSocketConfig implements WebSocketConfigurer {
	
	@Autowired
	ReplyEchoHandler replyEchoHandler; 
	
	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(replyEchoHandler, "/chat/");
		
	}
	
}
