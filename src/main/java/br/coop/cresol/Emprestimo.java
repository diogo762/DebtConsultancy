package br.coop.cresol;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import org.junit.Ignore;
import org.junit.Test;

import br.core.cresol.BaseTest;
import br.pages.cresol.EmprestimoPage;

public class Emprestimo extends BaseTest {

	/**
	 * Metodos com o front end para validar a tela Emprestimos
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	private EmprestimoPage Page;

	@Test
	public void CancelarEmprestimo() throws InterruptedException {

		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarEmprestimoseFinanciamentos();
		Page.ClicarEmprestimos();
		Page.ClicarManter();
		Page.EntrarTelaEmprestimo();
		Page.PreencherModalidade("2005");
		Page.ClicarPesquisar();
		Page.ClicarEstornarCancelar();
		Page.ClicarSim();
		Page.VerificarMensagemDeCancelamento();

	}

	@Test
	public void IncluirParecer() {
		Page = new EmprestimoPage();
		Page.incluirParecer();

	} 

	/**
	 * Metodos para realizar consulta restritivo externo na tela de duplicatas
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws SQLException
	 */

	@Test
	public void ConsultaDesatualizadaSerasa() throws InterruptedException, IOException, SQLException {
		try {
			Page = new EmprestimoPage();
			Page.ResetarDadosSerasa("01720108960");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500201320190028959");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.VerificarConsultaDesatualizadaPF();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Desatualizada_Serasa.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Desatualizada_Serasa.txt",
					a);

			throw a;

		}
	}

	@Test
	public void ConsultaDesatualizadaBoaVista() throws InterruptedException, IOException, SQLException {
		try {
			Page = new EmprestimoPage();
			Page.RegredirDadosBoaVista("11568088000169");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500107520190188613");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.VerificarConsultaDesatualizadaPJ2();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Desatualizada_Boa_Vista.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Desatualizada_Boa_Vista.txt",
					a);

			throw a;

		}

	}

	@Test
	public void SemRestritivoSerasa() throws InterruptedException, IOException, SQLException {
		try {
			Page = new EmprestimoPage();
			Page.DataAtualSerasaSemRestritivo("05328741021");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500202120190007725");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.VerificarConsultaSemRestritivo();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Sem_Restritivo_Serasa.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Sem_Restritivo_Serasa.txt",
					a);

			throw a;

		}

	}

	@Test
	public void ComRestritivoSerasa() throws InterruptedException, IOException, SQLException {
		try {
			Page = new EmprestimoPage();
			Page.DataAtualSerasaComRestritivo("05328741021");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500202120190007725");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.VerificarAssociadoComRestritivo();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Com_Restritivo_Serasa.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Com_Restritivo_Serasa.txt",
					a);

			throw a;

		}

	}

	@Test
	public void ConfirmarConsultaDesatualizada() throws InterruptedException, IOException, SQLException {
		try {
			Page = new EmprestimoPage();
			Page.ResetarDadosSerasa("64693759015");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500201320190033793");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.ClicarCheck();
			Page.ClicarConfirmar();
			Page.VerificarMensagemDeConsultaDesatualizada();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Mensagem_Consulta_Desatualizada.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Mensagem_Consulta_Desatualizada.txt",
					a);

			throw a;

		}

	}

	@Ignore
	public void ConsultaSerasaPF() throws InterruptedException, SQLException, IOException, Exception {
		try {
			Page = new EmprestimoPage();
			Page.ResetarDadosSerasa("01720108960");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500201320190028959");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.VerificarConsultaDesatualizada();
			Page.ClicarConsultarRestritivo2();
			Page.ClicarSim();
			Page.EntrarTelaEmprestimo();
			Page.VerificarConsultaSerasaPF();
			Page.ValidarConsultaSerasaPF();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Consulta_Serasa_PF.png");
		} catch (

		AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Consulta_Serasa_PJ.txt",
					a);

			throw a;

		}

	}

	@Ignore
	public void ConsultaSerasaPJ() throws InterruptedException, SQLException, IOException {
		try {
			Page = new EmprestimoPage();
			Page.ResetarDadosSerasa("8397696000143");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500202120190005331");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.VerificarConsultaDesatualizada();
			Page.ClicarConsultarRestritivo();
			Page.ClicarSim();
			Page.EntrarTelaEmprestimo();
			Page.VerificarConsultaSerasa();
			Page.ValidarConsultaSerasaPJ();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Consulta_Serasa_PJ.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Consulta_Serasa_PJ.txt",
					a);

			throw a;

		}

	}

	@Ignore
	public void ConsultaBoaVistaPJ() throws InterruptedException, SQLException, IOException {
		try {
			Page = new EmprestimoPage();
			Page.ResetarDadosBoaVista("6374930000191");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500201920190007448");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.VerificarConsultaDesatualizada();
			Page.ClicarConsultarRestritivo();
			Page.ClicarSim();
			Page.EntrarTelaEmprestimo();
			Page.VerificarConsultaBoaVista();
			Page.ValidarConsultaBoaVistaPJ();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Consulta_Boa_Vista_PJ.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Consulta_Boa_Vista_PJ.txt",
					a);

			throw a;

		}

	}

	@Ignore
	public void ConsultaBoaVistaPF() throws InterruptedException, SQLException, IOException {
		try {
			Page = new EmprestimoPage();
			Page.ResetarDadosBoaVista("03087448966");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500107520190178440");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.VerificarConsultaDesatualizada();
			Page.ClicarConsultarRestritivo();
			Page.ClicarSim();
			Page.EntrarTelaEmprestimo();
			Page.VerificarConsultaBoaVista();
			Page.ValidarConsultaBoaVistaPF();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Consulta_Boa_Vista_PF.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Consulta_Boa_Vista_PF.txt",
					a);

			throw a;

		}

	}

	@Test
	public void ComRestritivoBoaVistaPJ() throws InterruptedException, SQLException, IOException {
		try {
			Page = new EmprestimoPage();
			Page.DataAtual("79257291000158");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500107520190088730");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.VerificarAssociadoComRestritivo();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Com_Restritivo_Boa_Vista_PJ.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Com_Restritivo_Boa_Vista_PJ.txt",
					a);

			throw a;

		}

	}

	@Test
	public void SemRestritivoBoaVistaPJ() throws InterruptedException, SQLException, IOException {
		try {
			Page = new EmprestimoPage();
			Page.DataAtualSemRestritivo("03139040000107");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500201920190007448");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.VerificarConsultaSemRestritivo();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Sem_Restritivo_Boa_Vista_PJ.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Sem_Restritivo_Boa_Vista_PJ.txt",
					a);

			throw a;

		}

	}

	@Test
	public void ComRestritivoBoaVistaPF() throws InterruptedException, SQLException, IOException {
		try {
			Page = new EmprestimoPage();
			Page.DataAtual("6158027960");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500107520190195303");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.VerificarAssociadoComRestritivo2();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Com_Restritivo_Boa_Vista_PF.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Com_Restritivo_Boa_Vista_PF.txt",
					a);

			throw a;

		}

	}

	@Test
	public void SemRestritivoBoaVistaPF() throws InterruptedException, SQLException, IOException {
		try {
			Page = new EmprestimoPage();
			Page.DataAtualSemRestritivo("06158027960");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500107520190195303");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.VerificarConsultaSemRestritivoReserva();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Sem_Restritivo_Boa_Vista_PF.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Sem_Restritivo_Boa_Vista_PF.txt",
					a);

			throw a;

		}

	}

	@Test
	public void ConsultaJaRealizadaNoDiaBoaVistaPJ() throws InterruptedException, SQLException, IOException {
		try {
			Page = new EmprestimoPage();
			Page.DataAtual("03139040000107");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500201920190007448");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.VerificarConsultaBoaVista();
			Page.ClicarConsultarRestritivo();
			Page.ValidarMensagemConsultaJaRealizadaNoDiaBoaVista();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Consulta_Ja_Realizada_Boa_Vista_PJ.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Consulta_Ja_Realizada_Boa_Vista_PJ.txt",
					a);

			throw a;

		}

	}

	@Test
	public void ConsultaJaRealizadaNoDiaBoaVistaPF() throws InterruptedException, SQLException, IOException {
		try {
			Page = new EmprestimoPage();
			Page.DataAtual("06158027960");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500107520190195303");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.VerificarConsultaBoaVistaReserva();
			Page.ClicarConsultarRestritivo3();
			Page.ValidarMensagemConsultaJaRealizadaNoDiaBoaVista();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Consulta_Ja_Realizada_Boa_Vista_PF.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Consulta_Ja_Realizada_Boa_Vista_PF.txt",
					a);

			throw a;

		}

	}

	@Test
	public void ConsultaJaRealizadaSerasaPF() throws InterruptedException, SQLException, IOException {
		try {
			Page = new EmprestimoPage();
			Page.DataAtualSerasaComRestritivo("21995877972");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500201320190026862");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.VerificarConsultaBoaVista();
			Page.ClicarConsultarRestritivo2();
			Page.ValidarMensagemConsultaJaRealizadaNoDiaSerasa();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Consulta_Ja_Realizada_Serasa_PF.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Consulta_Ja_Realizada_Serasa_PF.txt",
					a);

			throw a;

		}

	}

	@Test
	public void ConsultaJaRealizadaSerasaPJ() throws InterruptedException, SQLException, IOException {
		try {
			Page = new EmprestimoPage();
			Page.DataAtualSerasaComRestritivo("30650228000198");
			Page.EntrarMenuLateral();
			Page.ClicarEmprestimoseFinanciamentos();
			Page.ClicarEmprestimos();
			Page.ClicarManter();
			Page.EntrarTelaEmprestimo();
			Page.PreencherNroContrato("500201320190005460");
			Page.ClicarPesquisar();
			Page.ClicarConfirmarLiberar();
			Page.VerificarConsultaBoaVista();
			Page.ClicarConsultarRestritivo();
			Page.ValidarMensagemConsultaJaRealizadaNoDiaSerasa();
			Page.Print(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Duplicata_Consulta_Ja_Realizada_Serasa_PJ.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Duplicata_Consulta_Ja_Realizada_Serasa_PJ.txt",
					a);

			throw a;

		}

	}
	
	/**
	 * Metodos para realizar consulta restritivo externo na tela de proposta de credito 
	 * no modulo alcada
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 * @throws InterruptedException 
	 * @throws ParseException 
	*/
	
	@Test
	public void DataHoraRestritivoExterno() throws InterruptedException, ParseException {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarManterAlcada();
		Page.EntrarTelaAlcada();
	    Page.PreencherNroContratoAlcada("500107520190204188");
		Page.ClicarPesquisar();
		Page.ClicarPropostaDeCredito();
		Page.VerificarDataHoraRestritivoExterno();
	}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Data_hora_Alcada.txt",
				a);

		throw a;

	}
		
		
		
		
	}
	
	@Test
	public void SimulacaoNaoFazConsultaExterno() throws InterruptedException, ParseException , Exception {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarManterAlcada();
		Page.EntrarTelaAlcada();
		Page.PreencherNroContratoAlcada("500107520180235184");
		Page.ClicarPesquisar();
		Page.ClicarPropostaDeCredito();
		Page.VerificarDataConsultaExterna();
	}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Simulacao_nao_faz_consulta.txt",
				a);

		throw a;

	}
		
	}	
		
	
	
	@Test
	public void RestritivoPendenciaPagamentoAssociadoPF() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.AtualizarDataConsultaBoaVistaPropostaPF();
		Page.AtualizarDataConsultaBoaVistaPropostaGEPF();
		Page.EntrarMenuLateral();
		Page.ClicarManterAlcada();
		Page.EntrarTelaAlcada();
		Page.PreencherNroContratoAlcada("500107520190204188");
		Page.ClicarPesquisar();
		Page.ClicarPropostaDeCredito();
		Page.VerificarDataHoraRestritivoExterno();
		Page.VerificarPendenciaPagamento();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Pendencia_PF.txt",
				a);

		throw a;

	}

}
	
	@Test
	public void RestritivoPendenciaPagamentoGrupoEconomicoPF() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.AtualizarDataConsultaBoaVistaPropostaPF();
		Page.AtualizarDataConsultaBoaVistaPropostaGEPF();
		Page.EntrarMenuLateral();
		Page.ClicarManterAlcada();
		Page.EntrarTelaAlcada();
		Page.PreencherNroContratoAlcada("500107520190204188");
		Page.ClicarPesquisar();
		Page.ClicarPropostaDeCredito();
		Page.VerificarDataHoraRestritivoExterno();
		Page.VerificarPendenciaPagamentoGE();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Pendencia_GE_PF.txt",
				a);

		throw a;

	}

}
		
		
	
	@Test
	public void RestritivoProstestoAssociadoPF() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.AtualizarDataConsultaBoaVistaPropostaPF();
		Page.AtualizarDataConsultaBoaVistaPropostaGEPF();
		Page.EntrarMenuLateral();
		Page.ClicarManterAlcada();
		Page.EntrarTelaAlcada();
		Page.PreencherNroContratoAlcada("500107520190204188");
		Page.ClicarPesquisar();
		Page.ClicarPropostaDeCredito();
		Page.VerificarDataHoraRestritivoExterno();
		Page.VerificarProtesto();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Protesto_PF.txt",
				a);

		throw a;

	}

}
	
	
	@Test
	public void RestritivoProstestoGrupoEconomicoPF() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.AtualizarDataConsultaBoaVistaPropostaPF();
		Page.AtualizarDataConsultaBoaVistaPropostaGEPF();
		Page.EntrarMenuLateral();
		Page.ClicarManterAlcada();
		Page.EntrarTelaAlcada();
		Page.PreencherNroContratoAlcada("500107520190204188");
		Page.ClicarPesquisar();
		Page.ClicarPropostaDeCredito();
		Page.VerificarDataHoraRestritivoExterno();
		Page.VerificarProtestoGE();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Protesto_GE_PF.txt",
				a);

		throw a;

	}

}
		

	@Test
	public void RestritivoChequeSemFundoAssociadoPF() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.AtualizarDataConsultaBoaVistaPropostaPF();
		Page.AtualizarDataConsultaBoaVistaPropostaGEPF();
		Page.EntrarMenuLateral();
		Page.ClicarManterAlcada();
		Page.EntrarTelaAlcada();
		Page.PreencherNroContratoAlcada("500107520190204188");
		Page.ClicarPesquisar();
		Page.ClicarPropostaDeCredito();
		Page.VerificarDataHoraRestritivoExterno();
		Page.VerificarChequeSemFundoPF();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Cheque_PF.txt",
				a);

		throw a;

	}

}
	
	
	@Test
	public void RestritivoChequeSemFundoGrupoEconomicoPF() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.AtualizarDataConsultaBoaVistaPropostaPF();
		Page.AtualizarDataConsultaBoaVistaPropostaGEPF();
		Page.EntrarMenuLateral();
		Page.ClicarManterAlcada();
		Page.EntrarTelaAlcada();
		Page.PreencherNroContratoAlcada("500107520190204188");
		Page.ClicarPesquisar();
		Page.ClicarPropostaDeCredito();
		Page.VerificarDataHoraRestritivoExterno();
		Page.VerificarChequeSemFundoGEPF();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Cheque_GE_PF.txt",
				a);

		throw a;

	}

}
	
	
	@Test
	public void RestritivoProstestoAssociadoPJ() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.AtualizarDataConsultaBoaVistaPropostaPJ();
		Page.AtualizarDataConsultaBoaVistaPropostaGEPJ();
		Page.EntrarMenuLateral();
		Page.ClicarManterAlcada();
		Page.EntrarTelaAlcada();
		Page.PreencherNroContratoAlcada("500107520190205151");
		Page.ClicarPesquisar();
		Page.ClicarPropostaDeCredito();
		Page.VerificarDataHoraRestritivoExterno();
		Page.VerificarProtestoPJ();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Protesto_PJ.txt",
				a);

		throw a;

	}

}
	
	
	@Test
	public void RestritivoChequeSemFundoAssociadoPJ() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.AtualizarDataConsultaBoaVistaPropostaPJ();
		Page.AtualizarDataConsultaBoaVistaPropostaGEPJ();
		Page.EntrarMenuLateral();
		Page.ClicarManterAlcada();
		Page.EntrarTelaAlcada();
		Page.PreencherNroContratoAlcada("500107520190205151");
		Page.ClicarPesquisar();
		Page.ClicarPropostaDeCredito();
		Page.VerificarDataHoraRestritivoExterno();
		Page.VerificarChequeSemFundoPJ();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Cheque_PJ.txt",
				a);

		throw a;

	}

}
	
	@Test
	public void RestritivoAcaoJudicialAssociadoPJ() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.AtualizarDataConsultaBoaVistaPropostaPJ();
		Page.AtualizarDataConsultaBoaVistaPropostaGEPJ();
		Page.EntrarMenuLateral();
		Page.ClicarManterAlcada();
		Page.EntrarTelaAlcada();
		Page.PreencherNroContratoAlcada("500107520190205151");
		Page.ClicarPesquisar();
		Page.ClicarPropostaDeCredito();
		Page.VerificarDataHoraRestritivoExterno();
		Page.VerificarAcaoJudicialPJ();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Acao_Judicial_PJ.txt",
				a);

		throw a;

	}

}
	
	@Test
	public void RestritivoFalenciaAssociadoPJ() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.AtualizarDataConsultaBoaVistaPropostaPJ();
		Page.AtualizarDataConsultaBoaVistaPropostaGEPJ();
		Page.EntrarMenuLateral();
		Page.ClicarManterAlcada();
		Page.EntrarTelaAlcada();
		Page.PreencherNroContratoAlcada("500107520190205151");
		Page.ClicarPesquisar();
		Page.ClicarPropostaDeCredito();
		Page.VerificarDataHoraRestritivoExterno();
		Page.VerificarFalenciaPJ();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Falencia_PJ.txt",
				a);

		throw a;

	}

}
	
	@Test
	public void RestritivoDividaVencidaAssociadoPJ() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.AtualizarDataConsultaBoaVistaPropostaPJ();
		Page.AtualizarDataConsultaBoaVistaPropostaGEPJ();
		Page.EntrarMenuLateral();
		Page.ClicarManterAlcada();
		Page.EntrarTelaAlcada();
		Page.PreencherNroContratoAlcada("500107520190205151");
		Page.ClicarPesquisar();
		Page.ClicarPropostaDeCredito();
		Page.VerificarDataHoraRestritivoExterno();
		Page.VerificarDividaVencidaPJ();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Divida_Vencida_PJ.txt",
				a);

		throw a;

	}

}	
	
	
	@Test
	public void RestritivoGrupoEconomicoPJ() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.AtualizarDataConsultaBoaVistaPropostaPJ();
		Page.AtualizarDataConsultaBoaVistaPropostaGEPJ();
		Page.EntrarMenuLateral();
		Page.ClicarManterAlcada();
		Page.EntrarTelaAlcada();
		Page.PreencherNroContratoAlcada("500107520190205151");
		Page.ClicarPesquisar();
		Page.ClicarPropostaDeCredito();
		Page.VerificarDataHoraRestritivoExterno();
		Page.VerificarRestritivoGEPJ();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Grupo_Economico_PJ.txt",
				a);

		throw a;

	}

}	
	
	
	@Test
	public void RestritivoSerasaGrupoEconomico() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.AtualizarDataConsultaSerasaPropostaGE();
		Page.AtualizarDataConsultaSerasaPropostaAssociado();
		Page.EntrarMenuLateral();
		Page.ClicarManterAlcada();
		Page.EntrarTelaAlcada();
		Page.PreencherNroContratoAlcada("500107520190204188");
		Page.ClicarPesquisar();
		Page.ClicarPropostaDeCredito();
		//Page.VerificarDataHoraRestritivoExterno();
		Page.ValidarSerasaPropostaGE();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Serasa_Grupo_Economico.txt",
				a);

		throw a;

	}

}
	
	@Test
	public void RestritivoSerasaAssociado() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.AtualizarDataConsultaSerasaPropostaGE();
		Page.AtualizarDataConsultaSerasaPropostaAssociado();
		Page.EntrarMenuLateral();
		Page.ClicarManterAlcada();
		Page.EntrarTelaAlcada();
		Page.PreencherNroContratoAlcada("500107520190204188");
		Page.ClicarPesquisar();
		Page.ClicarPropostaDeCredito();
		Page.ValidarSerasaPropostaAssociado();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Serasa_Associado.txt",
				a);

		throw a;

	}

} 
	
	
	
	
	/**
	 * Metodos para realizar consulta restritivo externo na tela de proposta de credito 
	 * no modulo Emprestimo
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 * @throws InterruptedException 
	 * @throws ParseException 
	*/
	
	@Test
	public void DataHoraRestritivoExternoTelaEmprestimo() throws InterruptedException, ParseException {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarEmprestimoseFinanciamentos();
		Page.ClicarEmprestimos();
		Page.ClicarManter();
		Page.EntrarTelaEmprestimo();
		Page.PreencherModalidade("2010");
		Page.PreencherNroContrato("500107520200000824");
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarPropostaDeCreditoEmprestimo();
		Page.VerificarDataHoraRestritivoExternoEmprestimo();
	}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Data_hora_Emprestimo.txt",
				a);

		throw a;

	}
		
		
		
		
	}
	
	
	@Test
	public void TelaPropostaEmprestimoNaoFazConsultaExterno() throws InterruptedException, ParseException , Exception {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarEmprestimoseFinanciamentos();
		Page.ClicarEmprestimos();
		Page.ClicarManter();
		Page.EntrarTelaEmprestimo();;
		Page.PreencherNroContrato("500107520190475192");
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarPropostaDeCreditoEmprestimo();
		Page.VerificarDataConsultaExternaEmprestimo();
	}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Emprestimo_nao_faz_consulta.txt",
				a);

		throw a;

	}
		
	}	
	
	@Test
	public void RestritivoPendenciaPagamentoGrupoEconomicoPFAprovado() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarEmprestimoseFinanciamentos();
		Page.ClicarEmprestimos();
		Page.ClicarManter();
		Page.EntrarTelaEmprestimo();
		Page.PreencherNroContrato("500107520200000824");
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarPropostaDeCreditoEmprestimo();
		Page.VerificarDataHoraRestritivoExternoEmprestimo();
		Page.VerificarPendenciaPagamentoGEEmprestimo();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Pendencia_GE_PF_Emprestimo.txt",
				a);

		throw a;

	}

}
	
	@Test
	public void RestritivoPendenciaPagamentoAssociadoPFAprovado() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarEmprestimoseFinanciamentos();
		Page.ClicarEmprestimos();
		Page.ClicarManter();
		Page.EntrarTelaEmprestimo();
		Page.PreencherNroContrato("500107520200000824");
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarPropostaDeCreditoEmprestimo();
		Page.VerificarDataHoraRestritivoExternoEmprestimo();
		Page.VerificarPendenciaPagamentoAssociadoEmprestimo();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Pendencia_Associado_PF_Emprestimo.txt",
				a);

		throw a;

	}

}
	
	@Test
	public void RestritivoProtestoGrupoEconomicoPFAprovado() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarEmprestimoseFinanciamentos();
		Page.ClicarEmprestimos();
		Page.ClicarManter();
		Page.EntrarTelaEmprestimo();
		Page.PreencherNroContrato("500107520200000824");
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarPropostaDeCreditoEmprestimo();
		Page.VerificarDataHoraRestritivoExternoEmprestimo();
		Page.VerificarProtestoGEEmprestimo();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Protesto_GE_PF_Emprestimo.txt",
				a);

		throw a;

	}

} 
	
	@Test
	public void RestritivoProtestoAssociadoPFAprovado() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarEmprestimoseFinanciamentos();
		Page.ClicarEmprestimos();
		Page.ClicarManter();
		Page.EntrarTelaEmprestimo();
		Page.PreencherNroContrato("500107520200000824");
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarPropostaDeCreditoEmprestimo();
		Page.VerificarDataHoraRestritivoExternoEmprestimo();
		Page.VerificarProtestoAssociadoEmprestimo();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Protesto_Associado_PF_Emprestimo.txt",
				a);

		throw a;

	}

} 
	
	
	@Test
	public void RestritivoChequeSemFundoGrupoEconomicoPFAprovado() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarEmprestimoseFinanciamentos();
		Page.ClicarEmprestimos();
		Page.ClicarManter();
		Page.EntrarTelaEmprestimo();
		Page.PreencherNroContrato("500107520200000824");
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarPropostaDeCreditoEmprestimo();
		Page.VerificarDataHoraRestritivoExternoEmprestimo();
		Page.VerificarChequeSemFundoGEPFEmprestimo();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Cheque_sem_fundo_GE_PF_Emprestimo.txt",
				a);

		throw a;

	}

}
		
	
	
	

	@Test
	public void RestritivoChequeSemFundoAssociadoPFAprovado() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarEmprestimoseFinanciamentos();
		Page.ClicarEmprestimos();
		Page.ClicarManter();
		Page.EntrarTelaEmprestimo();
		Page.PreencherNroContrato("500107520200000824");
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarPropostaDeCreditoEmprestimo();
		Page.VerificarDataHoraRestritivoExternoEmprestimo();
		Page.VerificarChequeSemFundoAssociadoPFEmprestimo();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Cheque_sem_fundo_Associado_PF_Emprestimo.txt",
				a);

		throw a;

	}

} 
	
	
	@Test
	public void RestritivoDividaVencidaAssociadoPJAprovado() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarEmprestimoseFinanciamentos();
		Page.ClicarEmprestimos();
		Page.ClicarManter();
		Page.EntrarTelaEmprestimo();
		Page.PreencherNroContrato("500107520190472546");
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarPropostaDeCreditoEmprestimo();
		Page.VerificarDataHoraRestritivoExternoEmprestimo();
		Page.VerificarDividaVencidaPJAprovado();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Divida_Vencida_Associado_PJ_Emprestimo_Aprovado.txt",
				a);

		throw a;

	}

}
	
	@Test
	public void RestritivoFalenciaAssociadoPJAprovado() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarEmprestimoseFinanciamentos();
		Page.ClicarEmprestimos();
		Page.ClicarManter();
		Page.EntrarTelaEmprestimo();
		Page.PreencherNroContrato("500107520190472546");
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarPropostaDeCreditoEmprestimo();
		Page.VerificarDataHoraRestritivoExternoEmprestimo();
		Page.VerificarFalenciaPJAprovado();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Falencia_Associado_PJ_Emprestimo_Aprovado.txt",
				a);

		throw a;

	}

}
	
	
	@Test
	public void RestritivoAcaoJudicialAssociadoPJAprovado() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarEmprestimoseFinanciamentos();
		Page.ClicarEmprestimos();
		Page.ClicarManter();
		Page.EntrarTelaEmprestimo();
		Page.PreencherNroContrato("500107520190472546");
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarPropostaDeCreditoEmprestimo();
		Page.VerificarDataHoraRestritivoExternoEmprestimo();
		Page.VerificarAcaoJudicialPJAprovado();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Acao_judicial_Associado_PJ_Emprestimo_Aprovado.txt",
				a);

		throw a;

	}

}
	
	@Test
	public void RestritivoChequeSemFundoAssociadoPJAprovado() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarEmprestimoseFinanciamentos();
		Page.ClicarEmprestimos();
		Page.ClicarManter();
		Page.EntrarTelaEmprestimo();
		Page.PreencherNroContrato("500107520190472546");
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarPropostaDeCreditoEmprestimo();
		Page.VerificarDataHoraRestritivoExternoEmprestimo();
		Page.VerificarChequeSemFundoPJAprovado();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Cheque_Sem_Fundo_Associado_PJ_Emprestimo_Aprovado.txt",
				a);

		throw a;

	}

} 
	
	
	@Test
	public void RestritivoProtestoAssociadoPJAprovado() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarEmprestimoseFinanciamentos();
		Page.ClicarEmprestimos();
		Page.ClicarManter();
		Page.EntrarTelaEmprestimo();
		Page.PreencherNroContrato("500107520190472546");
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarPropostaDeCreditoEmprestimo();
		Page.VerificarDataHoraRestritivoExternoEmprestimo();
		Page.VerificarProtestoPJAprovado();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Protesto_Associado_PJ_Emprestimo_Aprovado.txt",
				a);

		throw a;

	}

}
		
	
	@Test
	public void RestritivoSerasaAprovado() throws InterruptedException, ParseException, SQLException, Exception {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarEmprestimoseFinanciamentos();
		Page.ClicarEmprestimos();
		Page.ClicarManter();
		Page.EntrarTelaEmprestimo();
		Page.PreencherNroContrato("500107520190472546");
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarPropostaDeCreditoEmprestimo();
		Page.VerificarDataHoraRestritivoExternoEmprestimo();
		Page.ValidarSerasaPropostaEmprestimoAssociado();
		}catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Proposta_Exibir_Boavista_Protesto_Associado_PJ_Emprestimo_Aprovado.txt",
				a);

		throw a;

	}

}
		
		
		
	
	/**
	 * Metodos para realizar os testes de contratar emprestimo
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 * @throws SQLException 
	*/
	@Test 
	public void DiferencaDeDiasSerasa() throws InterruptedException, ParseException, SQLException {
		try {
		Page = new EmprestimoPage();
		Page.ValidarDiferencaDeDiasRestritivoRelevantesSerasa();
		
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Diferenca_Dias_Serasa.txt",
					a);
			throw a;
		}
	}
	
	@Test 
	public void SemRestritivoNaoRelevantesSerasa() throws InterruptedException, ParseException, SQLException {
		try { 
		Page = new EmprestimoPage();
		Page.ValidarSemRestritivoNaoRelevantesSerasaAssociado();
		
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Sem_Restritivo_Nao_Relevantes_Serasa.txt",
					a);
			throw a;
		}
	}
	
	@Test 
	public void DiferencaDeDiasBoaVistaPJ() throws InterruptedException, ParseException, SQLException {
		try { 
		Page = new EmprestimoPage();
		Page.ValidarDiferencaDeDiasRestritivoRelevantesBoaVistaPJ();
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Diferenca_Dias_BoaVista_PJ.txt",
					a);
			throw a;
		}
	}
	
	@Test 
	public void DiferencaDeDiasBoaVistaRestritivoRelevantesPF() throws InterruptedException, ParseException, SQLException {
		try {
		Page = new EmprestimoPage();
		Page.ValidarDiferencaDeDiasRestritivoRelevantesBoaVistaPF();
		
	} catch (AssertionError a) {

		Page.TratarErro("C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Diferenca_Dias_BoaVista_Relevantes_PF.txt",
				a);
		throw a;
	}
}
	
	@Test 
	public void DiferencaDeDiasBoaVistaRestritivoNaoRelevantesAssociado() throws InterruptedException, ParseException, SQLException, AssertionError {
		try {
		Page = new EmprestimoPage();
		Page.ValidarDiferencaDeDiasRestritivoNaoRelevantesBoaVistaAssociado();
		
	} catch (AssertionError a) {

		Page.TratarErro("C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Diferenca_Dias_BoaVista_Nao_Relevantes_Associado_PF.txt",
				a);
throw a;
	}
}

	
	@Test 
	public void DiferencaDeDiasBoaVistaRestritivoNaoRelevantesGrupoEconomico() throws InterruptedException, ParseException, SQLException, AssertionError {
		try {
		Page = new EmprestimoPage();
		Page.ValidarDiferencaDeDiasRestritivoNaoRelevantesBoaVistaGrupoEconomico();
		
	} catch (AssertionError a) {

		Page.TratarErro("C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Diferenca_Dias_BoaVista_Nao_Relevantes_Grupo_Economico.txt",
				a);
throw a;
	}
}


	
	
	@Test 
	public void SemRestritivoRelevantes() throws InterruptedException, ParseException, SQLException {
		try {
		Page = new EmprestimoPage();
		Page.ValidarDiferencaDeDiasRestritivoRelevantesBoaVistaSemRestritivos();
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Sem_Restritivos_Relevantes.txt",
					a);
			throw a;
		}
	}
	
		
	
	
	@Test  
	public void SemRestritivoNaoRelevantesBoaVistaAssociadoPF() throws InterruptedException, ParseException, SQLException {
		try {
		Page = new EmprestimoPage();
		Page.ValidarSemRestritivoNaoRelevantesBoaVistaAssociadoPF();
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Sem_Restritivos_Nao_Relavantes_BoaVista_PF.txt",
					a);
			throw a;
		}
	}
	
		
	
	
	@Test 
	public void SemRestritivoRelevantesGrupoEconomicoPF() throws InterruptedException, ParseException, SQLException {
		try {
		Page = new EmprestimoPage();
		Page.ValidarSemRestritivoRelevantesBoaVistaGrupoEconomicoPF();
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Sem_Restritivo_Relavantes_Grupo_Economico_PF.txt",
					a);
			throw a;
		}
	}
	
		
	
	
	@Test 
	public void SemRestritivoNaoRelevantesGrupoEconomicoPF() throws InterruptedException, ParseException, SQLException {
		try {
		Page = new EmprestimoPage();
		Page.ValidarSemRestritivoNaoRelevantesBoaVistaGrupoEconomicoPF();
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Sem_Restritivo_Nao_Relavantes_Grupo_Economico_PF.txt",
					a);
			throw a;
		}
	}
		
	
	
	@Test 
	public void SemRestritivoNaoRelevantesBoaVistaAssociadoPJ() throws InterruptedException, ParseException, SQLException {
		try { 
		Page = new EmprestimoPage();
		Page.ValidarSemRestritivoNaoRelevantesBoaVistaAssociadoPJ();
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Sem_Restritivo_Nao_Relavantes_Associado_BoaVista_PJ.txt",
					a);
			throw a;
		}
	}
		
	
	
	@Test
	public void ClassificacaoScoragem() throws InterruptedException,  SQLException, IOException {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarScore();
		Page.EntrarTelaScore();
		Page.PreencherNroDocumento("53892690987");
		Page.ClicarCheckDoc();
		Page.ClicarPesquisar();
		Page.ClicarExibirScore();
		Page.ValidarClassificacaoScoragem();
		Page.Print(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Contratar_Classicacao_Scoaragem.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Classificacao_Scoragem.txt",
					a);
			throw a;
		}
	}
		

		
		

	
	@Test
	public void ApuracaoDoResultadoFinalDosRestritivos() throws InterruptedException,  SQLException, IOException {
		try { 
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarScore();
		Page.EntrarTelaScore();
		Page.PreencherNroDocumento("53892690987");
		Page.ClicarCheckDoc();
		Page.ClicarPesquisar();
		Page.ClicarExibirScore();
		Page.ValidarApuracaoResultadoFinalRestritivo();
		Page.Print(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Contratar_Apuracao_Resultado_Final_Restritivo.png");
		
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Apuracao_Resultado_Final_Restritivo.txt",
					a);
			throw a;
		}
	}
		
	
	@Test
	public void ApuracaoFinalCooperadoExternoInterno() throws InterruptedException,  SQLException, IOException {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarScore();
		Page.EntrarTelaScore();
		Page.PreencherNroDocumento("53892690987");
		Page.ClicarCheckDoc();
		Page.ClicarPesquisar();
		Page.ClicarExibirScore();
	    Page.ValidarApuracaoFinalCooperadoExternaInterna();
	    Page.Print(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Contratar_Apuracao_Final_Externo_Interno.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Apuracao_Final_Externo_Interno.txt",
					a);
			throw a;
		}
	}
	
	
	@Test
	public void ValidarAvalicaoDaOperacao() throws InterruptedException,  SQLException, IOException {
		try {
		Page = new EmprestimoPage();
		Page.EntrarMenuLateral();
		Page.ClicarScore();
		Page.EntrarTelaScore();
		Page.PreencherNroDocumento("53892690987");
		Page.ClicarCheckDoc();
		Page.ClicarPesquisar();
		Page.ClicarExibirScore();
	    Page.ValidarAvaliacaoDaOperacao();
	    Page.Print(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_Contratar_Avaliacao_Da_Operacao.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Avaliacao_Da_Aprovacao.txt",
					a);
			throw a;
		}
	}
}