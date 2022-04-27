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
	By locator_directionComplit = By.id("publicador_direccion");
	//Caracteristicas de los tipos de inmuebles
	By locator_typeProperty = By.id("select_tipo_proyecto");
	By locator_nameTypeProperty = By.id("inmueble-nombre_proyecto_1");
	By locator_sale = By.id("inmueble-precio_desde_1");
	By locator_numberRoom = By.id("select_num_habitaciones_1");
	By locator_numberBath = By.id("select_num_banos_1");
	By locator_numberParking = By.id("select_num_parqueaderos_1");
	By locator_swimming = By.id("select_num_piscinas_privadas_1");
	By locator_floor = By.id("inmueble_tipo_piso_1");
	By locator_saleManagement = By.id("inmueble-valor_administracion_1");
	By locator_tvCircuit = By.id("inmueble_cir_cerr_tv_1");
	By locator_serviceRoom = By.id("habitacion_servicio_1");
	By locator_serviceBath = By.id("banio_servicio_1");
	By locator_laundryArea = By.id("zona_lavanderia_1");
	By locator_fireplace = By.id("select_con_chimenea_1");
	By locator_allowsPets = By.id("select_permite_mascotas_1");
	By locator_typeStove = By.id("inmueble_tipo_estufa_1");
	By locator_typeHeater = By.id("inmueble_tipo_calentador_1");
	By locator_airConditioning = By.id("select_num_aires_acondicionados_1");
	By locator_terraceArea = By.id("select_zona_terraza_1");
	By locator_numberTerrace = By.id("select_numero_terraza_1");
	By locator_builtArea = By.id("inmueble_area_privada_1");
	By locator_totalArea = By.id("inmueble_area_construida_1");
	By locator_numberBalcony = By.id("select_numero_balcones_1");
	By locator_numberDeposits = By.id("select_numero_depositos_1");
	By locator_deliverDate = By.id("inmueble_fecha_entrega_1");
	By locator_soldOut = By.id("select_vendido_si_no_1");
	By locator_typeParking = By.id("select_tipo_parqueadero_1");
	By locator_unitsAvailable = By.id("select_unidades_disponibles_1");
	By locator_homeAppliances = By.xpath("//*[@id=\"btn-group-#select_mas_electrodomesticos_1\"]/button");
	By locator_kiln = By.xpath("//*[@id=\"btn-group-#select_mas_electrodomesticos_1\"]/div/ul/li[1]");
	By locator_extractor = By.xpath("//*[@id=\"btn-group-#select_mas_electrodomesticos_1\"]/div/ul/li[2]");
	By locator_dishwasher = By.xpath("//*[@id=\"btn-group-#select_mas_electrodomesticos_1\"]/div/ul/li[3]");
	
	//Login
	String username = "qa.constructorahogar21@yopmail.com";//usuario constructora qa.constructorahogar21@yopmail.com //ciencuadrasconstructora12@yopmail.com
	String password = "LeonO1O1*"; // contraseña
	//Crear nuevo proyecto
	String nameProject = "Oasis"; // nombre del proyecto
	String stage = "Sobre Plano"; //etapa del proyecto puede ser "seleccione, Sobre Plano, Construcion, Entrega Inmediata"
	String projectPhase = "Venta";//Ingrese Venta, PreVenta, Oferta Terminada, Lanzamiento
	String straum = "3";//Ingrese 1,2,3,4,5 o 6 
	String department = "Cundinamarca";// Ingrese el departamento
	String city = "Bogotá";//ingrese la ciudad
	String location = "Ciudad Bolívar";// Ingrese el volor de la localidad que decea segun las opciones html
	String neighborhood = "Madelena";//Ingrese el barrio 
	String direction = "Si";//Ingrese Si y No
	String date = "06062022";// Ingrese la fecha 
	String condition = "Activo";//Ingresar Activo, Inactivo, Duplicado 
	String pay = "Gratis";//Ingrese Pago, Gratis
	String directionComplit = "Calle 60 sur#66-63";
	//Caracteristicas de los tipos de inmuebles
	String typeProperty = "Apartamento";//Ingrese el tipo de inmueble
	String nameTypeProperty = "Duplex";//ingrese el nombre del tipo de apartamento
	String sale = "130000000";// Ingrese el precio 
	String numberRoom = "3";// Ingrese el numero de habitaciones
	String numberBath = "2";//Ingrese el numero de baños
	String numberParking = "1";//Ingrese el numero de parqueaderos
	String swimning = "No";//Ingrese Si o No si cuenta con piscina
	String floor = "Baldosa";//Ingrese el tipo de piso
	String saleManagement = "100000";//Ingrese el precio de la administración 
	String tvCircuit = "No";//ingrese Si o No si cuenta con circuito cerrado de tv
	String ServiceRoom = "No";//Ingrese Si o No si cuenta con habitación de servicio
	String serviceBath = "No";//Ingrese Si o No si cuenta con baño de servicio
	String laundryArea = "No";//Ingrese Si o No si cuenta con zona de labanderia 
	String fireplace = "No";// Ingrese Si o No si cuenta con chimenea
	String allowsPets = "Si";// Ingrese Si o No si permite mascotas
	String typeStove = "Gas";// Ingrese el tipo de estufa 
	String typeHeater = "Gas";//Ingrese el tipo de calentador 
	String airConditioning = "No";//Ingrese Si o No si cuenta con aire acondicionado
	String terraceArea = "No";//Ingrese el Si o No si cuenta con terraza
	String numberTerrace = "";//Ingrese el numero de terrazas en caso de que tenga
	String builtArea = "60";//Ingrese el area del inmueble
	String totalArea = "70";//Ingrese el area total del inmueble
	String numberBalcony = "0";//Ingrese el numero de valcones
	String numberDeposits = "0";//ingrese el numero de depositos 
	String deliverDate = "13122023";//Ingrese la fecha de entrega
	String soldOut = "";// Ingrese Si o No si se encuentra vendido
	String typeParking = "Comunal";// Ingrese el tipo de parqueadero
	String unitsAvailable = "10";//Ingrese las unidades disponibles
	String kiln = "No";//Ingrese Si o No si cuenta con horno
	String extractor = "No";//Ingrese Si o No sicuenta con extractor
	String dishwasher = "No";//Ingrese Si o No si cuenta con lavaplatos
	
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
			Thread.sleep(3000);
			WebElement fas = driver.findElement(locator_projectPhase);
			Select sel2 = new Select(fas);
			sel2.selectByVisibleText(projectPhase);
			Thread.sleep(3000);
			WebElement est = driver.findElement(locator_stratum);
			Select sel3 = new Select(est);
			sel3.selectByVisibleText(straum);
			Thread.sleep(3000);
			WebElement dep = driver.findElement(locator_department);
			Select sel4 = new Select(dep);
			sel4.selectByVisibleText(department);
			Thread.sleep(3000);
			WebElement ciu = driver.findElement(locator_city);
			Select sel5 = new Select(ciu);
			sel5.selectByVisibleText(city);
			Thread.sleep(3000);
			WebElement loc = driver.findElement(locator_location);
			Select sel6 = new Select(loc);
			sel6.selectByVisibleText(location);
			Thread.sleep(3000);
			WebElement bar = driver.findElement(locator_neighborhood);
			Select sel7 = new Select(bar);
			sel7.selectByVisibleText(neighborhood);
			Thread.sleep(3000);
			WebElement dir = driver.findElement(locator_direction);
			Select sel8 = new Select(dir);
			sel8.selectByVisibleText(direction);
			Thread.sleep(3000);
			type(date, locator_date);
			Thread.sleep(3000);
			WebElement con = driver.findElement(locator_condition);
			Select sel9 = new Select(con);
			sel9.selectByVisibleText(condition);
			Thread.sleep(3000);
			WebElement mem = driver.findElement(locator_pay);
			Select sel10 = new Select(mem);
			sel10.selectByVisibleText(pay);
			type(directionComplit, locator_directionComplit);
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
	
	public void characteristicsProperty() {
		try {
			
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
