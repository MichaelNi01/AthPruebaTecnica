@CrearCuentaCorreo
Feature: Realizar Creacion de Cuenta de Correo

  @Scenario:CrearCuenta
  Scenario: Crear Cuenta Con datos Validos
    Given Como un usuario que no tiene cuenta de Email
    When Quiero crear una Cuenta Con mis datos personales
    	And Un passwd correcto
    Then Validar que la cuenta se pueda Crear
    
  @CP0020:CrearCuentaCorreoAleatorio
  Scenario Outline: Crear cuenta con correo aleatorio
    Given Como un usuario que no tiene cuenta de Email
    When Quiero crear una Cuenta con mis datos desde feature <nombre> <apellido> <correo>
    When Ingresar passwwd desde feature <contraseña>
    Then Validar que la cuenta se pueda Crear
    
    Examples: 
    |nombre      | apellido | correo 				 | contraseña 	|
    |"juanc"		 |"niño"		|"athmailprueba" | "Juanc1234*"	|
    