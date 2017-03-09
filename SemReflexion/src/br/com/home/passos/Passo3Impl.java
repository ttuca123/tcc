package br.com.home.passos;

import br.com.home.configuracao.Servico;

public class Passo3Impl implements Passos {
	
	
	
	public Servico iniciarNavegacao(Servico servico){
		
		System.out.println("Iniciar navegação pela página 3 com servico "+servico.getDescricao());
		
		servico.setGravaAtributoX(true);
		
		return servico;
		
		
	}
	
	@Override
	public Servico finalizarNavegacao(Servico servico) {

		System.out.println("Finalizar navegação pela página 3 com servico " + servico.getDescricao());

		
		return servico;
	}

	
}
