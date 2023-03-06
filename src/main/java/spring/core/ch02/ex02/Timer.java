package spring.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {
	// 주가 돼서 clock이 실행될 이유가 없다, 해서 주가 아닌 종으로 실행되는 advice 라고 한다.
	@Around // clock 입장에서 rabbit의 sleep이 실행될때 Join 될것이다. advice가 결합될 지점이 JoinPoint이다.
	public Object clock(ProceedingJoinPoint jp) throws Throwable {
		
	} 
}
