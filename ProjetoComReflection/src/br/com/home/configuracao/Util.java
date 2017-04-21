package br.com.home.configuracao;

public class Util {

	
	
	public static Double converterFormatoRealDouble(String valor)
	{

		return Double.parseDouble(valor.replaceAll("\\.", "").replace(",", ".")
				.replace("R$", ""));

	}
}
