#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps

Feature: Testar o processo de solicitação de um empréstimo

  Scenario: Testar se um empréstimo é aprovado ou reprovado
    Given Eu realizo a solicitação de empréstimo
    When E informo o valor da minha renda mensal '10000'
    And E informo o valor do empréstimo '10000'
    Then O empréstimo é aprovado

#    Examples: 
#      | nconta     | resultado |
#      | 1234abcd   |   false   | # Testa 8 digitos com string
#      | 12ab       |   false   | # Testa menos de 8 digitos com string
#      | 12121212   |   true    | # Testa 8 digitos inteiros
#      | 12ab12ab12 |   false   | # Testa mais de 8 digitos