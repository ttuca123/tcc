package br.com.home.exception;

public class Excecao2 extends Exception {

	private static final long serialVersionUID = 1L;

	public Excecao2(String casoTeste)
	{
		super("Exceção ocorrida para o caso de Teste "
				.concat(casoTeste));
	}

	private EnumTipoErro tipoErro = EnumTipoErro.TIPO_ERRO_2;

	public EnumTipoErro getErro()
	{

		return tipoErro;
	}
	
}
