package br.com.home.passos;

import br.com.home.configuracao.Servico;

public class Passo2Impl implements Passo {

	public Servico iniciarNavegacao(Servico servico) {

		System.out.println("Iniciar navega��o pela p�gina 2 com servico " + servico.getDescricao());

		return servico;
	}

	@Override
	public Servico finalizarNavegacao(Servico servico) {

		System.out.println("Finalizar navega��o pela p�gina 2 com servico " + servico.getDescricao());

		servico.setGravaAtributoY(true);

		return servico;

	}
}
