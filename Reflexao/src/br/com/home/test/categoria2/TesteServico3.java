package br.com.home.test.categoria2;

import br.com.home.passos.Passo1Impl;
import br.com.home.passos.Passo3Impl;
import br.com.home.passos.Passo4Impl;
import br.com.home.tests.TestBase;
import br.com.home.util.CasoDeTeste;

@CasoDeTeste(id = "CT-03", descricao = "Caso de Teste 03", passos = { Passo1Impl.class, Passo3Impl.class,
		Passo4Impl.class })
public class TesteServico3 extends TestBase {

	public TesteServico3() {

		super(TesteServico3.class);

	}

}
