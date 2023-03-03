package spring.core.ch01.ex05;

import org.springframework.stereotype.Component;

@Component //("rifleGun") // value값을 직접적으면 bean id를 지정할수있다.
public class Rifle implements Gun {
	@Override
	public void fire() {
		System.out.println("소총 탕탕.");
	}
}
