Feature: FEATURE DE CAPA WEB SESION 2


  @EscenarioLatam
  Scenario: Quiero consultar un vuelo en la pagina de LATAM
    Given que estoy en la pagina de LATAM
    When ingreso la ciudad de origen "LIMA"
    And ingreso la ciudad de destino "AREQUIPA"
    And selecciono la opcion ida
    And presiono boton Buscar Vuelo
    Then verifico que muestre resultados



  @EscenarioIBK
  Scenario: Quiero ingresar mis datos a la web de interbank
    Given que estoy en la web de ibk
    When selecciono opcion Abre tu cuenta
    And se muestra apertura de cuenta
    And ingreso el dni "70348428"
    And ingreso el correo "explorer@gmail.com"
    And seleccionamos el operador "ENTEL"
    And ingreso el celular "123456789"
    And presiono boton siguiente
    Then valido resultado exitoso


  @EscenarioIBK2
  Scenario: Quiero ingresar mis datos a la web de interbank
    Given que estoy en la web de ibk
    When selecciono opcion Abre tu cuenta
    And se muestra apertura de cuenta
    And ingreso el dni "02501010"
    And ingreso el correo "explorer.com"
    And seleccionamos el operador "CLARO"
    And ingreso el celular "000000000"
    And presiono boton siguiente
    Then valido mensaje validacion


  @Google
  Scenario: Quiero ingresar mis datos a la web de interbank
    Given que estoy en la web de ibk
    When ingreso texto "Lima"
    And presiono boton Buscar