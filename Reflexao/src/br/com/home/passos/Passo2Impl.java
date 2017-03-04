package br.com.home.passos;

import br.com.home.configuracao.Servico;

public class Passo2Impl implements Passos {

	public void iniciarNavegacao(Servico servico) {

		System.out.println("Iniciar navega��o pela p�gina 2 com servico " + servico.getDescricao());

	}

	@Override
	public void finalizarNavegacao(Servico servico) {

		System.out.println("Finalizar navega��o pela p�gina 2 com servico " + servico.getDescricao());

	}
}
