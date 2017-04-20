package br.com.home.configuracao;


/**
 * @author Artur
 *
 */

public class Salario {

	private Double salarioBruto;

	private Integer dependente;

	private Double outros;
	
	private String resultadoEsperado;

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Integer getDependentes() {
		return dependente;
	}

	public void setDependentes(Integer dependentes) {
		this.dependente = dependentes;
	}

	public Double getOutros() {
		return outros;
	}

	public void setOutros(Double outros) {
		this.outros = outros;
	}

	public String getResultadoEsperado() {
		return resultadoEsperado;
	}

	public void setResultadoEsperado(String resultadoEsperado) {
		this.resultadoEsperado = resultadoEsperado;
	}
	
	
}
