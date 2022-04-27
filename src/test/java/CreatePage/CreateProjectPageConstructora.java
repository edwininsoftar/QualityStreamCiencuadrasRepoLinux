package CreatePage;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	By locator_stage = By.id("select_etapa_cabecera");
	By locator_projectPhase = By.id("fase_proyecto");
	By locator_stratum = By.id("input_estrato");
	By locator_department = By.id("select_departamento_publicador");
	By locator_city = By.id("select_ciudad_publicador");
	By locator_location = By.id("select_localidad_publicador");
	By locator_neighborhood = By.id("select_barrio_publicador");
	By locator_direction = By.id("select_mostrar_direccion_publicador");
	By locator_date = By.id("input_fecha_entrega");
	By locator_condition = By.id("select_estado");
	By locator_pay = By.id("select_membresia");
	
	//Login
	String username = "ciencuadrasconstructora12@yopmail.com";//usuario constructora
	String password = "LeonO1O1*"; // contraseña
	//Crear nuevo proyecto
	String nameProject = "Oasis"; // nombre del proyecto
	String stage = "Sobre Plano"; //etapa del proyecto puede ser "seleccione, Sobre Plano, Construcion, Entrega Inmediata"
	String projectPhase = "";//Ingrese Venta, PreVenta, Oferta Terminada, Lanzamiento
	String straum = "3";//Ingrese 1,2,3,4,5 o 6 
	String department = "Cundinamarca";// Ingrese el departamento
	String city = "Bogotá";//ingrese la ciudad
	String location = "Ciudad Bolivar";// Ingrese la localidad
	String neighborhood = "Madelena";//Ingrese el barrio 
	String direction = "Si";//Ingrese Si y No
	String date = "06062022";// Ingrese la fecha 
	String condition = "Activo";//Ingresar Activo, Inactivo, Duplicado 
	String pay = "Pago";//Ingrese Pago, Gratis
	
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
	
	public void publicProject() {
		try {
			type(nameProject, locator_nameProject);
			Thread.sleep(3000);
			WebElement eta = driver.findElement(locator_stage);
			Select sel = new Select(eta);
			sel.selectByVisibleText(stage);
		} catch (NoSuchElementException e) {
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
