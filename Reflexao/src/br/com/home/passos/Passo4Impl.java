package br.com.home.passos;

import br.com.home.configuracao.Servico;

public class Passo4Impl implements Passos {

	public void iniciarNavegacao(Servico servico) {

		System.out.println("Iniciar navegação pela página 4 com servico " + servico.getDescricao());

	}
	
	@Override
	public void finalizarNavegacao(Servico servico) {

		System.out.println("Finalizar navegação pela página 4 com servico " + servico.getDescricao());

	}

	
}
