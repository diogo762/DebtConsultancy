package br.coop.cresol;

import org.junit.Test;

import br.core.cresol.BaseTest;
import br.pages.cresol.LoginPage;

public class Login extends BaseTest {

	LoginPage Page;

	@Test
	public void login() throws InterruptedException {

		Page.inicio();
		Page.usuario("VICTOR");
		Page.clicarunidade();
		Page.numerodacooperativa("1075");
		Page.selecionarcooperativa("001075 - CRESOL VALE EUROPEU");
		Page.senha("ferroada");
		Page.clicarconfirmar();
		Page.depois();

	}

}
