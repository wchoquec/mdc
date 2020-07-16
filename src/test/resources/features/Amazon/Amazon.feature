Feature: Busqueda en Amazon

  @Escenario1
  Scenario Outline: Usuario ingresa a la web de amazon
    Given se encuentra en la pagina de amazon
    When doy click en el campo de busqueda
    And escribo el dato "<datos>"
    And presiono boton de busqueda
    Then verifico resultado
    And selecciono una marca "<marca>"
    And selecciono primer elemento
    Then verifico nombre
    Examples:
      | datos | marca |
      | monitor  | HP |