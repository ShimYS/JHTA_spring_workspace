package kr.co.jhta.exception;

/**
 * spring-mybatis 프로젝트에서 사용되는 예외객체다.
 * @author sim55
 *
 */
public class HTAException extends RuntimeException {
	
	public HTAException(String message) {
		super(message);
	}
	
	public HTAException(String message, Throwable cause) {
		super(message, cause);
	}
}
