package contactStream;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class contactPage extends BasicWrap{
	
	
	By locator_buyNew = By.linkText("COMPRA NUEVO");
	By locator_builder = By.id("lname");
	By locator_constructoraTuHogar = By.id("mat-option[ng-reflect-value=\"Constructora tu hogar\"]");
	By locator_applyButton = By.id("btn-filter-desktop");
	By locator_cancelar = By.cssSelector("button[class=\"btn cancel\"]");
	By locator_contact1 = By.xpath("//*[@id=\"all-content\"]/app-card[1]/div/div/div[2]/div/button[3]");
	By locator_contact2 = By.xpath("//*[@id=\"all-content\"]/app-card[2]/div/div/div[2]/div/button[3]");
	By locator_contact3 = By.xpath("//*[@id=\"all-content\"]/app-card[3]/div/div/div[2]/div/button[3]");
	By locator_contact4 = By.xpath("//*[@id=\"all-content\"]/app-card[4]/div/div/div[2]/div/button[3]");
	By locator_name = By.id("name");
	By locator_email = By.id("email");
	By locator_cellPhone = By.id("cellPhone");
	By locator_schedule = By.cssSelector("mat-select[formcontrolname=\"contactSchedule\"]");
	By locator_mondayFridayam = By.cssSelector("mat-option[ng-reflect-value=\"Lunes - Viernes / am\"]");
	By locator_mondayFridaypm = By.cssSelector("mat-option[ng-reflect-value=\"Lunes - Viernes / pm\"]");
	By locator_weekendam = By.cssSelector("mat-option[ng-reflect-value=\"Fin de semana / am\"]");
	By locator_weekendpm = By.cssSelector("mat-option[ng-reflect-value=\"Fin de semana / pm\"]");
	By locator_livingPlace = By.cssSelector("mat-select[formcontrolname=\"reasonSeekHousing\"]");
	By locator_toInvest = By.cssSelector("mat-option[ng-reflect-value=\"Para Invertir\"]");
	By locator_toLive = By.cssSelector("mat-option[ng-reflect-value=\"Para Vivir\"]");
	By locator_planToBuy = By.cssSelector("mat-select[formcontrolname=\"expectedTimePurchase\"]");
	By locator_threeMonths = By.cssSelector("mat-option[ng-reflect-value=\"En 3 meses\"]");
	By locator_sixMonths = By.cssSelector("mat-option[ng-reflect-value=\\\"En 6 meses\\\"]\"");
	By locator_nineMonths = By.cssSelector("mat-option[ng-reflect-value=\\\"En 9 meses\\\"]\"");
	By locator_reCapchat = By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]");
	By locator_captcha = By.cssSelector("div[class=\"recaptcha-checkbox-border\"]");
	By locator_buttonSend = By.xpath("//*[@id=\"contactSalesForm\"]/div[7]/button[1]");
	By locator_x = By.xpath("//*[@id=\"detail-contact-sales\"]/button/span/span");
	By locator_enterButton = By.linkText("INGRESAR");
	By locator_user = By.cssSelector("input[formcontrolname=\"username\"]");
	By locator_password = By.cssSelector("input[formcontrolname=\"password\"]");
	By locator_logIn = By.xpath("/html/body/app-root/div/app-login/div/lib-cc-login/div/div/div[3]/form/button/span");
	By locator_menu = By.cssSelector("div[class=\"circle-name\"]");
	By locator_myReports = By.linkText("Mis Reportes");
	By locator_startDate = By.id("fechaDesde");
	By locator_endDate = By.id("fechaHasta");
	By locator_Consult = By.id("btn-submit-home");
	By locator_clickForm = By.id("//*[@id=\"tablaReportes\"]/table/tbody/tr[2]/td[5]");
	
	String Contact = "Contactar1"; //Contactar1,Contactar2,Contactar3,Contactar4,
	String Constructora = "Constructora uno";//nombre de la constructora que va a buscar
	String name = "fabian corrales"; // Nombre o razon social
	String email = "leonardo2121@yopmail.com";
	String cellPhone = "3123454345";
	String customerSupport = "lunes a viernes am"; //elige un horario para contactarme lunes a viernes am,lunes a viernes pm,Fin de semana am,Fin de semana pm 
	String livinPlace = "Para invertir"; //para que buscas vivienda Para invertir, Para vivir
    String planToBuy = "3 meses"; // cuando planeas comprar 3 meses, 6 meses, 9 meses,
    String user = "qa.constructorahogar21@yopmail.com";//usuario de constructora
    String password = "LeonO1O1*";//contraseña
    String startDate = "2022-04-01"; //fecha inicio de reporte
    String endDate = "2022-04-30";// fecha de fin de reporte
    
	public contactPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void contactBuyNew() throws InterruptedException {
		try {
			Thread.sleep(8000);
			click(locator_buyNew);
			
			if(isDisplayed(locator_builder)) {
			WebElement text = driver.findElement(locator_builder);
			type(Constructora, locator_builder);
			Thread.sleep(8000);
			text.sendKeys(Keys.DOWN);
			text.sendKeys(Keys.ENTER);
			click(locator_applyButton);
			Thread.sleep(8000);
			click(locator_cancelar);
			Thread.sleep(8000);
			if (Contact.equals("Contactar1")){
				click(locator_contact1);
			}if (Contact.equals("Contactar2")){
				click(locator_contact2);
			}if (Contact.equals("Contactar3")){
				click(locator_contact3);
			}if (Contact.equals("Contactar4")){
				click(locator_contact4);
			}
			} else {
				System.out.println("no se envio el contactar");
			}
		} catch (NoSuchElementException e) {
			System.out.println("No se encuentra el elemento: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error de tiempo de espera para ejecutar el comando: " + e);
		} catch (Exception e) {
			System.out.println("Error" + e);
		} finally {
			System.out.println("Fin validaciones del contactar");
		}
		
	
	
	}
	
	public void formContact() throws InterruptedException{
		
		try {
			Thread.sleep(8000);
			type(name, locator_name);
			type(email, locator_email);
			type(cellPhone, locator_cellPhone);
			click(locator_schedule);
			if(customerSupport.equals("lunes a viernes am")) {
				click(locator_mondayFridayam);
			}if(customerSupport.equals("lunes a viernes pm")) {
				click(locator_mondayFridaypm);
			}if(customerSupport.equals("Fin de semana am")) {
				click(locator_weekendam);
			}if(customerSupport.equals("Fin de semana pm")) {
				click(locator_weekendpm);
			}
			click(locator_livingPlace);
			if(livinPlace.equals("Para invertir")) {
				click(locator_toInvest);
			}
			if(livinPlace.equals("Para vivir")) {
				click(locator_toLive);
			}
			click(locator_planToBuy);
			if(planToBuy.equals("3 meses")) {
			click(locator_threeMonths);
			}if(planToBuy.equals("6 meses")) {
				click(locator_sixMonths);
			}if(planToBuy.equals("9 meses")) {
				click(locator_nineMonths);
			}
			
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(30));
			ewait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator_reCapchat));
			ewait.until(ExpectedConditions.elementToBeClickable(locator_captcha)).click();
			driver.switchTo().defaultContent();
			
            click(locator_buttonSend);
			Thread.sleep(8000);
			click(locator_x);
		
		} catch (NoSuchElementException e){ 
			System.out.println("No se encuentra el elemento: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error de tiempo de espera para ejecutar el comando: " + e);
		} catch (Exception e) {
			System.out.println("Error" + e);
		} finally {
			System.out.println("Fin validaciones del contactar");
		}
		
		
	}
	public void userBuilder() throws InterruptedException {
		
		try {
		Thread.sleep(8000);
		click(locator_enterButton);
        type(user, locator_user);
        type(password, locator_password);
        click(locator_logIn);
        Thread.sleep(8000);
        click(locator_menu);
        click(locator_myReports);
        WebElement dta = driver.findElement(locator_startDate);
        dta.clear();
		dta.sendKeys(startDate);
        WebElement dtaFin = driver.findElement(locator_endDate);
        dta.clear();
		dta.sendKeys(endDate);
		String numText = driver.findElement(locator_clickForm).getText();
		System.out.println(numText);
		
		}catch(NoSuchElementException e){
			System.out.println("No se encuentra el elemento: " + e);
		}catch(TimeoutException e){
			System.out.println("Error de tiempo de espera para ejecutar el comando: " + e);
		}catch(Exception e){
			System.out.println("Error" + e);
		}finally {
			System.out.println("Fin validaciones del contactar");
		}
		
		
	}


}
