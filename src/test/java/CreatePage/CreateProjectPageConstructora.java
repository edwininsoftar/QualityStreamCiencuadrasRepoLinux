package CreatePage;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class CreateProjectPageConstructora extends BasicWrap{
	//localizadores de logueo hasta llegar a crear un proyecto 
	By locator_enterButton = By.linkText("INGRESAR");
	By locator_user = By.cssSelector("input[formcontrolname=\"username\"]");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
	By locator_logIn = By.xpath("//*[@id=\"mat-dialog-0\"]/lib-cc-login/div/div/div[3]/form/button/span");
	By locator_menu = By.cssSelector("div[class=\"circle-name\"]");
	By locator_projectsPublished = By.linkText("Proyectos publicados");
	By locator_createProject = By.linkText("CREAR PROYECTO");
	//localizadores para crear el proyecto
	By locator_nameProject = By.id("nombreProyecto");
	By locator_stage = By.xpath("//*[@id=\"select_etapa_cabecera\"]");
	By locator_select = By.xpath("//*[@id=\"select_etapa_cabecera\"]/option[1]");
	By locator_onFlat = By.xpath("//*[@id=\"select_etapa_cabecera\"]/option[2]");
	By locator_Construction = By.xpath("//*[@id=\"select_etapa_cabecera\"]/option[3]");
	By locator_immediateDelivery = By.xpath("//*[@id=\"select_etapa_cabecera\"]/option[4]");
	
	String user = "qa.constructorahogar21@yopmail.com";//usuario constructora
	String password = "LeonO1O1*"; // contraseña
	String nameProject = "Oasis"; // nombre del proyecto
	String stage = "Sobre plano"; //etapa del proyecto puede ser "seleccione, Sobre plano, Construcion, Entrega inmediata"

	public CreateProjectPageConstructora(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void logIn() {
		try{
			Thread.sleep(8000);
			click(locator_enterButton);
			Thread.sleep(8000);
			type(user, locator_user);
			type(password, locator_password);
			click(locator_logIn);
			Thread.sleep(6000);
			click(locator_menu);
			click(locator_projectsPublished);
			click(locator_createProject);
			
		}
		catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error: " + e);
		} catch (Exception e) {
			System.out.println("Error:" +e);
		} 
	}

}
