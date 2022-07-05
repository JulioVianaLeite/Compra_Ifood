package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.DriverContext;

//Classe onde estar�o os mapeamentos da p�gina

public class ifoodPaginas{
	
	
	//Construtor
	public ifoodPaginas(){
		PageFactory.initElements(DriverContext.getDriver(), this);
	}
	
	
	@FindBy(how=How.XPATH, using="//body/div[@id='__next']/section[2]/div[1]/form[1]/div[1]/input[1]")
	protected WebElement clicarEndereco;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='__next']/section[2]/div[1]/form[1]/div[1]/input[1]")
	protected WebElement clicarEnter;
	
	@FindBy(how=How.XPATH, using="//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")
	protected WebElement clicarCorfirmar;
	
	@FindBy(how=How.XPATH, using="//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/label[1]/input[1]")
	protected WebElement clicarComplemento;
	
	@FindBy(how=How.XPATH, using="//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/label[1]/input[1]")
	protected WebElement clicarReferencia;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Casa')]")
	protected WebElement clicarCasa;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Salvar endereço')]")
	protected WebElement clicarSalvar;
	
	@FindBy(how=How.XPATH, using="//header/div[2]/form[1]/div[1]/input[1]")
	protected WebElement clicarBusca;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='__next']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/section[1]/article[1]/section[1]/div[1]/div[1]/div[1]/a[1]/div[1]")
	protected WebElement clicarMcJacu;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='__next']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")
	protected WebElement clicarBuscaCardapio;
	
	@FindBy(how=How.XPATH, using="//body/div[@id='__next']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[2]/div[1]/a[1]/div[1]/div[1]")
	protected WebElement clicarLanche;
	
	@FindBy(how=How.XPATH, using="//body/div[9]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/section[1]/form[1]/section[2]/label[5]/span[1]/p[1]")
	protected WebElement clicarAcompanhamento;
		
	@FindBy(how=How.XPATH, using="//body/div[9]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/section[1]/form[1]/section[3]/label[6]/span[1]/p[1]")
	protected WebElement clicarBebida;
	
	@FindBy(how=How.XPATH, using="//body/div[9]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/section[1]/form[1]/section[4]/label[1]/span[1]/div[1]/button[2]/span[1]/*[1]")
	protected WebElement clicarPicles;
	
	@FindBy(how=How.XPATH, using="//body/div[9]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/section[1]/form[1]/section[4]/label[6]/span[1]/div[1]/button[2]/span[1]/*[1]")
	protected WebElement clicarMolhoTasty;
	
	@FindBy(how=How.XPATH, using="//body/div[9]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/section[1]/form[1]/section[5]/label[3]/span[1]/div[1]/button[2]/span[1]/*[1]")
	protected WebElement clicarSemTomate;
	
	@FindBy(how=How.XPATH, using="//body/div[9]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/button[1]/div[1]")
	protected WebElement clicarAdicionar;
	
	@FindBy(how=How.XPATH, using="//span[contains(text(),'Escolher forma de pagamento')]")
	protected WebElement clicarPagamento;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
