package br.com.home.passos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.home.configuracao.DriverUtil;
import br.com.home.configuracao.Salario;

public class TelaInicial implements Passos {

	public Salario executar(Salario salario) {

		DriverUtil.getDriver().get("http://www.calculador.com.br/calculo/salario-liquido");
		
		DriverUtil.getDriver().findElement(By.id("Entrada_SalarioBruto")).clear();
		
		DriverUtil.getDriver().findElement(By.id("Entrada_SalarioBruto")).sendKeys(Keys.BACK_SPACE+salario.getSalarioBruto().toString());
		
		DriverUtil.getDriver().findElement(By.id("Entrada_NumDependentes")).clear();		
		
		DriverUtil.getDriver().findElement(By.id("Entrada_NumDependentes")).sendKeys(salario.getDependentes().toString());
		
		DriverUtil.getDriver().findElement(By.id("Entrada_OutrosDescontos")).clear();
		
		DriverUtil.getDriver().findElement(By.id("Entrada_OutrosDescontos")).sendKeys(salario.getOutros().toString());
		
		DriverUtil.getDriver().findElement(By.id("Calcular")).click();		
		
		
		new WebDriverWait(DriverUtil.getDriver(), 5).until(ExpectedConditions.presenceOfElementLocated(By.id("resultado")));
		
		return salario;

	}

	

}
