package br.com.home.exception;

public class Excecao4 extends Exception {

	private static final long serialVersionUID = 1L;

	public Excecao4(String casoTeste)
	{
		super("Exceção ocorrida para o caso de Teste "
				.concat(casoTeste));
	}

	private EnumTipoErro tipoErro = EnumTipoErro.TIPO_ERRO_4;

	public EnumTipoErro getErro()
	{

		return tipoErro;
	}
	
}
