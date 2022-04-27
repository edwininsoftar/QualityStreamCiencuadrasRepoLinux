package CreatePage;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;

import Base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class CreateProjectPageConstructora extends BasicWrap{
	//localizadores de logueo hasta llegar a crear un proyecto 
	By locator_into = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	By locator_username = By.xpath("//*[@id=\"mat-input-3\"]");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
	By locator_login = By.cssSelector("span[class=\"ng-star-inserted\"]");
	By locator_menu = By.cssSelector("div[class=\"circle-name\"]");
	By locator_publishedProperty = By.linkText("Proyectos publicados");
	By locator_createProject = By.linkText("CREAR PROYECTO");
	//localizadores para crear el proyecto
	By locator_nameProject = By.id("nombreProyecto");
	By locator_stage = By.xpath("//*[@id=\"select_etapa_cabecera\"]");
	By locator_select = By.xpath("//*[@id=\"select_etapa_cabecera\"]/option[1]");
	By locator_onFlat = By.xpath("//*[@id=\"select_etapa_cabecera\"]/option[2]");
	By locator_Construction = By.xpath("//*[@id=\"select_etapa_cabecera\"]/option[3]");
	By locator_immediateDelivery = By.xpath("//*[@id=\"select_etapa_cabecera\"]/option[4]");
	
	String username = "ciencuadrasconstructora12@yopmail.com";//usuario constructora
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
			click(locator_into);
			type(username, locator_username);
			type(password, locator_password);
			click(locator_login);
			Thread.sleep(8000);
			click(locator_menu);
			click(locator_publishedProperty);
			click(locator_createProject);
		}catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		}catch (TimeoutException e) {
			System.out.println("Error: " + e);
		}catch (ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error:" +e);
		} 
	}

}
