package spring.core.ch01.ex01;

public class Shooter {
	private Gun gun;
	
	public Shooter(Gun gun) {
		this.gun = gun;
	} // DI, 디펜던시 인덱션, 생성자와 세터를 이용한다.
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void fire() {
		gun.fire();
	}
}
