package br.com.home.passos;

import br.com.home.configuracao.Servico;

public interface Passo {

	public Servico iniciarNavegacao(Servico servico);

	public Servico finalizarNavegacao(Servico servico);

}
