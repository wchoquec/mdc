@Linio
Feature: Pagina Linio

  @Linio1
  Scenario: Validar la busqueda de un producto en Linio
    Given abro la pagina de Linio
    When ingreso el producto "laptop" a buscar
    And presiono boton buscar
    Then valido que exista resultados


    @Linio2
    Scenario: Agregar un producto al carrito
      Given abro la pagina de Linio
      And ingreso el producto "playstation" a buscar
      And presiono boton buscar
      When selecciono el primer producto
      And selecciono el boton añadir al carrito
      Then valido que se agregue