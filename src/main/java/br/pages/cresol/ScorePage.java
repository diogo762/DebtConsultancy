package br.pages.cresol;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import br.core.cresol.BasePage;

public class ScorePage extends BasePage {
	
	/**
	 * Metodos com o back end para validar a tela Score
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void EntrarMenuLateral() {

		dsl.entrarMenuLateral();

	}

	public void ClicarScore() {

		dsl.clicarLink("Score");
		//dsl.clicar("webfx-tree-object-275-anchor");//Local 

	}

	public void ClicarManterScore() {
		dsl.clicarLink("Manter");
		//dsl.clicar("ssubmenu1162");
		//dsl.clicar("webfx-tree-object-276-anchor");//Local 

	}

	public void EntrarModulo() {

		dsl.entrarModulo();

	}

	public void ClicarPesquisar() {

		dsl.clicar("Pesquisar");

	}

	public void ClicarExibir() {

		dsl.clicarcss("#actionImgGrid_1 > .imgGrid");

	}

	public void ClicarExibirRestritivoFinal() {

		dsl.clicarcss("#actionImgGrid_1 > .imgPqnGrid");

	}

	public void VerificarValorDoCampoRelevantesAssociado(String msg) {

		dsl.verificarTextosCss("#list_tabela_criteriosRestritivos #linhaTabela_1 > td:nth-child(1) > .word-wrap", msg);
		
		try {

			PrintStream log2 = new PrintStream(new File(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Score/Score_relevantes_associado.txt"));
			System.setOut(log2);
			log2.print(msg + "--" + "Valor Colmeia\n");
		

		} catch (FileNotFoundException fx) {

			System.out.println(fx);

		}

	}

	public void VerificarValorDoCampoNaoRelevantesAssociado(String msg) {

		dsl.verificarTextosCss("#list_tabela_criteriosRestritivos #linhaTabela_3 > td:nth-child(1) > .word-wrap", msg);
		
		try {

			PrintStream log2 = new PrintStream(new File(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Score/Score_nao_relevantes_associado.txt"));
			System.setOut(log2);
			log2.print(msg + "--" + "Valor Colmeia\n");
		

		} catch (FileNotFoundException fx) {

			System.out.println(fx);

		}

	}

	public void VerificarValorDoCampoRelevantesGrupoEconomico(String msg) {

		dsl.verificarTextosCss("#list_tabela_criteriosRestritivos #linhaTabela_5 > td:nth-child(1) > .word-wrap", msg);
		
		try {

			PrintStream log2 = new PrintStream(new File(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Score/Score_relevantes_grupo_economico.txt"));
			System.setOut(log2);
			log2.print(msg + "--" + "Valor Colmeia\n");
		

		} catch (FileNotFoundException fx) {

			System.out.println(fx);

		}

	}

	public void VerificarValorDoCampoNaoRelevantesGrupoEconomico(String msg) {

		dsl.verificarTextosCss("#list_tabela_criteriosRestritivos #linhaTabela_7 > td:nth-child(1) > .word-wrap", msg);
		
		try {

			PrintStream log2 = new PrintStream(new File(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_Score/Score_nao_relevantes_grupo_economico.txt"));
			System.setOut(log2);
			log2.print(msg + "--" + "Valor Colmeia\n");
		

		} catch (FileNotFoundException fx) {

			System.out.println(fx);

		}

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

}
