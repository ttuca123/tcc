package br.com.home.configuracao;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import br.com.home.passos.Passos;
import br.com.home.util.CasoDeTeste;

public class Servico {

	private String id;

	private String descricao;

	private boolean isServicoUnico;


	public Servico() {

	}
	

	public Servico(String id, String descricao, boolean isServicoUnico) {

		this.id = id;
		this.descricao = descricao;
		this.isServicoUnico = isServicoUnico;
	}

	

	

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isServicoUnico() {
		return isServicoUnico;
	}

	public void setServicoUnico(boolean isServicoUnico) {
		this.isServicoUnico = isServicoUnico;
	}

}
