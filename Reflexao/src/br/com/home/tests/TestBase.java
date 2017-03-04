package br.com.home.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.home.configuracao.Reflexion;
import br.com.home.configuracao.Servico;

public class TestBase {

	private Class<?> clazze;

	private Servico servico;

	private Reflexion reflexion;

	public TestBase(Class<?> clazze) {
		this.clazze = clazze;

	}

	@Before
	public void beforeClass() {
		reflexion = new Reflexion();
		servico = reflexion.configurar(clazze);
	}

	@Test
	public void executar() {

		try {
			reflexion.executarTeste(servico);

		} catch (InstantiationException e) {
			e.printStackTrace();

		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@After
	public void after() {
		System.out.println("/*********Finalização do Teste*********/");
	}

}
