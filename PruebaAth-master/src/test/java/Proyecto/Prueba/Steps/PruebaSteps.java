package Proyecto.Prueba.Steps;

import Proyecto.Prueba.PageObject.PruebaPageObject;
import net.thucydides.core.annotations.Step;

public class PruebaSteps {
	PruebaPageObject PruebaPageObject;
	
	@Step
	public void IngresarCrearCuenta() {
		PruebaPageObject.open();
		
	}
	@Step
	public void DatosPersonales() {
		PruebaPageObject.EscribirNombre();
		PruebaPageObject.EscribirApellidos();
		PruebaPageObject.EscribirUsername();
		
		
		
	}
	@Step
	public void Contrasena() {
		PruebaPageObject.EscribirPasswd();
		PruebaPageObject.EscribirRepasswd();
		PruebaPageObject.InteractuarSiguiente();		
	}
	@Step
	public void ValidacionCrearCuenta() {
		PruebaPageObject.BuscarLabel();
		
	}
	
	@Step
	public void DatosPersonales(String arg1, String arg2, String arg3) {
		PruebaPageObject.EscribirNombre(arg1);
		PruebaPageObject.EscribirApellidos(arg2);
		PruebaPageObject.EscribirUsername(arg3);
	}
	
	@Step
	public void Contrasena(String arg1) {
		PruebaPageObject.EscribirPasswd(arg1);
		PruebaPageObject.EscribirRepasswd(arg1);
		PruebaPageObject.InteractuarSiguiente();
	}

}
