package Proyecto.Prueba.PageObject;

import org.openqa.selenium.support.FindBy;

import Proyecto.Prueba.Utilidades.Utilidades;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp")
public class PruebaPageObject extends PageObject{
	
	Utilidades Util;
	/*
	 * Definicion de variables
	 * */
	String TXT_CONTRASENA="Loquequieraponer2020";
	@FindBy(id="firstName")
	public WebElementFacade TXT_NOMBRES;
	
	@FindBy(name="lastName")
	public WebElementFacade TXT_APELLIDOS;
	
	@FindBy(xpath="//*[@id=\"username\"]")
	public WebElementFacade TXT_USERNAME;
	
	@FindBy(name="Passwd")
	public WebElementFacade TXT_PASSWD;
	
	//@FindBy(xpath="//*[@id=\"accountDetailsNext\"]") se actualiza el identificador 
	@FindBy(name="ConfirmPasswd")
	public WebElementFacade TXT_PASSWDCONF;
	
	//@FindBy(xpath="//*[@id=\"accountDetailsNext\"]/span/span") se actualiza el identificador
	@FindBy(id ="accountDetailsNext")
	public WebElementFacade BTN_SIGUIENTE;
	
	@FindBy(id="headingText")
	public WebElementFacade LBL_CONFIRMACION;
	
	
	public void EscribirNombre() {
		TXT_NOMBRES.sendKeys("Nombre de Prueba");
		}

	public void EscribirApellidos() {
		TXT_APELLIDOS.sendKeys("Apellido Prueba");
	}


	public void EscribirUsername() {
		TXT_USERNAME.sendKeys("userprueba20202");
		
	}


	public void EscribirPasswd() {
		TXT_PASSWD.sendKeys(TXT_CONTRASENA);
		
	}


	public void EscribirRepasswd() {
		TXT_PASSWDCONF.sendKeys(TXT_CONTRASENA);
		
	}

	public void InteractuarSiguiente() {
		BTN_SIGUIENTE.click();
		
	}
// Se crea metodo de validacion
	public void BuscarLabel () {
		boolean resultado = LBL_CONFIRMACION.isVisible();
		assert(resultado);
	}
	
	public void EscribirNombre(String arg1) {
		TXT_NOMBRES.sendKeys(arg1);
		}
	
	public void EscribirApellidos(String arg1) {
		TXT_APELLIDOS.sendKeys(arg1);
	}
	
	public void EscribirUsername(String arg1) {
		String correo = arg1 + Util.correo_aleatorio();
		TXT_USERNAME.sendKeys(correo);
	}
	
	public void EscribirPasswd(String arg1) {
		TXT_PASSWD.sendKeys(arg1);
		
	}


	public void EscribirRepasswd(String arg1) {
		TXT_PASSWDCONF.sendKeys(arg1);
		
	}
}
