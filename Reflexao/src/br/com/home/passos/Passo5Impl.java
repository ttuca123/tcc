package br.com.home.passos;

import br.com.home.configuracao.Servico;

public class Passo5Impl implements Passos {

	public Servico iniciarNavegacao(Servico servico) {

		System.out.println("Iniciar navega��o pela p�gina 5 com servico " + servico.getDescricao());
		
		servico.setGravaAtributoY(true);
		servico.setGravaAtributoX(true);
		
		return servico;

	}

	@Override
	public Servico finalizarNavegacao(Servico servico) {

		System.out.println("Finalizar navega��o pela p�gina 5 com servico " + servico.getDescricao());

		
		return servico;
	}

}
