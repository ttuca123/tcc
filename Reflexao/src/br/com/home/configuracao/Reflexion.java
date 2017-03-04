package br.com.home.configuracao;

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

	public Servico configurar(Class<?> clazze) {

		this.clazze = clazze;

		Servico servico = new Servico();

		CasoDeTeste casoTeste = clazze.getDeclaredAnnotation(CasoDeTeste.class);

		servico.setId(casoTeste.id());

		servico.setDescricao(casoTeste.descricao());

		servico.setServicoUnico(casoTeste.isServicoUnico());

		return servico;

	}

	@SuppressWarnings("rawtypes")
	public void executar(Servico servico) throws InstantiationException, IllegalAccessException {

		if (clazze != null && clazze.isAnnotationPresent(CasoDeTeste.class)) {

			CasoDeTeste cr = clazze.getAnnotation(CasoDeTeste.class);

			Class<? extends Passos>[] clazzes = cr.passos();

			for (Class<? extends Passos> clazze : clazzes) {

				Passos passo = clazze.newInstance();
				passo.iniciarNavegacao(servico);
				passo.finalizarNavegacao(servico);

			}

		}

	}

}
