package br.com.home.passos;

import br.com.home.configuracao.Servico;

public class Passo1Impl implements Passos {

	public void iniciarNavegacao(Servico servico) {

		System.out.println("Iniciar navegar pela p�gina 1 com servico " + servico.getDescricao());

	}

	@Override
	public void finalizarNavegacao(Servico servico) {

		System.out.println("Finalizar navega��o pela p�gina 1 com servico " + servico.getDescricao());

	}

}
