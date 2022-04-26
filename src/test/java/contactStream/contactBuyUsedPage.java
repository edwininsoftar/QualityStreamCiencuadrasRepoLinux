package contactStream;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class contactBuyUsedPage extends BasicWrap {

	// Localizadores para llegar al contactar
	By locator_buyUsed = By.linkText("COMPRA USADO");
	By locator_Offers = By.linkText("OFERTAS");
	By locator_leaseProperty = By.linkText("ARRENDAR INMUEBLE");
	By locator_search = By.id("search");
	By locator_city = By.xpath("/html/body/div[3]/div/div/div/div/mat-optgroup[1]/mat-option/span");
	By locator_contact1 = By.xpath("//*[@id=\"all-content\"]/app-card[1]/div/div/div[2]/div/button[3]");
	By locator_contact2 = By.xpath("//*[@id=\"all-content\"]/app-card[2]/div/div/div[2]/div/button[3]");
	By locator_contact3 = By.xpath("//*[@id=\"all-content\"]/app-card[3]/div/div/div[2]/div/button[3]");
	By locator_contact4 = By.xpath("//*[@id=\"all-content\"]/app-card[4]/div/div/div[2]/div/button[3]");
	By locator_letter1 = By.xpath("//*[@id=\"all-content\"]/app-card[1]/div/div/div[2]/div/div/ul/li[1]/button");
	By locator_letter2 = By.xpath("//*[@id=\"all-content\"]/app-card[2]/div/div/div[2]/div/div/ul/li[1]/button");
	By locator_letter3 = By.xpath("//*[@id=\"all-content\"]/app-card[3]/div/div/div[2]/div/div/ul/li[1]/button");
	By locator_letter4 = By.xpath("//*[@id=\"all-content\"]/app-card[4]/div/div/div[2]/div/div/ul/li[1]/button");
	// Localizadores para llenar el formulario contactar
	By locator_name = By.id("name");
	By locator_email = By.id("email");
	By locator_cellPhone = By.id("celphone");
	By locator_reCapchat = By
			.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]");
	By locator_captcha = By.cssSelector("div[class=\"recaptcha-checkbox-border\"]");
	By locator_buttonSend = By.xpath("//*[@id=\"estateAdvisorForm\"]/div[7]/button/span");
	By locator_x = By
			.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-message-sended/div/div[1]/button/span/span");
	// Localizadores para validar que si se envio el contactar como usuario
	// inmobiliaria
	By locator_enterButton = By.linkText("INGRESAR");
	By locator_user = By.cssSelector("input[formcontrolname=\"username\"]");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
	By locator_logIn = By.xpath("/html/body/app-root/div/app-login/div/lib-cc-login/div/div/div[3]/form/button/span");
	By locator_menu = By.cssSelector("div[class=\"circle-name\"]");
	By locator_myReports = By.linkText("Mis Reportes");
	By locator_startDate = By.id("fechaDesde");
	By locator_endDate = By.id("fechaHasta");
	By locator_Consult = By.id("btn-submit-home");
	By locator_clickForm = By.xpath("/html/body/div[3]/div/section/div/div[3]/div/div[5]/table/tbody/tr[2]/td[5]");

	String resultsContact = "Compra usado"; // para enviar el contactar desde Ofertas, Compra usado, Arrendar inmueble
	String Ciudad = "Tabio"; // ciudad para utilizar en el buscador
	String Contact = "Contactar1"; // Contactar para las primeras 4 card de inmuebles usados
									// "Contactar1,Contactar2,Contactar3,Contactar4"
	String letter = "letter1"; // Contactar para las primeras 4 card de inmuebles usados
								// "letter1,letter2,letter3,letter4"
	String name = "fabian corrales"; // Nombre o razon social
	String email = "leonardo2121@yopmail.com";// correo electronico
	String cellPhone = "3123454345";// celular
	String user = "qa.cieninmuebles21@yopmail.com";// usuario de inmobiliaria
	String password = "Ciencuadras21*";// contraseña
	String startDate = "2022-04-01"; // fecha inicio de reporte
	String endDate = "2022-04-30";// fecha de fin de reporte

	public contactBuyUsedPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void contactBuyUsed() throws InterruptedException {
		try {
			Thread.sleep(8000);
			if (resultsContact.equals("Compra usado")) {
				click(locator_buyUsed);
			}
			if (resultsContact.equals("Ofertas")) {
				click(locator_Offers);
			}
			if (resultsContact.equals("Arrendar inmueble")) {
				click(locator_leaseProperty);
			}
			Thread.sleep(8000);
			type(Ciudad, locator_search);
			Thread.sleep(8000);
			click(locator_city);
			Thread.sleep(8000);
			if (Contact.equals("Contactar1")) {
				click(locator_contact1);
			}
			if (Contact.equals("Contactar2")) {
				click(locator_contact2);
			}
			if (Contact.equals("Contactar3")) {
				click(locator_contact3);
			}
			if (Contact.equals("Contactar4")) {
				click(locator_contact4);
			}
			Thread.sleep(10000);
			if (letter.equals("letter1")) {
				click(locator_letter1);
			}
			if (letter.equals("letter2")) {
				click(locator_letter2);
			}
			if (letter.equals("letter3")) {
				click(locator_letter3);
			}
			if (letter.equals("letter4")) {
				click(locator_letter4);
			} 
		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error: " + e);
		} catch (Exception e) {
			System.out.println("Error:"+ e);
		}

	}

	public void formContact() throws InterruptedException {

		try {
			Thread.sleep(8000);
			type(name, locator_name);
			type(email, locator_email);
			type(cellPhone, locator_cellPhone);

			Thread.sleep(10000);
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(30));
			ewait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator_reCapchat));
			ewait.until(ExpectedConditions.elementToBeClickable(locator_captcha)).click();
			driver.switchTo().defaultContent();
			Thread.sleep(8000);
			click(locator_buttonSend);
			Thread.sleep(10000);
			click(locator_x);

		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error: " + e);
		} catch (Exception e) {
			System.out.println("Error:" +e);
		} 
	}

	public void userRealEstate() throws InterruptedException {

		try {
			Thread.sleep(8000);
			click(locator_enterButton);
			type(user, locator_user);
			type(password, locator_password);
			click(locator_logIn);
			Thread.sleep(8000);
			click(locator_menu);
			click(locator_myReports);
			Thread.sleep(8000);
			WebElement dta = driver.findElement(locator_startDate);
			dta.clear();
			dta.sendKeys(startDate);
			WebElement dtaFin = driver.findElement(locator_endDate);
			dtaFin.clear();
			dtaFin.sendKeys(endDate);
			Thread.sleep(5000);
			click(locator_Consult);
			Thread.sleep(30000);
			String numText = driver.findElement(locator_clickForm).getText();
			System.out.println("Numero de contactos registrados: " + numText);

		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error: " + e);
		} catch (Exception e) {
			System.out.println("Error" + e);
		} 

	}

}
