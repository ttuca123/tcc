package br.com.home.passos;

import br.com.home.configuracao.Servico;

public class Passo3 implements Passos {
	
	
	
	public void realizarNavegacao(Servico servico){
		
		System.out.println("navegar pela p�gina 3 com servico "+servico.getDescricao());
		
		
	}

	@Override
	public void realizarValidacao(Servico servico) {
		
		System.out.println("realizar valida��o da p�gina 3 com servico " + servico.getDescricao());
		
	}
}
