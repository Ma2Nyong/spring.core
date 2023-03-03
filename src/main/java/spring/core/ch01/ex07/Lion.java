package spring.core.ch01.ex07;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Lion implements InitializingBean, DisposableBean{
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("lion is born.");
	} // lion bean이 태어났다를 알 수 있다.
	
	public void shout() {
		System.out.println("lion shout.");
	} // 일하는것을 shout으로 표현.
	
	@Override
	public void destroy() throws Exception {
		System.out.println("lion is dead.");
	} // 죽기 직전에 호출될 것이다.
}
