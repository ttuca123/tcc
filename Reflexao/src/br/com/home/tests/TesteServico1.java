package br.com.home.tests;

import br.com.home.passos.Passo1;
import br.com.home.passos.Passo2;
import br.com.home.util.CasoDeTeste;

@CasoDeTeste(id = "CT-01", descricao = "Caso de Teste 01", passos = { Passo1.class, Passo2.class })
public class TesteServico1 extends TestBase {

	public TesteServico1() {

		super(TesteServico1.class);

	}

}
