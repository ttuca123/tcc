package br.com.home.configuracao;

import br.com.home.exception.Excecao1;
import br.com.home.exception.Excecao2;
import br.com.home.exception.Excecao3;
import br.com.home.exception.Excecao4;
import br.com.home.exception.Excecao5;
import br.com.home.passos.Passos;
import br.com.home.util.CasoDeTeste;

/**
 * 
 * @author Artur Data 04/03/2017
 * 
 *         Classe criada com a finalidade de gerenciar a montagem e execução das
 *         classes que utilizam Reflexion e Annotations para testes.
 */

public class Reflexion {

	private Class<?> clazze;

	public Salario configurar(Class<?> clazze) {

		this.clazze = clazze;

		Salario salario = new Salario();

		CasoDeTeste casoTeste = clazze.getDeclaredAnnotation(CasoDeTeste.class);

		salario.setSalarioBruto(casoTeste.salarioBruto());
		
		salario.setOutros(casoTeste.outros());
		
		salario.setDependentes(casoTeste.numeroDependente());		
		
		return salario;

	}

	@SuppressWarnings("rawtypes")
	public void executar(Salario servico) throws InstantiationException, IllegalAccessException
			 {

		if (clazze != null && clazze.isAnnotationPresent(CasoDeTeste.class)) {

			CasoDeTeste cr = clazze.getAnnotation(CasoDeTeste.class);

			Class<? extends Passos>[] clazzes = cr.passos();

			for (Class<? extends Passos> clazze : clazzes) {

				Passos passo = clazze.newInstance();
				servico = passo.executar(servico);
				
			}

		}

	}

}
