package br.pages.cresol;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import br.core.cresol.BasePage;

public class ConfiguradoresPage extends BasePage {
	
	/**
	 * Metodos com o back end para validar a tela Configuradores
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */


	public void EntrarMenuLateral() {

		dsl.entrarMenuLateral();

	}
	
	public void ClicarConfiguradores() {
		
		 dsl.clicarLink("Configuradores");
		//dsl.clicar("webfx-tree-object-168-anchor"); // Local
		
	}
	
	public void ClicarScore() {
		
		dsl.clicarLink("Score");
		//dsl.clicar("webfx-tree-object-199-anchor"); // Local
		
	}
	
	public void ClicarConfiguracao() {
		
		dsl.clicarLink("Configuração");
		//dsl.clicar("ssubmenu157");//171
		//dsl.clicar("webfx-tree-object-200-anchor"); // Local
		
	}
	
	public void EntrarModulo() {
		
		dsl.entrarModulo();
		
		
	}
	
	public void ClicarExibir() throws InterruptedException {
		Thread.sleep(5000);
		dsl.clicarcss("#actionImgGrid_1 > .imgPqnGrid");
		
		
	}
	
	public void VerificarValordoCampoRelevantesAssociado(String msg) {
		
		dsl.verificarTextos("tipoSubCriterio_3", msg);
		
		try {

			PrintStream log2 = new PrintStream(new File(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_configuradores/Configuradores_relevantes_Associado.txt"));
			System.setOut(log2);
			log2.print(msg + "--" + "Valor Colmeia\n");
		

		} catch (FileNotFoundException fx) {

			System.out.println(fx);

		}
		
	}

	public void VerificarValordoCampoNaoRelevantesAssociado(String msg) {
		
		dsl.verificarTextos("tipoSubCriterio_47", msg);
		
		try {

			PrintStream log2 = new PrintStream(new File(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_configuradores/Configuradores_nao_relevantes_Associado.txt"));
			System.setOut(log2);
			log2.print(msg + "--" + "Valor Colmeia\n");
		

		} catch (FileNotFoundException fx) {

			System.out.println(fx);

		}
		
	}

	public void VerificarValordoCampoRelevantesGrupoEconomico(String msg) {
		dsl.verificarTextos("tipoSubCriterio_4", msg);
		
		try {

			PrintStream log2 = new PrintStream(new File(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_configuradores/Configuradores_relevantes_grupo_economico.txt"));
			System.setOut(log2);
			log2.print(msg + "--" + "Valor Colmeia\n");
		

		} catch (FileNotFoundException fx) {

			System.out.println(fx);

		}
		
	}

	public void VerificarValordoCampoNaoRelevantesGrupoEconomico(String msg) {
		dsl.verificarTextos("tipoSubCriterio_48", msg);
		
		try {

			PrintStream log2 = new PrintStream(new File(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_configuradores/Configuradores_nao_relevantes_grupo_economico.txt"));
			System.setOut(log2);
			log2.print(msg + "--" + "Valor Colmeia\n");
		

		} catch (FileNotFoundException fx) {

			System.out.println(fx);

		}

		
	}
	
	public void VerificarValorCampoEfetuarConsultasSerasa(String msg) {
		dsl.verificarTextos("efetuarConsultaSerasa_idLabel", msg);
		
		try {

			PrintStream log2 = new PrintStream(new File(
					"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_configuradores/Configuradores_Efetuar_consultas_Serasa.txt"));
			System.setOut(log2);
			log2.print(msg + "--" + "Valor Colmeia\n");
		

		} catch (FileNotFoundException fx) {

			System.out.println(fx);

		}
	}
		
		public void VerificarValorCampoValorDeRelevanciaRestritivosExternos(String msg) {
			dsl.verificarTextos("valorRelevanciaRestritivosExterno_idLabel", msg);
			
			try {

				PrintStream log2 = new PrintStream(new File(
						"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Evidencias_configuradores/Configuradores_valor_Relevancia_Restritivos_Externo.txt"));
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
