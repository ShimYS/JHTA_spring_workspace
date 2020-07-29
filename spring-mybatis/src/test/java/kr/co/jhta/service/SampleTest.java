package kr.co.jhta.service;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class SampleTest {
	
	@Test
	public void testPlus() {
		Sample sample = new Sample();
		int value = sample.plus(10,  30);
		assertEquals(40, value); // 단언문
		// errors : 테스트 진행중 오류가나서 중단된 상태
		// failures : 테스트 실행완료 되었지만 예상한 답과 다를 때
	}
	@Ignore
	@Test
	public void testMinus() {
		Sample sample = new Sample();
		int value = sample.minus(10, 30);
		assertEquals(-20, value); // 단언문
		// errors : 테스트 진행중 오류가나서 중단된 상태
		// failures : 테스트 실행완료 되었지만 예상한 답과 다를 때
	}
}
