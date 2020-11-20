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
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.core.cresol.BasePage;

public class RestritivoPage extends BasePage {
	
	
	/**
	 * Metodos com o back end para validar a tela restritivos
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void EntrarMenuLateral() {

		dsl.entrarMenuLateral();

	}

	public void ClicarRestritivo() {

		//dsl.clicar("webfx-tree-object-266-plus"); Singular 130
		dsl.clicarLink("Restritivos");
		//dsl.clicar("webfx-tree-object-266-anchor"); // Central 130

	}

	public void ClicarManter() {

		 //dsl.clicar("ssubmenu1153");//Cresol paralelo
		 dsl.clicar("ssubmenu1167");
		//dsl.clicar("webfx-tree-object-267-anchor"); // Local 130

	}

	public void EntrarRestritivo() {

		dsl.entrarModulo();

	}

	public void NumeroDocumento(String doc) {

		dsl.limparCampo("numeroDocumentoPessoa");
		dsl.escrever("numeroDocumentoPessoa", doc);

	}
	
	
	public void NumeroCooperativa(String coop) {

		dsl.escrever("codigoCooperativa", coop);

	}

	public void NumeroConta(String cooperativa, String conta) {
		dsl.escrever("codigoCooperativaContaCorrente", cooperativa);
		dsl.escrever("numeroContaCorrente", conta);

	}

	public void ClicarPesquisar() {

		dsl.clicar("Pesquisar");

	}

	public void ClicarExibir() {

		dsl.clicarcss("#actionCampoGrid_1_1 .imgGrid");

	}

	public void ClicarAlterar() {

		dsl.clicarcss("#actionCampoGrid_1_5 .imgGrid");

	}

	public void MudarStatusAcaoJudicial(String valor) {

		dsl.selecionarCombocss("#list_tabela_acoesJudiciaisBoaVista #situacaoRegistro_1", "ATIVO");

		dsl.selecionarCombocss("#list_tabela_acoesJudiciaisBoaVista #situacaoRegistro_1", valor);

	}

	public void MudarStatusFalencia(String valor) {

		dsl.selecionarCombocss("#list_tabela_falenciasBoaVista #situacaoRegistro_1", "ATIVO");

		dsl.selecionarCombocss("#list_tabela_falenciasBoaVista #situacaoRegistro_1", valor);

	}

	public void MudarStatusDividaVencida(String valor) {

		dsl.selecionarCombocss("#list_tabela_dividaVencidaBoaVista #situacaoRegistro_1", "ATIVO");

		dsl.selecionarCombocss("#list_tabela_dividaVencidaBoaVista #situacaoRegistro_1", valor);

	}

	public void MudarStatusPendencia(String valor) {

		dsl.selecionarCombocss("#list_tabela_pendenciaPagamentoBoaVista #situacaoRegistro_1 ", "ATIVO");

		dsl.selecionarCombocss("#list_tabela_pendenciaPagamentoBoaVista #situacaoRegistro_1 ", valor);

	}

	public void MudarStatusChequeSemFundoPF(String valor) {

		dsl.selecionarCombocss("#list_tabela_chequeSemFundoPFBoaVista #situacaoRegistro_1 ", "ATIVO");

		dsl.selecionarCombocss("#list_tabela_chequeSemFundoPFBoaVista #situacaoRegistro_1 ", valor);

	}

	public void MudarStatusProtesto(String valor) {

		dsl.selecionarCombocss("#list_tabela_protestosBoaVista #situacaoRegistro_1 ", "ATIVO");

		dsl.selecionarCombocss("#list_tabela_protestosBoaVista #situacaoRegistro_1 ", valor);

	}

	public void MudarStatusChequeSemFundoPJ(String valor) {

		dsl.selecionarCombocss("#list_tabela_chequeSemFundoBoaVista #situacaoRegistro_1 ", "ATIVO");

		dsl.selecionarCombocss("#list_tabela_chequeSemFundoBoaVista #situacaoRegistro_1 ", valor);

	}
	
	public void MudarStatusSerasa(String valor) {

		dsl.selecionarCombocss("#list_tabela_pendenciaPagamento #situacaoRestritivo_1 ", "ATIVO");

		dsl.selecionarCombocss("#list_tabela_pendenciaPagamento #situacaoRestritivo_1 ", valor);

	}


	public void ClicarGrupoEconomico() throws InterruptedException {

		Thread.sleep(15000);
		dsl.clicarcss("#actionImgGrid_2 > .imgGrid");

	}

	public void ClicarConfirmar() {
      
		dsl.clicar("Confirmar");

	}

	public void ValidarMensagemAlterarRestritivo() {

		dsl.sairFrame();
		dsl.entrarFrameindex(0);
		dsl.clicar("dvBg");
		dsl.sairFrame();
		dsl.entrarFrameindex(2);
		dsl.entrarFrameindex(0);
		dsl.entrarFrameindex(0);
		WebElement msg5 = getDriver().findElement(By.id("tbMsg"));
		String mensagem = msg5.getText();
		dsl.verificarString(" Restritivo Alterado(a)(s) com sucesso.", mensagem);

	}

	public void ValidarMensagemConsultaJaRealizadaNoDia() throws InterruptedException {
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
				" Atenção! Essa consulta não será efetivada, pois já foi realizada uma outra consulta nesta data.",
				mensagem);

	}

	public void ValidarMensagemCampoObrigatorio() throws InterruptedException {
		Thread.sleep(2000);
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
				" Atenção! Para realizar a pesquisa, preencha pelo menos um dos seguintes campos: Número Documento ou Conta Corrente.",
				mensagem);

	}

	public void ValidarMensagemConsultaRealizada() throws InterruptedException {
		Thread.sleep(15000);
		dsl.sairFrame();
		dsl.entrarFrameindex(0);
		dsl.clicar("dvBg");
		dsl.sairFrame();
		dsl.entrarFrameindex(2);
		dsl.entrarFrameindex(0);
		dsl.entrarFrameindex(0);
		dsl.clicar("tbMsg");
		WebElement msg5 = getDriver().findElement(By.id("tbMsg"));
		String mensagem = msg5.getText();
		dsl.verificarString(" Atualização efetuada com sucesso.", mensagem);

	}
	
	
	public void ValidarMensagemConsultaSerasa() throws InterruptedException {
		Thread.sleep(2000);
		dsl.sairFrame();
		dsl.entrarFrameindex(0);
		dsl.clicar("dvBg");
		dsl.sairFrame();
		dsl.entrarFrameindex(2);
		dsl.entrarFrameindex(0);
		dsl.entrarFrameindex(0);
		dsl.clicar("tbMsg");
		WebElement msg5 = getDriver().findElement(By.id("tbMsg"));
		String mensagem = msg5.getText();
		dsl.verificarString(" Deseja fazer uma nova consulta ao Serasa, isso pode acarretar em custos a cooperativa?", mensagem);

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
		Thread.sleep(5000);
		

	}
	
	public void ClicarNao() throws InterruptedException {

		Thread.sleep(2000);
		dsl.sairFrame();
		dsl.entrarFrameindex(0);
		dsl.clicar("dvBg");
		dsl.sairFrame();
		dsl.entrarFrameindex(2);
		dsl.entrarFrameindex(0);
		dsl.entrarFrameindex(0);
		dsl.clicarcss(".form_botao:nth-child(2)");
		Thread.sleep(15000);
		

	}

	/**
	 * Métodos para validar o retorno da consulta Boa vista na tela Exibir PF
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void VerificarScore() throws SQLException {

		String query = "select * from restritivo_score where nro_documento = 4396105916";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {
				int scr = rs.getInt("classificacao_numerica");
				int score = scr;
				WebElement msg = getDriver().findElement(By.id("PercentualScore"));
				String mensagem = msg.getText();
				int num = Integer.parseInt(mensagem);
				dsl.verificarInteiro(num, score);

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_exibir_restritivo/Exbir_Score_PF.txt"));
					System.setOut(log2);
					log2.print(score + "--" + "Valor da Base - classificacao_numerica\n");
					log2.print(num + "--" + "Valor colmeia - score\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void VerificarContumacia() throws SQLException {

		String query = "select * from restritivo_cheque_sustado where nro_documento = 4396105916";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {

				Date d = rs.getDate("dt_ocorrencia");
				Date data = d;
				SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");

				String result = out.format(in.parse(data.toString()));
				WebElement msg21 = getDriver().findElement(
						By.cssSelector("#list_tabela_contumaciaSustacaoBoaVista  td:nth-child(1) > .word-wrap"));
				String mensagem21 = msg21.getText();
				dsl.verificarString(mensagem21, result);
				

				/*String ban = rs.getString("nome_banco");
				String banco = ban;
				WebElement msg = getDriver().findElement(
						By.cssSelector("#list_tabela_contumaciaSustacaoBoaVista td:nth-child(2) > .word-wrap"));
				String mensagem = msg.getText();
				
				dsl.verificarString(mensagem, banco);
				System.out.println(mensagem);
				System.out.println(banco);*/

				int ag = rs.getInt("cod_agencia");
				int agencia = ag;
				WebElement msg2 = getDriver().findElement(
						By.cssSelector("#list_tabela_contumaciaSustacaoBoaVista td:nth-child(3) > .word-wrap"));
				String mensagem2 = msg2.getText();
				int num2 = Integer.parseInt(mensagem2);
				dsl.verificarInteiro(num2, agencia);
				

				int cc = rs.getInt("nro_conta_corrente");
				int conta = cc;
				WebElement msg3 = getDriver().findElement(
						By.cssSelector("#list_tabela_contumaciaSustacaoBoaVista td:nth-child(4) > .word-wrap"));
				String mensagem3 = msg3.getText();
				int num3 = Integer.parseInt(mensagem3);
				dsl.verificarInteiro(num3, conta);
				

				int ci = rs.getInt("nro_cheque_inicial");
				int chequei = ci;
				WebElement msg4 = getDriver().findElement(
						By.cssSelector("#list_tabela_contumaciaSustacaoBoaVista td:nth-child(5) > .word-wrap"));
				String mensagem4 = msg4.getText();
				String vl2 = mensagem4.replace("0", "");
				int num4 = Integer.parseInt(vl2);
				dsl.verificarInteiro(num4, chequei);
				

				int cf = rs.getInt("nro_cheque_final");
				int chequef = cf;
				WebElement msg5 = getDriver().findElement(
						By.cssSelector("#list_tabela_contumaciaSustacaoBoaVista td:nth-child(6) > .word-wrap"));
				String mensagem5 = msg5.getText();
				String vl3 = mensagem5.replace("0", "");
				int num5 = Integer.parseInt(vl3);
				dsl.verificarInteiro(num5, chequef);
				

				String mot = rs.getString("descricao_alinea");
				String motivo = mot;
				WebElement msg6 = getDriver().findElement(
						By.cssSelector("#list_tabela_contumaciaSustacaoBoaVista td:nth-child(7) > .word-wrap"));
				String mensagem6 = msg6.getText();
				dsl.verificarString(mensagem6, motivo);
				

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_exibir_restritivo/Exbir_contumacia_PF.txt"));
					System.setOut(log2);
					log2.print(result + "--" + "Valor da Base - dt_ocorrencia\n");
					log2.print(mensagem21 + "--" + "Valor colmeia - data ocorrencia\n");
					log2.print("------------------------------------\n");
					//log2.print(banco + "--" + "Valor da Base - cod_banco\n");
					//log2.print(num + "--" + "Valor colmeia - banco\n");
					log2.print("------------------------------------\n");
					log2.print(agencia + "--" + "Valor da Base - cod_agencia\n");
					log2.print(num2 + "--" + "Valor colmeia - agencia\n");
					log2.print("------------------------------------\n");
					log2.print(conta + "--" + "Valor da Base - nro_conta_corrente\n");
					log2.print(num3 + "--" + "Valor colmeia - conta\n");
					log2.print("------------------------------------\n");
					log2.print(chequei + "--" + "Valor da Base - nro_cheque_inicial\n");
					log2.print(num4 + "--" + "Valor colmeia - num cheque inicial\n");
					log2.print("------------------------------------\n");
					log2.print(chequef + "--" + "Valor da Base - nro_cheque_final\n");
					log2.print(num5 + "--" + "Valor colmeia - num cheque final\n");
					log2.print("------------------------------------\n");
					log2.print(motivo + "--" + "Valor da Base - descricao_alinea\n");
					log2.print(mensagem6 + "--" + "Valor colmeia - motivo\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void VerificarPendenciaSemAvalista() throws SQLException {

		String query = "select * from restritivo_pendencia_pagamento  where nro_documento = 4396105916";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {

				Date d = rs.getDate("dt_registro");
				Date data = d;
				SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");

				String result = out.format(in.parse(data.toString()));
				WebElement msg21 = getDriver().findElement(By.cssSelector(
						"#list_tabela_pendenciaPagamentoBoaVista #linhaTabela_1 >  td:nth-child(1) > .word-wrap"));
				String mensagem21 = msg21.getText();
				dsl.verificarString(mensagem21, result);
				

				BigDecimal ban = rs.getBigDecimal("vl_debito");
				BigDecimal valor = ban;
				String vl = valor.toString();
				String vl2 = vl.replace(".", ",");

				WebElement msg = getDriver().findElement(
						By.cssSelector("#list_tabela_pendenciaPagamentoBoaVista #linhaTabela_1 > td:nth-child(2)"));
				String mensagem23 = msg.getText();

				dsl.verificarString(mensagem23, vl2);
			

				String contr = rs.getString("nro_contrato");
				String contrato = contr;
				WebElement msg2 = getDriver().findElement(By.cssSelector(
						"#list_tabela_pendenciaPagamentoBoaVista #linhaTabela_1 > td:nth-child(3) > .word-wrap"));
				String mensagem2 = msg2.getText();

				dsl.verificarString(mensagem2, contrato);

				String mod = rs.getString("tipo_ocorrencia");
				String modalidade = mod;
				WebElement msg3 = getDriver().findElement(By.cssSelector(
						"#list_tabela_pendenciaPagamentoBoaVista #linhaTabela_1 > td:nth-child(4) > .word-wrap"));
				String mensagem3 = msg3.getText();
				dsl.verificarString(mensagem3, modalidade);

				String emp = rs.getString("descricao_informante");
				String empresa = emp;
				WebElement msg4 = getDriver().findElement(By.cssSelector(
						"#list_tabela_pendenciaPagamentoBoaVista #linhaTabela_1 > td:nth-child(5) > .word-wrap"));
				String mensagem4 = msg4.getText();
				dsl.verificarString(mensagem4, empresa);

				String avl = rs.getString("situacao_pendencia");
				String avalista = avl;
				String sub = avalista.replaceAll("COMPRADOR", "NÃO");
				 
				
		
				
				
				System.out.println(sub);
				WebElement msg5 = getDriver().findElement(By.cssSelector(
						"#list_tabela_pendenciaPagamentoBoaVista #linhaTabela_1 > td:nth-child(6) > .word-wrap"));
				String mensagem5 = msg5.getText();
				
				
				dsl.verificarString(mensagem5, sub);
				
			

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_exibir_restritivo/Exbir_Pendencia_pagamento.txt"));
					System.setOut(log2);
					log2.print(result + "--" + "Valor da Base - dt_registro\n");
					log2.print(mensagem21 + "--" + "Valor colmeia - data ocorrencia\n");
					log2.print("------------------------------------\n");
					log2.print(vl2 + "--" + "Valor da Base - vl_debito\n");
					log2.print(mensagem23 + "--" + "Valor colmeia - valor\n");
					log2.print("------------------------------------\n");
					log2.print(contrato + "--" + "Valor da Base - nro_contrato\n");
					log2.print(mensagem2 + "--" + "Valor colmeia - contrato\n");
					log2.print("------------------------------------\n");
					log2.print(modalidade + "--" + "Valor da Base - tipo_ocorrencia\n");
					log2.print(mensagem3 + "--" + "Valor colmeia - modalidade\n");
					log2.print("------------------------------------\n");
					log2.print(empresa + "--" + "Valor da Base - descricao_informante\n");
					log2.print(mensagem4 + "--" + "Valor colmeia - empresa\n");
					log2.print("------------------------------------\n");
					log2.print(avalista + "--" + "Valor da Base - situacao_pendencia\n");
					log2.print(mensagem5 + "--" + "Valor colmeia - avalista\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void VerificarPendenciaComAvalista() throws SQLException {

		String query = "select * from restritivo_pendencia_pagamento  where nro_documento = 4396105916";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {

				Date d = rs.getDate("dt_registro");
				Date data = d;
				SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");

				String result = out.format(in.parse(data.toString()));
				WebElement msg21 = getDriver().findElement(By.cssSelector(
						"#list_tabela_pendenciaPagamentoBoaVista #linhaTabela_1 >  td:nth-child(1) > .word-wrap"));
				String mensagem21 = msg21.getText();
				dsl.verificarString(mensagem21, result);
				

				BigDecimal ban = rs.getBigDecimal("vl_debito");
				BigDecimal valor = ban;
				String vl = valor.toString();
				String vl2 = vl.replace(".", ",");

				WebElement msg = getDriver().findElement(
						By.cssSelector("#list_tabela_pendenciaPagamentoBoaVista #linhaTabela_1 > td:nth-child(2)"));
				String mensagem23 = msg.getText();

				dsl.verificarString(mensagem23, vl2);
				

				String contr = rs.getString("nro_contrato");
				String contrato = contr;
				WebElement msg2 = getDriver().findElement(By.cssSelector(
						"#list_tabela_pendenciaPagamentoBoaVista #linhaTabela_1 > td:nth-child(3) > .word-wrap"));
				String mensagem2 = msg2.getText();

				dsl.verificarString(mensagem2, contrato);

				String mod = rs.getString("tipo_ocorrencia");
				String modalidade = mod;
				WebElement msg3 = getDriver().findElement(By.cssSelector(
						"#list_tabela_pendenciaPagamentoBoaVista #linhaTabela_1 > td:nth-child(4) > .word-wrap"));
				String mensagem3 = msg3.getText();
				dsl.verificarString(mensagem3, modalidade);

				String emp = rs.getString("descricao_informante");
				String empresa = emp;
				WebElement msg4 = getDriver().findElement(By.cssSelector(
						"#list_tabela_pendenciaPagamentoBoaVista #linhaTabela_1 > td:nth-child(5) > .word-wrap"));
				String mensagem4 = msg4.getText();
				dsl.verificarString(mensagem4, empresa);

				String avl = rs.getString("situacao_pendencia");
				String avalista = avl;
				String sub = avalista.replaceAll("Avalista", "SIM");
				 
				
		
				
				
				System.out.println(sub);
				WebElement msg5 = getDriver().findElement(By.cssSelector(
						"#list_tabela_pendenciaPagamentoBoaVista #linhaTabela_1 > td:nth-child(6) > .word-wrap"));
				String mensagem5 = msg5.getText();
				
				
				dsl.verificarString(mensagem5, sub);
				
			

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_exibir_restritivo/Exbir_Pendencia_pagamento.txt"));
					System.setOut(log2);
					log2.print(result + "--" + "Valor da Base - dt_registro\n");
					log2.print(mensagem21 + "--" + "Valor colmeia - data ocorrencia\n");
					log2.print("------------------------------------\n");
					log2.print(vl2 + "--" + "Valor da Base - vl_debito\n");
					log2.print(mensagem23 + "--" + "Valor colmeia - valor\n");
					log2.print("------------------------------------\n");
					log2.print(contrato + "--" + "Valor da Base - nro_contrato\n");
					log2.print(mensagem2 + "--" + "Valor colmeia - contrato\n");
					log2.print("------------------------------------\n");
					log2.print(modalidade + "--" + "Valor da Base - tipo_ocorrencia\n");
					log2.print(mensagem3 + "--" + "Valor colmeia - modalidade\n");
					log2.print("------------------------------------\n");
					log2.print(empresa + "--" + "Valor da Base - descricao_informante\n");
					log2.print(mensagem4 + "--" + "Valor colmeia - empresa\n");
					log2.print("------------------------------------\n");
					log2.print(avalista + "--" + "Valor da Base - situacao_pendencia\n");
					log2.print(mensagem5 + "--" + "Valor colmeia - avalista\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void VerificarChequeSemFundo() throws SQLException {

		String query = "select * from restritivo_devolucao_cheque  where nro_documento = 4396105916";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {

				Date d = rs.getDate("dt_ocorrencia");
				Date data = d;
				SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");

				String result = out.format(in.parse(data.toString()));
				WebElement msg21 = getDriver().findElement(By.cssSelector(
						"#list_tabela_chequeSemFundoPFBoaVista #linhaTabela_1 >  td:nth-child(1) > .word-wrap"));
				String mensagem21 = msg21.getText();
				dsl.verificarString(mensagem21, result);
				

				BigDecimal vlb = rs.getBigDecimal("vl_cheque_devolvido");
				BigDecimal valor = vlb;
				String vl = valor.toString();
				String vl2 = vl.replace(".", ",");

				WebElement msg23 = getDriver().findElement(
						By.cssSelector("#list_tabela_chequeSemFundoPFBoaVista #linhaTabela_1 > td:nth-child(2)"));
				String mensagem23 = msg23.getText();

				dsl.verificarString(mensagem23, vl2);
				

				/*int ban = rs.getInt("cod_banco");
				int banco = ban;
				WebElement msg = getDriver().findElement(
						By.cssSelector("#list_tabela_chequeSemFundoPFBoaVista #linhaTabela_1 > td:nth-child(3)"));
				String mensagem = msg.getText();
				int num = Integer.parseInt(mensagem);
				dsl.verificarInteiro(num, banco);
				System.out.println(banco);*/

				int ag = rs.getInt("cod_agencia");
				int agencia = ag;
				WebElement msg2 = getDriver().findElement(By.cssSelector(
						"#list_tabela_chequeSemFundoPFBoaVista #linhaTabela_1 > td:nth-child(4) > .word-wrap"));
				String mensagem2 = msg2.getText();
				int num2 = Integer.parseInt(mensagem2);
				dsl.verificarInteiro(num2, agencia);
				

			

				String city = rs.getString("nome_cidade");
				String cidade = city;
				WebElement msg4 = getDriver().findElement(By.cssSelector(
						"#list_tabela_chequeSemFundoPFBoaVista #linhaTabela_1 > td:nth-child(5) > .word-wrap"));
				String mensagem4 = msg4.getText();
				dsl.verificarString(mensagem4, cidade);
				

				String cod2 = rs.getString("uf");
				String uf = cod2;
				WebElement msg5 = getDriver().findElement(By.cssSelector(
						"#list_tabela_chequeSemFundoPFBoaVista #linhaTabela_1 > td:nth-child(6) > .word-wrap"));
				String mensagem5 = msg5.getText();
				dsl.verificarString(mensagem5, uf);
				

				int cheq = rs.getInt("nro_cheque_inicial");
				int chequeinicial = cheq;
				WebElement msg6 = getDriver()
						.findElement(By.cssSelector("#list_tabela_chequeSemFundoPFBoaVista #linhaTabela_1 > td:nth-child(7) > .word-wrap"));
				String mensagem6 = msg6.getText();
				int num4 = Integer.parseInt(mensagem6);
				dsl.verificarInteiro(num4, chequeinicial);
				

				int cheq2 = rs.getInt("nro_cheque_final");
				int chequefinal = cheq2;
				WebElement msg11 = getDriver()
						.findElement(By.cssSelector("#list_tabela_chequeSemFundoPFBoaVista #linhaTabela_1 > td:nth-child(8) > .word-wrap"));
				String mensagem11 = msg11.getText();
				int num11 = Integer.parseInt(mensagem11);
				dsl.verificarInteiro(num11, chequefinal);
				

				int ali = rs.getInt("alinea_devolucao_cheque");
				int alinea = ali;
				WebElement msg7 = getDriver()
						.findElement(By.cssSelector("#list_tabela_chequeSemFundoPFBoaVista #linhaTabela_1 > td:nth-child(9) > .word-wrap"));
				String mensagem7 = msg7.getText();
				int num7 = Integer.parseInt(mensagem7);
				dsl.verificarInteiro(num7, alinea);
				

		

				BigDecimal vlb2 = rs.getBigDecimal("quantidade_cheque");
				BigDecimal valor2 = vlb2;
				String vl28 = valor2.toString();
				String vl27 = vl28.replace(".", ",");

				WebElement msg28 = getDriver().findElement(
						By.cssSelector("#list_tabela_chequeSemFundoPFBoaVista #linhaTabela_1 > td:nth-child(10) > .word-wrap"));
				String mensagem28 = msg28.getText();

				dsl.verificarString(mensagem28, vl27);
				

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_exibir_restritivo/Exbir_Cheque_sem_fundo_PF.txt"));
					System.setOut(log2);
					log2.print(result + "--" + "Valor da Base - dt_ocorrencia\n");
					log2.print(mensagem21 + "--" + "Valor colmeia - data ocorrencia\n");
					log2.print("------------------------------------\n");
					log2.print(vl2 + "--" + "Valor da Base - vl_cheque_devolvido\n");
					log2.print(mensagem23 + "--" + "Valor colmeia - valor\n");
					//log2.print("------------------------------------\n");
					//log2.print(banco + "--" + "Valor da Base - cod_banco\n");
					//log2.print(num + "--" + "Valor colmeia - banco\n");
					log2.print("------------------------------------\n");
					log2.print(agencia + "--" + "Valor da Base - cod_agencia\n");
					log2.print(num2 + "--" + "Valor colmeia - agencia\n");
					log2.print("------------------------------------\n");
					log2.print(alinea + "--" + "Valor da Base - motivo_cheque_sem_fundo\n");
					log2.print(num7 + "--" + "Valor colmeia - alinea\n");
					log2.print("------------------------------------\n");
			        log2.print(cidade + "--" + "Valor da Base - nome_cidade\n");
					log2.print(mensagem4 + "--" + "Valor colmeia - cidade\n");
					log2.print("------------------------------------\n");
					log2.print(uf + "--" + "Valor da Base - uf\n");
					log2.print(mensagem5 + "--" + "Valor colmeia - uf\n");
					log2.print("------------------------------------\n");
					log2.print(chequeinicial + "--" + "Valor da Base - nro_cheque_inicial\n");
					log2.print(num4 + "--" + "Valor colmeia - num cheque inicial\n");
					log2.print("------------------------------------\n");
					log2.print(chequefinal + "--" + "Valor da Base - nro_cheque_final\n");
					log2.print(num11 + "--" + "Valor colmeia - num cheque final\n");
					log2.print("------------------------------------\n");
					log2.print(vl28 + "--" + "Valor da Base - quantidade_cheque\n");
					log2.print(mensagem28 + "--" + "Valor colmeia - quantidade\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void VerificarProtesto() throws SQLException {

		String query = "select * from restritivo_protesto where nro_documento = 4396105916 ";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {

				Date d = rs.getDate("dt_protesto");
				Date data = d;
				SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");

				String result = out.format(in.parse(data.toString()));
				WebElement msg21 = getDriver()
						.findElement(By.cssSelector("#list_tabela_protestosBoaVista  td:nth-child(1) > .word-wrap"));
				String mensagem21 = msg21.getText();

				dsl.verificarString(mensagem21, result);
				

				BigDecimal vlb = rs.getBigDecimal("vl_protesto");
				BigDecimal valor = vlb;
				String vl = valor.toString();
				String vl2 = vl.replace(".", ",");

				WebElement msg23 = getDriver()
						.findElement(By.cssSelector("#list_tabela_protestosBoaVista td:nth-child(2)"));
				String mensagem23 = msg23.getText();

				dsl.verificarString(mensagem23, vl2);
				

				int car = rs.getInt("nro_cartorio");
				int cartorio = car;
				WebElement msg = getDriver()
						.findElement(By.cssSelector("#list_tabela_protestosBoaVista  td:nth-child(3) > .word-wrap"));
				String mensagem = msg.getText();
				int num = Integer.parseInt(mensagem);
				dsl.verificarInteiro(num, cartorio);
				

				String cod2 = rs.getString("descricao_praca_cartorio");
				String cidade = cod2;
				WebElement msg2 = getDriver()
						.findElement(By.cssSelector("#list_tabela_protestosBoaVista  td:nth-child(4) > .word-wrap"));
				String mensagem2 = msg2.getText();
				dsl.verificarString(mensagem2, cidade);
				

				String cod3 = rs.getString("uf");
				String uf = cod3;
				WebElement msg3 = getDriver()
						.findElement(By.cssSelector("#list_tabela_protestosBoaVista  td:nth-child(5) > .word-wrap"));
				String mensagem3 = msg3.getText();
				dsl.verificarString(mensagem3, uf);
				

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_exibir_restritivo/Exbir_Protesto_PF.txt"));
					System.setOut(log2);
					log2.print(result + "--" + "Valor da Base - dt_protesto\n");
					log2.print(mensagem21 + "--" + "Valor colmeia - data ocorrencia\n");
					log2.print("------------------------------------\n");
					log2.print(vl2 + "--" + "Valor da Base - vl_protesto\n");
					log2.print(mensagem23 + "--" + "Valor colmeia - valor\n");
					log2.print("------------------------------------\n");
					log2.print(cartorio + "--" + "Valor da Base - nro_cartorio\n");
					log2.print(num + "--" + "Valor colmeia - cartorio\n");
					log2.print("------------------------------------\n");
					log2.print(cidade + "--" + "Valor da Base - nome_cidade\n");
					log2.print(mensagem2 + "--" + "Valor colmeia - cidade\n");
					log2.print("------------------------------------\n");
					log2.print(uf + "--" + "Valor da Base - uf\n");
					log2.print(mensagem3 + "--" + "Valor colmeia - uf\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*public void VerificarAcaoJudicialPF() throws SQLException {

		String query = "select * from restritivo_acao_judicial  where nro_documento = 04396105916";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {

				Date d = rs.getDate("dt_ocorrencia");
				Date data = d;
				SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");

				String result = out.format(in.parse(data.toString()));
				WebElement msg21 = getDriver().findElement(
						By.cssSelector("#list_tabela_acoesJudiciaisBoaVista  td:nth-child(1) > .word-wrap"));
				String mensagem21 = msg21.getText();
				dsl.verificarString(mensagem21, result);
				System.out.println(mensagem21);
				System.out.println(result);

				BigDecimal vlb = rs.getBigDecimal("vl_acao");
				BigDecimal valor = vlb;
				String vl = valor.toString();
				String vl2 = vl.replace(".", ",");

				WebElement msg23 = getDriver().findElement(
						By.cssSelector("#list_tabela_acoesJudiciaisBoaVista td:nth-child(2) > .word-wrap"));
				String mensagem23 = msg23.getText();

				dsl.verificarString(mensagem23, vl2);
				System.out.println(vl2);
				System.out.println(mensagem23);

				String ac = rs.getString("texto_acao");
				String texto = ac;
				WebElement msg = getDriver().findElement(
						By.cssSelector("#list_tabela_acoesJudiciaisBoaVista td:nth-child(3) > .word-wrap"));
				String mensagem = msg.getText();
				dsl.verificarString(mensagem, texto);
				System.out.println(mensagem);
				System.out.println(texto);

				String ac2 = rs.getString("uf");
				String uf = ac2;
				WebElement msg2 = getDriver().findElement(
						By.cssSelector("#list_tabela_acoesJudiciaisBoaVista td:nth-child(4) > .word-wrap"));
				String mensagem2 = msg2.getText();
				dsl.verificarString(mensagem2, uf);
				System.out.println(mensagem2);
				System.out.println(uf);



				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/BoaVista/BoaVista/src/main/resources/Evidencias_exibir_restritivo/Exbir_acao_judicial_PF.txt"));
					System.setOut(log2);

					log2.print(result + "--" + "Valor da Base - dt_ocorrencia\n");
					log2.print(mensagem21 + "--" + "Valor colmeia - data ocorrencia\n");
					log2.print("------------------------------------\n");
					log2.print(vl2 + "--" + "Valor da Base - vl_acao\n");
					log2.print(mensagem23 + "--" + "Valor colmeia - valor\n");
					log2.print("------------------------------------\n");
					log2.print(texto + "--" + "Valor da Base - texto_acao\n");
					log2.print(mensagem + "--" + "Valor colmeia - natureza acao\n");
					log2.print("------------------------------------\n");
					log2.print(uf + "--" + "Valor da Base - uf\n");
					log2.print(mensagem2 + "--" + "Valor colmeia - uf\n");
				

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}*/

	public void VerificarGrupoEconomicoPF() throws SQLException {

		String query = "select * from restritivo_score where nro_documento = 09033677776";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {
				int scr = rs.getInt("classificacao_numerica");
				int score = scr;
				WebElement msg = getDriver().findElement(By.id("PercentualScore"));
				String mensagem = msg.getText();
				int num = Integer.parseInt(mensagem);
				dsl.verificarInteiro(num, score);
				

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_exibir_restritivo/Exbir_Grupo_economico.txt"));
					System.setOut(log2);
					log2.print(score + "--" + "Valor da Base - classificacao_numerica\n");
					log2.print(num + "--" + "Valor colmeia - score\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Métodos para validar o retorno da consulta Boa vista na tela Exibir PJ
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void VerificarScorePJ() throws SQLException {

		String query = "select * from restritivo_score where nro_documento = 28345432000153 ";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {
				int scr = rs.getInt("classificacao_numerica");
				int score = scr;
				WebElement msg = getDriver().findElement(By.id("PercentualScore"));
				String mensagem = msg.getText();
				int num = Integer.parseInt(mensagem);
				dsl.verificarInteiro(num, score);
				

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_exibir_restritivo/Exbir_Score_PJ.txt"));
					System.setOut(log2);
					log2.print(score + "--" + "Valor da Base - classificacao_numerica\n");
					log2.print(num + "--" + "Valor colmeia - score\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void VerificarAcaoJudicialPJ() throws SQLException {

		String query = "select * from restritivo_acao_judicial where cod_restritivo_acao_judicial = 111";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {
				
				
				Date d = rs.getDate("dt_distribuicao_acao");
				Date data = d;
				SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");

				String result = out.format(in.parse(data.toString()));
				WebElement msg21 = getDriver().findElement(By.cssSelector(
						"#list_tabela_acoesJudiciaisBoaVista td:nth-child(1) > .word-wrap"));
				String mensagem21 = msg21.getText();
				dsl.verificarString(mensagem21, result);
				

				BigDecimal vlb = rs.getBigDecimal("vl_acao");
				BigDecimal valor = vlb;
				String vl = valor.toString();
				String vl2 = vl.replace(".", ",");

				WebElement msg23 = getDriver().findElement(
						By.cssSelector("#list_tabela_acoesJudiciaisBoaVista td:nth-child(2) > .word-wrap"));
				String mensagem23 = msg23.getText();

				dsl.verificarString(mensagem23, vl2);
				

				String ac = rs.getString("texto_acao");
				String texto = ac;
				WebElement msg = getDriver().findElement(
						By.cssSelector("#list_tabela_acoesJudiciaisBoaVista td:nth-child(3) > .word-wrap"));
				String mensagem = msg.getText();
				dsl.verificarString(mensagem, texto);
				

				String ac2 = rs.getString("uf");
				String uf = ac2;
				WebElement msg2 = getDriver().findElement(
						By.cssSelector("#list_tabela_acoesJudiciaisBoaVista td:nth-child(5) > .word-wrap"));
				String mensagem2 = msg2.getText();
				dsl.verificarString(mensagem2, uf);
				
				
				
				String ac3 = rs.getString("descricao_foro");
				String cidade = ac3;
				WebElement msg3 = getDriver().findElement(
						By.cssSelector("#list_tabela_acoesJudiciaisBoaVista td:nth-child(4) > .word-wrap"));
				String mensagem3 = msg3.getText();
				dsl.verificarString(mensagem3, cidade);
				

			

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_exibir_restritivo/Exbir_acao_judicial_PJ.txt"));
					System.setOut(log2);
					log2.print(vl2 + "--" + "Valor da Base - vl_acao\n");
					log2.print(mensagem23 + "--" + "Valor colmeia - valor\n");
					log2.print("------------------------------------\n");
					log2.print(texto + "--" + "Valor da Base - texto_acao\n");
					log2.print(mensagem + "--" + "Valor colmeia - natureza acao\n");
					log2.print("------------------------------------\n");
					log2.print(uf + "--" + "Valor da Base - uf\n");
					log2.print(mensagem2 + "--" + "Valor colmeia - uf\n");
					log2.print("------------------------------------\n");
					log2.print(cidade + "--" + "Valor da Base - descricao_foro\n");
					log2.print(mensagem3 + "--" + "Valor colmeia - cidade\n");
				

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void VerificarContumaciaPJ() throws SQLException {

		String query = "select * from restritivo_cheque_sustado  where cod_restritivo_cheque_sustado = 341 ";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {

				Date d = rs.getDate("dt_ocorrencia");
				Date data = d;
				SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");

				String result = out.format(in.parse(data.toString()));
				WebElement msg21 = getDriver().findElement(By.cssSelector(
						"#list_tabela_contumaciaSustacaoBoaVista #linhaTabela_1  td:nth-child(1) > .word-wrap"));
				String mensagem21 = msg21.getText();
				dsl.verificarString(mensagem21, result);
				

				String ban = rs.getString("nome_banco");
				String banco = ban;
				WebElement msg = getDriver().findElement(By.cssSelector(
						"#list_tabela_contumaciaSustacaoBoaVista #linhaTabela_1 td:nth-child(2) > .word-wrap"));
				String mensagem = msg.getText();
				dsl.verificarString(mensagem, banco);
				

				int ag = rs.getInt("cod_agencia");
				int agencia = ag;
				WebElement msg2 = getDriver().findElement(By.cssSelector(
						"#list_tabela_contumaciaSustacaoBoaVista #linhaTabela_1 td:nth-child(3) > .word-wrap"));
				String mensagem2 = msg2.getText();
				int num2 = Integer.parseInt(mensagem2);
				dsl.verificarInteiro(num2, agencia);
				

				int cc = rs.getInt("nro_conta_corrente");
				int conta = cc;
				WebElement msg3 = getDriver().findElement(By.cssSelector(
						"#list_tabela_contumaciaSustacaoBoaVista #linhaTabela_1 td:nth-child(4) > .word-wrap"));
				String mensagem3 = msg3.getText();
				int num3 = Integer.parseInt(mensagem3);
				dsl.verificarInteiro(num3, conta);
				

				int ci = rs.getInt("nro_cheque_inicial");
				int chequei = ci;
				WebElement msg4 = getDriver().findElement(By.cssSelector(
						"#list_tabela_contumaciaSustacaoBoaVista #linhaTabela_1 td:nth-child(5) > .word-wrap"));
				String mensagem4 = msg4.getText();
				String vl3 = mensagem4.replace("0", "");
				int num4 = Integer.parseInt(vl3);
				dsl.verificarInteiro(num4, chequei);
				

				int cf = rs.getInt("nro_cheque_final");
				int chequef = cf;
				WebElement msg5 = getDriver().findElement(By.cssSelector(
						"#list_tabela_contumaciaSustacaoBoaVista #linhaTabela_1 td:nth-child(6) > .word-wrap"));
				String mensagem5 = msg5.getText();
				String vl2 = mensagem5.replace("0", "");
				int num5 = Integer.parseInt(vl2);
				dsl.verificarInteiro(num5, chequef);
				

				String mot = rs.getString("descricao_alinea");
				String motivo = mot;
				WebElement msg6 = getDriver().findElement(By.cssSelector(
						"#list_tabela_contumaciaSustacaoBoaVista #linhaTabela_1 td:nth-child(7) > .word-wrap"));
				String mensagem6 = msg6.getText();
				dsl.verificarString(mensagem6, motivo);
				

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_exibir_restritivo/Exbir_contumacia_PJ.txt"));
					System.setOut(log2);
					log2.print(result + "--" + "Valor da Base - dt_ocorrencia\n");
					log2.print(mensagem21 + "--" + "Valor colmeia - data ocorrencia\n");
					log2.print("------------------------------------\n");
					log2.print(banco + "--" + "Valor da Base - nome_banco\n");
					log2.print(mensagem + "--" + "Valor colmeia - instituicao\n");
					log2.print("------------------------------------\n");
					log2.print(agencia + "--" + "Valor da Base - cod_agencia\n");
					log2.print(num2 + "--" + "Valor colmeia - agencia\n");
					log2.print("------------------------------------\n");
					log2.print(conta + "--" + "Valor da Base - nro_conta_corrente\n");
					log2.print(num3 + "--" + "Valor colmeia - conta\n");
					log2.print("------------------------------------\n");
					log2.print(chequei + "--" + "Valor da Base - nro_cheque_inicial\n");
					log2.print(num4 + "--" + "Valor colmeia - num cheque inicial\n");
					log2.print("------------------------------------\n");
					log2.print(chequef + "--" + "Valor da Base - nro_cheque_final\n");
					log2.print(num5 + "--" + "Valor colmeia - num cheque final\n");
					log2.print("------------------------------------\n");
					log2.print(motivo + "--" + "Valor da Base - descricao_alinea\n");
					log2.print(mensagem6 + "--" + "Valor colmeia - motivo\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void VerificarProtestoPJ() throws SQLException {

		String query = "select * from restritivo_protesto where nro_documento = 28345432000153 and cod_restritivo_protesto = 1309";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {

				Date d = rs.getDate("dt_vencimento");
				Date data = d;
				SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");

				String result = out.format(in.parse(data.toString()));
				WebElement msg21 = getDriver()
						.findElement(By.cssSelector("#list_tabela_protestosBoaVista  td:nth-child(1) > .word-wrap"));
				String mensagem21 = msg21.getText();
				dsl.verificarString(mensagem21, result);
				

				BigDecimal vlb = rs.getBigDecimal("vl_protesto");
				BigDecimal valor = vlb;
				String vl = valor.toString();
				String vl2 = vl.replace(".", ",");

				WebElement msg23 = getDriver()
						.findElement(By.cssSelector("#list_tabela_protestosBoaVista td:nth-child(2)"));
				String mensagem23 = msg23.getText();

				dsl.verificarString(mensagem23, vl2);
				

				int car = rs.getInt("nro_cartorio");
				int cartorio = car;
				WebElement msg = getDriver()
						.findElement(By.cssSelector("#list_tabela_protestosBoaVista td:nth-child(3) > .word-wrap"));
				String mensagem = msg.getText();
				int num = Integer.parseInt(mensagem);
				dsl.verificarInteiro(num, cartorio);
				

				String cod2 = rs.getString("nome_cidade");
				String cidade = cod2;
				WebElement msg2 = getDriver()
						.findElement(By.cssSelector("#list_tabela_protestosBoaVista  td:nth-child(4) > .word-wrap"));
				String mensagem2 = msg2.getText();
				dsl.verificarString(mensagem2, cidade);
				

				String cod3 = rs.getString("uf");
				String uf = cod3;
				WebElement msg3 = getDriver()
						.findElement(By.cssSelector("#list_tabela_protestosBoaVista  td:nth-child(5) > .word-wrap"));
				String mensagem3 = msg3.getText();
				dsl.verificarString(mensagem3, uf);
				

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_exibir_restritivo/Exbir_Protesto_PJ.txt"));
					System.setOut(log2);
					log2.print(result + "--" + "Valor da Base - dt_protesto\n");
					log2.print(mensagem21 + "--" + "Valor colmeia - data ocorrencia\n");
					log2.print("------------------------------------\n");
					log2.print(vl2 + "--" + "Valor da Base - vl_protesto\n");
					log2.print(mensagem23 + "--" + "Valor colmeia - valor\n");
					log2.print("------------------------------------\n");
					log2.print(cartorio + "--" + "Valor da Base - nro_cartorio\n");
					log2.print(num + "--" + "Valor colmeia - cartorio\n");
					log2.print("------------------------------------\n");
					log2.print(cidade + "--" + "Valor da Base - nome_cidade\n");
					log2.print(mensagem2 + "--" + "Valor colmeia - cidade\n");
					log2.print("------------------------------------\n");
					log2.print(uf + "--" + "Valor da Base - uf\n");
					log2.print(mensagem3 + "--" + "Valor colmeia - uf\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void VerificarChequeSemFundoPJ() throws SQLException {

		String query = "select * from restritivo_cheque_sem_fundo where nro_documento = 28345432000153 and cod_restritivo_cheque_sem_fundo = 76 ";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {

				Date d = rs.getDate("dt_ultimo_cheque");
				Date data = d;
				SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");

				String result = out.format(in.parse(data.toString()));
				WebElement msg21 = getDriver().findElement(
						By.cssSelector("#list_tabela_chequeSemFundoBoaVista  td:nth-child(1) > .word-wrap"));
				String mensagem21 = msg21.getText();
				dsl.verificarString(mensagem21, result);
				

				String scr = rs.getString("nome_banco");
				String banco = scr;
				WebElement msg = getDriver().findElement(
						By.cssSelector("#list_tabela_chequeSemFundoBoaVista td:nth-child(2) > .word-wrap"));
				String mensagem = msg.getText();

				dsl.verificarString(mensagem, banco);
				

				int ci = rs.getInt("cod_agencia");
				int agencia = ci;
				WebElement msg4 = getDriver().findElement(
						By.cssSelector("#list_tabela_chequeSemFundoBoaVista td:nth-child(3) > .word-wrap"));
				String mensagem4 = msg4.getText();
				int num4 = Integer.parseInt(mensagem4);
				dsl.verificarInteiro(num4, agencia);
				

		

				String al = rs.getString("motivo_cheque_sem_fundo");
				String alinea = al;
				WebElement msg6 = getDriver().findElement(
						By.cssSelector("#list_tabela_chequeSemFundoBoaVista td:nth-child(4) > .word-wrap"));
				String mensagem6 = msg6.getText();

				dsl.verificarString(mensagem6, alinea);
				

				int ci3 = rs.getInt("quantidade_cheque_sem_fundo");
				int qua = ci3;
				WebElement msg7 = getDriver().findElement(
						By.cssSelector("#list_tabela_chequeSemFundoBoaVista td:nth-child(5) > .word-wrap"));
				String mensagem7 = msg7.getText();
				int num7 = Integer.parseInt(mensagem7);
				dsl.verificarInteiro(num7, qua);
				

				

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_exibir_restritivo/Exbir_Cheque_sem_fundo_PJ.txt"));
					System.setOut(log2);
					log2.print(result + "--" + "Valor da Base - dt_ultimo_cheque\n");
					log2.print(mensagem21 + "--" + "Valor colmeia - data ocorrencia\n");
					log2.print("------------------------------------\n");
					log2.print(banco + "--" + "Valor da Base - nome_banco\n");
					log2.print(mensagem + "--" + "Valor colmeia - banco\n");
					log2.print("------------------------------------\n");
					log2.print(agencia + "--" + "Valor da Base - cod_agencia\n");
					log2.print(num4 + "--" + "Valor colmeia - agencia\n");
					log2.print("------------------------------------\n");
					log2.print(alinea + "--" + "Valor da Base - motivo_cheque_sem_fundo\n");
					log2.print(mensagem6 + "--" + "Valor colmeia - alinea\n");
					log2.print("------------------------------------\n");
					log2.print(qua + "--" + "Valor da Base - quantidade_cheque_sem_fundo\n");
					log2.print(num7 + "--" + "Valor colmeia - quantidade\n");
				
				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void VerificarFalencias() throws SQLException {

		String query = "select * from restritivo_falencia  where nro_documento = 28345432000153 and cod_restritivo_falencia = 86";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {

				Date d = rs.getDate("dt_falencia");
				Date data = d;
				SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");

				String result = out.format(in.parse(data.toString()));
				WebElement msg21 = getDriver()
						.findElement(By.cssSelector("#list_tabela_falenciasBoaVista  td:nth-child(1) > .word-wrap"));
				String mensagem21 = msg21.getText();
				dsl.verificarString(mensagem21, result);
			

				String oc = rs.getString("tipo_ocorrencia");
				String ocr = oc;
				WebElement msg = getDriver()
						.findElement(By.cssSelector("#list_tabela_falenciasBoaVista td:nth-child(2) > .word-wrap "));
				String mensagem = msg.getText();

				dsl.verificarString(mensagem, ocr);
				

			

			

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_exibir_restritivo/Exbir_Falencia.txt"));
					System.setOut(log2);
					log2.print(result + "--" + "Valor da Base - dt_falencia\n");
					log2.print(mensagem21 + "--" + "Valor colmeia - data ocorrencia\n");
					log2.print("------------------------------------\n");
					log2.print(ocr + "--" + "Valor da Base - tipo_ocorrencia\n");
					log2.print(mensagem + "--" + "Valor colmeia - valor\n");
				

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void VerificarDividaVencida() throws SQLException {

		String query = "select * from restritivo_divida_vencida   where nro_documento = 28345432000153 and cod_restritivo_divida_vencida = 168 ";
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {

				Date d = rs.getDate("dt_debito");
				Date data = d;
				SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd");
				SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");

				String result = out.format(in.parse(data.toString()));
				WebElement msg21 = getDriver().findElement(
						By.cssSelector("#list_tabela_dividaVencidaBoaVista  td:nth-child(1) > .word-wrap"));
				String mensagem21 = msg21.getText();
				dsl.verificarString(mensagem21, result);
				

				BigDecimal vlb = rs.getBigDecimal("vl_divida_vencida");
				BigDecimal valor = vlb;
				String vl = valor.toString();
				String vl2 = vl.replace(".", ",");

				WebElement msg23 = getDriver()
						.findElement(By.cssSelector("#list_tabela_dividaVencidaBoaVista td:nth-child(2)"));
				String mensagem23 = msg23.getText();

				dsl.verificarString(mensagem23, vl2);
				

				

	

				String oc = rs.getString("nome_informante");
				String ocr = oc;
				WebElement msg = getDriver().findElement(
						By.cssSelector("#list_tabela_dividaVencidaBoaVista td:nth-child(3) > .word-wrap "));
				String mensagem = msg.getText();

				dsl.verificarString(mensagem, ocr);
				

				String oc2 = rs.getString("documento_origem");
				String ocr2 = oc2;
				WebElement msg2 = getDriver().findElement(
						By.cssSelector("#list_tabela_dividaVencidaBoaVista td:nth-child(4) > .word-wrap "));
				String mensagem2 = msg2.getText();

				dsl.verificarString(mensagem2, ocr2);

				

				try {

					PrintStream log2 = new PrintStream(new File(
							"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_exibir_restritivo/Exbir_Divida_vencida.txt"));
					System.setOut(log2);
					log2.print(result + "--" + "Valor da Base - dt debito\n");
					log2.print(mensagem21 + "--" + "Valor colmeia - data ocorrencia\n");
					log2.print("------------------------------------\n");
					log2.print(vl2 + "--" + "Valor da Base - vl_divida_vencida\n");
					log2.print(mensagem23 + "--" + "Valor colmeia - valor\n");
					log2.print("------------------------------------\n");
				    log2.print(ocr + "--" + "Valor da Base - nome informante\n");
					log2.print(mensagem + "--" + "Valor colmeia - Empresa\n");
					log2.print("------------------------------------\n");
					log2.print(ocr2 + "--" + "Valor da Base - documento_origem\n");
					log2.print(mensagem2 + "--" + "Valor colmeia - numero contrato\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void VerificarSerasa() {

		dsl.VerificarPresenca("dvSubtitulo_restritivo.subtitulo.pendencia.pagamento");

	}
	
	public void VerificarBoaVista() {

		dsl.VerificarPresenca("PercentualScore");

	}

	public void VerificarTela() throws InterruptedException, IOException {

		Thread.sleep(1000);
		dsl.print(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Prints/Print_mensagem_Pesquisar_restritivo_com_numero_conta_tela_manter.png");

	}

	public void SerasaSim() {

		WebElement msg2 = getDriver()
				.findElement(By.cssSelector("#list_tabela_null #linhaTabela_1  td:nth-child(4) > .word-wrap "));
		String mensagem2 = msg2.getText();

		dsl.verificarString(mensagem2, "Sim - Serasa");

	}

	public void BoaVistaSim() {

		WebElement msg2 = getDriver()
				.findElement(By.cssSelector("#list_tabela_null #linhaTabela_1  td:nth-child(4) > .word-wrap "));
		String mensagem2 = msg2.getText();

		dsl.verificarString(mensagem2, "Sim - Boa Vista");

	}

	/**
	 * Métodos alterar o status da consulta Boa vista na tela Alterar PF
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void VerificarAlteracaoRestritivo(String script, int situacao, String caminho) throws SQLException {

		String query = script;
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {
				int scr = rs.getInt("situacao");
				int sit = scr;

				dsl.verificarInteiro(sit, situacao);
				

				try {

					PrintStream log2 = new PrintStream(new File(caminho));
					System.setOut(log2);
					log2.print(sit + "--" + "Valor da Base - situacao\n");
					log2.print(situacao + "--" + "Valor colmeia - situacao restritivo\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo que realiza o tratamento de erros, o log fica disponivel em um
	 * arquivo
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void TratarErro(String caminho, Throwable erro) {

		try {

			PrintStream log2 = new PrintStream(new File(caminho));
			System.setOut(log2);
			log2.print(erro + "--" + "Occoreu um erro nesse cenario verifique o log\n");

		} catch (FileNotFoundException fx) {

			System.out.println(fx);

		}

	}

	public void PrintMensagem(String caminho) throws IOException, InterruptedException {

		dsl.print(caminho);
		

	}
	
	public void FecharDiv() throws InterruptedException {
		Thread.sleep(15000);
		dsl.sairFrame();
		dsl.entrarFrameindex(0);
		dsl.clicar("dvBg");
		dsl.sairFrame();
		dsl.entrarFrameindex(2);
		dsl.entrarFrameindex(0);
		//dsl.entrarFrameindex(0);
		dsl.clicar("xCloseDiv");
		Thread.sleep(15000);
		
		
		
		
	}

	public void DataAtual() throws SQLException {
		try {

			String query = "update restritivo_bureau  set dt_hr_atualizacao = CURRENT_TIMESTAMP  where nro_documento = 76318028900 ";
			con2.executaBusca(query);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
	
	public void AtualizarDataConsultaBoaVistaPF() {
		
		try {

			String query = "update restritivo_bureau  set dt_hr_atualizacao = CURRENT_TIMESTAMP  where usuario = 'AUTOMACAOPF' ";
			con2.executaBusca(query);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
	
	
public void AtualizarRestritivoPF() {
		
		try {

			String query = "update restritivo_protesto set situacao = 6833 where cod_restritivo_protesto = 1267";
			con2.executaBusca(query);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}


public void SemAvalista() {
	
	try {

		String query = "update restritivo_pendencia_pagamento set situacao_pendencia = 'COMPRADOR' where nro_documento = 04396105916 ";
		con2.executaBusca(query);

	} catch (Exception e) {

		e.printStackTrace();

	}
}


public void ComAvalista() {
	
	try {

		String query = "update restritivo_pendencia_pagamento set situacao_pendencia = 'Avalista' where nro_documento = 04396105916 ";
		con2.executaBusca(query);

	} catch (Exception e) {

		e.printStackTrace();

	}
}


public void AtualizarRestritivoPJ() {
	
	try {

		String query = "update restritivo_acao_judicial set situacao = 6833 where cod_restritivo_acao_judicial = 111";
		con2.executaBusca(query);

	} catch (Exception e) {

		e.printStackTrace();

	}
}

	
public void AtualizarDataConsultaBoaVistaPJ() {
		
		try {

			String query = "update restritivo_bureau  set dt_hr_atualizacao = CURRENT_TIMESTAMP  where usuario = 'AUTOMACAOPJ'";
			con2.executaBusca(query);

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

public void AtualizarDataConsultaBoaVistaGrupoEconomico() {
	
	try {

		String query = "update restritivo_bureau  set dt_hr_atualizacao = CURRENT_TIMESTAMP  where usuario = 'AUTOMACAOGE' ";
		con2.executaBusca(query);

	} catch (Exception e) {

		e.printStackTrace();

	}
}


public void AtualizarDataConsultaSerasaPJ() {
	
	try {

		String query = "update tb_gfc_restritivo_serasa_bureau set rsb_data_hora_atualizacao = CURRENT_TIMESTAMP where rsb_usuario = 'AUTOMACAO-SERASAPJ'";
		con.executaBusca(query);

	} catch (Exception e) {

		e.printStackTrace();

	}
}

public void AtualizarDataConsultaSerasaPF() {
	
	try {

		String query = "update tb_gfc_restritivo_serasa_bureau set rsb_data_hora_atualizacao = CURRENT_TIMESTAMP where rsb_usuario = 'AUTOMACAO-SERASAPF'";
		con.executaBusca(query);

	} catch (Exception e) {

		e.printStackTrace();

	}
}
		
		
	

	public void ClicarAtualizarConsultaExterna() {

		dsl.clicarcss("#actionCampoGrid_1_3 .imgGrid");
		
	}

	public void VerificarConsultaRealizada(String caminho, String doc) throws SQLException {

		String query = "select * from restritivo_bureau  where nro_documento =" + doc;
		ResultSet rs = con2.executaBusca(query);

		try {

			while (rs.next()) {
				int scr = rs.getInt("situacao");
				int sit = scr;

				dsl.verificarInteiro(sit, 11289);
				

				/*Date d = rs.getDate("dt_hr_atualizacao");
				Date data = d;
				
				
				SimpleDateFormat df;
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				sdf.format( new Date( System.currentTimeMillis()));

				SimpleDateFormat in = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

				SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");

				String result = out.format(in.parse(data.toString()));
				WebElement msg21 = getDriver()
						.findElement(By.cssSelector("#linhaTabela_1 > td:nth-child(6) > .word-wrap"));
				String mensagem21 = msg21.getText();
				//dsl.verificarString(mensagem21, result);
				System.out.println(mensagem21);
				//System.out.println(result); */

				try {

					PrintStream log2 = new PrintStream(new File(caminho));
					System.setOut(log2);
					log2.print(sit + "--" + "Valor da Base - situacao\n");
					log2.print(11289 + "--" + "Consulta Realizada\n");
					// log2.print("------------------------------------\n");
					// log2.print(result + "--" + "Valor da Base
					// -dt_hora_atualizacao\n");
					// log2.print(mensagem21 + "--" + "Valor colmeia -
					// atualizacao restritivo externo\n");

				} catch (FileNotFoundException fx) {

					System.out.println(fx);

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void ResetarDados(String doc) throws SQLException {

		try {

			String query = "update restritivo_bureau  set nro_documento = 12345678911  where nro_documento = " + doc;
            con2.executaBusca(query);
	
			

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
	
	public void ResetarDadosSocio() throws SQLException {

		try {

			
			String query = "update restritivo_bureau  set dt_hr_atualizacao = CURRENT_TIMESTAMP where nro_documento = 7344688905 and usuario = 'AUTOMACAO-2020'";
			con2.executaBusca(query);
			
			

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
	
	
	public void ResetarDadosSocio2() throws SQLException {

		try {

			
			String query = 
					"update restritivo_bureau  set dt_hr_atualizacao = CURRENT_TIMESTAMP  where nro_documento = 35978813787 and usuario = 'AUTOMACAOSOCIO2'";
			con2.executaBusca(query);
			
			

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
	
	public void ResetarConsultaSocio() throws SQLException {

		try {

			
			String query = "update restritivo_bureau  set dt_hr_atualizacao = '2019-09-10 10:46:07.771988' where nro_documento = 6090878944 and usuario = 'AUTOMACAO-2021' ";
			con2.executaBusca(query);
			
			

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
	
	public void ResetarConsultaSocio2() throws SQLException {

		try {

			
			String query = "update restritivo_bureau  set dt_hr_atualizacao = '2019-09-23 10:46:07.771988' where nro_documento = 7777577964  and usuario = 'AUTOMACAOSOCIO3' ";
			con2.executaBusca(query);
			
			

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
	
	public void LimparConsultaSocio() throws SQLException {

		try {

			
			String query = "update restritivo_bureau  set nro_documento = 33366699910 where nro_documento = 6090878944 and usuario = '88888' ";
			con2.executaBusca(query);
			
			

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
	
	public void LimparConsultaSocio2() throws SQLException {

		try {

			
			String query = "update restritivo_bureau  set nro_documento = 33366699911 where nro_documento = 7777577964 and usuario = '88888' ";
			con2.executaBusca(query);
			
			

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public void ConferirData () {
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String today = sdf.format( new Date( System.currentTimeMillis()));
		
		WebElement msg21 = getDriver()
				.findElement(By.cssSelector("#linhaTabela_1 > td:nth-child(6) > .word-wrap"));
		String mensagem21 = msg21.getText();
		dsl.verificarString(mensagem21, today);
		
		
		
		
		
		
	}
	
	
}
