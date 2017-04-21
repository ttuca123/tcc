package br.com.home.passos;

import org.openqa.selenium.By;

import br.com.home.configuracao.DriverUtil;
import br.com.home.configuracao.Util;

public class PassoIRRF {

	
	public static boolean verificarImpostoRenda(Double salarioBruto){
		
		if ( salarioBruto < 1903.98){
			
			return Util.converterFormatoRealDouble(DriverUtil.getDriver()
					.findElement(By.xpath(".//*[@id='calculator-result']/div[3]/table/tbody/tr[3]/td[4]"))
					.getText()).equals(salarioBruto*0.0)?true:false;
		}
		
		return false;	
		
	}
}
