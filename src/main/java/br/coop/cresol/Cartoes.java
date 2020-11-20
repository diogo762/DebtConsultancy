package br.coop.cresol;

import org.junit.Test;

import br.core.cresol.BaseTest;
import br.pages.cresol.CartoesPage;

public class Cartoes extends BaseTest {
	
	/**
	 * Metodos com o front end para validar a tela Cartoes
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */


	private CartoesPage Page;

	@Test
	public void CancelarCartao() {

		Page = new CartoesPage();
		Page.EntrarMenuLateral();
		Page.ClicarProdutos();
		Page.ClicarCartoes();
		Page.ClicarManterCartoes();
		Page.EntrarTelaManterCartoes();
		Page.SelecionarSituacao();
		Page.ClicarPesquisar();
		Page.ClicarCancelar();
		Page.ClicarSim();
		Page.VerificarMensagemDeCancelamento();

	}

}
