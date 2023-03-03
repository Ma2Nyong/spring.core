package spring.core.ch01.ex06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // 타겟은 ..?
@Retention(RetentionPolicy.RUNTIME) // 객체에서도 작동하게한다.
public @interface NoComponent {

} // annotation 을 직접 만든다
