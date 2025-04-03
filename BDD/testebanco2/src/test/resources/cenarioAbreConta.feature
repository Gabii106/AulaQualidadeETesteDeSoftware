#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps

Feature: Testar o processo de abertura de conta bancária

  Scenario: Testar quantidade de digitos para abrir uma conta
    Given Eu desejo abrir uma nova conta
    #When O número da conta é '12345678'
    When O número da conta é '<nconta>'
    #Then O resultado esperado deve ser 'true'
    Then O resultado esperado deve ser '<resultado>'

    Examples: 
      | nconta     | resultado |
      | 1234abcd   |   false   | # Testa 8 digitos com string
      | 12ab       |   false   | # Testa menos de 8 digitos com string
      | 12121212   |   true    | # Testa 8 digitos inteiros
      | 12ab12ab12 |   false   | # Testa mais de 8 digitos