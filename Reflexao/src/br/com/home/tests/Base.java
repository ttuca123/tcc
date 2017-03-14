package br.com.home.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.home.configuracao.Reflexion;
import br.com.home.configuracao.Servico;
import br.com.home.exception.Excecao1;
import br.com.home.exception.Excecao2;
import br.com.home.exception.Excecao3;
import br.com.home.exception.Excecao4;
import br.com.home.exception.Excecao5;

/**
 * 
 * @author Artur Data 04/03/2017
 * 
 *         Classe respons�vel pela generaliza��o da execu��o dos testes
 *
 */

public class Base {

	private Class<?> clazze;

	private Servico servico;

	private Reflexion reflexion;

	public Base(Class<?> clazze) {
		this.clazze = clazze;

	}

	@Before
	public void before() {
		reflexion = new Reflexion();
		servico = reflexion.configurar(clazze);
	}

	@Test
	public void executar() {

		try {
			reflexion.executar(servico);

		} catch (InstantiationException e) {
			e.printStackTrace();

		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Excecao1 ex1) {
			System.out.println("Realizar alguma a��o para a exce��o 1");
		} catch (Excecao2 ex1) {
			System.out.println("Realizar alguma a��o para a exce��o 2");
		} catch (Excecao3 ex1) {
			System.out.println("Realizar alguma a��o para a exce��o 3");
		} catch (Excecao4 ex1) {
			System.out.println("Realizar alguma a��o para a exce��o 4");
		} catch (Excecao5 ex1) {
			System.out.println("Realizar alguma a��o para a exce��o 5");
		}

	}

	@After
	public void after() {
		System.out.println("/*********Finaliza��o do Teste*********/");
	}

}
