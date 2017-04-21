package br.com.home.configuracao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Artur Data 04/03/2017
 * 
 *         Classe responsável pela generalização da execução dos testes
 *
 */

public class Base {

	private Class<?> clazze;

	private Salario servico;

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

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@After
	public void after() {
		DriverUtil.getDriver().quit();
	}

}
