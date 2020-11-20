package br.coop.cresol;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Ignore;
import org.junit.Test;

import br.core.cresol.BaseTest;
import br.pages.cresol.RestritivoPage;

public class Restritivo extends BaseTest {

	private RestritivoPage Page;

	/**
	 * Metodos com o front end para validar a tela Restritivo
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	@Test
	public void ScoreRestritivoPF() throws SQLException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPF();
			Page.AtualizarRestritivoPF();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("04396105916");
			Page.ClicarPesquisar();
			Page.BoaVistaSim();
			Page.ClicarExibir();
			Page.VerificarScore();

		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Exibir_Score_PF.txt",
					a);

			throw a;

		}

	}

	@Test
	public void ContumaciaPF() throws SQLException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPF();
			Page.AtualizarRestritivoPF();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("04396105916");
			Page.ClicarPesquisar();
			Page.BoaVistaSim();
			Page.ClicarExibir();
			Page.VerificarContumacia();

		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Exibir_Contumacia_PF.txt",
					a);

			throw a;

		}

	}

	@Test
	public void PendenciaSemAvalista() throws SQLException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPF();
			Page.AtualizarRestritivoPF();
			Page.SemAvalista();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("04396105916");
			Page.ClicarPesquisar();
			Page.BoaVistaSim();
			Page.ClicarExibir();
			Page.VerificarPendenciaSemAvalista();

		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Exibir_Pendencia.txt",
					a);

			throw a;

		}

	}

	@Test
	public void PendenciaComAvalista() throws SQLException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPF();
			Page.AtualizarRestritivoPF();
			Page.ComAvalista();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("04396105916");
			Page.ClicarPesquisar();
			Page.BoaVistaSim();
			Page.ClicarExibir();
			Page.VerificarPendenciaComAvalista();

		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Exibir_Pendencia.txt",
					a);

			throw a;

		}

	}

	@Test
	public void ChequeSemFundoPF() throws SQLException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPF();
			Page.AtualizarRestritivoPF();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("04396105916");
			Page.ClicarPesquisar();
			Page.BoaVistaSim();
			Page.ClicarExibir();
			Page.VerificarChequeSemFundo();

		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Exibir_cheque_sem_fundo_PF.txt",
					a);

			throw a;

		}

	}

	@Test
	public void ProtestoPF() throws SQLException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPF();
			Page.AtualizarRestritivoPF();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("04396105916");
			Page.ClicarPesquisar();
			Page.BoaVistaSim();
			Page.ClicarExibir();
			Page.VerificarProtesto();

		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Exibir_Protestol_PF.txt",
					a);

			throw a;

		}

	}

	/*
	 * @Test public void AcaoJudicialPF() throws SQLException { try { Page = new
	 * RestritivoPage(); Page.AtualizarDataConsultaBoaVistaPF();
	 * Page.AtualizarRestritivoPF(); Page.EntrarMenuLateral();
	 * Page.ClicarRestritivo(); Page.ClicarManter(); Page.EntrarRestritivo();
	 * Page.NumeroDocumento("04396105916"); Page.ClicarPesquisar();
	 * Page.BoaVistaSim(); Page.ClicarExibir(); Page.VerificarAcaoJudicialPF();
	 * 
	 * } catch (AssertionError a) {
	 * 
	 * Page.TratarErro(
	 * "C:\\Users/dcsantos/BoaVista/BoaVista/src/main/resources/Erros/Exibir_Acao_judicial_PF.txt",
	 * a);
	 * 
	 * throw a;
	 * 
	 * }
	 * 
	 * }
	 */

	@Test
	public void GrupoEconomicoPF() throws SQLException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaGrupoEconomico();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("04396105916");
			Page.ClicarPesquisar();
			Page.ClicarExibir();
			Page.ClicarGrupoEconomico();
			Page.VerificarGrupoEconomicoPF();
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Exibir_Grupo_economico.txt",
					a);

			throw a;

		}

	}

	/**
	 * Metodos para validar o retorno da consulta Boa vista na tela Exibir PJ
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	@Test
	public void ScoreRestritivoPJ() throws SQLException, AssertionError {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.AtualizarRestritivoPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.BoaVistaSim();
			Page.ClicarExibir();
			Page.VerificarScorePJ();
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Exibir_Score_PJ.txt",
					a);

			throw a;

		}

	}

	@Test
	public void AcaoJudicialPJ() throws SQLException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.AtualizarRestritivoPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.BoaVistaSim();
			Page.ClicarExibir();
			Page.VerificarAcaoJudicialPJ();
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Exibir_acao_judicial_PJ.txt",
					a);

			throw a;

		}

	}

	@Test
	public void ContumaciaPJ() throws SQLException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.AtualizarRestritivoPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.BoaVistaSim();
			Page.ClicarExibir();
			Page.VerificarContumaciaPJ();
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Exibir_contumacia_PJ.txt",
					a);

			throw a;

		}

	}

	@Test
	public void ProtestoPJ() throws SQLException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.AtualizarRestritivoPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.BoaVistaSim();
			Page.ClicarExibir();
			Page.VerificarProtestoPJ();
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Exibir_Protesto_PJ.txt",
					a);

			throw a;

		}

	}

	@Test
	public void ChequeSemFundoPJ() throws SQLException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.AtualizarRestritivoPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.BoaVistaSim();
			Page.ClicarExibir();
			Page.VerificarChequeSemFundoPJ();
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Exibir_Cheque_sem_fundo_PJ.txt",
					a);

			throw a;

		}

	}

	@Test
	public void Falencia() throws SQLException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.AtualizarRestritivoPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.BoaVistaSim();
			Page.ClicarExibir();
			Page.VerificarFalencias();
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Exibir_Falencia.txt",
					a);

			throw a;

		}

	}

	@Test
	public void DividaVencida() throws SQLException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.AtualizarRestritivoPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.BoaVistaSim();
			Page.ClicarExibir();
			Page.VerificarDividaVencida();
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Exibir_Divida_vencida.txt",
					a);

			throw a;

		}

	}

	/**
	 * Metodos alterar o status da consulta Boa vista na tela Alterar PF
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 * @throws InterruptedException
	 * @throws IOException
	 * 
	 */

	
	  /*@Test 
	  public void AlterarRestritivoAcaoJudicialBaixadoPF() throws
	  SQLException, IOException, InterruptedException { try { Page = new
	  RestritivoPage(); Page.AtualizarDataConsultaBoaVistaPF();
	  Page.EntrarMenuLateral(); Page.ClicarRestritivo(); Page.ClicarManter();
	  Page.EntrarRestritivo(); Page.NumeroDocumento("04396105916");
	  Page.ClicarPesquisar(); Page.ClicarAlterar();
	  Page.MudarStatusAcaoJudicial("BAIXADO"); Page.ClicarConfirmar();
	  Page.ValidarMensagemAlterarRestritivo(); Page.PrintMensagem(
	  "C:\\Users/dcsantos/BoaVista/BoaVista/src/main/resources/Prints/Print_mensagem_Acao_judicial_baixado_PF.png"
	  ); Page.VerificarAlteracaoRestritivo(
	  "select * from restritivo_acao_judicial  where cod_restritivo_acao_judicial = 113"
	  , 6834,
	  "C:\\Users/dcsantos/BoaVista/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_acao_judicial_PF_baixado.txt"
	  ); } catch (AssertionError a) {
	  
	  Page.TratarErro(
	  "C:\\Users/dcsantos/BoaVista/BoaVista/src/main/resources/Erros/Alterar_acao_judicial_Baixado_PF.txt",
	  a);
	  
	  throw a;
	  
	  }
	  
	  }
	  
	 @Test
	 public void AlterarRestritivoAcaoJudicialSolicitadoPF() throws
	 SQLException, IOException, InterruptedException { try { Page = new
	  RestritivoPage(); Page.AtualizarDataConsultaBoaVistaPF();
	  Page.EntrarMenuLateral(); Page.ClicarRestritivo(); Page.ClicarManter();
	  Page.EntrarRestritivo(); Page.NumeroDocumento("04396105916");
	  Page.ClicarPesquisar(); Page.ClicarAlterar();
	  Page.MudarStatusAcaoJudicial("SOLICITADO-BAIXA"); Page.ClicarConfirmar();
	  Page.ValidarMensagemAlterarRestritivo(); Page.PrintMensagem(
	  "C:\\Users/dcsantos/BoaVista/BoaVista/src/main/resources/Prints/Print_mensagem_Acao_judicial_solicitado_PF.png"
	  ); Page.VerificarAlteracaoRestritivo(
	  "select * from restritivo_acao_judicial  where cod_restritivo_acao_judicial = 113"
	  , 6835,
	  "C:\\Users/dcsantos/BoaVista/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_acao_judicial_PF_solicitado.txt"
	  ); } catch (AssertionError a) {
	  
	  Page.TratarErro(
	  "C:\\Users/dcsantos/BoaVista/BoaVista/src/main/resources/Erros/Alterar_acao_judicial_solicitado_PF.txt",
	  a);
	  
	  throw a;
	  
	  } }
	  
	  @Test 
	  public void AlterarRestritivoAcaoJudicialAtivoPF() throws
	  SQLException, IOException, InterruptedException { try { Page = new
	  RestritivoPage(); Page.AtualizarDataConsultaBoaVistaPF();
	  Page.EntrarMenuLateral(); Page.ClicarRestritivo(); Page.ClicarManter();
	  Page.EntrarRestritivo(); Page.NumeroDocumento("04396105916");
	  Page.ClicarPesquisar(); Page.ClicarAlterar();
	  Page.MudarStatusAcaoJudicial("ATIVO"); Page.ClicarConfirmar();
	  Page.ValidarMensagemAlterarRestritivo(); Page.PrintMensagem(
	  "C:\\Users/dcsantos/BoaVista/BoaVista/src/main/resources/Prints/Print_mensagem_Acao_judicial_ativo_PF.png"
	  ); Page.VerificarAlteracaoRestritivo(
	  "select * from restritivo_acao_judicial  where cod_restritivo_acao_judicial = 113"
	  , 6833,
	  "C:\\Users/dcsantos/BoaVista/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_acao_judicial_PF_ativo.txt"
	  ); } catch (AssertionError a) {
	  
	  Page.TratarErro(
	  "C:\\Users/dcsantos/BoaVista/BoaVista/src/main/resources/Erros/Alterar_acao_judicial_ativo_PF.txt",
	  a);
	 
	  throw a;
	  
	  } }*/
	 

	@Test
	public void AlterarRestritivoPendenciaSolicitadoPF() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPF();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("04396105916");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusPendencia("SOLICITADO-BAIXA");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Pendencia_solicitado.png");
			Page.VerificarAlteracaoRestritivo(
					"select * from restritivo_pendencia_pagamento where cod_restritivo_pendencia_pagamento = 1904",
					6835,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_pendencia_solicitado.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/pendencia_solicitado.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoPendenciaAtivoPF() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPF();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("04396105916");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusPendencia("ATIVO");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Pendencia_ativo.png");
			Page.VerificarAlteracaoRestritivo(
					"select * from restritivo_pendencia_pagamento where cod_restritivo_pendencia_pagamento = 1904",
					6833,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_pendencia_ativo.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/pendencia_ativo.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoPendenciaBaixadoPF() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPF();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("04396105916");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusPendencia("BAIXADO");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Pendencia_baixado.png");
			Page.VerificarAlteracaoRestritivo(
					"select * from restritivo_pendencia_pagamento where cod_restritivo_pendencia_pagamento = 1904",
					6834,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_pendencia_baixado.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/pendencia_baixado.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoChequeSemFundoBaixadoPF() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPF();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("04396105916");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusChequeSemFundoPF("BAIXADO");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Cheque_sem_fundo_baixado_PF.png");
			Page.VerificarAlteracaoRestritivo(
					"select * from restritivo_devolucao_cheque where cod_restritivo_devolucao_cheque = 160", 6834,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_cheque_sem_fundo_PF_baixado.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/cheque_sem_fundo_baixado_PF.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoChequeSemFundoAtivoPF() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPF();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("04396105916");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusChequeSemFundoPF("ATIVO");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Cheque_sem_fundo_ativo_PF.png");
			Page.VerificarAlteracaoRestritivo(
					"select * from restritivo_devolucao_cheque where cod_restritivo_devolucao_cheque = 160", 6833,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_cheque_sem_fundo_PF_ativo.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/cheque_sem_fundo_ativo_PF.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoChequeSemFundoSolicitadoPF() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPF();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("04396105916");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusChequeSemFundoPF("SOLICITADO-BAIXA");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Cheque_sem_fundo_solicitado_PF.png");
			Page.VerificarAlteracaoRestritivo(
					"select * from restritivo_devolucao_cheque where cod_restritivo_devolucao_cheque = 160", 6835,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_cheque_sem_fundo_PF_solicitado.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/cheque_sem_fundo_solicitado_PF.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoProtestoSolicitadoPF() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPF();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("04396105916");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusProtesto("SOLICITADO-BAIXA");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Protesto_solicitado_PF.png");
			Page.VerificarAlteracaoRestritivo("select * from restritivo_protesto where cod_restritivo_protesto = 1267",
					6835,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_protestoPF_solicitado.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Protesto_solicitado_PF.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoProtestoBaixadoPF() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPF();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("04396105916");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusProtesto("BAIXADO");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Protesto_baixado_PF.png");
			Page.VerificarAlteracaoRestritivo("select * from restritivo_protesto where cod_restritivo_protesto = 1267",
					6834,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_protestoPF_baixado.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Protesto_baixado_PF.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoProtestoAtivoPF() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPF();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("04396105916");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusProtesto("ATIVO");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Protesto_ativo_PF.png");
			Page.VerificarAlteracaoRestritivo("select * from restritivo_protesto where cod_restritivo_protesto = 1267",
					6833,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_protestoPF_ativo.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Protesto_ativo_PF.txt",
					a);

			throw a;

		}
	}

	/**
	 * Metodos alterar o status da consulta Boa vista na tela Alterar PJ
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 * @throws InterruptedException
	 * @throws IOException
	 * 
	 **/

	@Test
	public void AlterarRestritivoChequeSemFundoSolicitadoPJ() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusChequeSemFundoPJ("SOLICITADO-BAIXA");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Cheque_sem_fundo_solicitado_PJ.png");
			Page.VerificarAlteracaoRestritivo(
					"select * from restritivo_cheque_sem_fundo where cod_restritivo_cheque_sem_fundo = 76", 6835,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_Cheque_sem_fundo_PJ_solicitado.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Cheque_fundo_solicitado_PJ.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoChequeSemFundoBaixadodoPJ() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusChequeSemFundoPJ("BAIXADO");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Cheque_sem_fundo_baixado_PJ.png");
			Page.VerificarAlteracaoRestritivo(
					"select * from restritivo_cheque_sem_fundo where cod_restritivo_cheque_sem_fundo = 76", 6834,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_Cheque_sem_fundo_PJ_baixado.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Cheque_fundo_baixado_PJ.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoChequeSemFundoAtivoPJ() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusChequeSemFundoPJ("ATIVO");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Cheque_sem_fundo_ativo_PJ.png");
			Page.VerificarAlteracaoRestritivo(
					"select * from restritivo_cheque_sem_fundo where cod_restritivo_cheque_sem_fundo = 76", 6833,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_Cheque_sem_fundo_PJ_ativo.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Cheque_fundo_ativo_PJ.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoAcaoJudicialBaixadoPJ() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusAcaoJudicial("BAIXADO");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Acao_judicial_baixado_PJ.png");
			Page.VerificarAlteracaoRestritivo(
					"select * from restritivo_acao_judicial  where cod_restritivo_acao_judicial = 111", 6834,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_AcaoJudicialPJ_baixado.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Acao_judicial_baixado_PJ.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoAcaoJudicialSolicitadoPJ() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusAcaoJudicial("SOLICITADO-BAIXA");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Acao_judicial_solicitado_PJ.png");
			Page.VerificarAlteracaoRestritivo(
					"select * from restritivo_acao_judicial  where cod_restritivo_acao_judicial = 111", 6835,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_AcaoJudicialPJ_solicitado.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Acao_judicial_solicitado_PJ.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoAcaoJudicialAtivoPJ() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusAcaoJudicial("ATIVO");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Acao_judicial_ativo_PJ.png");
			Page.VerificarAlteracaoRestritivo(
					"select * from restritivo_acao_judicial  where cod_restritivo_acao_judicial = 111", 6833,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_AcaoJudicialPJ_ativo.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Acao_judicial_ativo_PJ.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoProtestoSolicitadoPJ() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusProtesto("SOLICITADO-BAIXA");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Proteso_solicitado_PJ.png");
			Page.VerificarAlteracaoRestritivo("select * from restritivo_protesto where cod_restritivo_protesto = 1309",
					6835,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_protestoPJ_solicitado.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Protesto_solicitado_PJ.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoProtestoBaixadoPJ() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusProtesto("BAIXADO");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Proteso_baixado_PJ.png");
			Page.VerificarAlteracaoRestritivo("select * from restritivo_protesto where cod_restritivo_protesto = 1309",
					6834,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_protestoPJ_baixado.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Protesto_baixado_PJ.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoProtestoAtivoPJ() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusProtesto("ATIVO");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Proteso_ativo_PJ.png");
			Page.VerificarAlteracaoRestritivo("select * from restritivo_protesto where cod_restritivo_protesto = 1309",
					6833,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_protestoPJ_ativo.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Protesto_ativo_PJ.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoFalenciaAtivo() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusFalencia("ATIVO");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Falencia_ativo.png");
			Page.VerificarAlteracaoRestritivo("select * from restritivo_falencia where cod_restritivo_falencia = 86",
					6833,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_Falencia_ativo.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Falencia_ativo.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoFalenciaBaixado() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusFalencia("BAIXADO");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Falencia_baixado.png");
			Page.VerificarAlteracaoRestritivo("select * from restritivo_falencia where cod_restritivo_falencia = 86",
					6834,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_Falencia_Baixado.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Falencia_baixado.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoFalenciaSolicitado() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusFalencia("SOLICITADO-BAIXA");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Falencia_solicitado.png");
			Page.VerificarAlteracaoRestritivo("select * from restritivo_falencia where cod_restritivo_falencia = 86",
					6835,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_Falencia_solicitado.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Falencia_solicitado.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoDividaVencidaSolicitado() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusDividaVencida("SOLICITADO-BAIXA");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Divida_vencida_solicitado.png");
			Page.VerificarAlteracaoRestritivo(
					"select * from restritivo_divida_vencida where cod_restritivo_divida_vencida = 168", 6835,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_divida_vencida_solicitado.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Divida_vencida_solicitado.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoDividaVencidaBaixado() throws SQLException, IOException, InterruptedException {
		try {
			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusDividaVencida("BAIXADO");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Divida_vencida_baixado.png");
			Page.VerificarAlteracaoRestritivo(
					"select * from restritivo_divida_vencida where cod_restritivo_divida_vencida = 168", 6834,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_divida_vencida_baixado.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Divida_vencida_baixado.txt",
					a);

			throw a;

		}
	}

	@Test
	public void AlterarRestritivoDividaVencidaAtivo() throws SQLException, IOException, InterruptedException {
		try {

			Page = new RestritivoPage();
			Page.AtualizarDataConsultaBoaVistaPJ();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("28345432000153");
			Page.ClicarPesquisar();
			Page.ClicarAlterar();
			Page.MudarStatusDividaVencida("ATIVO");
			Page.ClicarConfirmar();
			Page.ValidarMensagemAlterarRestritivo();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Divida_vencida_ativo.png");
			Page.VerificarAlteracaoRestritivo(
					"select * from restritivo_divida_vencida where cod_restritivo_divida_vencida = 168", 6833,
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_alterar_restritivo/Alterar_divida_vencida_ativo.txt");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Divida_vencida_ativo.txt",
					a);

			throw a;

		}
	} 

	/**
	 * Metodos para realizar a consulta Boa vista e realizar validações na tela
	 * manter restritivos
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws SQLException
	 * 
	 */

	@Test
	public void RealizarConsultaBoavistaPF() throws InterruptedException, IOException, SQLException {
		try {
			Page = new RestritivoPage();
			Page.ResetarDados("37623095900");
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("37623095900");
			Page.ClicarPesquisar();
			Page.ClicarAtualizarConsultaExterna();
			Page.ClicarSim();
			Page.ValidarMensagemConsultaRealizada();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Consulta_realizada_PF.png");
			Page.FecharDiv();
			Page.ClicarPesquisar();
			Page.ConferirData();
			Page.ClicarExibir();
			Page.VerificarBoaVista();
			Page.VerificarConsultaRealizada(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_manter_restritivo/Consulta_realizada_PF.txt",
					"37623095900");

		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Consulta_realizada_PF.txt",
					a);

			throw a;

		}
	}

	@Test
	public void RealizarConsultaBoavistaPJ() throws InterruptedException, IOException, SQLException {
		try {
			Page = new RestritivoPage();
			Page.ResetarDados("10597700000169");
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroDocumento("10597700000169");
			Page.ClicarPesquisar();
			Page.ClicarAtualizarConsultaExterna();
			Page.ClicarSim();
			Page.ValidarMensagemConsultaRealizada();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Consulta_realizada_PJ.png");
			Page.FecharDiv();
			Page.ClicarPesquisar();
			Page.ConferirData();
			Page.ClicarExibir();
			Page.VerificarBoaVista();
			Page.VerificarConsultaRealizada(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_manter_restritivo/Consulta_realizada_PJ.txt",
					"10597700000169");

		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Consulta_realizada_PJ.txt",
					a);

			throw a;

		}
	}

	@Ignore
	public void RealizarConsultaBoavistaPJComSocio() throws InterruptedException, IOException, SQLException {
		try {
			Page = new RestritivoPage();
			Page.ResetarDados("09451922000190 ");
			Page.LimparConsultaSocio();
			Page.LimparConsultaSocio2();
			Page.ResetarConsultaSocio();
			Page.ResetarConsultaSocio2();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroCooperativa("1075");
			Page.NumeroDocumento("09451922000190");
			Page.ClicarPesquisar();
			Page.ClicarAtualizarConsultaExterna();
			Page.ClicarSim();
			Page.ClicarSim();
			Page.FecharDiv();
			Page.NumeroCooperativa("1075");
			Page.NumeroDocumento("7777577964 ");
			Page.ClicarPesquisar();
			Page.ConferirData();
			Page.ClicarExibir();
			Page.VerificarBoaVista();
			// Page.LimparConsultaSocio();
			// Page.LimparConsultaSocio2();
			Page.VerificarConsultaRealizada(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_manter_restritivo/Consulta_realizada_PJ_com_socios.txt",
					"09451922000190");

		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Consulta_realizada_PJ_com_socios.txt",
					a);

			throw a;

		}
	}

	@Ignore
	public void RealizarConsultaBoavistaPJComSocioNao() throws InterruptedException, IOException, SQLException {
		try {
			Page = new RestritivoPage();
			Page.ResetarDados("09451922000190");
			Page.LimparConsultaSocio();
			Page.LimparConsultaSocio2();
			Page.ResetarConsultaSocio();
			Page.ResetarConsultaSocio2();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroCooperativa("1075");
			Page.NumeroDocumento("09451922000190");
			Page.ClicarPesquisar();
			Page.ClicarAtualizarConsultaExterna();
			Page.ClicarSim();
			Page.ClicarNao();
			Page.EntrarRestritivo();
			Page.ConferirData();
			Page.ClicarExibir();
			Page.VerificarBoaVista();
			Page.VerificarConsultaRealizada(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_manter_restritivo/Consulta_realizada_PJ_com_socios_Nao.txt",
					"09451922000190");

		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Consulta_realizada_PJ_com_socios_nao.txt",
					a);

			throw a;

		}
	}

	@Test
	public void ConsultaJaRealizadaNoDia() throws IOException, InterruptedException, SQLException {
		try {
			Page = new RestritivoPage();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.DataAtual();
			Page.NumeroDocumento("76318028900");
			Page.ClicarPesquisar();
			Page.ClicarAtualizarConsultaExterna();
			Page.ValidarMensagemConsultaJaRealizadaNoDia();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Consulta_ja_realizada_no_dia.png");
		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Consulta_ja_realizada_no_dia.txt",
					a);

			throw a;

		}
	}

	@Test
	public void ValidarCamposObrigatoriosTelaManter() throws InterruptedException, IOException {
		try {
			Page = new RestritivoPage();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.ClicarPesquisar();
			Page.ValidarMensagemCampoObrigatorio();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Campo_obrigatorio_tela_manter.png");

		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Campo_obrigatorio_tela_manter.txt",
					a);

			throw a;

		}
	}

	@Test
	public void PesquisarRestritivoComAConta() throws SQLException, InterruptedException, IOException {

		Page = new RestritivoPage();
		Page.EntrarMenuLateral();
		Page.ClicarRestritivo();
		Page.ClicarManter();
		Page.EntrarRestritivo();
		Page.NumeroConta("1075", "16.584-0");
		Page.ClicarPesquisar();
		Page.VerificarTela();

	}

	/**
	 * Metodos para realizar Testes relativo ao Serasa
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	@Test
	public void AlterarRestritivoSerasa() throws SQLException, IOException, InterruptedException {

		Page = new RestritivoPage();
		Page.EntrarMenuLateral();
		Page.ClicarRestritivo();
		Page.ClicarManter();
		Page.EntrarRestritivo();
		Page.NumeroDocumento("48626341920");
		Page.ClicarPesquisar();
		Page.ClicarAlterar();
		Page.MudarStatusSerasa("BAIXADO");
		Page.ClicarConfirmar();
		Page.ValidarMensagemAlterarRestritivo();
		Page.PrintMensagem(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Alterar_restritivo_serasa.png");

	}

	@Test
	public void RealizarConsultaSerasaPF() throws InterruptedException, IOException, SQLException {
		try {
			Page = new RestritivoPage();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroCooperativa("1078");
			Page.NumeroDocumento("07190623906");
			Page.ClicarPesquisar();
			Page.ClicarAtualizarConsultaExterna();
			Page.ClicarSim();
			Page.ValidarMensagemConsultaRealizada();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Consulta_realizada_Serasa_PF.png");

		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Consulta_realizada_Serasa_PF.txt",
					a);

			throw a;

		}
	}

	@Test
	public void RealizarConsultaSerasaPJ() throws InterruptedException, IOException, SQLException {
		try {
			Page = new RestritivoPage();
			Page.EntrarMenuLateral();
			Page.ClicarRestritivo();
			Page.ClicarManter();
			Page.EntrarRestritivo();
			Page.NumeroCooperativa("1078");
			Page.NumeroDocumento("12119702000178");
			Page.ClicarPesquisar();
			Page.ClicarAtualizarConsultaExterna();
			Page.ClicarSim();
			Page.ValidarMensagemConsultaRealizada();
			Page.PrintMensagem(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Consulta_realizada_Serasa_PJ.png");

		} catch (AssertionError a) {

			Page.TratarErro(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Consulta_realizada_Serasa_PJ.txt",
					a);

			throw a;

		}
	}

	@Test
	public void RestritivoSerasaPJ() throws SQLException {

		Page = new RestritivoPage();
		//Page.AtualizarDataConsultaSerasaPJ();
		Page.EntrarMenuLateral();
		Page.ClicarRestritivo();
		Page.ClicarManter();
		Page.EntrarRestritivo();
		Page.NumeroCooperativa("1078");
		Page.NumeroDocumento("12119702000178");
		Page.ClicarPesquisar();
		Page.SerasaSim();
		Page.ClicarExibir();
		Page.VerificarSerasa();

	}

	@Test
	public void RestritivoSerasaPF() throws SQLException {

		Page = new RestritivoPage();
		//Page.AtualizarDataConsultaSerasaPF();
		Page.EntrarMenuLateral();
		Page.ClicarRestritivo();
		Page.ClicarManter();
		Page.EntrarRestritivo();
		Page.NumeroDocumento("48626341920 ");
		Page.ClicarPesquisar();
		Page.SerasaSim();
		Page.ClicarExibir();
		Page.VerificarSerasa();

	}

}
