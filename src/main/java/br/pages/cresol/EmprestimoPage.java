package br.pages.cresol;

import static br.core.cresol.DriverFactory.getDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.core.cresol.BasePage;

public class EmprestimoPage extends BasePage {

	/**
	 * Metodos com o back end para validar a tela Emprestimos
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void EntrarMenuLateral() {

		dsl.entrarMenuLateral();

	}

	public void ClicarEmprestimoseFinanciamentos() {

		// dsl.clicarLink("Empréstimos e Financiamentos");
		dsl.clicar("webfx-tree-object-92-anchor");// Local 130

	}

	public void ClicarEmprestimos() {

		// dsl.clicarLink("Empréstimos");
		dsl.clicar("webfx-tree-object-93-anchor");// Local 130

	}

	public void ClicarManter() {

		// dsl.clicar("ssubmenu13");
		dsl.clicar("webfx-tree-object-94-anchor");// Local 130

	}

	public void ClicarManterAlcada() {

		dsl.clicar("webfx-tree-object-449-anchor");// Local 130

	}
	
	public void ClicarScore() {

		dsl.clicar("webfx-tree-object-275-anchor");// Local 130
		dsl.clicar("webfx-tree-object-276-anchor");// Local 130

	}
	
	public void EntrarTelaScore() {

		dsl.entrarModulo();

	}

	public void EntrarTelaAlcada() {

		dsl.entrarModulo();

	}

	public void EntrarTelaEmprestimo() {

		dsl.entrarModulo();

	}

	public void PreencherModalidade(String mod) {

		dsl.escrever("codigoOperacaoCampo", mod);

	}

	public void PreencherNroContrato(String contrato) {

		dsl.escreverbyname("nrContrato", contrato);

	}

	public void PreencherCooperativa(String coop) {

		dsl.escrever("codigoCooperativaConta", coop);

	}

	public void PreencherNroContratoAlcada(String contrato) {

		dsl.escreverbyname("numeroDocumentoAlcada", contrato);

	}

	public void ClicarPesquisar() throws InterruptedException {

		dsl.clicar("Pesquisar");

	}
	
	public void ClicarCheckDoc() throws InterruptedException {

		dsl.clicar("pesquisaPesquisa");

	}

	public void ClicarEstornarCancelar() {

		dsl.clicarcss("#actionCampoGrid_1_5 .imgGrid");

	}

	public void ClicarPropostaDeCredito() {

		dsl.clicarcss("#actionCampoGrid_1_5 .imgGrid");

	}
	
	public void ClicarPropostaDeCreditoEmprestimo() {

		dsl.clicar("icon_proposta");

	}
	
	public void ClicarExibir() {

		dsl.clicarcss("#actionCampoGrid_1_1 .imgGrid");

	}

	public void ClicarConfirmarLiberar() throws InterruptedException {

		dsl.clicarcss("#actionCampoGrid_1_4 .imgGrid");

	}

	
	public void ClicarExibirScore(){
		
		
		dsl.clicarcss("#actionCampoGrid_1_1 .imgGrid");
		
		
	}
	
	public void ClicarCheck() {

		dsl.clicarBotaoname("check");

	}
	
	public void PreencherNroDocumento(String doc){
		
		dsl.escrever("numeroDocumento", doc);
		
	}

	public void VerificarConsultaDesatualizadaPF() {

		WebElement msg21 = getDriver().findElement(By.cssSelector("#linhaTabela_1 > td:nth-child(9) > .word-wrap"));
		String mensagem21 = msg21.getText();
		dsl.verificarString(mensagem21, "CONSULTA DESATUALIZADA");

	}

	public void VerificarConsultaDesatualizada() {

		WebElement msg21 = getDriver().findElement(By.cssSelector("#linhaTabela_1 > td:nth-child(9) > .word-wrap"));
		String mensagem21 = msg21.getText();
		dsl.verificarString(mensagem21, "CONSULTA DESATUALIZADA");

	}

	public void VerificarAssociadoComRestritivo() {

		WebElement msg21 = getDriver().findElement(By.cssSelector("#linhaTabela_1 > td:nth-child(9) > .word-wrap"));
		String mensagem21 = msg21.getText();
		dsl.verificarString(mensagem21, "COM RESTRITIVOS");

	}
	
	public void VerificarAssociadoComRestritivo2() {

		WebElement msg21 = getDriver().findElement(By.cssSelector("#linhaTabela_3 > td:nth-child(9) > .word-wrap"));
		String mensagem21 = msg21.getText();
		dsl.verificarString(mensagem21, "COM RESTRITIVOS");

	}


	public void VerificarConsultaDesatualizadaPJ() {

		WebElement msg21 = getDriver().findElement(By.cssSelector("#linhaTabela_1 > td:nth-child(9) > .word-wrap"));
		String mensagem21 = msg21.getText();
		dsl.verificarString(mensagem21, "CONSULTA DESATUALIZADA");

	}

	public void VerificarConsultaDesatualizadaPJ2() {

		WebElement msg21 = getDriver().findElement(By.cssSelector("#linhaTabela_3 > td:nth-child(9) > .word-wrap"));
		String mensagem21 = msg21.getText();
		dsl.verificarString(mensagem21, "CONSULTA DESATUALIZADA");

	}

	public void VerificarDataHoraRestritivoExterno() {

		WebElement msg21 = getDriver()
				.findElement(By.cssSelector(".form_tabela:nth-child(64) tr:nth-child(3) #simples_idLabel"));
		String mensagem21 = msg21.getText();
		dsl.verificarString(mensagem21, "Data/hora da consulta Restritivo Externo");

		try {

			PrintStream log2 = new PrintStream(new File(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Label_data_hora_restritivo_externo.txt"));
			System.setOut(log2);
			log2.print(mensagem21 + "--" + "Valor Colmeia\n");

		} catch (FileNotFoundException fx) {

			System.out.println(fx);

		}

	}
	
	public void VerificarDataHoraRestritivoExternoEmprestimo() {

		WebElement msg21 = getDriver()
				.findElement(By.cssSelector(".form_tabela:nth-child(64) tr:nth-child(3) #simples_idLabel"));
		String mensagem21 = msg21.getText();
		dsl.verificarString(mensagem21, "Data/hora da consulta Restritivo Externo");

		try {

			PrintStream log2 = new PrintStream(new File(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Label_data_hora_restritivo_externo_Emprestimo.txt"));
			System.setOut(log2);
			log2.print(mensagem21 + "--" + "Valor Colmeia\n");

		} catch (FileNotFoundException fx) {

			System.out.println(fx);

		}

	}
	
	public void VerificarDataConsultaExterna() {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String today = sdf.format( new Date( System.currentTimeMillis()));
		
		WebElement msg21 = getDriver()
				.findElement(By.cssSelector(".form_tabela:nth-child(65) tr:nth-child(3) > .form_text"));
		String mensagem21 = msg21.getText();
		
		dsl.verificarDiferente(mensagem21, today);
		System.out.println(today);
		System.out.println(mensagem21);

		try {

			PrintStream log2 = new PrintStream(new File(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Simulacao_nao_faz_consulta_externa.txt"));
			System.setOut(log2);
			log2.print(mensagem21 + "--" + "Valor Colmeia\n");
			log2.print(today + "--" + "Data de hoje\n");

		} catch (FileNotFoundException fx) {

			System.out.println(fx);

		}

	}
	
	public void VerificarDataConsultaExternaEmprestimo() {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String today = sdf.format( new Date( System.currentTimeMillis()));
		
		WebElement msg21 = getDriver()
				.findElement(By.cssSelector(".form_tabela:nth-child(64) tr:nth-child(3) > .form_text"));
		String mensagem21 = msg21.getText();
		
		dsl.verificarDiferente(mensagem21, today);
		

		try {

			PrintStream log2 = new PrintStream(new File(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Emprestimo_nao_faz_consulta_externa.txt"));
			System.setOut(log2);
			log2.print(mensagem21 + "--" + "Valor Colmeia\n");
			log2.print(today + "--" + "Data de hoje\n");

		} catch (FileNotFoundException fx) {

			System.out.println(fx);

		}

	}

	public void ClicarSim() throws InterruptedException {
		Thread.sleep(5000);
		dsl.sairFrame();
		dsl.entrarFrameindex(0);
		dsl.clicar("dvBg");
		dsl.sairFrame();
		dsl.entrarFrameindex(2);
		dsl.entrarFrameindex(0);
		dsl.entrarFrameindex(0);
		dsl.clicarcss(".form_botao:nth-child(1)");

	}

	public void ClicarConsultarRestritivo() throws InterruptedException {
		Thread.sleep(5000);
		dsl.clicarcss("#actionCampoGrid_1_2 .imgGrid");

	}

	public void ClicarConsultarRestritivo2() throws InterruptedException {
		Thread.sleep(5000);
		dsl.clicarcss("#actionCampoGrid_2_2 .imgGrid");

	}
	
	public void ClicarConsultarRestritivo3() throws InterruptedException {
		Thread.sleep(5000);
		dsl.clicarcss("#actionCampoGrid_3_2 .imgGrid");

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
		dsl.verificarMensagens(" Cancelamento/estorno efetuado com sucesso.");

	}

	public void VerificarMensagemDeConsultaDesatualizada() {

		dsl.sairFrame();
		dsl.entrarFrameindex(0);
		dsl.clicar("dvBg");
		dsl.sairFrame();
		dsl.entrarFrameindex(2);
		dsl.entrarFrameindex(0);
		dsl.entrarFrameindex(0);
		dsl.clicar("tbMsg");
		dsl.verificarMensagens(
				" Atenção! Um ou mais registros de cobrança selecionados não possuem consulta atualizada ou constam restritivos em aberto. Deseja continuar sem a atualização dos restritivos?");

	}

	public void ValidarMensagemConsultaJaRealizadaNoDiaBoaVista() throws InterruptedException {
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
		dsl.verificarString(
				" Deseja fazer uma nova consulta ao Boa Vista, isso pode acarretar em custos a cooperativa?",
				mensagem);

	}
	
	public void ValidarMensagemConsultaJaRealizadaNoDiaSerasa() throws InterruptedException {
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
		dsl.verificarString(
				" Deseja fazer uma nova consulta ao Serasa, isso pode acarretar em custos a cooperativa?",
				mensagem);

	}

	public void incluirParecer() {
		dsl.incluirParecer();

	}

	public void ClicarConfirmar() throws InterruptedException {
		Thread.sleep(3000);
		dsl.clicar("Confirmar");

	}

	public void VerificarConsultaSemRestritivo() {
		WebElement msg23 = getDriver().findElement(By.cssSelector("#linhaTabela_1 > td:nth-child(9) > .word-wrap"));
		String mensagem23 = msg23.getText();
		dsl.verificarString(mensagem23, "SEM RESTRITIVOS");

	}
	
	public void VerificarConsultaSemRestritivoReserva() {
		WebElement msg23 = getDriver().findElement(By.cssSelector("#linhaTabela_3 > td:nth-child(9) > .word-wrap"));
		String mensagem23 = msg23.getText();
		dsl.verificarString(mensagem23, "SEM RESTRITIVOS");

	}


	public void VerificarConsultaBoaVista() throws InterruptedException {
		Thread.sleep(15000);
		WebElement msg23 = getDriver().findElement(By.cssSelector("#linhaTabela_1 > td:nth-child(9) > .word-wrap"));
		String mensagem23 = msg23.getText();
		dsl.verificarDiferente("CONSULTA DESATUALIZADA", mensagem23);

	}
	
	public void VerificarConsultaBoaVistaReserva() throws InterruptedException {
		Thread.sleep(15000);
		WebElement msg23 = getDriver().findElement(By.cssSelector("#linhaTabela_3 > td:nth-child(9) > .word-wrap"));
		String mensagem23 = msg23.getText();
		dsl.verificarDiferente("CONSULTA DESATUALIZADA", mensagem23);

	}

	public void VerificarConsultaSerasa() throws InterruptedException {
		Thread.sleep(15000);

		WebElement msg23 = getDriver().findElement(By.cssSelector("#linhaTabela_1 > td:nth-child(9) > .word-wrap"));
		String mensagem23 = msg23.getText();
		dsl.verificarDiferente("CONSULTA DESATUALIZADA", mensagem23);

	}

	public void VerificarConsultaSerasaPF() throws InterruptedException {
		Thread.sleep(5000);

		WebElement msg23 = getDriver().findElement(By.cssSelector("#linhaTabela_2 > td:nth-child(9) > .word-wrap"));
		String mensagem23 = msg23.getText();
		dsl.verificarDiferente("CONSULTA DESATUALIZADA", mensagem23);

	}

	public void ValidarConsultaSerasaPF() throws SQLException, InterruptedException, Exception {
		Thread.sleep(15000);
		String query = "select * from tb_gfc_restritivo_serasa_bureau where rsb_cpf_cnpj = 01720108960 ORDER BY rsb_data_hora_atualizacao DESC limit 1";
		ResultSet rs = con.executaBusca(query);

		try {

			while (rs.next()) {
				String sit = rs.getString("rsb_situacao");
				String situacao = sit;
				dsl.verificarString("11289", situacao);

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Duplicata/Consulta_Serasa_PF.txt"));
					System.setOut(log2);
					log2.print(situacao + "--" + "Valor da Base - rsb_situacao\n");
					log2.print(11289 + "--" + "Consulta reaiizada\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public void ValidarConsultaSerasaPJ() throws SQLException, InterruptedException {
		Thread.sleep(15000);
		String query = "select * from tb_gfc_restritivo_serasa_bureau where rsb_cpf_cnpj = 08397696000143 ORDER BY rsb_data_hora_atualizacao DESC limit 1";
		ResultSet rs = con.executaBusca(query);

		try {

			while (rs.next()) {
				String sit = rs.getString("rsb_situacao");
				String situacao = sit;
				dsl.verificarString(situacao, "11289");

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Duplicata/Consulta_Serasa_PJ.txt"));
					System.setOut(log2);
					log2.print(situacao + "--" + "Valor da Base - rsb_situacao\n");
					log2.print(11289 + "--" + "Consulta reaiizada\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void ValidarConsultaBoaVistaPJ() throws SQLException, InterruptedException {
		Thread.sleep(15000);
		String query = "select * from restritivo_bureau  where nro_documento = 6374930000191 ORDER BY dt_hr_atualizacao DESC limit 1";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {
				String sit = rs.getString("situacao");
				String situacao = sit;
				dsl.verificarString(situacao, "11289");

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Duplicata/Consulta_BoaVista_PJ.txt"));
					System.setOut(log2);
					log2.print(situacao + "--" + "Valor da Base - situacao\n");
					log2.print(11289 + "--" + "Consulta reaiizada\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void ValidarConsultaBoaVistaPF() throws SQLException, InterruptedException {
		Thread.sleep(15000);
		String query = "select * from restritivo_bureau  where nro_documento = 03087448966  ORDER BY dt_hr_atualizacao DESC limit 1";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {
				String sit = rs.getString("situacao");
				String situacao = sit;
				dsl.verificarString(situacao, "11289");

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Duplicata/Consulta_BoaVista_PF.txt"));
					System.setOut(log2);
					log2.print(situacao + "--" + "Valor da Base - situacao\n");
					log2.print(11289 + "--" + "Consulta reaiizada\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void ResetarDadosSerasa(String doc) throws SQLException {

		try {

			String query = "update tb_gfc_restritivo_serasa_bureau set rsb_cpf_cnpj = 33366699910 where rsb_cpf_cnpj =  " + doc;

			con.executaBusca(query);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public void ResetarDadosBoaVista(String doc) throws SQLException {

		try {

			String query = "update restritivo_bureau set nro_documento = 33366699910 where nro_documento = " + doc;
			con2.executaBusca(query);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
	
	
	public void RegredirDadosBoaVista(String doc) throws SQLException {

		try {

			String query = "update restritivo_bureau   set  nro_documento = 33366699910 where usuario = '88888' and nro_documento = " + doc;
			con2.executaBusca(query);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public void DataAtual(String doc) throws SQLException {
		try {

			String query = "update restritivo_bureau  set dt_hr_atualizacao = CURRENT_TIMESTAMP where usuario = 'AUTOMACAODUPCOMRES'  and nro_documento =  " + doc;
			con2.executaBusca(query);

		} catch (Exception e) {

			e.printStackTrace();
			
			

		}
	}

	public void DataAtualSemRestritivo(String doc) throws SQLException {
		try {

			String query = "update restritivo_bureau  set dt_hr_atualizacao = CURRENT_TIMESTAMP where usuario = 'AUTOMACAODUPSEMRES'  and nro_documento =  "
					+ doc;
			con2.executaBusca(query);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public void DataAtualSerasaSemRestritivo(String doc) throws SQLException {
		try {

			String query = "update tb_gfc_restritivo_serasa_bureau set rsb_data_hora_atualizacao = CURRENT_TIMESTAMP where rsb_usuario = 'AUTOMACAODUPSERASA' and rsb_cpf_cnpj = "
					+ doc;
			con.executaBusca(query);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public void DataAtualSerasaComRestritivo(String doc) throws SQLException {
		try {

			String query = "update tb_gfc_restritivo_serasa_bureau set rsb_data_hora_atualizacao = CURRENT_TIMESTAMP where rsb_usuario = 'AUTOMACAODUPSERASA2' and rsb_cpf_cnpj = " + doc;
			con.executaBusca(query);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public void Print(String caminho) throws IOException, InterruptedException {

		dsl.print(caminho);

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

	public void ConferirData() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String today = sdf.format(new Date(System.currentTimeMillis()));

		String resultado = PegarDataGea();

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false);
		java.util.Date d1 = df.parse(today);

		java.util.Date d2 = df.parse(resultado);

		long dt = (d1.getTime() - d2.getTime());
		long periodo = dt / 86400000L;
		System.out.println(periodo);
		System.out.println(PegarDataGea());
	}
	
	public String PegarDataGea() {
		
		getDriver().switchTo().frame(0);
		WebElement data = getDriver().findElement(By.id("sp_dataAtual"));
		String dia = data.getText();
		String dt = dia;
		String[] textoSeparado2 = dt.split(",");
		ArrayList<String> dt2 = new ArrayList<String>();
		dt2.add(textoSeparado2[0]);
		dt2.add(textoSeparado2[1]);
		String pegar2 = (String) dt2.get(1);
		//pegar2 = pegar2.replaceAll("[^0-9]", "");
		String datadeposito = (String) pegar2;
		
		
		return datadeposito;
		
		
		
	} 
	
	
	
	public void ValidarDiferencaDeDiasRestritivoRelevantesSerasa() throws SQLException, InterruptedException {
		
		String query = "select sci_versao, reg_cod_registro, sci_nro_documento, sci_vl_referencia,  tgr1.reg_descricao,  tgr1.reg_complemento, sci_vl_registro, * from tb_gfe_score_informacao, tb_gen_registro tgr1 where sci_tipo_score = tgr1.reg_id_registro and sci_nro_documento = 09033677776 and sci_tipo_score ='2412' order by sci_versao desc limit 1";
		ResultSet rs = con.executaBusca(query);

		try {

			while (rs.next()) {
				Date d = rs.getDate("sci_versao");
				Date data = d;
				
				
				String dtemp = "10/07/2017";
				
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				
				
				df.setLenient(false);
				

				java.util.Date d2 = df.parse(dtemp);

				long dt = (data.getTime() - d2.getTime());
				long periodo = (dt / 86400000L) + 1;
				
				long dias = rs.getLong("sci_vl_referencia");
				long demp = dias;
				
				dsl.verificarLong(periodo, demp);
				
				
				
				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Contratar/Sem_Restritivo_Nao_Relevantes_Serasa.txt"));
					System.setOut(log2);
					log2.print(periodo + "--" + "Valor da Base - sci_vl_referencia\n");
					log2.print(demp + "--" + "Dias de restritivo\n");
							

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public void ValidarSemRestritivoNaoRelevantesSerasaAssociado() throws SQLException, InterruptedException {
		
		String query = "select sci_versao, reg_cod_registro, sci_nro_documento, sci_vl_referencia,  tgr1.reg_descricao,  tgr1.reg_complemento, sci_vl_registro, * from tb_gfe_score_informacao, tb_gen_registro tgr1 where sci_tipo_score = tgr1.reg_id_registro and sci_nro_documento = 09033677776 and sci_tipo_score ='2926' order by sci_versao desc limit 1";
		ResultSet rs = con.executaBusca(query);

		try {

			while (rs.next()) {
				int sem = rs.getInt("sci_vl_referencia");
				int zerado = sem;
				
				int valorzerado = 0;
			
				
				dsl.verificarInteiro(zerado, valorzerado);
				
				
				
				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Contratar/Sem_Restritivo_Nao_Relevantes_BoaVista_PF.txt"));
					System.setOut(log2);
					log2.print(zerado + "--" + "Valor da Base - sci_vl_referencia\n");
					log2.print(valorzerado + "--" + "Dias de restritivo\n");
							

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	
public void ValidarDiferencaDeDiasRestritivoRelevantesBoaVistaPJ() throws SQLException, InterruptedException {
		
		String query = "select sci_versao, reg_cod_registro, sci_nro_documento, sci_vl_referencia,  tgr1.reg_descricao,  tgr1.reg_complemento, sci_vl_registro, * from tb_gfe_score_informacao, tb_gen_registro tgr1 where sci_tipo_score = tgr1.reg_id_registro and sci_nro_documento = 26625721000180 and sci_tipo_score ='2412' order by sci_versao desc limit 1";
		ResultSet rs = con.executaBusca(query);

		try {

			while (rs.next()) {
				Date d = rs.getDate("sci_versao");
				Date data = d;
				
				
				String dtemp = "29/07/2016";
				
				DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
				
				
				df.setLenient(false);
				

				java.util.Date d2 = df.parse(dtemp);

				long dt = (data.getTime() - d2.getTime());
				long periodo = (dt / 86400000L) + 1;
				
				long dias = rs.getLong("sci_vl_referencia");
				long demp = dias;
				
				dsl.verificarLong(periodo, demp);
			
				
				
				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Contratar/Dias_Relavantes_Boa_Vista_PJ.txt"));
					System.setOut(log2);
					log2.print(periodo + "--" + "Valor da Base - sci_vl_referencia\n");
					log2.print(demp + "--" + "Dias de restritivo\n");
							

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	} 


public void ValidarDiferencaDeDiasRestritivoRelevantesBoaVistaSemRestritivos() throws SQLException, InterruptedException {
	
	String query = "select sci_versao, reg_cod_registro, sci_nro_documento, sci_vl_referencia,  tgr1.reg_descricao,  tgr1.reg_complemento, sci_vl_registro, * from tb_gfe_score_informacao, tb_gen_registro tgr1 where sci_tipo_score = tgr1.reg_id_registro and sci_nro_documento = 53892690987 and sci_tipo_score ='2412' order by sci_versao desc limit 1";
	ResultSet rs = con.executaBusca(query);

	try {

		while (rs.next()) {
			int sem = rs.getInt("sci_vl_referencia");
			int zerado = sem;
			
			int valorzerado = 0;
		
			
			dsl.verificarInteiro(zerado, valorzerado);
		
			
			
			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Contratar/Dias_Sem_Restritivo_BoaVista.txt"));
				System.setOut(log2);
				log2.print(zerado + "--" + "Valor da Base - sci_vl_referencia\n");
				log2.print(valorzerado + "--" + "Dias de restritivo\n");
						

			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}

public void ValidarDiferencaDeDiasRestritivoRelevantesBoaVistaPF() throws SQLException, InterruptedException {
	
	String query = "select sci_versao, reg_cod_registro, sci_nro_documento, sci_vl_referencia,  tgr1.reg_descricao,  tgr1.reg_complemento, sci_vl_registro, * from tb_gfe_score_informacao, tb_gen_registro tgr1 where sci_tipo_score = tgr1.reg_id_registro and sci_nro_documento = 6084497926 and sci_tipo_score ='2412' order by sci_versao desc limit 1";
	ResultSet rs = con.executaBusca(query);

	try {

		while (rs.next()) {
			Date d = rs.getDate("sci_versao");
			Date data = d;
			
			
			String dtemp = "10/04/2020";
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			
			
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(dtemp);

			long dt = (data.getTime() - d2.getTime());
			long periodo = (dt / 86400000L) + 1;
			
			long dias = rs.getLong("sci_vl_referencia");
			long demp = dias;
			
			dsl.verificarLong(periodo, demp);
			
			
			
			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Contratar/Dias_BoaVista_PF.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Valor da Base - sci_vl_referencia\n");
				log2.print(demp + "--" + "Dias de restritivo\n");
						

			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

} 


public void ValidarDiferencaDeDiasRestritivoNaoRelevantesBoaVistaAssociado() throws SQLException, InterruptedException {
	
	String query = "select sci_versao, reg_cod_registro, sci_nro_documento, sci_vl_referencia,  tgr1.reg_descricao,  tgr1.reg_complemento, sci_vl_registro, * from tb_gfe_score_informacao, tb_gen_registro tgr1 where sci_tipo_score = tgr1.reg_id_registro and sci_nro_documento = 04396105916 and sci_tipo_score ='2926' order by sci_versao desc limit 1";
	ResultSet rs = con.executaBusca(query);

	try {

		while (rs.next()) {
			//Date d = rs.getDate("sci_versao");
			//Date data = d;
			
			
			String dtemp = PegarDataGea();
			String dtemp2 = "11/03/2017";
			
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			
			
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(dtemp);
			java.util.Date d3 = df.parse(dtemp2);

			//long dt = (data.getTime() - d2.getTime());
			long dt = ( d2.getTime() - d3.getTime());
			long periodo = (dt / 86400000L) + 1;
			long dias = rs.getLong("sci_vl_referencia");
			long demp = dias;
			
			dsl.verificarLong(periodo, demp);
			
			
			
			
			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Contratar/Dias_BoaVista_Nao_Relevantes_PF.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Valor da Base - sci_vl_referencia\n");
				log2.print(demp + "--" + "Dias de restritivo\n");
						

			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

} 


public void ValidarDiferencaDeDiasRestritivoNaoRelevantesBoaVistaGrupoEconomico() throws SQLException, InterruptedException {
	
	String query = "select sci_versao, reg_cod_registro, sci_nro_documento, sci_vl_referencia,  tgr1.reg_descricao,  tgr1.reg_complemento, sci_vl_registro, * from tb_gfe_score_informacao, tb_gen_registro tgr1 where sci_tipo_score = tgr1.reg_id_registro and sci_nro_documento = 09033677776 and sci_tipo_score ='2927' order by sci_versao desc limit 1";
	ResultSet rs = con.executaBusca(query);

	try {

		while (rs.next()) {
			//Date d = rs.getDate("sci_versao");
			//Date data = d;
			
			
			String dtemp = "11/03/2017";
			
			String dtemp2 = PegarDataGea();
			
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			
			
			df.setLenient(false);
			
			java.util.Date d1 = df.parse(dtemp2);
			java.util.Date d2 = df.parse(dtemp);

			long dt = (d1.getTime() - d2.getTime());
			long periodo = (dt / 86400000L) + 1;
			
			long dias = rs.getLong("sci_vl_referencia");
			long demp = dias;
			
			dsl.verificarLong(demp , periodo);
			
			
			
			
			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Contratar/Dias_BoaVista_Nao_Relevantes_PF.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Valor da Base - sci_vl_referencia\n");
				log2.print(demp + "--" + "Dias de restritivo\n");
						

			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

} 


public void ValidarSemRestritivoNaoRelevantesBoaVistaAssociadoPF() throws SQLException, InterruptedException {
	
	String query = "select sci_versao, reg_cod_registro, sci_nro_documento, sci_vl_referencia,  tgr1.reg_descricao,  tgr1.reg_complemento, sci_vl_registro, * from tb_gfe_score_informacao, tb_gen_registro tgr1 where sci_tipo_score = tgr1.reg_id_registro and sci_nro_documento = 6084497926 and sci_tipo_score ='2926' order by sci_versao desc limit 1";
	ResultSet rs = con.executaBusca(query);

	try {

		while (rs.next()) {
			int sem = rs.getInt("sci_vl_referencia");
			int zerado = sem;
			
			int valorzerado = 0;
		
			
			dsl.verificarInteiro(zerado, valorzerado);
			
			
			
			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Contratar/Sem_Restritivo_Nao_Relevantes_BoaVista_PF.txt"));
				System.setOut(log2);
				log2.print(zerado + "--" + "Valor da Base - sci_vl_referencia\n");
				log2.print(valorzerado + "--" + "Dias de restritivo\n");
						

			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}


public void ValidarSemRestritivoRelevantesBoaVistaGrupoEconomicoPF() throws SQLException, InterruptedException {
	
	String query = "select sci_versao, reg_cod_registro, sci_nro_documento, sci_vl_referencia,  tgr1.reg_descricao,  tgr1.reg_complemento, sci_vl_registro, * from tb_gfe_score_informacao, tb_gen_registro tgr1 where sci_tipo_score = tgr1.reg_id_registro and sci_nro_documento = 6084497926 and sci_tipo_score ='2413' order by sci_versao desc limit 1";
	ResultSet rs = con.executaBusca(query);

	try {

		while (rs.next()) {
			int sem = rs.getInt("sci_vl_referencia");
			int zerado = sem;
			
			int valorzerado = 0;
		
			
			dsl.verificarInteiro(zerado, valorzerado);
			
			
			
			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Contratar/Sem_Restritivo_Relevantes_BoaVista_Grupo_Economico_PF.txt"));
				System.setOut(log2);
				log2.print(zerado + "--" + "Valor da Base - sci_vl_referencia\n");
				log2.print(valorzerado + "--" + "Dias de restritivo\n");
						

			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}


public void ValidarSemRestritivoNaoRelevantesBoaVistaGrupoEconomicoPF() throws SQLException, InterruptedException {
	
	String query = "select sci_versao, reg_cod_registro, sci_nro_documento, sci_vl_referencia,  tgr1.reg_descricao,  tgr1.reg_complemento, sci_vl_registro, * from tb_gfe_score_informacao, tb_gen_registro tgr1 where sci_tipo_score = tgr1.reg_id_registro and sci_nro_documento = 6084497926 and sci_tipo_score ='2927' order by sci_versao desc limit 1";
	ResultSet rs = con.executaBusca(query);

	try {

		while (rs.next()) {
			int sem = rs.getInt("sci_vl_referencia");
			int zerado = sem;
			
			int valorzerado = 0;
		
			
			dsl.verificarInteiro(zerado, valorzerado);
			
			
			
			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Contratar/Sem_Restritivo_Nao_Relevantes_BoaVista_Grupo_Economico.txt"));
				System.setOut(log2);
				log2.print(zerado + "--" + "Valor da Base - sci_vl_referencia\n");
				log2.print(valorzerado + "--" + "Dias de restritivo\n");
						

			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}


public void ValidarSemRestritivoNaoRelevantesBoaVistaAssociadoPJ() throws SQLException, InterruptedException {
	
	String query = "select sci_versao, reg_cod_registro, sci_nro_documento, sci_vl_referencia,  tgr1.reg_descricao,  tgr1.reg_complemento, sci_vl_registro, * from tb_gfe_score_informacao, tb_gen_registro tgr1 where sci_tipo_score = tgr1.reg_id_registro and sci_nro_documento = 26625721000180 and sci_tipo_score ='2926' order by sci_versao desc limit 1";
	ResultSet rs = con.executaBusca(query);

	try {

		while (rs.next()) {
			int sem = rs.getInt("sci_vl_referencia");
			int zerado = sem;
			
			int valorzerado = 0;
		
			
			dsl.verificarInteiro(zerado, valorzerado);
			
			
			
			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Contratar/Sem_Restritivos_Nao_Relavantes_BoaVista_PJ.txt"));
				System.setOut(log2);
				log2.print(zerado + "--" + "Valor da Base - sci_vl_referencia\n");
				log2.print(valorzerado + "--" + "Dias de restritivo\n");
						

			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}


public void ValidarClassificacaoScoragem() throws SQLException, InterruptedException {
	
	String query = "select tgr2.reg_cod_dominio, tgd.dom_descricao, scr_classificacao_apurada, tgr1.reg_descricao, scr_classificacao_final, tgr2.reg_descricao, *from tb_gfe_score, tb_gen_registro tgr1, tb_gen_registro tgr2, tb_gen_dominio tgd where tgr2.reg_cod_dominio = tgd.dom_codigo and scr_classificacao_final = tgr1.reg_id_registro and scr_classificacao_apurada = tgr2.reg_id_registro and scr_nro_documento = 53892690987  order by scr_versao desc limit 1";
	ResultSet rs = con.executaBusca(query);

	try {

		while (rs.next()) {
			String clss = rs.getString("reg_descricao");
			String clas = clss;
			
			WebElement msg23 = getDriver().findElement(By.id("classificacaoFinal"));
			String mensagem23 = msg23.getText();
			dsl.verificarString(mensagem23, clas);

			
		
			
			
			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Contratar/Classificacao_Scoragem.txt"));
				System.setOut(log2);
				log2.print(clas + "--" + "Valor da Base - reg_desscricao\n");
				log2.print(mensagem23 + "--" + "valor colmeia\n");
						

			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

} 


public void ValidarApuracaoResultadoFinalRestritivo() throws SQLException, InterruptedException {
	
	String query = "select * from tb_gfe_score_item where sci_nro_documento =  53892690987 and sci_versao >= '2020-11-10' and sci_tipo_score in ('2413', '2926','2927', '2412') order by sci_nota_ponderada desc limit 1";
	ResultSet rs = con.executaBusca(query);

	try {

		while (rs.next()) {
			String nt = rs.getString("sci_nota_ponderada");
			String nota = nt;
			
			String nota2 = nota.replace(".", ",");
			
			WebElement msg23 = getDriver().findElement(By.cssSelector("#list_tabela_criteriosPrincipais #linhaTabela_1 > td:nth-child(2) > .word-wrap"));
			String mensagem23 = msg23.getText();
			dsl.verificarString(mensagem23, nota2);

			
		
			
			
			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Contratar/Apuracao_Resultado_Final.txt"));
				System.setOut(log2);
				log2.print(nota2 + "--" + "Valor da Base - reg_desscricao\n");
				log2.print(mensagem23 + "--" + "valor colmeia\n");
						

			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}


public void ValidarApuracaoFinalCooperadoExternaInterna() throws SQLException, InterruptedException {
	
	String query = "select sum(sci_nota_ponderada), count(1), sum(sci_nota_ponderada)/count(1) from tb_gfe_score_item, tb_gen_registro tgr1 where sci_tipo_score = tgr1.reg_id_registro and sci_nro_documento =  53892690987  and sci_versao >= '2020-11-10'  and sci_tipo_score in (select reg_id_registro from tb_gen_registro where reg_cod_dominio = '3317'  and reg_cod_registro in ('37', '43') order by sci_nota_ponderada desc)";
	ResultSet rs = con.executaBusca(query);

	try {

		while (rs.next()) {
			String nt = rs.getString("?column?");
			String nota = nt;
			String nota2 = nota.replace("0", "");
			
		
			
			WebElement msg23 = getDriver().findElement(By.xpath("//table[7]/tbody/tr[2]/td[2]/p"));
			String mensagem23 = msg23.getText();
			String nota3 = mensagem23.replace(",", ".");
			dsl.verificarString(nota3, nota2);
			

			
		
			
			
			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Contratar/Apuracao_Final_Externa_Interna.txt"));
				System.setOut(log2);
				log2.print(nota2 + "--" + "Valor da Base\n");
				log2.print(nota3 + "--" + "valor colmeia\n");
						

			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}


public void ValidarAvaliacaoDaOperacao() throws SQLException, InterruptedException {
	
	String query = "select sum(sci_nota_ponderada), count(1), sum(sci_nota_ponderada)/count(1) from tb_gfe_score_item, tb_gen_registro tgr1 where sci_tipo_score = tgr1.reg_id_registro and sci_nro_documento =  53892690987  and sci_versao >= '2020-11-10'  and sci_tipo_score in (select reg_id_registro from tb_gen_registro where reg_cod_dominio = '3317'  and reg_cod_registro = '45' order by sci_nota_ponderada desc)";
	ResultSet rs = con.executaBusca(query);

	try {

		while (rs.next()) {
			String nt = rs.getString("?column?");
			String nota = nt;
			String nota2 = nota.replace("0", "");
			
		
			
			WebElement msg23 = getDriver().findElement(By.cssSelector("#list_tabela_criteriosAvaliacoesOperacoesGridPrincipal td:nth-child(2) > .word-wrap"));
			String mensagem23 = msg23.getText();
			String nota3 = mensagem23.replace(",", ".");
			String nota5 = nota3.replace("0", "");
			dsl.verificarString(nota5, nota2);
			
			

			
		
			
			
			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Contratar/Avaliacao_Da_Operacao.txt"));
				System.setOut(log2);
				log2.print(nota2 + "--" + "Valor da Base\n");
				log2.print(nota3 + "--" + "valor colmeia\n");
						

			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}

public void VerificarPendenciaPagamento() throws SQLException, InterruptedException {

	String query = "select * from restritivo_pendencia_pagamento  where nro_documento = 6898636910";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_registro");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[9]/tbody/tr[2]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[9]/tbody/tr[2]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Pendência de Pagamento");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[9]/tbody/tr[2]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[9]/tbody/tr[2]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "6898636910");
			

			BigDecimal ban = rs.getBigDecimal("vl_debito");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					By.xpath("//table[9]/tbody/tr[2]/td[7]"));
					//By.xpath("//table[@id='list_tabela_null']/tbody/tr[2]/td[7])[2]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[9]/tbody/tr[2]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L) + 1;
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Simulacao_Exibir_Pendencia_PF.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print(pegar2 + "--" + "Valor da Base - \n");
				log2.print(pegar3 + "--" + "Valor colmeia - valor\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Pendência de Pagamento" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("6898636910" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}

public void VerificarPendenciaPagamentoGE() throws SQLException, InterruptedException {

	String query = "select * from restritivo_pendencia_pagamento  where nro_documento = 07134529940";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_registro");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[7]/tbody/tr[2]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[7]/tbody/tr[2]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Pendência de Pagamento");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[7]/tbody/tr[2]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[7]/tbody/tr[2]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "7134529940");
			

			BigDecimal ban = rs.getBigDecimal("vl_debito");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					By.xpath("//table[7]/tbody/tr[2]/td[7]"));
					//By.xpath("//table[@id='list_tabela_null']/tbody/tr[2]/td[7])[2]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[7]/tbody/tr[2]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L);
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Simulacao_Exibir_Pendencia_GE_PF.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print(pegar2 + "--" + "Valor da Base - \n");
				log2.print(pegar3 + "--" + "Valor colmeia - valor\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Pendência de Pagamento" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("7134529940" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}

public void VerificarPendenciaPagamentoGEEmprestimo() throws SQLException, InterruptedException {

	String query = "select * from restritivo_pendencia_pagamento  where nro_documento = 7092012902 ";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_registro");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[8]/tbody/tr[2]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[8]/tbody/tr[2]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Pendência de Pagamento");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[8]/tbody/tr[2]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[8]/tbody/tr[2]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "7092012902");
			

			BigDecimal ban = rs.getBigDecimal("vl_debito");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					By.xpath("//table[8]/tbody/tr[2]/td[7]"));
					//By.xpath("//table[@id='list_tabela_null']/tbody/tr[2]/td[7])[2]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[8]/tbody/tr[2]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L) + 1;
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Emprestimo_Exibir_Pendencia_GE_PF.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print(pegar2 + "--" + "Valor da Base - \n");
				log2.print(pegar3 + "--" + "Valor colmeia - valor\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Pendência de Pagamento" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("7092012902" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}



public void VerificarPendenciaPagamentoAssociadoEmprestimo() throws SQLException, InterruptedException {

	String query = "select * from restritivo_pendencia_pagamento  where dt_hr_atualizacao = '2020-11-06 08:26:13.139842' ";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_registro");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[2]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[2]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Pendência de Pagamento");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[2]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[2]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "6084497926");
			

			BigDecimal ban = rs.getBigDecimal("vl_debito");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[2]/td[7]"));
					//By.xpath("//table[@id='list_tabela_null']/tbody/tr[2]/td[7])[2]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[10]/tbody/tr[2]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L) + 1;
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Emprestimo_Exibir_Pendencia_Associado_PF.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print(pegar2 + "--" + "Valor da Base - \n");
				log2.print(pegar3 + "--" + "Valor colmeia - valor\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Pendência de Pagamento" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("6084497926" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}


public void VerificarProtesto() throws SQLException, InterruptedException {

	String query = "select * from restritivo_protesto  where nro_documento = 6898636910";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_protesto");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[9]/tbody/tr[3]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[9]/tbody/tr[3]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Protesto");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[9]/tbody/tr[3]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[9]/tbody/tr[3]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "6898636910");
			

			BigDecimal ban = rs.getBigDecimal("vl_protesto");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					By.xpath("//table[9]/tbody/tr[3]/td[7]"));
					//By.xpath("//table[@id='list_tabela_null']/tbody/tr[2]/td[7])[2]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[9]/tbody/tr[3]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L);
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Simulacao_Exibir_Protesto_PF.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print(pegar2 + "--" + "Valor da Base - \n");
				log2.print(pegar3 + "--" + "Valor colmeia - valor\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Protesto" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("6898636910" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}

public void VerificarProtestoGE() throws SQLException, InterruptedException {

	String query = "select * from restritivo_protesto  where nro_documento = 07134529940";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_protesto");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[7]/tbody/tr[3]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[7]/tbody/tr[3]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Protesto");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[7]/tbody/tr[3]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[7]/tbody/tr[3]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "7134529940");
			

			BigDecimal ban = rs.getBigDecimal("vl_protesto");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					//By.xpath("//table[8]/tbody/tr[3]/td[7]"));
					By.xpath("//table[7]/tbody/tr[3]/td[7]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[7]/tbody/tr[3]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L);
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Simulacao_Exibir_Protesto_GE_PF.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print(pegar2 + "--" + "Valor da Base - \n");
				log2.print(pegar3 + "--" + "Valor colmeia - valor\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Protesto" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("07134529940" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}


public void VerificarProtestoGEEmprestimo() throws SQLException, InterruptedException {

	String query = "select * from restritivo_protesto  where nro_documento = 7092012902 ";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_protesto");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[@id='list_tabela_null']/tbody/tr[3]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[@id='list_tabela_null']/tbody/tr[3]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Protesto");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[@id='list_tabela_null']/tbody/tr[3]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[@id='list_tabela_null']/tbody/tr[3]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "7092012902");
			

			BigDecimal ban = rs.getBigDecimal("vl_protesto");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					//By.xpath("//table[8]/tbody/tr[3]/td[7]"));
					By.xpath("//table[@id='list_tabela_null']/tbody/tr[3]/td[7]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[@id='list_tabela_null']/tbody/tr[3]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L) + 1;
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Emprestimo_Exibir_Protesto_GE_PF.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print(pegar2 + "--" + "Valor da Base - \n");
				log2.print(pegar3 + "--" + "Valor colmeia - valor\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Protesto" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("7092012902 " + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}

public void VerificarProtestoAssociadoEmprestimo() throws SQLException, InterruptedException {

	String query = "select * from restritivo_protesto  where dt_hr_atualizacao = '2020-11-06 08:26:13.139842' ";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_protesto");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[3]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[3]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Protesto");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[3]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[3]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "6084497926");
			

			BigDecimal ban = rs.getBigDecimal("vl_protesto");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					//By.xpath("//table[8]/tbody/tr[3]/td[7]"));
					By.xpath("//table[10]/tbody/tr[3]/td[7]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[10]/tbody/tr[3]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L) + 1;
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Emprestimo_Exibir_Protesto_Associado_PF.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print(pegar2 + "--" + "Valor da Base - \n");
				log2.print(pegar3 + "--" + "Valor colmeia - valor\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Protesto" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("6084497926 " + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}



public void VerificarChequeSemFundoPF() throws SQLException, InterruptedException {

	String query = "select * from restritivo_devolucao_cheque  where nro_documento = 6898636910";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_ocorrencia");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[9]/tbody/tr[4]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[9]/tbody/tr[4]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Cheque sem Fundo");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[9]/tbody/tr[4]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[9]/tbody/tr[4]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "6898636910");
			

			BigDecimal ban = rs.getBigDecimal("vl_cheque_devolvido");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					By.xpath("//table[9]/tbody/tr[4]/td[7]"));
					//By.xpath("//table[@id='list_tabela_null']/tbody/tr[2]/td[7])[2]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[9]/tbody/tr[4]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L) + 1;
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Simulacao_Exibir_Cheque_Sem_Fundo_PF.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print(pegar2 + "--" + "Valor da Base - \n");
				log2.print(pegar3 + "--" + "Valor colmeia - valor\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Cheque sem Fundo" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("6898636910" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}

public void VerificarChequeSemFundoGEPF() throws SQLException, InterruptedException {

	String query = "select * from restritivo_devolucao_cheque  where nro_documento = 07134529940";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_ocorrencia");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[7]/tbody/tr[4]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[7]/tbody/tr[4]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Cheque sem Fundo");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[7]/tbody/tr[4]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[7]/tbody/tr[4]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "7134529940");
			

			BigDecimal ban = rs.getBigDecimal("vl_cheque_devolvido");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					By.xpath("//table[7]/tbody/tr[4]/td[7]"));
					//By.xpath("//table[@id='list_tabela_null']/tbody/tr[2]/td[7])[2]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[7]/tbody/tr[4]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L) + 1;
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Simulacao_Exibir_Cheque_Sem_Fundo_PF_GE.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print(pegar2 + "--" + "Valor da Base - \n");
				log2.print(pegar3 + "--" + "Valor colmeia - valor\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Cheque sem Fundo" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("7134529940" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}



public void VerificarChequeSemFundoGEPFEmprestimo() throws SQLException, InterruptedException {

	String query = "select * from restritivo_devolucao_cheque  where nro_documento = 7092012902 ";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_ocorrencia");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[8]/tbody/tr[4]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[8]/tbody/tr[4]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Cheque sem Fundo");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[8]/tbody/tr[4]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[8]/tbody/tr[4]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "7092012902");
			

			BigDecimal ban = rs.getBigDecimal("vl_cheque_devolvido");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					By.xpath("//table[8]/tbody/tr[4]/td[7]"));
					//By.xpath("//table[@id='list_tabela_null']/tbody/tr[2]/td[7])[2]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[8]/tbody/tr[4]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L) + 1;
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Emprestimo_Exibir_Cheque_Sem_Fundo_PF_GE.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print(pegar2 + "--" + "Valor da Base - \n");
				log2.print(pegar3 + "--" + "Valor colmeia - valor\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Cheque sem Fundo" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("7092012902 " + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}


public void VerificarChequeSemFundoAssociadoPFEmprestimo() throws SQLException, InterruptedException {

	String query = "select * from restritivo_devolucao_cheque  where dt_hr_atualizacao = '2020-11-06 08:26:13.139842' ";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_ocorrencia");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[4]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[4]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Cheque sem Fundo");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[4]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[4]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "6084497926");
			

			BigDecimal ban = rs.getBigDecimal("vl_cheque_devolvido");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[4]/td[7]"));
					//By.xpath("//table[@id='list_tabela_null']/tbody/tr[2]/td[7])[2]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[10]/tbody/tr[4]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L) + 1;
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Emprestimo_Exibir_Cheque_Sem_Fundo_PF_Associado.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print(pegar2 + "--" + "Valor da Base - \n");
				log2.print(pegar3 + "--" + "Valor colmeia - valor\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Cheque sem Fundo" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("6084497926 " + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}


public void VerificarProtestoPJ() throws SQLException, InterruptedException {

	String query = "select * from restritivo_protesto  where nro_documento = 34330577000183";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_vencimento");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[2]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[2]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Protesto");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[2]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[2]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "34330577000183");
			

			BigDecimal ban = rs.getBigDecimal("vl_protesto");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[2]/td[7]"));
					//By.xpath("//table[@id='list_tabela_null']/tbody/tr[2]/td[7])[2]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[12]/tbody/tr[2]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L) + 1;
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Simulacao_Exibir_Protesto_PJ.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print(pegar2 + "--" + "Valor da Base - \n");
				log2.print(pegar3 + "--" + "Valor colmeia - valor\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Protesto" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("34330577000183" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}

public void VerificarProtestoPJAprovado() throws SQLException, InterruptedException {

	String query = "select * from restritivo_protesto  where dt_hr_atualizacao = '2020-10-26 15:39:36.497' ";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_vencimento");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[2]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[2]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Protesto");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[2]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[2]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "83638668000196");
			

			BigDecimal ban = rs.getBigDecimal("vl_protesto");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[2]/td[7]"));
					//By.xpath("//table[@id='list_tabela_null']/tbody/tr[2]/td[7])[2]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[10]/tbody/tr[2]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L);
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Emprestimo_Exibir_Protesto_PJ.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print(pegar2 + "--" + "Valor da Base - \n");
				log2.print(pegar3 + "--" + "Valor colmeia - valor\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Protesto" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("83638668000196" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}


public void VerificarChequeSemFundoPJ() throws SQLException, InterruptedException {

	String query = "select * from restritivo_cheque_sem_fundo  where nro_documento = 34330577000183";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_ultimo_cheque");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[3]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[3]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Cheque sem Fundo");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[3]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[3]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "34330577000183");
			

		
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[12]/tbody/tr[3]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L);
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Simulacao_Exibir_Cheque_PJ.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Cheque sem Fundo" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("34330577000183" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}


public void VerificarChequeSemFundoPJAprovado() throws SQLException, InterruptedException {

	String query = "select * from restritivo_cheque_sem_fundo  where dt_hr_atualizacao = '2020-10-26 15:39:36.497' ";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_ultimo_cheque");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[3]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[3]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Cheque sem Fundo");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[3]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[3]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "83638668000196");
			

		
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[10]/tbody/tr[3]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L) + 1;
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Emprestimo_Exibir_Cheque_PJ.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Cheque sem Fundo" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("83638668000196" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}



public void VerificarAcaoJudicialPJ() throws SQLException, InterruptedException {

	String query = "select * from restritivo_acao_judicial  where nro_documento = 34330577000183";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_distribuicao_acao");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[4]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[4]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Ações Judiciais");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[4]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[4]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "34330577000183");
			
			
			BigDecimal ban = rs.getBigDecimal("vl_acao");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[4]/td[7]"));
					//By.xpath("//table[@id='list_tabela_null']/tbody/tr[2]/td[7])[2]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

		
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[12]/tbody/tr[4]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L);
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Simulacao_Exibir_Acao_judicial_PJ.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Acao judicial" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("34330577000183" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}



public void VerificarAcaoJudicialPJAprovado() throws SQLException, InterruptedException {

	String query = "select * from restritivo_acao_judicial  where dt_hr_atualizacao = '2020-10-26 15:39:36.497' ";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_distribuicao_acao");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[4]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[4]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Ações Judiciais");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[4]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[4]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "83638668000196");
			
			
			BigDecimal ban = rs.getBigDecimal("vl_acao");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[4]/td[7]"));
					//By.xpath("//table[@id='list_tabela_null']/tbody/tr[2]/td[7])[2]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

		
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[10]/tbody/tr[4]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L);
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Emprestimo_Exibir_Acao_judicial_PJ.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Acao judicial" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("83638668000196" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}


public void VerificarDividaVencidaPJ() throws SQLException, InterruptedException {

	String query = "select * from restritivo_divida_vencida  where nro_documento = 34330577000183";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_debito");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[6]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[6]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Dívida Vencida");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[6]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[6]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "34330577000183");
			
			
			BigDecimal ban = rs.getBigDecimal("vl_divida_vencida");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[6]/td[7]"));
					//By.xpath("//table[@id='list_tabela_null']/tbody/tr[2]/td[7])[2]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

		
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[12]/tbody/tr[6]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L);
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Simulacao_Exibir_Divida_Vencida_PJ.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Divida vencida" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("34330577000183" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}


public void VerificarDividaVencidaPJAprovado() throws SQLException, InterruptedException {

	String query = "select * from restritivo_divida_vencida  where dt_hr_atualizacao = '2020-10-26 15:39:36.497' ";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_debito");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[6]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[6]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Dívida Vencida");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[6]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[6]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "83638668000196");
			
			
			BigDecimal ban = rs.getBigDecimal("vl_divida_vencida");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[6]/td[7]"));
					//By.xpath("//table[@id='list_tabela_null']/tbody/tr[2]/td[7])[2]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

		
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[10]/tbody/tr[6]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L) + 1;
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Emprestimo_Exibir_Divida_Vencida_PJ.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Divida vencida" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("83638668000196" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}



public void VerificarFalenciaPJ() throws SQLException, InterruptedException {

	String query = "select * from restritivo_falencia where nro_documento = 34330577000183";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_falencia");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[5]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[5]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Falências");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[5]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[12]/tbody/tr[5]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "34330577000183");
			
			
		
			

		
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[12]/tbody/tr[5]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L);
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Simulacao_Exibir_Falencia_PJ.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Falencia" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("34330577000183" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}


public void VerificarFalenciaPJAprovado() throws SQLException, InterruptedException {

	String query = "select * from restritivo_falencia where dt_hr_atualizacao = '2020-10-26 15:39:36.497' ";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_falencia");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[5]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[5]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Falências");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[5]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[5]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "83638668000196");
			
			
		
			

		
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[10]/tbody/tr[5]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L);
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Emprestimo_Exibir_Falencia_PJ.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Falencia" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("83638668000196" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}



public void AtualizarDataConsultaBoaVistaPropostaPF() throws Exception {
	
	try {

		String query = "update restritivo_bureau  set dt_hr_atualizacao = CURRENT_TIMESTAMP where usuario = 'AUTOMACAOE9ASSPF' and nro_documento = 6898636910";
		con2.executaBusca(query);

	} catch (Exception e) {

		e.printStackTrace();
		
throw e;
	}
}


public void VerificarRestritivoGEPJ() throws SQLException, InterruptedException {

	String query = "select * from restritivo_protesto  where nro_documento = 9175541912";
	ResultSet rs = con2.executaBusca(query);

	try {

		while (rs.next()) {

			Date d = rs.getDate("dt_protesto");
			Date data = d;


			//String dtemp = "14/06/2015";
			
			WebElement msg = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[2]/td[5]"));
			String mensagem23 = msg.getText();
			

			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			df.setLenient(false);
			

			java.util.Date d2 = df.parse(mensagem23);

			long dt = (d2.getTime() - data.getTime());
			long periodo = dt / 86400000L;
			
			
			
			dsl.verificarLong(0 , periodo);
			
			WebElement msg5 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[2]/td[3]"));
			String mensagem233 = msg5.getText();
			dsl.verificarString(mensagem233, "Protesto");
			
			
			WebElement msg7 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[2]/td[1]"));
			String mensagem232 = msg7.getText();
			dsl.verificarString(mensagem232, "Restritivo Externo - Boa Vista");
			
			
			WebElement msg8 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[2]/td[4]"));
			String mensagem237 = msg8.getText();
			dsl.verificarString(mensagem237, "9175541912");
			

			BigDecimal ban = rs.getBigDecimal("vl_protesto");
			BigDecimal valor = ban;
			String vl = valor.toString();
			String pegar2 = vl.replaceAll("[^0-9]", "");
			
			
			

			WebElement msg2 = getDriver().findElement(
					By.xpath("//table[10]/tbody/tr[2]/td[7]"));
					//By.xpath("//table[@id='list_tabela_null']/tbody/tr[2]/td[7])[2]"));
			String mensagem25 = msg2.getText();
			String pegar3 = mensagem25.replaceAll("[^0-9]", "");
			

			dsl.verificarString(pegar2, pegar3);
			

			WebElement msg3 = getDriver().findElement(By.xpath("//table[10]/tbody/tr[2]/td[6]"));
			
			String mensagem3 = msg3.getText();
			
			
			getDriver().switchTo().defaultContent();
			java.util.Date d5 = df.parse(PegarDataGea());
			long dt2 = ( d5.getTime()- data.getTime());
			long periodo2 = (dt2 / 86400000L);
			
			String periodo3 = String.valueOf(periodo2);
			
		
			
			dsl.verificarString(mensagem3, periodo3);
		
		

			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Simulacao_Exibir_Protesto_Grupo_Economico_PJ.txt"));
				System.setOut(log2);
				log2.print(periodo + "--" + "Data de inclusao - \n");
				log2.print(0 + "--" + "Diferenca de dias base - colmeia\n");
				log2.print("------------------------------------\n");
				log2.print(pegar2 + "--" + "Valor da Base - \n");
				log2.print(pegar3 + "--" + "Valor colmeia - valor\n");
				log2.print("------------------------------------\n");
				log2.print(periodo3 + "--" + "Diferenca de dias \n");
				log2.print(mensagem3 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Restritivo Externo - Boa Vista" + "--" + "Origem \n");
				log2.print(mensagem232 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("Protesto" + "--" + "Tipo \n");
				log2.print(mensagem233 + "--" + "Valor colmeia \n");
				log2.print("------------------------------------\n");
				log2.print("9175541912" + "--" + "Documento \n");
				log2.print(mensagem237 + "--" + "Valor colmeia \n");
				
				
			


			} catch (FileNotFoundException fx) {

				System.out.println(fx);

			}

		}

	} catch (Exception e) {
		e.printStackTrace();
	}

}


public void AtualizarDataConsultaBoaVistaPropostaPJ() throws Exception {
	
	try {

		String query = "update restritivo_bureau  set dt_hr_atualizacao = CURRENT_TIMESTAMP where usuario = 'AUTOMACAOE9ASSPJ' and nro_documento = 34330577000183";
		con2.executaBusca(query);

	} catch (Exception e) {

		e.printStackTrace();
		
throw e;
	}
}

public void AtualizarDataConsultaBoaVistaPropostaGEPJ() throws Exception {
	
	try {

		String query = "update restritivo_bureau  set dt_hr_atualizacao = CURRENT_TIMESTAMP where usuario = 'AUTOMACAOE9GEPJ' and nro_documento = 9175541912";
		con2.executaBusca(query);

	} catch (Exception e) {

		e.printStackTrace();
		
throw e;
	}
}


public void AtualizarDataConsultaSerasaPropostaGE() throws Exception {
	
	try {

		String query = "update tb_gfc_restritivo_serasa_bureau set rsb_data_hora_atualizacao = CURRENT_TIMESTAMP  where rsb_usuario = 'AUTOMACAOE9GE' and rsb_cpf_cnpj = 7134529940";
		con.executaBusca(query);

	} catch (Exception e) {

		e.printStackTrace();
		
throw e;
	}
}

public void AtualizarDataConsultaSerasaPropostaAssociado() throws Exception {
	
	try {

		String query = "update tb_gfc_restritivo_serasa_bureau set rsb_data_hora_atualizacao = CURRENT_TIMESTAMP  where rsb_usuario = 'AUTOMACAOE9ASS' and rsb_cpf_cnpj = 6898636910";
		con.executaBusca(query);

	} catch (Exception e) {

		e.printStackTrace();
		
throw e;
	}
}

public void AtualizarDataConsultaBoaVistaPropostaGEPF() throws Exception {
	
	try {

		String query = "update restritivo_bureau  set dt_hr_atualizacao = CURRENT_TIMESTAMP where usuario = 'AUTOMACAOE9GEPF' and nro_documento = 07134529940";
		con2.executaBusca(query);

	} catch (Exception e) {

		e.printStackTrace();
		
throw e;
	}
}
	
public void ValidarSerasaPropostaGE () {
	
	WebElement msg7 = getDriver().findElement(
			By.xpath("//table[7]/tbody/tr[5]/td[1]"));
	String mensagem232 = msg7.getText();
	dsl.verificarString(mensagem232, "Restritivo Externo - Serasa");
	try {

		PrintStream log2 = new PrintStream(new File(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Simulacao_Exibir_Serasa_Grupo_Economico.txt"));
		System.setOut(log2);
		log2.print("Restritivo Externo - Serasa" + "--" + "Origem \n");
		log2.print(mensagem232 + "--" + "Valor colmeia \n");
		
		
		
		
	


	} catch (FileNotFoundException fx) {

		System.out.println(fx);

	}

}
	

public void ValidarSerasaPropostaAssociado () {
	
	WebElement msg7 = getDriver().findElement(
			By.xpath("//table[9]/tbody/tr[5]/td[1]"));
	String mensagem232 = msg7.getText();
	dsl.verificarString(mensagem232, "Restritivo Externo - Serasa");
	try {

		PrintStream log2 = new PrintStream(new File(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Simulacao_Exibir_Serasa_Associado.txt"));
		System.setOut(log2);
		log2.print("Restritivo Externo - Serasa" + "--" + "Origem \n");
		log2.print(mensagem232 + "--" + "Valor colmeia \n");
		
		
		
		
	


	} catch (FileNotFoundException fx) {

		System.out.println(fx);

	}

}
	



public void ValidarSerasaPropostaEmprestimoAssociado () {
	
	WebElement msg7 = getDriver().findElement(
			By.xpath("//table[8]/tbody/tr[2]/td[1]"));
	String mensagem232 = msg7.getText();
	dsl.verificarString(mensagem232, "Restritivo Externo - Serasa");
	try {

		PrintStream log2 = new PrintStream(new File(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_proposta/Emprestimo_Exibir_Serasa_Associado.txt"));
		System.setOut(log2);
		log2.print("Restritivo Externo - Serasa" + "--" + "Origem \n");
		log2.print(mensagem232 + "--" + "Valor colmeia \n");
		
		
		
		
	


	} catch (FileNotFoundException fx) {

		System.out.println(fx);

	}

}
	
}
	


