package br.com.home.passos;

import br.com.home.configuracao.Servico;
import br.com.home.exception.Excecao1;
import br.com.home.exception.Excecao2;
import br.com.home.exception.Excecao3;
import br.com.home.exception.Excecao4;
import br.com.home.exception.Excecao5;

public interface Passo {

	public Servico iniciarNavegacao(Servico servico) throws Excecao1, Excecao2, Excecao3, Excecao4, Excecao5;

	public Servico finalizarNavegacao(Servico servico) throws Excecao1, Excecao2, Excecao3, Excecao4, Excecao5;

}
