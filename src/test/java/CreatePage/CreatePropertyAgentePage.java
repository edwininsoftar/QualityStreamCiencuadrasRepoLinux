package CreatePage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Base.BasicWrap;

public class CreatePropertyAgentePage extends BasicWrap{
	
	//Flujo crear rol Agente
	By locator_into = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	By locator_username = By.xpath("//*[@id=\"mat-input-3\"]");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
	By locator_login = By.cssSelector("span[class=\"ng-star-inserted\"]");
	By locator_user = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]");
	By locator_publishedProperty = By.linkText("Inmuebles publicados");
	By locator_createProperty = By.xpath("/html/body/div[3]/div/section/section/div/div[1]/div[2]/a[1]");
	//Publicación de un inmueble
	By locator_registration = By.id("inmueble-matricula_inmobiliaria");
	By locator_openButton = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[1]/div/div[1]/button");
	By locator_department = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[1]/div/div[1]/div/div/input");
	By locator_openButton2 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[2]/div/div[1]/button");
	By locator_city = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[2]/div/div[1]/div/div/input");
	By locator_openButton3 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[3]/div/div[1]/button");
	By locator_location = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[3]/div/div[1]/div/div/input");
	By locator_openButton4 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[4]/div/div[1]/button");
	By locator_neighborhood = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[3]/div[4]/div/div[1]/div/div/input");
	By locator_openButton5 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[1]/div/button");
	By locator_carrera = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[1]/div/div/ul/li[10]/a/span[1]");
	By locator_calle = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[1]/div/div/ul/li[5]/a/span[1]");
	By locator_avcll2 = By.id("dir2");
	By locator_a = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[3]/div/div/ul/li[2]/a/span[1]");
	By locator_b = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[3]/div/div/ul/li[3]/a/span[1]");
	By locator_openButton6 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[3]/div/button");
	By locator_bis = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[4]/div/div/ul/li[2]/a/span[1]");  
	By locator_este = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[4]/div/div/ul/li[3]/a/span[1]");
	By locator_openButton7 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[4]/div/button");
	By locator_a2 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[5]/div/div/ul/li[2]/a/span[1]");
	By locator_b2 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[5]/div/div/ul/li[3]/a/span[1]");
	By locator_openButton8 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[5]/div/button");
	By locator_sur = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[6]/div/div/ul/li[2]/a/span[1]");
	By locator_norte = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[6]/div/div/ul/li[4]/a/span[1]");
	By locator_openButton9 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[6]/div/button");
	By locator_number = By.id("dir7");
	By locator_a3 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[9]/div/div/ul/li[2]/a/span[1]");
	By locator_b3 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[9]/div/div/ul/li[3]/a/span[1]");
	By locator_openButton10 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[9]/div/button");
	By locator_number2 = By.id("dir9");
	By locator_sur2 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[11]/div/div/ul/li[2]/a/span[1]");
	By locator_norte2 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[11]/div/div/ul/li[4]/a/span[1]");
	By locator_openButton11 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[11]/div/button");
	By locator_apartment = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[14]/div/div/ul/li[2]/a/span[1]");
	By locator_house = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[14]/div/div/ul/li[5]/a/span[1]");
	By locator_openButton12 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[14]/div/button");
	By locator_textComplement = By.id("dir12");
	By locator_apartment2 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[16]/div/div/ul/li[2]/a/span[1]");
	By locator_house2 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[16]/div/div/ul/li[5]/a/span[1]");
	By locator_openButton13 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[4]/div[16]/div/button");
	By locator_textComplement2 = By.id("dir14");
	By loator_buttonAddress = By.id("ocultar_direccion");
	By locator_nickname = By.id("inmueble-apodo");
	//Caracteristicas información basica
	By locator_apartment3 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[1]/div/div[1]/div/ul/li[4]/a/span[1]");
	By locator_house3 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[1]/div/div[1]/div/ul/li[5]/a/span[1]");
	By locator_openButton14 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[1]/div/div[1]/button");
	By locator_sale = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[2]/div/div[1]/div/ul/li[2]/a/span[1]");
	By locator_rent = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[2]/div/div[1]/div/ul/li[3]/a/span[1]");
	By locator_saleOrent = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[2]/div/div[1]/div/ul/li[4]/a/span[1]");
	By locator_openButton15 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[2]/div/div[1]/button");
	//Arriendo
	By locator_stratum2 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[5]/div/div[1]/div/ul/li[2]/a/span[1]");
	By locator_stratum3 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[5]/div/div[1]/div/ul/li[3]/a/span[1]");
	By locator_openButton16 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[5]/div/div[1]/button");
	By locator_area = By.id("inmueble-area_construida");
	By locator_lotArea = By.id("inmueble-area_lote");
	By locator_room = By.id("inmueble-num_habitaciones");
	By locator_bath = By.id("inmueble-num_banos");
	By locator_parking = By.id("inmueble-num_parqueaderos");
	By locator_independent = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[12]/div/div[1]/div/ul/li[1]/a/span[1]");
	By locator_servitude = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[12]/div/div[1]/div/ul/li[2]/a/span[1]");
	By locator_covered = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[12]/div/div[1]/div/ul/li[3]/a/span[1]");
	By locator_discovered = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[12]/div/div[1]/div/ul/li[4]/a/span[1]");
	By locator_communal = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[12]/div/div[1]/div/ul/li[5]/a/span[1]");
	By locator_openButton17 = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[8]/div[12]/div/div[1]/button");
	By locator_valueRent = By.id("inmueble-canon_arrendamiento");
	By locator_buttonAdministration = By.id("incluye_administracion");
	By locator_managementValue = By.id("inmueble-valor_administracion");
	By locator_code = By.id("inmueble-codigo");
	By locator_buttonBrandNew = By.id("para_estrenar");
	By locator_antiquity = By.id("inmueble-antiguedad");
	By locator_floor = By.id("inmueble-num_piso");
	By locator_additionalInformation = By.id("inmueble-info_adicional");
	By locator_buttonSave = By.id("btn-publicar");
	By locator_buttonAccept = By.id("botonMisPublicaciones");
	//Venta 
	By locator_valueSale = By.id("inmueble-precio_venta");
	//Imagenes del inmueble
	By locator_img = By.id("fotos");
	By locator_coverPhoto = By.name("fotoPortada");
	By locator_accept = By.xpath("/html/body/div[17]/div[2]/div/div/div/div/div/div/div/div[4]/button");
	By locator_uploadFile = By.xpath("/html/body/div[3]/div[1]/form/div/div[3]/div/div[1]/div[11]/div[4]/div[5]/div[4]/div[2]/a");
	//Comprobación 
	By locator_codeProperty = By.xpath("/html/body/div[3]/div/section/section/div/div[2]/div/article/div/div[4]/div/div[1]/div[2]/p[1]/span/strong");
	By locator_textCode = By.id("inmueblesearch-codigo");
	By locator_searh = By.xpath("/html/body/div[3]/div/section/section/div/div[1]/div[6]/div[2]/a");
	By locator_endlink = By.xpath("/html/body/div[3]/div/section/section/div/div[2]/div/article[1]/div/div[4]/div/header/div[1]/h4/a");
	By locator_endRoom = By.xpath("/html/body/div[3]/div/section/section/div/div[2]/div/article/div/div[4]/div/div[2]/div/div[1]/p");
	By locator_endBath = By.xpath("/html/body/div[3]/div/section/section/div/div[2]/div/article/div/div[4]/div/div[2]/div/div[2]/p");
	By locator_endM2 = By.xpath("/html/body/div[3]/div/section/section/div/div[2]/div/article/div/div[4]/div/div[2]/div/div[4]/p");
	
	//Flujo crear rol Agente
	String username = "agenteciencuadras1@yopmail.com";
	String password = "@Contraseña112";
	//Publicación de un inmueble
	String registration = "45859674";// Ingrese la matricula inmobiliaria 
	String department = "Boyacá";// ingrese el departamento
	String city = "Sogamoso";//Ingrese la ciudad
	String location = "Sogamoso";//Ingrese la localidad
	String neighborhood = "UPTC";//Ingrese el barrio 
	String avcll = "Calle";//ingrese Carrera o Calle
	String avcll2 = "14";
	String letter = "B";//Ingrese la letra A o B
	String bisEste = "Bis"; //Ingrese Bis o Este
	String letter2 = "A";//Ingrese la letra
	String cardinalPoint = "Sur";//Ingrese el punto cardinal Sur o Norte
	String number = "18";
	String letter3 = "A"; //Ingrese la letra A o B
	String number2 = "20";
	String cardinalPoint2 = "Norte";//Ingrese el punto cardinal Sur o Norte
	String complement = "Casa"; //Ingrese Casa o Apartamento
	String textComplement = "segundo piso";
	String complement2 = "Casa";//Ingrese Casa o Apartamento
	String textComplement2 = "piso2";
	String buttonAddress = "Si";// Ingresi Si o No si decea que la direccion sea visible 
	String nickname = "San calletano";
	//Caracteristicas información basica
	String property = "Casa";//Ingrese Casa y Apartamento
	String transactionType = "Arriendo";//ingrese Arriendo, Venta o Arriendo y Venta
	String stratum = "2";//Ingrese el estrato 2 o 3
	String area = "50";//Ingrese el valor del area en metros cuadrados
	String lotArea = "60";//Ingrese el valor del area en metros cuadrados
	String room = "3";//Ingrese el numero de habitaciones
	String bath = "2";//Ingrese e numero de baños
	String parking = "1";//Ingrese el numero de parqueaderos
	String typeParking1 = "No";//Ingrese Si, si es Independiente 
	String typeParking2 = "Si";//Ingrese Si, si es Servidumbre
	String typeParking3 = "No";//Ingrese Si, si es Cubierto
	String typeParking4 = "Si";//Ingrese Si, si es Descubierto
	String typeParking5 = "No";//Ingrese Si, si es Comunal
	String valueRent = "800000";//Ingrese el valor del canos de arrendamiento 
	String valueSale = "130000000";//Ingrese el valor del inmueble
	String buttonAdministration = "Si";//Ingrese Si o No
	String managementValue = "100000";//Ingrese el valor de la administración 
	String code = "28";//Ingrese el codigo
	String buttonBrandNew = "No";//Ingrese Si o No
	String antiquity = "3";//Ingrese los años de antiguedad
	String floor = "1";//Ingrese el piso 
	String additionalInformation = "amoblado colores frescos";//Ingrese formación adicional
	
	
	public CreatePropertyAgentePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub 
	}
	
	public void login() {
		try {
			Thread.sleep(8000);
			click(locator_into);
			type(username, locator_username);
			type(password, locator_password);
			click(locator_login);
			Thread.sleep(8000);
			click(locator_user);
			click(locator_publishedProperty);
			Thread.sleep(5000);
			click(locator_createProperty);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void propertyPublication() {
		try {
			type(registration, locator_registration);
			Thread.sleep(2000);
			click(locator_openButton);
			Thread.sleep(2000);
			type(department, locator_department);
			WebElement dp = driver.findElement(locator_department);
			dp.sendKeys(Keys.DOWN);	
			dp.sendKeys(Keys.ENTER);	
			Thread.sleep(2000);
			click(locator_openButton2);
			Thread.sleep(2000);
			type(city, locator_city);
			WebElement ci = driver.findElement(locator_city);
			ci.sendKeys(Keys.DOWN);
			ci.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			click(locator_openButton3);
			Thread.sleep(2000);
			type(location, locator_location);
			WebElement lc = driver.findElement(locator_location);
			lc.sendKeys(Keys.DOWN);
			lc.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			click(locator_openButton4);
			Thread.sleep(2000);
			type(neighborhood, locator_neighborhood);
			WebElement br = driver.findElement(locator_neighborhood);
			br.sendKeys(Keys.DOWN);
			br.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			click(locator_openButton5);
			Thread.sleep(2000);
			if(avcll.equals("Carrera")) {
				click(locator_carrera);
			}
			if(avcll.equals("Calle")) {
				click(locator_calle);
			}
			Thread.sleep(2000);
			type(avcll2, locator_avcll2);
			Thread.sleep(2000);
			if(letter.equals("A")) {
				click(locator_openButton6);
				Thread.sleep(2000);
				click(locator_openButton6);
				click(locator_a);
			}
			if(letter.equals("B")) {
				click(locator_openButton6);
				Thread.sleep(2000);
				click(locator_openButton6);
				click(locator_b);
			}
			Thread.sleep(2000);
			if(bisEste.equals("Bis")) {
				click(locator_openButton7);
				click(locator_bis);
			}
			if(bisEste.equals("Este")) {
				click(locator_openButton7);
				click(locator_este);
			}
			Thread.sleep(2000);
			if(letter2.equals("A")) {
				click(locator_openButton8);
				click(locator_a2);
			}
			if(letter2.equals("B")) {
				click(locator_openButton8);
				click(locator_b2);
			}
			Thread.sleep(2000);
			if(cardinalPoint.equals("Sur")) {
				click(locator_openButton9);
				click(locator_sur);
			}
			if(cardinalPoint.equals("Norte")) {
				click(locator_openButton9);
				click(locator_norte);
			}
			Thread.sleep(2000);
			type(number, locator_number);
			Thread.sleep(2000);
			if(letter3.equals("A")) {
				click(locator_openButton10);
				click(locator_a3);
			}
			if(letter3.equals("B")) {
				click(locator_openButton10);
				click(locator_b3);
			}
			Thread.sleep(2000);
			type(number2, locator_number2);
			Thread.sleep(2000);
			if(cardinalPoint2.equals("Sur")) {
				click(locator_openButton11);
				click(locator_sur2);
			}
			if(cardinalPoint2.equals("Norte")) {
				click(locator_openButton11);
				click(locator_norte2);
			}	
			Thread.sleep(2000);
			if(complement.equals("Apartamento")) {
				click(locator_openButton12);
				click(locator_apartment);
			}
			if(complement.equals("Casa")) {
				click(locator_openButton12);
				click(locator_house);
			}
			Thread.sleep(2000);
			type(textComplement, locator_textComplement);
			Thread.sleep(2000);
			if(complement2.equals("Apartamento")) {
				click(locator_openButton13);
				click(locator_apartment2);
			}
			if(complement2.equals("Casa")) {
				click(locator_openButton13);
				click(locator_house2);
			}
			Thread.sleep(2000);
			type(textComplement2, locator_textComplement2);
			Thread.sleep(2000);
			if(buttonAddress.equals("Si")) {
				click(loator_buttonAddress);
			}
			type(nickname, locator_nickname);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void basicInformation() {
		try {
			Thread.sleep(2000);
			if(property.equals("Apartamento")) {
				click(locator_openButton14);
				click(locator_apartment3);
			}
			if(property.equals("Casa")) {
				click(locator_openButton14);
				click(locator_house3);
			}
			Thread.sleep(2000);
			if(transactionType.equals("Arriendo")) {
				click(locator_openButton15);
				click(locator_rent); 
			}
			if(transactionType.equals("Venta")) {
				click(locator_openButton15);
				click(locator_sale);
				Thread.sleep(2000);
				type(valueSale, locator_valueSale);
			}
			if(transactionType.equals("Arriendo y Venta")) {
				click(locator_openButton15);
				click(locator_saleOrent);
				Thread.sleep(2000);
				type(valueSale, locator_valueSale);
			}
			Thread.sleep(2000);
			if(stratum.equals("2")) {
				click(locator_openButton16);
				click(locator_stratum2);
			}
			if(stratum.equals("3")) {
				click(locator_openButton16);
				click(locator_stratum3);
			}
			Thread.sleep(2000);
			type(area, locator_area);
			Thread.sleep(2000);
			type(lotArea, locator_lotArea);
			Thread.sleep(2000);
			type(room, locator_room);
			Thread.sleep(2000);
			type(bath, locator_bath);
			Thread.sleep(2000);
			type(parking, locator_parking);
			Thread.sleep(2000);
			click(locator_openButton17);
			if(typeParking1.equals("Si")) {
				click(locator_independent);
			}
			if(typeParking2.equals("Si")) {
				click(locator_servitude);
			}
			if(typeParking3.equals("Si")) {
				click(locator_covered);
			}
			if(typeParking4.equals("Si")) {
				click(locator_discovered);
			}
			if(typeParking5.equals("Si")) {
				click(locator_communal);
			}
			click(locator_openButton17);
			Thread.sleep(2000);
			if(transactionType.equals("Arriendo") || transactionType.equals("Arriendo y Venta")) {
				Thread.sleep(3000);
				type(valueRent, locator_valueRent);
				Thread.sleep(2000);
				if(buttonAdministration.equals("Si")) {
					click(locator_buttonAdministration);
				}
				if(buttonAdministration.equals("No")) {
					Thread.sleep(2000);
					type(managementValue, locator_managementValue);
				}
			}else {
				Thread.sleep(2000);
				type(managementValue, locator_managementValue);
			}	
			Thread.sleep(2000);
			type(code, locator_code);
			Thread.sleep(2000);
			if(buttonBrandNew.equals("Si")) {
				click(locator_buttonBrandNew);
			}
			if(buttonBrandNew.equals("No")) {
				Thread.sleep(2000);
				type(antiquity, locator_antiquity);
			}
			Thread.sleep(2000);
			type(floor, locator_floor);
			Thread.sleep(2000);
			type(additionalInformation, locator_additionalInformation);
			Thread.sleep(3000);
			click(locator_buttonSave);
			Thread.sleep(2000);
			click(locator_buttonSave);
			Thread.sleep(5000); 
			click(locator_buttonAccept);
		} catch (Exception e) {
			System.out.println("Error: "+e);
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
			
			driver.findElement(locator_img).sendKeys(phat1);
			Thread.sleep(5000);
			driver.findElement(locator_img).sendKeys(phat2);
			Thread.sleep(5000);
			driver.findElement(locator_img).sendKeys(phat3);
			Thread.sleep(5000);
			click(locator_uploadFile);
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			click(locator_coverPhoto);
			Thread.sleep(2000);
			click(locator_buttonSave);
			Thread.sleep(8000);
			click(locator_buttonAccept);
		} catch (Exception e) {
			System.out.println("error: "+e);
		}
	}
	
	public void validation() {
		try {
			Thread.sleep(8000);
			String textCode = driver.findElement(locator_codeProperty).getText();
			type(textCode, locator_textCode);
			Thread.sleep(3000);
			click(locator_searh);
			Thread.sleep(5000);
			String endroom = driver.findElement(locator_endRoom).getText();
			String sEndroom = endroom.substring(0,1);
			if(room.equals(sEndroom)) {
				System.out.println("El número de habitaciones concuerda con las ingresadas: "+sEndroom);
			}else {
				System.out.println("El número de habitaciones consultados no concuerda con los ingresados");
			}
			String endBath = driver.findElement(locator_endBath).getText();
			String sEndBath = endBath.substring(0,1);
			if(bath.equals(sEndBath)) {
				System.out.println("El número de Baños concuerda con los ingresados: "+sEndBath);
			}else {
				System.out.println("El número de baños consultados no concuerda con los ingresados");
			}
			String endM2 = driver.findElement(locator_endM2).getText();
			String sEndM2 = endM2.substring(0,2);
			if(area.equals(sEndM2)) {
				System.out.println("El area concuerda con el area ingresados: "+sEndM2);
			}else {
				System.out.println("El area consultada no concuerda con la ingresada");
			}
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
}
