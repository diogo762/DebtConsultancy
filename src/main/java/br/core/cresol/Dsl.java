package br.core.cresol;

import static br.core.cresol.DriverFactory.getDriver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/**
 * Classe com os comandos do selenium utilizados na automação dos cenários de
 * testes do projeto Boa Vista CRESOL, scrpits de integração entre as telas do
 * colmeia e validações de comprovantes e mensagens
 * 
 * 
 * @author Diogo Cardoso Santos - AR.Phoenix
 */

public class Dsl {

	/********* Escrever e limpar campo de texto ************/

	public void escrever(String id_campo, String texto) {

		getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}

	public void limparCampo(String id) {

		getDriver().findElement(By.id(id)).clear();

	}

	public void limparCampoByName(String name) {

		getDriver().findElement(By.name(name)).clear();

	}

	public void escreverbyname(String id_campo, String texto) {

		getDriver().findElement(By.name(id_campo)).sendKeys(texto);
	}

	public String obterValorCampo(String id_campo) {
		return getDriver().findElement(By.id(id_campo)).getAttribute("value");
	}

	public String ValidarValorCampo(String id_campo) {
		return getDriver().findElement(By.id(id_campo)).getAttribute("value");
	}

	/********* Radio e Check ************/

	public void clicar(String id) {
		getDriver().findElement(By.id(id)).click();
	}

	public boolean isRadioMarcado(String id) {
		return getDriver().findElement(By.id(id)).isSelected();
	}

	public void clicarCheck(String id) {
		getDriver().findElement(By.id(id)).click();
	}

	public boolean isCheckMarcado(String id) {
		return getDriver().findElement(By.id(id)).isSelected();
	}

	/********* Combo ************/

	public void selecionarCombo(String id, String valor) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public void selecionarComboname(String nome, String valor) {
		WebElement element = getDriver().findElement(By.name(nome));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public void selecionarCombocss(String css, String valor) {
		WebElement element = getDriver().findElement(By.cssSelector(css));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}

	public void selecionarComboindex(String nome, int index) {
		WebElement element = getDriver().findElement(By.name(nome));
		Select combo = new Select(element);
		combo.selectByIndex(index);
	}

	public void deselecionarCombo(String id, String valor) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.deselectByVisibleText(valor);
	}

	public void obterValorCombo(String name, String esperado) {
		WebElement element = getDriver().findElement(By.name(name));
		Select combo = new Select(element);
		String valor = combo.getFirstSelectedOption().getText();
		Assert.assertEquals(valor, esperado);
	}

	public void obterValorComboById(String id, String esperado) {
		WebElement element = getDriver().findElement(By.name(id));
		Select combo = new Select(element);
		String valor = combo.getFirstSelectedOption().getText();
		Assert.assertEquals(valor, esperado);
	}

	public List<String> obterValoresCombo(String id) {
		WebElement element = getDriver().findElement(By.id("id"));
		Select combo = new Select(element);
		List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		for (WebElement opcao : allSelectedOptions) {
			valores.add(opcao.getText());
		}
		return valores;
	}
	
	
	public int obterQuantidadeOpcoesCombo(String id) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		return options.size();
	}

	public boolean verificarOpcaoCombo(String id, String opcao) {
		WebElement element = getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		List<WebElement> options = combo.getOptions();
		for (WebElement option : options) {
			if (option.getText().equals(opcao)) {
				return true;
			}
		}
		return false;
	}

	/********* Botao ************/

	public void clicarBotao(String id) {
		getDriver().findElement(By.id(id)).click();
	}

	public String obterValueElemento(String id) {
		return getDriver().findElement(By.id(id)).getAttribute("value");
	}

	public void clicarcss(String id) {
		getDriver().findElement(By.cssSelector(id)).click();
	}

	public void clicarXpath(String caminho) {

		getDriver().findElement(By.xpath(caminho)).click();

	}

	public void clicarBotaoname(String nome) {
		getDriver().findElement(By.name(nome)).click();
	}

	/********* Link ************/

	public void clicarLink(String link) {
		getDriver().findElement(By.linkText(link)).click();
	}

	/********* Textos ************/

	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}

	public String obterTexto(String id) {
		return obterTexto(By.id(id));
	}

	/********* Alerts ************/

	public String alertaObterTexto() {
		Alert alert = getDriver().switchTo().alert();
		return alert.getText();
	}

	public String alertaObterTextoEAceita() {
		Alert alert = getDriver().switchTo().alert();
		String valor = alert.getText();
		alert.accept();
		return valor;

	}

	public String alertaObterTextoENega() {
		Alert alert = getDriver().switchTo().alert();
		String valor = alert.getText();
		alert.dismiss();
		return valor;

	}

	public void alertaEscrever(String valor) {
		Alert alert = getDriver().switchTo().alert();
		alert.sendKeys(valor);
		alert.accept();
	}

	/********* Frames e Janelas ************/

	public void entrarFrame(String id) {
		getDriver().switchTo().frame(id);
	}

	public void entrarFrameindex(int index) {
		getDriver().switchTo().frame(index);
	}

	public void sairFrame() {
		getDriver().switchTo().defaultContent();
	}

	public void trocarJanela(String id) {
		getDriver().switchTo().window(id);
	}

	public void entrarMenuLateral() {

		getDriver().switchTo().frame(1);
	}

	public void entrarModulo() {

		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		//getDriver().switchTo().frame(1); //Singular 130
		getDriver().switchTo().frame(0); // Central 130

	}

	/********* Print ************/

	public void print(String pasta) throws IOException, InterruptedException {

		Thread.sleep(1000);

		TakesScreenshot ts = (TakesScreenshot) getDriver();

		File source = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File(pasta));

	}

	

	/********* Refresh da página ************/

	public void refreshPagina() {

		getDriver().navigate().refresh();

	}
	
	/********* Asserts ************/

	public void verificarMensagens(String msg) {

		getDriver().findElement(By.id("tbMsg")).click();
		WebElement tx = getDriver().findElement(By.id("tbMsg"));
		String mensagem = tx.getText();
		Assert.assertThat(mensagem, StringContains.containsString(msg));

	}

	public void verificarTextos(String id, String msg) {

		WebElement tx = getDriver().findElement(By.id(id));
		String mensagem = tx.getText();
		Assert.assertThat(mensagem, StringContains.containsString(msg));

	}

	public void verificarTextosCss(String css, String msg) {

		WebElement tx = getDriver().findElement(By.cssSelector(css));
		String mensagem = tx.getText();
		Assert.assertThat(mensagem, StringContains.containsString(msg));

	}

	public void verificarInteiro(int esperado, int atual) {

		Assert.assertEquals(atual, esperado);

	}
	
	public void verificarLong(long esperado, long atual) {

		Assert.assertEquals(atual, esperado);

	}

	public void VerificarPresenca(String id) {

		getDriver().findElement(By.id(id)).click();

		WebElement presente = getDriver().findElement(By.id(id));

		Assert.assertEquals(true, presente.isDisplayed());

	}

	public void verificarString(String esperado, String atual) {

		Assert.assertEquals(atual, esperado);

	}
	
	public void verificarDiferente(String naoesperado, String atual){
		
		Assert.assertNotEquals(naoesperado, atual);
		
	}

	public void incluirParecer() {
		Random random = new Random();

		getDriver().switchTo().frame(1);
		getDriver().findElement(By.id("ssubmenu41")).click();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(2);
		getDriver().switchTo().frame(0);
		WebElement element = getDriver().findElement(By.name("moduloOrigemAlcada"));
		Select combo = new Select(element);
		combo.selectByVisibleText("EMPRÉSTIMOS & FINANCIAMENTOS");
		WebElement element1 = getDriver().findElement(By.name("situacao"));
		Select combo1 = new Select(element1);
		combo1.selectByVisibleText("EM APROVAÇÃO");
		getDriver().findElement(By.id("Pesquisar")).click();
		WebElement dc = getDriver().findElement(By.cssSelector("#linhaTabela_1 > .tooltip:nth-child(3) > .word-wrap"));
		String doc = dc.getText();
		String documento = doc;
		double numero = random.nextDouble();
		getDriver().findElement(By.cssSelector("#actionCampoGrid_1_8 .imgGrid")).click();
		getDriver().findElement(By.name("descricaoParecer")).sendKeys("automacao" + numero);
		getDriver().findElement(By.id("Confirmar")).click();
		getDriver().findElement(By.name("numeroDocumentoAlcada")).sendKeys(documento);
		getDriver().findElement(By.id("Pesquisar")).click();
		getDriver().findElement(By.cssSelector("#actionCampoGrid_1_8 .imgGrid")).click();
		WebElement pr = getDriver().findElement(By.cssSelector(".list_cor_hover .word-wrap"));
		String par = pr.getText();
		String parecer = par;
		WebElement pr2 = getDriver().findElement(By.cssSelector(".list_cor_hover .word-wrap"));
		String par2 = pr2.getText();
		Assert.assertEquals(parecer, par2);

	}

	/**
	 * Método para gerar relatórios dos testes realizados
	 * 
	 * @author Diogo Cardoso Santos - AR.Phoenix
	 */

	public void relatorio(String path, String tela, String teste, String print, String descricao) {

		ExtentReports Report = new ExtentReports(path);

		Report = new ExtentReports(path, false);
		ExtentTest test = new ExtentTest(tela, tela);
		test = Report.startTest(teste);
		String img = test.addScreenCapture(print);
		test.log(LogStatus.INFO, descricao);
		test.log(LogStatus.PASS, "Success" + img);
		Report.endTest(test);
		Report.flush();

	}

	public void relatorioErro(String path, String tela, String teste, String print, String descricao, String log) {

		ExtentReports Report = new ExtentReports(path);

		Report = new ExtentReports(path, false);
		ExtentTest test = new ExtentTest(tela, tela);
		test = Report.startTest(teste);
		String img = test.addScreenCapture(print);
		test.log(LogStatus.INFO, descricao);
		test.log(LogStatus.FAIL, "Fail" + img + log);
		Report.endTest(test);
		Report.flush();

	}

	public void relatorioSemPrint(String path, String tela, String teste, String descricao) {

		ExtentReports Report = new ExtentReports(path);

		Report = new ExtentReports(path, false);
		ExtentTest test = new ExtentTest(tela, tela);
		test = Report.startTest(teste);
		test.log(LogStatus.INFO, descricao);
		test.log(LogStatus.PASS, "Success");
		Report.endTest(test);
		Report.flush();

	}

	public void relatorioErroSemPrint(String path, String tela, String teste, String descricao, String log) {

		ExtentReports Report = new ExtentReports(path);

		Report = new ExtentReports(path, false);
		ExtentTest test = new ExtentTest(tela, tela);
		test = Report.startTest(teste);
		test.log(LogStatus.INFO, descricao);
		test.log(LogStatus.FAIL, "Fail" + log);
		Report.endTest(test);
		Report.flush();

	}
	

}
