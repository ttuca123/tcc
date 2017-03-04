package br.com.home.passos;

import br.com.home.configuracao.Servico;
import br.com.home.util.ValidacaoTeste;

public interface Passos<E extends ValidacaoTeste> {

	public void iniciarNavegacao(Servico servico);
	
	public void finalizarNavegacao(Servico servico);

}
