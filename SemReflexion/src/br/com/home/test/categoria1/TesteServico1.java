package br.com.home.test.categoria1;

import org.junit.Before;
import org.junit.Test;

import br.com.home.configuracao.Base;
import br.com.home.configuracao.Servico;
import br.com.home.exception.Excecao1;
import br.com.home.exception.Excecao2;
import br.com.home.exception.Excecao3;
import br.com.home.exception.Excecao4;
import br.com.home.exception.Excecao5;
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

		
			try {
				passoContext = new PassoContext(new Passo1Impl());

				servico = passoContext.iniciar(servico);

				servico = passoContext.finalizar(servico);

				passoContext = new PassoContext(new Passo2Impl());

				servico = passoContext.iniciar(servico);

				servico = passoContext.finalizar(servico);
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

}
