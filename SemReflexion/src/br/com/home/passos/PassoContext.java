package br.com.home.passos;

import br.com.home.configuracao.Servico;
import br.com.home.exception.Excecao1;
import br.com.home.exception.Excecao2;
import br.com.home.exception.Excecao3;
import br.com.home.exception.Excecao4;
import br.com.home.exception.Excecao5;

public class PassoContext {

	private Passo strategy;

	public PassoContext(Passo strategy) {

		this.strategy = strategy;
	}

	public Servico iniciar(Servico servico) throws Excecao1, Excecao2, Excecao3, Excecao4, Excecao5 {

		return strategy.iniciarNavegacao(servico);
	}

	public Servico finalizar(Servico servico) throws Excecao1, Excecao2, Excecao3, Excecao4, Excecao5 {

		return strategy.finalizarNavegacao(servico);
	}

}
