
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import actions.ifoodAcoes;
import utils.Constantes;
import utils.DriverContext;

class TexteIfoodAutomacao {

	WebDriver driver;
	ifoodAcoes accont;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", Constantes.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.get("https://www.ifood.com.br/");
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
		accont = new ifoodAcoes();
	}

	@Test
	void test() throws InterruptedException {
		accont.clicarEnderecoEntrega("Rua Andorinha da Mata 239");
		Thread.sleep(2000);
		accont.clicarBotaoEnter();
		Thread.sleep(2000);
		accont.clicarConfirmarlocalização();
		Thread.sleep(2000);
		accont.clicarComplemento("Apto 52A");
		Thread.sleep(2000);
		accont.clicarPontoDeReferencia("De frente ao bar dos Zalemão");
		Thread.sleep(2000);
		accont.clicarCasa();
		Thread.sleep(1000);
		accont.clicarSalvaEndereco();
		Thread.sleep(1000);
		accont.clicarBuscarLoja("McDonalds");
		Thread.sleep(1000);
		accont.confirmaBuscarLoja();
		Thread.sleep(1000);
		accont.clicarMcJacuPessego();
		Thread.sleep(5000);
		accont.clicarBuscaNoCardapio("MCOFERTA MÉDIA BIG TASTY");
		Thread.sleep(4000);
		accont.clicarNoLanche();
		Thread.sleep(2000);
		accont.clicarAcompanhamento();
		Thread.sleep(2000);
		accont.clicarMcShakeMorango();
		Thread.sleep(2000);
		accont.clicarPicles();
		Thread.sleep(2000);
		accont.clicarMolhoTasty();
		Thread.sleep(2000);
		accont.clicarSemTomate();
		Thread.sleep(2000);
		accont.clicarAdicionar();
		Thread.sleep(2000);
		accont.clicarFormaDePagamento();
		
		
		
		

	}

	@AfterEach
	void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}

}
