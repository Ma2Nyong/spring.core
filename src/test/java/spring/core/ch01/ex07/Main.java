package spring.core.ch01.ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		// singleton 일 경우 beanID 가 아닌 Type으로 검색한다.
		Lion lion = ctx.getBean(Lion.class);
		lion.shout();
		
		ctx.close();
	}
}
