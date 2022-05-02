package CreatePage;

import java.io.File;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
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
	By locator_price = By.id("inmueble-precio_desde_1");
	By locator_numberRoom = By.id("select_num_habitaciones_1");
	By locator_numberBath = By.id("select_num_banos_1");
	By locator_numberParking = By.id("select_num_parqueaderos_1");
	By locator_swimming = By.id("select_num_piscinas_privadas_1");
	By locator_floor = By.id("inmueble_tipo_piso_1");
	By locator_valueManagement = By.id("inmueble-valor_administracion_1");
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
	By locator_homeAppliances = By.xpath("/html/body/div[3]/div/form/div/div[1]/div[1]/div[1]/div[10]/div/div[33]/div/div/div/button");
	By locator_kiln = By.xpath("/html/body/div[3]/div/form/div/div[1]/div[1]/div[1]/div[10]/div/div[33]/div/div/div/div/ul/li[1]");
	By locator_extractor = By.xpath("/html/body/div[3]/div/form/div/div[1]/div[1]/div[1]/div[10]/div/div[33]/div/div/div/div/ul/li[2]");
	By locator_dishwasher = By.xpath("/html/body/div[3]/div/form/div/div[1]/div[1]/div[1]/div[10]/div/div[33]/div/div/div/div/ul/li[3]");
	// localizadores sala de ventas
	By locator_nameRoom = By.id("nombre_sala_1");
	By locator_roomAddress = By.id("sala_direccion_1");
	By locator_callContactNumber = By.id("sala_ventas_telefono_fijo_1");
	By locator_emailRoom = By.id("email_sala_1");
	By locator_whatsappContactNumber = By.id("sala_ventas_num_celular_1");
	By locator_seller = By.id("sala_ventas_vendedor_nombre_1");
	//localizadores etapa
	By locator_stage1 = By.id("etapa_nombre_1");
	By locator_openingDate = By.id("inicio_etapa_1");
	By locator_closingDate = By.id("finalizacion_etapa_1");
	//localizadores informacion adicional
	By locator_additionalInformation = By.id("proyecto-info_adicional");
	By locator_buttonSave = By.id("btn_guardar_publicador");
	//Imagenes del inmueble
	By locator_imgProyect = By.id("file_cabecera");
	By locator_uploadFileProject = By.xpath("//*[@id=\"container_images_cabecera\"]/div[4]/div[4]/div[2]/a");
	By locator_imgProperty = By.id("file_inmueblestipo_1");
	By locator_uploadFileProperty = By.xpath("//*[@id=\"container_images_tipoinmueble_1\"]/div/div[4]/div[2]/a");
	By locator_imgLogoProperty = By.id("file_logo_proyecto1");
	By locator_uploadFileLogoProperty = By.xpath("//*[@id=\"container_logo_proyecto1\"]/div/div[4]/div[2]/a");
	By locator_coverPhoto = By.name("fotoPortada_project");
	By locator_save = By.id("btn_editar_publicador");
	// Verificación
	By locator_nameProjet = By.linkText("OASIS - TABIO");
	By locator_area = By.xpath("/html/body/app-root/app-estate-detail/div/div[1]/div[2]/div[2]/div[1]/app-detail-type-of/div/div/mat-accordion/div/mat-expansion-panel/div/div/ul/li[2]");
	By locator_room = By.xpath("/html/body/app-root/app-estate-detail/div/div[1]/div[2]/div[2]/div[1]/app-detail-type-of/div/div/mat-accordion/div/mat-expansion-panel/div/div/ul/li[4]");
	By locator_bath = By.xpath("/html/body/app-root/app-estate-detail/div/div[1]/div[2]/div[2]/div[1]/app-detail-type-of/div/div/mat-accordion/div/mat-expansion-panel/div/div/ul/li[5]");
	
	//Login
	String username = "qa.constructorahogar21@yopmail.com";//usuario constructora qa.constructorahogar21@yopmail.com //ciencuadrasconstructora12@yopmail.com
	String password = "LeonO1O1*"; // contraseña
	//Crear nuevo proyecto
	String nameProject = "Oasis"; // nombre del proyecto
	String stage = "Sobre Plano"; //etapa del proyecto puede ser "seleccione, Sobre Plano, Construcion, Entrega Inmediata"
	String projectPhase = "Venta";//Ingrese Venta, PreVenta, Oferta Terminada, Lanzamiento
	String straum = "3";//Ingrese 1,2,3,4,5 o 6 
	String department = "Cundinamarca";// Ingrese el departamento
	String city = "Tabio";//ingrese la ciudad
	String location = "Tabio";// Ingrese el volor de la localidad que decea segun las opciones html
	String neighborhood = "El Alcaparro";//Ingrese el barrio 
	String direction = "Si";//Ingrese Si y No
	String date = "02052022";// Ingrese la fecha 
	String condition = "Activo";//Ingresar Activo, Inactivo, Duplicado 
	String pay = "Gratis";//Ingrese Pago, Gratis
	String directionComplit = "Calle 12 # 10-5";
	//Caracteristicas de los tipos de inmuebles
	String typeProperty = "Apartamento";//Ingrese el tipo de inmueble
	String nameTypeProperty = "Duplex";//ingrese el nombre del tipo de apartamento
	String price = "130000000";// Ingrese el precio 
	String numberRoom = "3";// Ingrese el numero de habitaciones
	String numberBath = "2";//Ingrese el numero de baÃ±os
	String numberParking = "1";//Ingrese el numero de parqueaderos
	String swimning = "No";//Ingrese Si o No si cuenta con piscina
	String floor = "Baldosa";//Ingrese el tipo de piso
	String valueManagement = "100000";//Ingrese el precio de la administración 
	String tvCircuit = "No";//ingrese Si o No si cuenta con circuito cerrado de tv
	String ServiceRoom = "No";//Ingrese Si o No si cuenta con habitación de servicio
	String serviceBath = "No";//Ingrese Si o No si cuenta con baño de servicio
	String laundryArea = "No";//Ingrese Si o No si cuenta con zona de lavanderia 
	String fireplace = "No";// Ingrese Si o No si cuenta con chimenea
	String allowsPets = "Si";// Ingrese Si o No si permite mascotas
	String typeStove = "Gas";// Ingrese el tipo de estufa 
	String typeHeater = "Gas";//Ingrese el tipo de calentador 
	String airConditioning = "No";//Ingrese Si o No si cuenta con aire acondicionado
	String terraceArea = "No";//Ingrese el Si o No si cuenta con terraza
	String numberTerrace = "0";//Ingrese el numero de terrazas en caso de que tenga
	String builtArea = "60";//Ingrese el area del inmueble
	String totalArea = "70";//Ingrese el area total del inmueble
	String numberBalcony = "0";//Ingrese el numero de valcones
	String numberDeposits = "0";//ingrese el numero de depositos 
	String deliverDate = "13122023";//Ingrese la fecha de entrega
	String soldOut = "No";// Ingrese Si o No si se encuentra vendido
	String typeParking = "Comunal";// Ingrese el tipo de parqueadero
	String unitsAvailable = "10";//Ingrese las unidades disponibles
	String kiln = "Si";//Ingrese Si o No si cuenta con horno
	String extractor = "No";//Ingrese Si o No sicuenta con extractor
	String dishwasher = "Si";//Ingrese Si o No si cuenta con lavaplatos
	// datos de sala de ventas
	String nameRoom = "sala 1";//nombre de la sala
	String roomAddress = "calle 12 # 5-05"; //direccion de la sala
	String callContactNumber = "6013457689";//NÃºmero para contacto por llamada
	String emailRoom = "sala1@gmail.com";//Email sala
	String whatsappContactNumber = "3124567890";//Numero para contacto por whatsapp
	String seller = "luis carlos"; //Vendedor
	//datos de etapa
	String stage1 = "En construccion";//Nombre etapa
	String openingDate = "12062022";//Fecha apertura
	String closingDate = "07122022";//Fecha cierre
	//datos informacion adicional
	String additionalInformation = "Buena ubicación";//Informacion adicional
			
	
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
			Thread.sleep(5000);
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
			Thread.sleep(3000);
			WebElement tipInm = driver.findElement(locator_typeProperty);
			Select sel11 = new Select(tipInm);
			sel11.selectByVisibleText(typeProperty);
			Thread.sleep(3000);
			type(nameTypeProperty, locator_nameTypeProperty);
			type(price, locator_price);
		    Thread.sleep(3000);
		    WebElement numHab = driver.findElement(locator_numberRoom);
		    Select sel12 = new Select(numHab);
		    sel12.selectByVisibleText(numberRoom);
		    Thread.sleep(3000);
		    WebElement numBath = driver.findElement(locator_numberBath);
		    Select sel13 = new Select(numBath);
		    sel13.selectByVisibleText(numberBath);
		    Thread.sleep(3000);
		    WebElement numPar = driver.findElement(locator_numberParking);
		    Select sel14 = new Select(numPar);
		    sel14.selectByVisibleText(numberParking);
		    Thread.sleep(3000);
		    WebElement pisPri = driver.findElement(locator_swimming);
		    Select sel15 = new Select(pisPri);
		    sel15.selectByVisibleText(swimning);
		    Thread.sleep(3000);
		    WebElement pisInm = driver.findElement(locator_floor);
		    Select sel16 = new Select(pisInm);
		    sel16.selectByVisibleText(floor);
		    Thread.sleep(3000);
		    type(valueManagement, locator_valueManagement);
		    Thread.sleep(3000);
		    WebElement cirTv = driver.findElement(locator_tvCircuit);
		    Select sel17 = new Select(cirTv);
		    sel17.selectByVisibleText(tvCircuit);
		    Thread.sleep(3000);
		    WebElement habSer = driver.findElement(locator_serviceRoom);
		    Select sel18 = new Select(habSer);
		    sel18.selectByVisibleText(ServiceRoom);
		    Thread.sleep(3000);
		    WebElement bathSer = driver.findElement(locator_serviceBath);
		    Select sel19 = new Select(bathSer);
		    sel19.selectByVisibleText(serviceBath);
		    Thread.sleep(3000);
		    WebElement zonLav = driver.findElement(locator_laundryArea);
		    Select sel20 = new Select(zonLav);
		    sel20.selectByVisibleText(laundryArea);
		    Thread.sleep(3000);
		    WebElement conChi = driver.findElement(locator_fireplace);
		    Select sel21 = new Select(conChi);
		    sel21.selectByVisibleText(fireplace);
		    Thread.sleep(3000);
		    WebElement perMas = driver.findElement(locator_allowsPets);
		    Select sel22 = new Select(perMas);
		    sel22.selectByVisibleText(allowsPets);
		    Thread.sleep(3000);
		    WebElement tipEst = driver.findElement(locator_typeStove);
		    Select sel23 = new Select(tipEst);
		    sel23.selectByVisibleText(typeStove);
		    Thread.sleep(3000);
		    WebElement tipCal = driver.findElement(locator_typeHeater);
		    Select sel24 = new Select(tipCal);
		    sel24.selectByVisibleText(typeHeater);
		    Thread.sleep(3000);
		    WebElement airAco = driver.findElement(locator_airConditioning);
		    Select sel25 = new Select(airAco);
		    sel25.selectByVisibleText(airConditioning);
		    Thread.sleep(3000);
		    WebElement zonTer = driver.findElement(locator_terraceArea);
		    Select sel26 = new Select(zonTer);
		    sel26.selectByVisibleText(terraceArea);
		    Thread.sleep(3000);
		    type(numberTerrace, locator_numberTerrace);
		    Thread.sleep(3000);
		    type(builtArea, locator_builtArea);
		    Thread.sleep(3000);
		    type(totalArea, locator_totalArea);
		    Thread.sleep(3000);
		    WebElement numBal = driver.findElement(locator_numberBalcony);
		    Select sel30 = new Select(numBal);
		    sel30.selectByVisibleText(numberBalcony);
		    Thread.sleep(3000);
		    WebElement numDep = driver.findElement(locator_numberDeposits);
		    Select sel31 = new Select(numDep);
		    sel31.selectByVisibleText(numberDeposits);
		    Thread.sleep(3000);
		    type(deliverDate, locator_deliverDate);
		    Thread.sleep(3000);
		    WebElement ven = driver.findElement(locator_soldOut);
		    Select sel32 = new Select(ven);
		    sel32.selectByVisibleText(soldOut);
		    Thread.sleep(3000);
		    WebElement tipPar = driver.findElement(locator_typeParking);
		    Select sel33 = new Select(tipPar);
		    sel33.selectByVisibleText(typeParking);
		    Thread.sleep(3000);
		    type(unitsAvailable, locator_unitsAvailable);
		    Thread.sleep(5000);
		    if(kiln.equals("Si") || extractor.equals("Si") || dishwasher.equals("Si")) {
		    	click(locator_homeAppliances);
		    	 if(kiln.equals("Si")) {
				    click(locator_kiln);
				 }
				 if(extractor.equals("Si")) {
					click(locator_extractor);
				 }
				 if(dishwasher.equals("Si")) {
					click(locator_dishwasher);
				 }
		    }
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
	
	public void salesRoom() {
		try {
			Thread.sleep(3000);
			type(nameRoom,locator_nameRoom);
			Thread.sleep(3000);
			type(roomAddress,locator_roomAddress);
			Thread.sleep(3000);
			type(callContactNumber,locator_callContactNumber);
			Thread.sleep(3000);
			type(emailRoom,locator_emailRoom);
			Thread.sleep(3000);
			type(whatsappContactNumber,locator_whatsappContactNumber);
			Thread.sleep(3000);
			type(seller, locator_seller);
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
	
	public void stages() {
		try {
			Thread.sleep(3000);
			type(stage1, locator_stage1);
			Thread.sleep(3000);
			type(openingDate,locator_openingDate);
			Thread.sleep(3000);
			type(closingDate, locator_closingDate);
			Thread.sleep(3000);
			type(additionalInformation, locator_additionalInformation);
			Thread.sleep(3000);
			click(locator_buttonSave);
			Thread.sleep(5000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
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
	
	public void load()  {
		try {
			File file1 = new File("./src/test/resources/img/portada.png");
			File file2 = new File("./src/test/resources/img/arriendo.png");
			File file3 = new File("./src/test/resources/img/Screenshot.png");
			String phat1 = file1.getAbsolutePath();
			String phat2 = file2.getAbsolutePath();
			String phat3 = file3.getAbsolutePath();
			
			driver.findElement(locator_imgProyect).sendKeys(phat1);
			Thread.sleep(8000);
			click(locator_uploadFileProject);
			Thread.sleep(8000);
			click(locator_coverPhoto);
			Thread.sleep(8000);
			driver.findElement(locator_imgProperty).sendKeys(phat2);
			Thread.sleep(8000);
			click(locator_uploadFileProperty);
			Thread.sleep(8000);
			driver.findElement(locator_imgLogoProperty).sendKeys(phat3);
			Thread.sleep(8000);
			click(locator_uploadFileLogoProperty);
			Thread.sleep(8000);
			click(locator_save);
			Thread.sleep(8000);
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(TimeoutException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void validation() {
		try {
			Thread.sleep(8000);
			click(locator_nameProjet);
			Thread.sleep(8000);
			String endArea = driver.findElement(locator_area).getText();
			String sEndArea = endArea.substring(0,2);
			if(builtArea.equals(sEndArea)) {
				System.out.println("El area concuerda con el area ingresados: "+sEndArea);
			}else {
				System.out.println("El area consultada no concuerda con la ingresada");
			}
			String endRoom = driver.findElement(locator_room).getText();
			String sEndRoom = endRoom.substring(0,1);
			if(numberRoom.equals(sEndRoom)) {
				System.out.println("El número de habitaciones concuerda con las ingresadas: "+sEndRoom);
			}else {
				System.out.println("El número de habitaciones consultadas no concuerda con los ingresadas");
			}
			String endBath = driver.findElement(locator_bath).getText();
			String sEndBath = endBath.substring(0,1);
			if(numberBath.equals(sEndBath)) {
				System.out.println("El número de Baños concuerda con los ingresados: "+sEndBath);
			}else {
				System.out.println("El número de baños consultados no concuerda con los ingresados");
			}
		}catch (NoSuchElementException e) {
			System.out.println("Error: "+e);
		}catch(TimeoutException e) {
			System.out.println("Error: "+e);
		}catch(ElementClickInterceptedException e) {
			System.out.println("Error: "+e);
		}catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
}
