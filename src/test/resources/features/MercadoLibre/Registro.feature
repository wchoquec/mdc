Feature: Registro en la web de Mercado Libre

  @regression
  Scenario: Cliente nueva en Mercado Libre
    Given que Cesar acceda a la web de Mercadolibre
    When selecciona crear cuenta
    And escribe nombre de usuario "Cesar"
    And escribe apellido de usuario "Gutierrez"
    And escribe email de usuario "cgutierrez@yopmail.com"
    Then escribe clave de usuario "123456"