package br.coop.cresol;

import org.junit.Test;

import br.core.cresol.BaseTest;
import br.pages.cresol.ScorePage;

public class Score extends BaseTest {
	
	/**
	 * Metodos com o front end para validar a tela Score
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	private ScorePage Page;

	@Test
	public void RestritivosExternosRelevantesAssociado() {
try {
		Page = new ScorePage();
		Page.EntrarMenuLateral();
		Page.ClicarScore();
		Page.ClicarManterScore();
		Page.EntrarModulo();
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarExibirRestritivoFinal();
		Page.VerificarValorDoCampoRelevantesAssociado("Restritivos - Externos Relevantes - Associado");
		
} catch (AssertionError a) {

	Page.TratarErro(
			"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Score_relevante_associado.txt",
			a);

	throw a;

}


	}

	@Test
	public void RestritivosExternosNaoRelevantesAssociado() {
try {
		Page = new ScorePage();
		Page.EntrarMenuLateral();
		Page.ClicarScore();
		Page.ClicarManterScore();
		Page.EntrarModulo();
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarExibirRestritivoFinal();
		Page.VerificarValorDoCampoNaoRelevantesAssociado("Restritivos - Externos Não Relevantes - Associado");

} catch (AssertionError a) {

	Page.TratarErro(
			"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Score_nao_relevante_associado.txt",
			a);

	throw a;

}
	}

	@Test
	public void RestritivosExternosRelevantesGrupoEconomico() {
try {
		Page = new ScorePage();
		Page.EntrarMenuLateral();
		Page.ClicarScore();
		Page.ClicarManterScore();
		Page.EntrarModulo();
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarExibirRestritivoFinal();
		Page.VerificarValorDoCampoRelevantesGrupoEconomico(
				"Restritivos - Externos Relevantes - Membro do Grupo Econômico");
		
} catch (AssertionError a) {

	Page.TratarErro(
			"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Score_relevante_Grupo_economico.txt",
			a);

	throw a;

}

	}

	@Test
	public void RestritivosExternosNaoRelevantesGrupoEconomico() {
try {
		Page = new ScorePage();
		Page.EntrarMenuLateral();
		Page.ClicarScore();
		Page.ClicarManterScore();
		Page.EntrarModulo();
		Page.ClicarPesquisar();
		Page.ClicarExibir();
		Page.ClicarExibirRestritivoFinal();
		Page.VerificarValorDoCampoNaoRelevantesGrupoEconomico(
				"Restritivos - Externos Não Relevantes - Membro do Grupo Econômico");
} catch (AssertionError a) {

	Page.TratarErro(
			"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Score_nao_relevante_Grupo_economico.txt",
			a);

	throw a;

}

	}

}
