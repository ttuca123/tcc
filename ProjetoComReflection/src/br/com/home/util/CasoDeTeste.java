package br.com.home.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import br.com.home.passos.Passos;

/**
 * 
 * @author Artur
 * Data 04/03/2017
 * 
 * Interface responsável pelo mapeamento da configuração do teste.
 *
 */


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CasoDeTeste {
	

	double salarioBruto() default 0.0;
	
	int numeroDependente() default 0;

	double outros() default 0.0;

	Class<? extends Passos>[] passos();

}
