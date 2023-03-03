package spring.core.ch01.ex05;

import org.springframework.stereotype.Component;

@Component
public class Pistol implements Gun { //Component 를 쓰면 class이름이 bean의 id가 된다.
	@Override
	public void fire() {
		System.out.println("권총 탕탕.");
	}
}
