package spring.core.ch01.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	@Autowired @Nullable private Gun pistol; // 평소에는 singleton 으로 작업을 하기 때문에 변수명을 아무거나 적어도 상관없다.
	@Autowired @Nullable private Gun rifle;
	
	public void fire() {
		try {
			pistol.fire();
			rifle.fire();
		} catch(NullPointerException e) {}
	}
} 
