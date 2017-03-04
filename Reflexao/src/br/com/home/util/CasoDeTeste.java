package br.com.home.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import br.com.home.passos.Passos;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CasoDeTeste {
	String id() default "";

	String descricao() default "";
	
	boolean isServicoUnico() default true;
	
	Class<? extends Passos>[] passos();

	

//	PassosTeste passos();

}
