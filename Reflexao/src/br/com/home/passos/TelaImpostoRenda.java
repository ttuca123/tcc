package br.com.home.passos;

import org.openqa.selenium.By;

import br.com.home.configuracao.DriverUtil;
import br.com.home.configuracao.Salario;
import br.com.home.configuracao.Util;
import junit.framework.Assert;

public class TelaImpostoRenda implements Passos {

	public Salario executar(Salario salario) {

		boolean condicao = false;
		
		if ( Util.converterFormatoRealDouble(DriverUtil.getDriver()
				.findElement(By.xpath(".//*[@id='calculator-result']/div[3]/table/tbody/tr[1]/td[3]"))
				.getText()) < 1903.98){
			
			condicao = verificarImposto(salario.getSalarioBruto(), 0.0);		
			
		}	
		
		Assert.assertTrue("Imposto Calculado", condicao);

		return salario;

	}
	
	
	
	
	private boolean verificarImposto(Double salarioBruto, Double percentual){
		
		
		return Util.converterFormatoRealDouble(DriverUtil.getDriver()
		.findElement(By.xpath(".//*[@id='calculator-result']/div[3]/table/tbody/tr[3]/td[4]"))
		.getText()).equals(salarioBruto*percentual)?true:false;
		
	}
	

}
