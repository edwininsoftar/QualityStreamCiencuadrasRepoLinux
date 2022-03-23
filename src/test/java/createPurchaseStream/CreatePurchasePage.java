package createPurchaseStream;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Base.BasicWrap;

public class CreatePurchasePage extends BasicWrap {

	public CreatePurchasePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By locator_into = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	By locator_username = By.xpath("//*[@id=\"mat-input-3\"]");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
	By locator_login = By.cssSelector("span[class=\"ng-star-inserted\"]");
	By locator_public = By.cssSelector("span[_ngcontent-serverapp-c114][class=\"link\"]");
	By locator_person = By.name("persona");
	By locator_publicTu = By.cssSelector("a[class=\"card-item__link\"]");
	By locator_postYour = By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-options-content/div/div[2]/section/article[1]/div[4]/button");
	By locator_postRealEstate= By.xpath("//*[@id=\"cdk-step-content-0-0\"]/app-options-content/div/div[2]/section/article[2]/div[4]/button");
	By locator_free = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-publication-plans/div/div/div/div/div[2]/owl-carousel/owl-carousel-child/div[1]/div/div[1]/div/button");	
	By locator_standard = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-publication-plans/div/div/div/div/div[2]/owl-carousel/owl-carousel-child/div[1]/div/div[2]/div/button");
    By locator_premium = By.xpath("//*[@id=\"cdk-step-content-0-1\"]/app-publication-plans/div/div/div/div/div[2]/owl-carousel/owl-carousel-child/div[1]/div/div[3]/div/button");
	By locator_propertyType = By.xpath("//*[@id=\"propertyTypeId\"]/div/div[1]");	
	By locator_rent = By.xpath("//*[@id=\"mat-button-toggle-22-button\"]/div/span");
	By locator_sale = By.xpath("//*[@id=\"mat-button-toggle-51-button\"]/div/span");
	By locator_value = By.xpath("//*[@id=\"leasingFee\"]");
	By locator_managementNo = By.xpath("//*[@id=\"form_elem\"]/label/div/div/div[1]");
	By locator_managementSi = By.xpath("//*[@id=\"form_elem\"]/label/div/div/div[2]");
	By locator_managementValue = By.xpath("//*[@id=\"administrationValue\"]");
	By locator_saleValue = By.xpath("//*[@id=\"sellingPrice\"]");
	By locator_yearsOfAntiguaty = By.xpath("//*[@id=\"antiquity\"]");
	By locator_propertydescription = By.cssSelector("textarea[_ngcontent-c7]");
	By locator_stratumOne = By.xpath("//*[@id=\"mat-button-toggle-4-button\"]/div");
	By locator_stratumTow = By.xpath("//*[@id=\"mat-button-toggle-5-button\"]/div");
	By locator_stratumThree = By.xpath("//*[@id=\"mat-button-toggle-6-button\"]/div");
	By locator_stratumFour = By.xpath("//*[@id=\"mat-button-toggle-7-button\"]/div");
	By locator_stratumFive = By.xpath("//*[@id=\"mat-button-toggle-8-button\"]/div");
	By locator_stratumSix = By.xpath("//*[@id=\"mat-button-toggle-9-button\"]/div");
	By locator_squareMeter = By.xpath("//*[@id=\"builtArea\"]");
	By locator_room = By.name("numBedRooms");
	By locator_NToilets = By.name("numBathrooms");
	By locator_NParking = By.name("numParking");
    By locator_city = By.name("ciudad");
    By locator_neighborhood = By.xpath("//*[@id=\"barrio\"]");
    By locator_direction = By.xpath("//*[@id=\"address\"]");
    By locator_addaddress = By.xpath("//*[@id=\"addressComplement\"]");
    By locator_propertyLocation = By.xpath("//*[@id=\"dirCheckAddress\"]/label/div");
    By locator_NWhatsapp = By.xpath("//*[@id=\"cellphone\"]");
    By locator_contactMeWhatsapp = By.xpath("//*[@id=\"celularCheckWhatsapp\"]/label/div");
    By locator_contactMeCall = By.xpath("//*[@id=\"checkLlamada\"]/label/div");
    By locator_continue = By.cssSelector("div[class=\"pass-buttons desktop-btn\"]>div[class=\"pass-buttons-styles\"]>button[class=\"btn btn-default ng-star-inserted\"]");
    By locator_img = By.id("ngx-input-file-0");
    By locator_continueTow = By.cssSelector("div[_ngcontent-c7][class=\"pass-buttons desktop-btn\"]>div[class=\"pass-buttons-styles\"]>button[class=\"btn btn-default\"]");
    By locator_topay = By.xpath("//*[@id=\"payment-data\"]/div/div/button");
    By locator_topay2 = By.cssSelector("app-payment-data[_ngcontent-pgu-c0][_nghost-pgu-c6][ng-reflect-data-pay=\"[object Object]\"][ng-reflect-car-detail=\"[object Object]\"][ng-reflect-user-id=\"45673839\"][ng-reflect-gateway-code=\"[object Object]\"][ng-reflect-token-external=\"40HobcfBzO73DqfaXuB2\"][ng-reflect-is-unregistered-user=\"false\"][ng-reflect-products=\"[object Object]\"][ng-reflect-pay-methods][ng-reflect-portal-name=\"Ciencuadras\"][ng-reflect-iva-summatory=\"0\"][ng-reflect-customization=\"[object Object]\"][class=\"ng-star-inserted\"]>div[id=\"payment-data\"]>div[class=\"action\"]>div[class=\"btn_enlace\"]>button[class=\"btn-secondary block ng-star-inserted\"]");
    
	String username = "juanlag4545@yopmail.com";
	String password = "Ciencuadras21*";
	String popstType = "Tu";//Tu, Inmobiliaria
	String planType = "Gratis"; //Gratis,Estandar
	String propertyType = "Apartamento"; // Apartamento
	String transactionType = "Arriendo";// Arriendo
	String value = "800000";//ingrese el valor renta del inmueble
	String management = "No"; //ingrese si incluye administraci�n - No,Si
	String managementValue = "100000"; //Valor obligatorio si management = No
	String saleValue = "150000000";// ingrese el valor del inmuuebleen venta
	String yearsOfAntiguaty = "3";// Ingree a�os de antiguedad
	String propertyDescription = "Closed cosina integral zona de labado";//ingrese descripci�n del inmueble
	String stratum = "3";//ingrese el estarto de 1 a 6
	String squareMeter = "52"; // Ingrese los metros cuadrados del inmueble
	String room = "3 ";//ingrese el numero de abitaciones
	String Ntoilets = "2"; // Ingrese el numero de ba�os del inmueble
	String NParking = "2"; // Ingrese numero de parqueaderos
	String city = "Bogot� (Cundinamarca)"; // Ingrese la ciudad del inmueble
	String neighborhood = "Prado Veraniego Norte - Suba - Bogot�  (Cundinamarca)"; // Ingrese el barrio del inmueble
	String direction = "Calle 128C Bis # 52-53"; // Ingrese la direcci�n del inmueble
	String addaddress = "Piso 2"; // Complemento de direcci�n 
	String Nwhatsapp = "3202589674"; // Ingrese numero de whatsapp
	String contactMe = "Whatsapp"; // Whatsapp, Llamada
	
	public void buys() throws InterruptedException {
		try {
			Thread.sleep(6000);
			click(locator_into);
			type(username, locator_username);
			type(password, locator_password);
			click(locator_login);
			Thread.sleep(5000);
			click(locator_public);
			click(locator_person);
			click(locator_publicTu);
			if(popstType.equals("Tu")) {
				Thread.sleep(5000);
				click(locator_postYour);
				if(planType.equals("Gratis")) {
					click(locator_free);
				}
				if(planType.equals("Estandar")) {
					click(locator_standard);
				}
			}else {
				click(locator_postRealEstate);
			}
			
		} catch (Exception e) {
			System.out.println("error: " + e);
		}
	}
	
	public void purchaseForm() throws InterruptedException {
		try {
			if(transactionType.equals("Arriendo")) {
				type(value, locator_value);
				if(management.equals("Si")) {
					Actions action = new Actions(driver);
					WebElement source = driver.findElement(locator_managementNo);
					WebElement target = driver.findElement(locator_managementSi);
					action.dragAndDrop(source, target);
					action.dragAndDropBy(source, 0, 0);
					action.moveToElement(source).moveToElement(target).perform();
					action.release();
				}
				if(management.equals("No")){
					type(managementValue, locator_managementValue);
				}
			}
			type(yearsOfAntiguaty, locator_yearsOfAntiguaty);

			type(propertyDescription, locator_propertydescription);
			
			if(stratum.equals("1")) {
				click(locator_stratumOne);
			}
			if(stratum.equals("2")) {
				click(locator_stratumTow);
			}
			if(stratum.equals("3")) {
				click(locator_stratumThree);
			}
			if(stratum.equals("4")) {
				click(locator_stratumFour);
			}
			if(stratum.equals("5")) {
				click(locator_stratumFive);
			}
			if(stratum.equals("6")) {
				click(locator_stratumSix);
			}
			type(squareMeter, locator_squareMeter);
			WebElement roomClear = driver.findElement(locator_room);
			roomClear.clear();
			type(room, locator_room);
			WebElement toiletsClear = driver.findElement(locator_NToilets);
			toiletsClear.clear();
			type(Ntoilets, locator_NToilets);
			WebElement parkingClear = driver.findElement(locator_NParking);
			parkingClear.clear();
			type(NParking, locator_NParking);
			WebElement citytab = driver.findElement(locator_city);
			citytab.sendKeys(Keys.TAB);
			type(city, locator_city);
			Thread.sleep(3000);
			type(neighborhood, locator_neighborhood);
			WebElement neighborhoodTab = driver.findElement(locator_neighborhood);
			neighborhoodTab.sendKeys(Keys.TAB);
			Thread.sleep(3000);
			type(direction, locator_direction);
			type(addaddress, locator_addaddress);
			click(locator_propertyLocation);
			type(Nwhatsapp, locator_NWhatsapp);
			if(contactMe.equals("Whatsapp")) {
				click(locator_contactMeWhatsapp);
			}
			if(contactMe.equals("Llamada")){
				click(locator_contactMeCall);
			}
			Thread.sleep(2000);
			click(locator_continue);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	public void load() throws InterruptedException {
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
			click(locator_continueTow);
		} catch (Exception e) {
			System.out.println("error: "+e);
		}
	}
	public void topay() throws InterruptedException {
		try {
			Thread.sleep(5000);
			click(locator_topay);
		} catch (Exception e) {
			System.out.println("error: "+ e);
		}

	}
}
