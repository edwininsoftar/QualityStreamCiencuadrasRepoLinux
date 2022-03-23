package registerStream;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class RegisterPage extends BasicWrap {

	By locator_into = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	By locator_register = By.linkText("Regístrate");
	By locator_persona = By.xpath("//*[@id=\"mat-radio-2\"]/label/div[2]");
	By locator_agente = By.xpath("//*[@id=\"mat-radio-3\"]/label/div[2]");
	By locator_inmobiliaria = By.xpath("//*[@id=\"mat-radio-4\"]/label/div[2]");
	By locator_constructora = By.xpath("//*[@id=\"mat-radio-5\"]/label/div[2]");
	By locator_name = By.cssSelector("input[formcontrolname=\"name\"]");
	By locator_email = By.cssSelector("input[formcontrolname=\"email\"] ");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
	By locator_confirmPass = By.cssSelector("input[formcontrolname=\"confirmPass\"]");
	By locator_identification = By.cssSelector("input[formcontrolname=\"identification\"]");
	By locator_typeDocument = By.cssSelector("mat-select[role=combobox][formcontrolname=\"identificationType\"]");
	By locator_typeDocumentNit = By.cssSelector("mat-option[value=\"2\"]>span[class=\"mat-option-text\"]");
	By locator_typeDocumentCC = By.cssSelector("mat-option[value=\"1\"]>span[class=\"mat-option-text\"]");
	By locator_Dv = By.cssSelector("input[formcontrolname=\"checkDigit\"]");
	By locator_ButtonRegister = By.xpath("//*[@id=\"mat-dialog-2\"]/lib-cc-register/div/div/div[3]/form/button/span");
	By locator_reCapchat = By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]");
	By locator_captcha = By.cssSelector("div[class=\"recaptcha-checkbox-border\"]");

	
	String roll = "Agente"; // Persona, Agente, Inmobiliaria, Constructora
	String typeDocument = "NIT";// NIT, CC
	String name = "Juan Fernando Perez";// Nombre o razon social
	String email = "pruebaciencuadras1@yopmail.com";
	String password = "@Password13";// contraseña y confirmación de contraseña
	String identification = "1057593777";// Numero de identificación o Nit
	String DV = "8";// digito de verificación obligatorio si el tipo de documento es NIT

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void registerRoll() throws InterruptedException {
		try {
			Thread.sleep(6000);
			click(locator_into);
			click(locator_register);
			if (roll.equals("Persona") || roll.equals("Agente")) {
				if (roll.equals("Persona")) {
					click(locator_persona);
				} else {
					click(locator_agente);
					if(typeDocument.equals("CC")) {
						click(locator_typeDocument);
						click(locator_typeDocumentCC);
					}
					if(typeDocument.equals("NIT")) {
						click(locator_typeDocument);
						click(locator_typeDocumentNit);
					}
					type(identification,locator_identification);
				}
				if (typeDocument.equals("NIT")) {
					type(DV, locator_Dv);
				}
				type(name, locator_name);	
				type(email, locator_email);
				WebElement emailTab = driver.findElement(locator_email);
				emailTab.sendKeys(Keys.TAB);
				type(password, locator_password);
				WebElement passwordTab = driver.findElement(locator_password);
				passwordTab.sendKeys(Keys.TAB);
				type(password, locator_confirmPass);
			}
			if (roll.equals("Inmobiliaria") || roll.equals("Constructora")) {
				if (roll.equals("Inmobiliaria")) {
					click(locator_inmobiliaria);
				} else {
					click(locator_constructora);
				}
				type(name, locator_name);
				type(identification, locator_identification);
				type(DV, locator_Dv);
				type(email, locator_email);
				WebElement emailTab = driver.findElement(locator_email);
				emailTab.sendKeys(Keys.TAB);	
				type(password, locator_password);
				WebElement passwordTab = driver.findElement(locator_password);
				passwordTab.sendKeys(Keys.TAB);
				type(password,locator_confirmPass);
			}
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(30));
			ewait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator_reCapchat));
			ewait.until(ExpectedConditions.elementToBeClickable(locator_captcha)).click();
			click(locator_ButtonRegister);
		} catch (NoSuchElementException e) {
			System.out.println("No se encuentra el elemento: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error de tiempo de espera para ejecutar el comando: " + e);
		} catch (Exception e) {
			System.out.println("Error" + e);
		} finally {
			System.out.println("Fin validaciones Roll Persona");
		}
	}

}
