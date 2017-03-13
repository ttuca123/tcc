package br.com.home.passos;

import br.com.home.configuracao.Servico;

public class PassoContext {

	private Passo strategy;

	public PassoContext(Passo strategy) {

		this.strategy = strategy;
	}

	public Servico iniciar(Servico servico) {

		return strategy.iniciarNavegacao(servico);
	}

	public Servico finalizar(Servico servico) {

		return strategy.finalizarNavegacao(servico);
	}

}
