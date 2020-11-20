package br.pages.cresol;

import static br.core.cresol.DriverFactory.getDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.core.cresol.BasePage;

public class ParametrosPage extends BasePage {
	
	/**
	 * Metodos com o back end para validar a tela Parametros
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */


	public void EntrarMenuLAteral() {

		dsl.entrarMenuLateral();

	}

	public void ClicarParametrosEIndexadores() {

		//dsl.clicar("webfx-tree-object-439-anchor"); //local
		//dsl.clicar("webfx-tree-object-444-anchor"); //local
		//dsl.clicar("webfx-tree-object-445-anchor"); //local
		
		 dsl.clicarcss("#dsubmenu30 > .dTreeNode:nth-child(1) > .node");
		 dsl.clicarLink("Cooperativa");
		 dsl.clicarLink("Configurar");
		// dsl.clicar("ssubmenu39");

	}

	public void EntrarParametros() {

		dsl.entrarModulo();

	}

	public void NumeroCooperativa(String coop) {

		dsl.escrever("codigoCooperativa", coop);
		dsl.clicarcss(".imgBotaoPesquisa:nth-child(4)");

	}

	public void SimEfetuarConsulta() {

		dsl.selecionarComboname("codigoEfetuarSimNaoConsultasBoaVista", "NÃO");
		dsl.selecionarComboname("codigoEfetuarSimNaoConsultasBoaVista", "SIM");

	}

	public void PreencherCodigoCliente(String codigocliente) {
		dsl.limparCampoByName("codigoClienteBoaVista");
		dsl.escreverbyname("codigoClienteBoaVista", codigocliente);

	}

	public void ValidarCriptografiaEDescriptografiaDaSenha(String password2) throws SQLException {

		String query = "select * from tb_gcc_parametro_cc_cooperativa where ccc_cod_cooperativa = 1075";
		ResultSet rs = con.executaBusca(query);

		try {

			while (rs.next()) {
				String senha = rs.getString("ccc_senha_cliente_boa_vista");
				String documento = senha;
				String passw = password2;

				String criptografado = Base64.getEncoder().encodeToString(passw.getBytes());

				dsl.verificarString(documento, criptografado);
				System.out.println(criptografado);
				System.out.println(documento);

				byte[] decodificadobase = Base64.getDecoder().decode(documento);
				byte[] decodificadocolmeia = Base64.getDecoder().decode(criptografado);

				String senhabase = new String(decodificadobase);
				String senhacolmeia = new String(decodificadocolmeia);

				dsl.verificarString(senhabase, senhacolmeia);
				System.out.println(senhabase);
				System.out.println(senhacolmeia);

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Parametros/Efetuar_consulta_sim_criptografia_E_Descriptografia.txt"));
					System.setOut(log2);
					log2.print(documento + "--" + "Valor da Base criptografado\n");
					log2.print(criptografado + "--" + "Valor colmeia criptografado\n");
					log2.print("-----------------------------------------------------\n");
					log2.print(senhabase + "--" + "Valor da Base descriptografado\n");
					log2.print(senhacolmeia + "--" + "Valor colmeia descriptografado\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			// e.printStackTrace();
		}

	}

	public void ValidadeConsulta(String dias) {

		dsl.limparCampoByName("diasValidadeConsultaBoaVista");

		dsl.escreverbyname("diasValidadeConsultaBoaVista", dias);

	}

	public void ValorMaximoConsulta(String valor) {
		dsl.limparCampoByName("valorMaximoEmprestimoBoaVista");
		dsl.escreverbyname("valorMaximoEmprestimoBoaVista", valor);

	}

	public void PreencherSenha(String password) {

		dsl.limparCampoByName("senhaClienteBoaVista");
		dsl.escreverbyname("senhaClienteBoaVista", password);

	}

	public void ClicarConfirmar() {

		dsl.clicar("Confirmar");

	}

	public void VerificarMensagemDeSucesso() {

		dsl.sairFrame();
		dsl.entrarFrameindex(0);
		dsl.clicar("dvBg");
		dsl.sairFrame();
		dsl.entrarFrameindex(2);
		dsl.entrarFrameindex(0);
		dsl.entrarFrameindex(0);
		WebElement msg5 = getDriver().findElement(By.id("tbMsg"));
		String mensagem = msg5.getText();
		dsl.verificarString(" Configuração de Variáveis da Cooperativa Alterado(a)(s) com sucesso.", mensagem);

	}

	public void VerificarMensagemCamposObrigatorios() throws InterruptedException{
		Thread.sleep(5000);
		dsl.sairFrame();
		dsl.entrarFrameindex(0);
		dsl.clicar("dvBg");
		dsl.sairFrame();
		dsl.entrarFrameindex(2);
		dsl.entrarFrameindex(0);
		dsl.entrarFrameindex(0);
		WebElement msg5 = getDriver().findElement(By.id("tbMsg"));
		String mensagem = msg5.getText();
		dsl.verificarString(" O(s) campo(s) abaixo deve(m) ser preenchido(s):\n"+
" Código Cliente Boa Vista\n"+
" Senha Cliente Boa Vista\n"+
" Dias Validade Consulta Boa Vista\n"+
" Valor Maximo Consulta Boa Vista.", mensagem);
		
		
		
	}

	public void PrintMensagem(String pasta) throws IOException, InterruptedException {

		dsl.print(pasta);

	}

	public void TratarErro(String caminho, Throwable erro) {

		try {

			PrintStream log2 = new PrintStream(new File(caminho));
			System.setOut(log2);
			log2.print(erro + "--" + "Occoreu um erro nesse cenario verifique o log\n");

		} catch (FileNotFoundException fx) {

			System.out.println(fx);

		}

	}

	public void ValidarNaoDefault() {

		dsl.obterValorCombo("codigoEfetuarSimNaoConsultasBoaVista", "NÃO");

	}

}
