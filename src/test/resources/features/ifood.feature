
@ifood
Feature: Cadastro em E-commerce
  
	Background: Abrir o site
		Given que usuario acesse o site "https://www.ifood.com.br"

	@ifood_Mc
  Scenario Outline: Acessar o site
	And clica endereco e preenche os dados no campo "<endereco>" e confirma a localizacao
	And preenche os campos complemento "<complemento>", ponto de referencia "<referencia>" seleciono a opcao casa
	And salvo o edereco
	When sou direcionado na pagina principal do Ifood
	And preencho o campo de busca de restaurante "<mc>", clico no restaurante desejado
	Then abre todo o cardapio do restaurante onde posso buscar por nome no cardapio "<cardapio>" 
	And adiciono meu acompanhamento, bebida, ingredientes e a opcao de remover algo
	And continuar os passos para o pagamento
		
    Examples:  
	  	| endereco                   | complemento | referencia                   | mc        | cardapio                 |
	  	| Rua Andorinha da Mata 239  | Apto 52A    | De frente ao bar dos Zalemão | McDonalds | MCOFERTA MÉDIA BIG TASTY |
	  
