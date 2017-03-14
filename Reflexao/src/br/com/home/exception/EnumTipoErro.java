package br.com.home.exception;


public enum EnumTipoErro {

	TIPO_ERRO_1(1, "TIPO DE ERRO 1"),

	TIPO_ERRO_2(2, "TIPO DE ERRO 2"),

	TIPO_ERRO_3(3, "TIPO DE ERRO 3"),

	TIPO_ERRO_4(4, "TIPO DE ERRO 4"),

	TIPO_ERRO_5(5, "TIPO DE ERRO 5");

	private Integer ordinal = 0;

	private final String nomeAmigavel;

	EnumTipoErro(final Integer letra, final String nomeAmigavel) {
		this.ordinal = letra;
		this.nomeAmigavel = nomeAmigavel;
	}

	public Integer getLetra() {

		return ordinal;
	}

	public String getNomeAmigavel() {
		return nomeAmigavel;
	}

	public static EnumTipoErro valueOf(final Integer letra) {
		EnumTipoErro result = null;

		final EnumTipoErro[] values = EnumTipoErro.values();

		for (final EnumTipoErro enuTipoLaudo : values) {
			if (enuTipoLaudo.ordinal.equals(letra)) {
				result = enuTipoLaudo;
				break;
			}
		}
		return result;
	}

	public static EnumTipoErro valueOf(final int ordinal) {
		EnumTipoErro result = null;

		final EnumTipoErro[] values = EnumTipoErro.values();

		for (final EnumTipoErro enuTipoLaudo : values) {
			if (enuTipoLaudo.ordinal() == ordinal) {
				result = enuTipoLaudo;
				break;
			}
		}
		return result;
	}

	public int getOrdinal() {
		return ordinal();
	}

}
