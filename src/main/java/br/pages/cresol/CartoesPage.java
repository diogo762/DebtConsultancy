package br.pages.cresol;

import br.core.cresol.BasePage;

public class CartoesPage extends BasePage {
	
	/**
	 * Metodos com o back end para validar a tela Cartoes
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void EntrarMenuLateral() {

		dsl.entrarMenuLateral();

	}

	public void ClicarProdutos() {

		dsl.clicarLink("Produtos");

	}

	public void ClicarCartoes() {

		dsl.clicarLink("Cartões");

	}

	public void ClicarManterCartoes() {

		dsl.clicar("ssubmenu126");

	}

	public void EntrarTelaManterCartoes() {

		dsl.entrarModulo();

	}
	
	public void SelecionarSituacao () {
		
		dsl.selecionarComboname("situacao", "APROVADO" );
		
		
	}

	public void ClicarPesquisar() {

		dsl.clicar("Pesquisar");

	}

	public void ClicarCancelar() {

		dsl.clicarcss("#actionCampoGrid_5_7 .imgGrid");

	}

	public void ClicarSim() {

		dsl.sairFrame();
		dsl.entrarFrameindex(0);
		dsl.clicar("dvBg");
		dsl.sairFrame();
		dsl.entrarFrameindex(2);
		dsl.entrarFrameindex(0);
		dsl.entrarFrameindex(0);
		dsl.clicarcss(".form_botao:nth-child(1)");

	}

	public void VerificarMensagemDeCancelamento() {

		dsl.sairFrame();
		dsl.entrarFrameindex(0);
		dsl.clicar("dvBg");
		dsl.sairFrame();
		dsl.entrarFrameindex(2);
		dsl.entrarFrameindex(0);
		dsl.entrarFrameindex(0);
		dsl.clicar("tbMsg");
		dsl.verificarMensagens(" Cartão Cancelado(s) com sucesso.");

	}

}
