package br.com.home.configuracao;

import br.com.home.passos.Passos;
import br.com.home.util.CasoDeTeste;

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

	public void executarTeste(Servico servico) throws InstantiationException, IllegalAccessException {

		if (clazze != null && clazze.isAnnotationPresent(CasoDeTeste.class)) {

			CasoDeTeste cr = clazze.getAnnotation(CasoDeTeste.class);

			Class<? extends Passos>[] clazzes = cr.passos();

			for (Class<? extends Passos> clazze : clazzes) {

				Passos rv = clazze.newInstance();
				rv.realizarNavegacao(servico);

				rv.realizarValidacao(servico);
			}

		}

	}

}
