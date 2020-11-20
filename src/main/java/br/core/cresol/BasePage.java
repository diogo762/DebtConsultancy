package br.core.cresol;

/**
 * Classe que instancia a classe Dsl para as classes Pages, todas as classes
 * page precisam extender essa classe
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class BasePage {

	protected Dsl dsl;
	protected ConexaoDB con;
	protected ConexaoDB2 con2;

	public BasePage() {
		dsl = new Dsl();
		con = new ConexaoDB();
		con2 = new ConexaoDB2();
	}
}

