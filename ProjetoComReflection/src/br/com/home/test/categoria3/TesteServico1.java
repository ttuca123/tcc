package br.com.home.test.categoria3;

import br.com.home.passos.Passo1Impl;
import br.com.home.passos.Passo2Impl;
import br.com.home.tests.Base;
import br.com.home.util.CasoDeTeste;

@CasoDeTeste(id = "CT-01", descricao = "Caso de Teste 01", 
passos = { Passo1Impl.class, Passo2Impl.class })
public class TesteServico1 extends Base {

	public TesteServico1() {

		super(TesteServico1.class);

	}

}
