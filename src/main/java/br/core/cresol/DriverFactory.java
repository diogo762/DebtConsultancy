package br.core.cresol;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Classe de inicizalização e finalização do navegador
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class DriverFactory {

	private static WebDriver driver;

	private DriverFactory() {
	}

	public static WebDriver getDriver() {
		
		 FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--headless");  //Testar sem abrir o navegador (Precisar passar options como argumento no driver)  
		if (driver == null) {
			driver = new FirefoxDriver(options);
			driver.manage().window().setSize(new Dimension(1200, 765));
		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
