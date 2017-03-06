package br.com.home.passos;

import br.com.home.configuracao.Servico;

public class Passo1Impl implements Passos {

	@Override
	public void iniciarNavegacao(Servico servico) {

		System.out.println("Iniciar navegar pela página 1 com servico "
				+ servico.getDescricao());

	}

	@Override
	public void finalizarNavegacao(Servico servico) {

		System.out.println("Finalizar navegação pela página 1 com servico "
				+ servico.getDescricao());

	}

}
