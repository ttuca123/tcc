package br.com.home.test.categoria2;

import org.junit.Before;
import org.junit.Test;

import br.com.home.configuracao.Servico;
import br.com.home.passos.Passo1Impl;
import br.com.home.passos.Passo3Impl;
import br.com.home.passos.Passo4Impl;

public class TesteServico3 {

	Servico servico;

	@Before
	public void beforeClass() {
		servico = new Servico();
		servico.setId("CT-03");
		servico.setDescricao("Caso de Teste 03");

	}

	@Test
	public void executar() {

		Passo1Impl passo1 = new Passo1Impl();

		servico = passo1.iniciarNavegacao(servico);

		passo1.finalizarNavegacao(servico);

		Passo3Impl passo3 = new Passo3Impl();

		servico = passo3.iniciarNavegacao(servico);

		passo3.finalizarNavegacao(servico);

		Passo4Impl passo4 = new Passo4Impl();

		passo4.iniciarNavegacao(servico);

		passo4.finalizarNavegacao(servico);
	}

}
