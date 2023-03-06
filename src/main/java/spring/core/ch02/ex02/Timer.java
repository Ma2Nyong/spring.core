package spring.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {
	@Pointcut("execution(public * spring.core.ch02.ex02..*(..))")
	private void myPointcut() {}
	// 주가 돼서 clock이 실행될 이유가 없다, 해서 주가 아닌 종으로 실행되는 advice 라고 한다.
	@Around("myPointcut()") // clock 입장에서 rabbit의 sleep이 실행될때 Join 될것이다. advice가 결합될 지점이 JoinPoint이다.
	public Object clock(ProceedingJoinPoint jp) throws Throwable {
		//Result spring.core.ch02.ex02.Calculator.calc()가 출력된다
		System.out.println(jp.getSignature());
		
		long start = System.currentTimeMillis();
		Result result = (Result)jp.proceed();
		long end = System.currentTimeMillis();
		
		System.out.println("경과시간: " + (end - start));
		
		result.setResult(result.getResult() + "(clock)");
		return result;
	}
}
