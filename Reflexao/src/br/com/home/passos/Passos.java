package br.com.home.passos;

import br.com.home.configuracao.Servico;
import br.com.home.util.ValidacaoTeste;

public interface Passos {

	public Servico iniciarNavegacao(Servico servico);
	
	public Servico finalizarNavegacao(Servico servico);

}
