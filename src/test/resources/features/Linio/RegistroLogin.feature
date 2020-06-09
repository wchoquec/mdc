Feature: Registro en la web de Linio

  @regression
  Scenario: Cliente nuevo en Linio
    Given que Jesus acceda a la web de Mercadolibre
    When ingresa sus datos de registro
    Then valida sus datos

