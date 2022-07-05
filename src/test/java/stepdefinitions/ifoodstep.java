package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverPrincipal;
import actions.ifoodAcoes;

public class ifoodstep {
	
	DriverPrincipal principal = new DriverPrincipal();
	WebDriver driver = principal.AbrirUrl();
	ifoodAcoes action = PageFactory.initElements(driver, ifoodAcoes.class);
	
	public ifoodstep() throws Exception {

	}
	

	@Given("que usuario acesse o site {string}")
	public void que_usuario_acesse_o_site(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@And("clica endereco e preenche os dados no campo {string} e confirma a localizacao")
	public void clica_endereco_e_preenche_os_dados_no_campo_e_confirma_a_localizacao(String string) throws InterruptedException {
		action.clicarEnderecoEntrega(string);
		Thread.sleep(2000);
		action.clicarBotaoEnter();
		Thread.sleep(2000);
		action.clicarConfirmarlocalização();
	}

	@And("preenche os campos complemento {string}, ponto de referencia {string} seleciono a opcao casa")
	public void preenche_os_campos_complemento_ponto_de_referencia_seleciono_a_opcao_casa(String string, String string2) throws InterruptedException {
		action.clicarComplemento(string);
		Thread.sleep(2000);
		action.clicarPontoDeReferencia(string2);
		Thread.sleep(2000);
		action.clicarCasa();
	}

	@And("salvo o edereco")
	public void salvo_o_edereco() {
		action.clicarSalvaEndereco();
	}

	@When("sou direcionado na pagina principal do Ifood")
	public void sou_direcionado_na_pagina_principal_do_ifood() {
		
	}

	@And("preencho o campo de busca de restaurante {string}, clico no restaurante desejado")
	public void preencho_o_campo_de_busca_de_restaurante_clico_no_restaurante_desejado(String string) {
		action.clicarBuscarLoja(string);
		action.confirmaBuscarLoja();
		action.clicarMcJacuPessego();
	}

	@Then("abre todo o cardapio do restaurante onde posso buscar por nome no cardapio {string}")
	public void abre_todo_o_cardapio_do_restaurante_onde_posso_buscar_por_nome_no_cardapio(String string) throws InterruptedException {
		action.clicarBuscaNoCardapio(string);
		Thread.sleep(2000);
		action.clicarNoLanche();
	}

	@And("adiciono meu acompanhamento, bebida, ingredientes e a opcao de remover algo")
	public void adiciono_meu_acompanhamento_bebida_ingredientes_e_a_opcao_de_remover_algo() throws InterruptedException {
		action.clicarAcompanhamento();
		Thread.sleep(2000);
		action.clicarMcShakeMorango();
		Thread.sleep(2000);
		action.clicarPicles();
		Thread.sleep(2000);
		action.clicarMolhoTasty();
		Thread.sleep(2000);
		action.clicarSemTomate();
	}

	@And("continuar os passos para o pagamento")
	public void continuar_os_passos_para_o_pagamento() throws InterruptedException {
		action.clicarAdicionar();
		Thread.sleep(2000);
		action.clicarFormaDePagamento();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
