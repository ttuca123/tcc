package br.com.home.test.categoria1;

import org.junit.Before;
import org.junit.Test;

import br.com.home.configuracao.Servico;
import br.com.home.passos.Passo1Impl;
import br.com.home.passos.Passo2Impl;

public class TesteServico1 {

	Servico servico;

	@Before
	public void beforeClass() {
		servico = new Servico();
		servico.setId("CT-01");
		servico.setDescricao("Caso de Teste 01");

	}

	@Test
	public void executar() {

		Passo1Impl passo1 = new Passo1Impl();

		servico = passo1.iniciarNavegacao(servico);

		passo1.finalizarNavegacao(servico);

		Passo2Impl passo2 = new Passo2Impl();

		passo2.iniciarNavegacao(servico);

		passo2.finalizarNavegacao(servico);
	}

}
