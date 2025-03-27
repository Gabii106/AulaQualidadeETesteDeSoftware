#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps

Feature: Teste de criação de conta bancária

  Scenario: Testar a quantidade de digitos para abrir uma conta
    Given Eu desejo criar um novo objeto conta
    When É passado o número da conta 123456789 como argumento
    Then Se a quantidade de digitos para a abertura da conta for <status> é retorna verdadeiro

Examples:    
			| numeroConta  | status  |
			| 123456789    | true    |
			| 12345        | false   |
			| 987654321    | true    |
			| 12           | false   |
			
