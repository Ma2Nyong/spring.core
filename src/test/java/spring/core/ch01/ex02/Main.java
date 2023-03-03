package spring.core.ch01.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) { // IOC
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml", Main.class);
		// container은 Object type으로 가지고 있기에 Shooter 타입으로 달라고 지정해야한다.
		Shooter shooter1 = ctx.getBean("shooter1", Shooter.class);
		Shooter shooter2 = ctx.getBean("shooter2", Shooter.class);
		
		shooter1.fire();
		shooter2.fire();
	}
}
