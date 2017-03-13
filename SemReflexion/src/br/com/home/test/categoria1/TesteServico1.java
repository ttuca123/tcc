package br.com.home.test.categoria1;

import org.junit.Before;
import org.junit.Test;

import br.com.home.configuracao.Base;
import br.com.home.configuracao.Servico;
import br.com.home.passos.Passo1Impl;
import br.com.home.passos.Passo2Impl;
import br.com.home.passos.PassoContext;

public class TesteServico1 extends Base {

	@Before
	public void beforeClass() {
		servico = new Servico();
		servico.setId("CT-01");
		servico.setDescricao("Caso de Teste 01");

	}

	@Test
	public void executar() {

		passoContext = new PassoContext(new Passo1Impl());

		servico = passoContext.iniciar(servico);

		servico = passoContext.finalizar(servico);

		passoContext = new PassoContext(new Passo2Impl());

		servico = passoContext.iniciar(servico);

		servico = passoContext.finalizar(servico);
	}

}
