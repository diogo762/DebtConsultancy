package br.core.cresol;

import static br.core.cresol.DriverFactory.killDriver;

import java.io.IOException;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import br.pages.cresol.LoginPage;

/**
 * Classe com os pr� requisitos para iniciar e finalizar os cen�rios de teste,
 * Essa classe precisa ser extendida por todas as classes que executam os testes
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */



public class BaseTest {

	public WebDriver driver;
	public Map<String, Object> vars;
	JavascriptExecutor js;
	
	protected Dsl dsl;
	LoginPage Page2;
	
	/**
	 * M�todo que realiza o login no colmeia
	 * 
	 * @param usuario                 Login do usu�rio
	 * 
	 * @param numerodacooperativa     N�mero da cooperativa a ser logada
	 * 
	 * @param selecionarcooperativa   Nome da cooperativa a ser logada
	 * 
	 * @param senha                   Senha para a realiza��o do login
	 *            
	 */

	@Before
	public void inicializa() throws InterruptedException, Exception {
		
		Page2 = new LoginPage();
		try {
			
			Page2.inicio();
			Page2.usuario("VICTOR");
			Page2.clicarunidade();
			Page2.numerodacooperativa("90");
			//Page2.selecionarcooperativa("001075 - CRESOL VALE EUROPEU");
			Page2.senha("ferroada");
			Page2.clicarconfirmar();
			Page2.depois();

		} catch (Exception e) {

			Page2.refresh();
			Page2.inicio();
			Page2.usuario("VICTOR");
			Page2.clicarunidade();
			Page2.numerodacooperativa("90");
			//Page2.selecionarcooperativa("001075 - CRESOL VALE EUROPEU");
			Page2.senha("ferroada");
			Page2.clicarconfirmar();
			Page2.depois();
			
			throw e;

		}
	}

	public BaseTest() {
		dsl = new Dsl();
	}
	


	@After
	public void tearDown() throws InterruptedException, IOException {

		killDriver();

	}

}

