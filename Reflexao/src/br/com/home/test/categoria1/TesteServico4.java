package br.com.home.test.categoria1;

import br.com.home.passos.Passo1Impl;
import br.com.home.passos.Passo2Impl;
import br.com.home.passos.Passo5Impl;
import br.com.home.tests.TestBase;
import br.com.home.util.CasoDeTeste;

@CasoDeTeste(id = "CT-04", descricao = "Caso de Teste 04", passos = { Passo1Impl.class, Passo2Impl.class,
		Passo5Impl.class })
public class TesteServico4 extends TestBase {

	public TesteServico4() {

		super(TesteServico4.class);

	}

}
