package br.com.home.passos;

import org.openqa.selenium.By;

import br.com.home.configuracao.DriverUtil;
import br.com.home.configuracao.Util;

public class PassoINSS {

	
	public static boolean verificarINSS(Double salarioBruto){		
		
		if ( salarioBruto < 1659.13){
			
			return Util.converterFormatoRealDouble(DriverUtil.getDriver()
					.findElement(By.xpath(".//*[@id='calculator-result']/div[3]/table/tbody/tr[2]/td[4]"))
					.getText()).equals(salarioBruto*0.08)?true:false;
			
		}
		
		return false;
	}
}
