package br.coop.cresol;

import org.junit.Test;

import br.core.cresol.BaseTest;
import br.pages.cresol.ConfiguradoresPage;

public class Configuradores extends BaseTest {
	
	/**
	 * Metodos com o front end para validar a tela Configuradores
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */
	
	private ConfiguradoresPage Page;
	
	@Test
	public void RestritivosExternosRelevantesAssociado() throws InterruptedException {
		try {
		Page = new ConfiguradoresPage();
		Page.EntrarMenuLateral();
		Page.ClicarConfiguradores();
		Page.ClicarScore();
		Page.ClicarConfiguracao();
		Page.EntrarModulo();
		Page.ClicarExibir();
		Page.VerificarValordoCampoRelevantesAssociado("Restritivos - Externos Relevantes - Associado");
		
	} catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Configuradores_relevante_Associado.txt",
				a);

		throw a;

	}
		
		
	}
	
	@Test
	public void RestritivosExternosNaoRelevantesAssociado() throws InterruptedException {
		try {
		Page = new ConfiguradoresPage();
		Page.EntrarMenuLateral();
		Page.ClicarConfiguradores();
		Page.ClicarScore();
		Page.ClicarConfiguracao();
		Page.EntrarModulo();
		Page.ClicarExibir();
		Page.VerificarValordoCampoNaoRelevantesAssociado("Restritivos - Externos Não Relevantes - Associado");
		
	} catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Configuradores_nao_relevante_Associado.txt",
				a);

		throw a;

	}
		
		
	}
	
	
	@Test
	public void RestritivosExternosRelevantesGrupoEconomico() throws InterruptedException {
		try {
		Page = new ConfiguradoresPage();
		Page.EntrarMenuLateral();
		Page.ClicarConfiguradores();
		Page.ClicarScore();
		Page.ClicarConfiguracao();
		Page.EntrarModulo();
		Page.ClicarExibir();
		Page.VerificarValordoCampoRelevantesGrupoEconomico("Restritivos - Externos Relevantes - Membro do Grupo Econômico");
	
	} catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Configuradores_relevante_Grupo_economico.txt",
				a);

		throw a;

	}
		
	}
	
	@Test
	public void RestritivosExternosNaoRelevantesGrupoEconomico() throws InterruptedException {
		try {
		Page = new ConfiguradoresPage();
		Page.EntrarMenuLateral();
		Page.ClicarConfiguradores();
		Page.ClicarScore();
		Page.ClicarConfiguracao();
		Page.EntrarModulo();
		Page.ClicarExibir();
		Page.VerificarValordoCampoNaoRelevantesGrupoEconomico("Restritivos - Externos Não Relevantes - Membro do Grupo Econômico");
		
	} catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Configuradores_nao_relevante_Grupo_economico.txt",
				a);

		throw a;

	}
		
	}
	
	
	@Test
	public void EfetuarConsultaSerasaInalterado()  {
		try {
		Page = new ConfiguradoresPage();
		Page.EntrarMenuLateral();
		Page.ClicarConfiguradores();
		Page.ClicarScore();
		Page.ClicarConfiguracao();
		Page.EntrarModulo();
		Page.VerificarValorCampoEfetuarConsultasSerasa("Efetuar Consultas SERASA (*)");
		
	} catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Configuradores_Efetuar_consultas_serasa.txt",
				a);

		throw a;

	}
		
	}
	
	@Test
	public void ValorDeRelevanciaRestritivosExternos()  {
		try {
		Page = new ConfiguradoresPage();
		Page.EntrarMenuLateral();
		Page.ClicarConfiguradores();
		Page.ClicarScore();
		Page.ClicarConfiguracao();
		Page.EntrarModulo();
		Page.VerificarValorCampoValorDeRelevanciaRestritivosExternos("Valor de Relevância dos Restritivos Externos (*)");
		
	} catch (AssertionError a) {

		Page.TratarErro(
				"C:\\Users/dcsantos/git/restritivo-boavista/03-QA/Teste Automatizado/BoaVista/src/main/resources/Erros/Configuradores_valor_Relevancia_Restritivos_Externo.txt",
				a);

		throw a;

	}
		
	}

}
