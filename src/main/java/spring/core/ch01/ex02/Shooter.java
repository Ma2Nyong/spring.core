package spring.core.ch01.ex02;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import spring.core.ch01.ex01.Gun;

@Setter //setter 생성.
@NoArgsConstructor //compile 후 생성자를 추가시킨다.
@AllArgsConstructor // 모든 디펜던시들을 ?
public class Shooter {
	private String shooterName;
	private Gun gun;
	
	public void fire() {
		System.out.print(shooterName + ": ");
		gun.fire();
	}
}
// 현재는 DI를 연습하고 있다.