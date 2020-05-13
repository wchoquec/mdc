@Netflix
Feature: Apis de Netflix para consumo masivo

  @regression
  Scenario: Operador lista clientes de Netflix
    Given que la aplicación esta operativa
    When obtiene la lista: 2 de clientes suscritos
    Then valida que la respuesta es 200

  @Manual:Passed
  Scenario: Operador lista informacion de un cliente
    Given que la aplicación esta operativa
    When obtiene al cliente: 3 suscrito
    Then valida que la respuesta es 200

  Scenario: Operador no encuentra cliente en la lista
    Given que la aplicación esta operativa
    When obtiene al cliente: 23 suscrito
    Then valida que la respuesta es 404


