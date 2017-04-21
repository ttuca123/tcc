package br.com.home.configuracao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtil {
	
	private static WebDriver driver;
	
	public static WebDriver getDriver(){
		
		try {
			if(driver==null){
				
				System.setProperty("webdriver.gecko.driver", "D:/gecko/geckodriver.exe");				 
				
				driver = new FirefoxDriver();			
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
	
}
