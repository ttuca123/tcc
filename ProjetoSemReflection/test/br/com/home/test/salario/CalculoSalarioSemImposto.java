package br.com.home.test.salario;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.home.configuracao.DriverUtil;
import br.com.home.configuracao.Salario;
import br.com.home.passos.PassoINSS;
import br.com.home.passos.PassoIRRF;
import junit.framework.Assert;

public class CalculoSalarioSemImposto {

	private static final Double SALARIO_BRUTO = 1000.00;

	private static final Integer DEPENDENTE = 0;

	private static final Double OUTROS_DESCONTOS = 0.00;

	@Before
	public void before() {
		DriverUtil.getDriver().get("http://www.calculador.com.br/calculo/salario-liquido");

	}

	@Test
	public void test() {

		Salario salario = new Salario(SALARIO_BRUTO, DEPENDENTE, OUTROS_DESCONTOS);

		DriverUtil.getDriver().findElement(By.id("Entrada_SalarioBruto")).clear();

		DriverUtil.getDriver().findElement(By.id("Entrada_SalarioBruto"))
				.sendKeys(Keys.BACK_SPACE + salario.getSalarioBruto().toString());

		DriverUtil.getDriver().findElement(By.id("Entrada_NumDependentes")).clear();

		DriverUtil.getDriver().findElement(By.id("Entrada_NumDependentes"))
				.sendKeys(salario.getDependentes().toString());

		DriverUtil.getDriver().findElement(By.id("Entrada_OutrosDescontos")).clear();

		DriverUtil.getDriver().findElement(By.id("Entrada_OutrosDescontos")).sendKeys(salario.getOutros().toString());

		DriverUtil.getDriver().findElement(By.id("Calcular")).click();

		new WebDriverWait(DriverUtil.getDriver(), 7)
				.until(ExpectedConditions.presenceOfElementLocated(By.id("resultado")));

		Assert.assertTrue("Imposto de Renda Calculado", PassoIRRF.verificarImpostoRenda(salario.getSalarioBruto()));

		Assert.assertTrue("INSS Calculado", PassoINSS.verificarINSS(salario.getSalarioBruto()));

	}

	@After
	public void after() {
		
		DriverUtil.getDriver().quit();

	}

}
