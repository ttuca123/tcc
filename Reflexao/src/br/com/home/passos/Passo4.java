package br.com.home.passos;

import br.com.home.configuracao.Servico;

public class Passo4 implements Passos {

	public void realizarNavegacao(Servico servico) {

		System.out.println("navegar pela página 4 com servico " + servico.getDescricao());

	}

	@Override
	public void realizarValidacao(Servico servico) {

		System.out.println("realizar validação da página 4 com servico " + servico.getDescricao());

	}
}
