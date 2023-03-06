package spring.core.ch02.ex03;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	public int calc(int num) {
		try {
			Thread.sleep((long)(Math.random() * 1000));
		} catch(Exception e) {}
		// 출력순서를 확인한다, advice msg가 먼저나오면 advice msg 가 먼저 선택된것이다.
		System.out.println("Calculator.calc()");
		return num;
	}
}
