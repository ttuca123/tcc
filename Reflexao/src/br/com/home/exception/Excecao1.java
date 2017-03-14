package br.com.home.exception;

public class Excecao1 extends Exception {

	private static final long serialVersionUID = 1L;

	public Excecao1(String casoTeste)
	{
		super("Exceção ocorrida para o caso de Teste "
				.concat(casoTeste));
	}

	private EnumTipoErro tipoErro = EnumTipoErro.TIPO_ERRO_1;

	public EnumTipoErro getErro()
	{

		return tipoErro;
	}
	
}
