package br.com.home.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PassosTeste
{
	boolean passo1() default true;
	
	boolean passo2() default false;
	
	boolean passo3() default false;
	
	boolean passo4() default true;
	
	boolean passo5() default false;
	
	boolean passo6() default false;

	

}
