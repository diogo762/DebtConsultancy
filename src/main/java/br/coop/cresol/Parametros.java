package br.coop.cresol;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Test;

import br.core.cresol.BaseTest;
import br.pages.cresol.ParametrosPage;

public class Parametros extends BaseTest {

	/**
	 * Metodos com o front end para validar a tela Parametros
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	private ParametrosPage Page;

	@Test
	public void EfetuarConsultaBoaVistaSim() throws IOException, InterruptedException, SQLException {
		try {
			Page = new ParametrosPage();
			Page.EntrarMenuLAteral();
			Page.ClicarParametrosEIndexadores();
			Page.EntrarParametros();
			Page.NumeroCooperativa("1075");
			Page.SimEfetuarConsulta();
			Page.PreencherCodigoCliente("88888");
			Page.ValidadeConsulta("120");
			Page.ValorMaximoConsulta("1000000000");
			Page.PreencherSenha("CRESSOL");
			Page.ClicarConfirmar();
			Page.ValidarCriptografiaEDescriptografiaDaSenha("CRESSOL");
			Page.VerificarMensagemDeSucesso();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Efetuar_Consulta_Boa_vista_sim.png");

		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Efetuar_Consulta_Boa_vista_sim.txt",
					a);

			throw a;

		}

	}

	@Test
	public void EfetuarConsultaBoaVistaNaoDefault() {

		try {
			Page = new ParametrosPage();
			Page.EntrarMenuLAteral();
			Page.ClicarParametrosEIndexadores();
			Page.EntrarParametros();
			Page.NumeroCooperativa("1078");
			Page.ValidarNaoDefault();
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Efetuar_Consulta_Boa_vista_nao_default.txt",
					a);

			throw a;

		}

	}

	@Test
	public void ValidarCamposObrigatorios() throws IOException, InterruptedException {

		try {
			Page = new ParametrosPage();
			Page.EntrarMenuLAteral();
			Page.ClicarParametrosEIndexadores();
			Page.EntrarParametros();
			//Page.NumeroCooperativa("1078");//Contexto paralelo Cresol
			Page.NumeroCooperativa("1008");
			Page.SimEfetuarConsulta();
			Page.ClicarConfirmar();
			Page.VerificarMensagemCamposObrigatorios();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Efetuar_Consulta_Boa_vista_parametros_campos_obrigatorios.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Efetuar_Consulta_Boa_vista_parametros_campos_obrigatorios.txt",
					a);

			throw a;

		}

	}

}
