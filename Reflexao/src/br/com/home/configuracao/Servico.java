package br.com.home.configuracao;


/**
 * @author Artur
 * 
 * Classe que será configurada para execução do serviço
 *
 */

public class Servico {

	private String id;

	private String descricao;

	private boolean isServicoUnico;

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
