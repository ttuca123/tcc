package br.com.home.passos;

import br.com.home.configuracao.Servico;

public class Passo1Impl implements Passo {

	public Servico iniciarNavegacao(Servico servico) {

		System.out.println("Iniciar navegar pela p�gina 1 com servico " + servico.getDescricao());

		servico.setGravaAtributoY(true);

		return servico;

	}

	@Override
	public Servico finalizarNavegacao(Servico servico) {

		System.out.println("Finalizar navega��o pela p�gina 1 com servico " + servico.getDescricao());

		servico.setGravaAtributoX(true);

		return servico;
	}

}
