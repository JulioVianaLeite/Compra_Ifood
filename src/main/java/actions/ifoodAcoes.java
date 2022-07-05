package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.ifoodPaginas;
import utils.DriverContext;

public class ifoodAcoes extends ifoodPaginas {
	protected WebDriverWait wait;
	
	public ifoodAcoes(){
		wait = new WebDriverWait(DriverContext.getDriver(), 60);
		}
	
	public void clicarEnderecoEntrega(String endereco) {
		wait.until(ExpectedConditions.visibilityOf(clicarEndereco)).sendKeys(endereco);
	}
	
	public void clicarBotaoEnter() {
		wait.until(ExpectedConditions.visibilityOf(clicarEnter)).sendKeys(Keys.RETURN);
	}
	
	public void clicarConfirmarlocalização() {
		wait.until(ExpectedConditions.visibilityOf(clicarCorfirmar)).click();
	}
	
	public void clicarComplemento(String complemento) {
		wait.until(ExpectedConditions.visibilityOf(clicarComplemento)).sendKeys(complemento);
	}
	
	public void clicarPontoDeReferencia(String referencia) {
		wait.until(ExpectedConditions.visibilityOf(clicarReferencia)).sendKeys(referencia);
	}
	
	public void clicarCasa() {
		wait.until(ExpectedConditions.visibilityOf(clicarCasa)).click();
	}
	
	public void clicarSalvaEndereco() {
		wait.until(ExpectedConditions.visibilityOf(clicarSalvar)).click();
	}
	
	public void clicarBuscarLoja(String busca) {
		wait.until(ExpectedConditions.visibilityOf(clicarBusca)).sendKeys(busca);
	}
	
	public void confirmaBuscarLoja() {
		wait.until(ExpectedConditions.visibilityOf(clicarBusca)).sendKeys(Keys.RETURN);
	}
	
	public void clicarMcJacuPessego() {
		wait.until(ExpectedConditions.visibilityOf(clicarMcJacu)).click();
	}
	
	public void clicarBuscaNoCardapio(String cardapio) {
		wait.until(ExpectedConditions.visibilityOf(clicarBuscaCardapio)).sendKeys(cardapio);
	}
	
	
	public void clicarNoLanche() {
		wait.until(ExpectedConditions.visibilityOf(clicarLanche)).click();
	}
	
	public void clicarAcompanhamento() {
		wait.until(ExpectedConditions.elementToBeClickable(clicarAcompanhamento)).click();
	}
	
	public void clicarMcShakeMorango() {
		wait.until(ExpectedConditions.visibilityOf(clicarBebida)).click();
	}
	
	public void clicarPicles() {
		wait.until(ExpectedConditions.visibilityOf(clicarPicles)).click();
	}
	
	public void clicarMolhoTasty() {
		wait.until(ExpectedConditions.visibilityOf(clicarMolhoTasty)).click();
	}
	
	public void clicarSemTomate() {
		wait.until(ExpectedConditions.visibilityOf(clicarSemTomate)).click();
	}
	
	public void clicarAdicionar() {
		wait.until(ExpectedConditions.visibilityOf(clicarAdicionar)).click();
	}
	
	public void clicarFormaDePagamento() {
		wait.until(ExpectedConditions.visibilityOf(clicarPagamento)).click();
	}
	
	
	
	
	
	
}
