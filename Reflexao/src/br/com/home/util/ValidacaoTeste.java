package br.com.home.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidacaoTeste
{
	boolean verificacao1() default false;
	
	boolean verificacao2() default false;
	
	boolean verificacao3() default false;
	
	boolean verificacao4() default false;
	
	boolean verificacao5() default false;
	
	boolean verificacao6() default false;

	

}
