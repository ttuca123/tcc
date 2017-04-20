package br.com.home.test.salario;

import br.com.home.passos.TelaINSS;
import br.com.home.passos.TelaImpostoRenda;
import br.com.home.passos.TelaInicial;
import br.com.home.tests.Base;
import br.com.home.util.CasoDeTeste;

@CasoDeTeste(salarioBruto = 1000.00, numeroDependente = 0, outros = 0.0,
passos = {TelaInicial.class, TelaImpostoRenda.class, TelaINSS.class})
public class CalculoSalarioSemImposto extends Base{

	public CalculoSalarioSemImposto() {
		super(CalculoSalarioSemImposto.class);
		// TODO Auto-generated constructor stub
	}
	
	
}
