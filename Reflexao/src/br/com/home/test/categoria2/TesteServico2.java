package br.com.home.test.categoria2;

import br.com.home.passos.Passo1Impl;
import br.com.home.passos.Passo2Impl;
import br.com.home.tests.Base;
import br.com.home.util.CasoDeTeste;

@CasoDeTeste(id = "CT-02", descricao = "Caso de Teste 02", 
passos = { Passo1Impl.class, Passo2Impl.class })
public class TesteServico2 extends Base {

	public TesteServico2() {

		super(TesteServico2.class);

	}

}
