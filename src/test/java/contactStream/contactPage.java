package contactStream;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class contactPage extends BasicWrap{
	
	By locator_buyNew = By.linkText("COMPRA NUEVO");
	By locator_contact = By.xpath("//*[@id=\"all-content\"]/app-card[2]/div/div/div[2]/div/button[3]");
	By locator_title = By.xpath("//*[@id=\"contactForm\"]/div[1]/h3");
	By locator_name = By.id("name");
	By locator_email = By.id("email");
	By locator_indicative = By
			.xpath("//*[@id=\"contactForm\"]/div[2]/div[4]/div[1]/div/mat-form-field/div/div[1]/div[3]");
	By locator_indicativeColombia = By.xpath("//*[@id=\"mat-option-18\"]/span/span[2]");
	By locator_cellPhone = By.id("cellPhone");
	By locator_schedule = By.id("mat-select-3");
	By locator_monadayFridayam = By.id("mat-option-32");
	By locator_monadayFridaypm = By.id("mat-option-33");
	By locator_weekendam = By.id("mat-option-34");
	By locator_weekendpm = By.id("mat-option-35");
	By locator_livingPlace = By.id("mat-select-4");
	By locator_toInvest = By.id("mat-option-36");
	By locator_toLive = By.id("mat-option-37");
	By locator_toBuy = By.id("mat-select-5");
	By locator_threeMonths = By.id("mat-option-38");
	By locator_sixMonths = By.id("mat-option-39");
	By locator_nineMonths = By.id("mat-option-40");
	By locator_reCapchat = By.xpath
			("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]");
	By locator_captcha = By.xpath("//*[@id=\"recaptcha-anchor\"]");
	By locator_price = By.xpath("//*[@id=\"all-content\"]/app-card[2]/div/div/div[1]/div[1]/h3");
	By locator_builtArea = By.xpath("//*[@id=\"all-content\"]/app-card[2]/div/div/div[1]/div[2]/ul/li[3]");
	By locator_buttonSend = By.xpath("//*[@id=\"contactSalesForm\"]/div[7]/button[1]");

	String name = "fabian corrales"; // Nombre o razon social
	String email = "leonardo2121@yopmail.com";
	String cellPhone = "3123454345";
	String price_property = "$163.000.000 ";
	String area_built = "60 m";
	String customerSupport = "monadayFridayam"; //elige un horario para contactarme monadayFridayam,monadayFridaypm,weekendam,weekendpm 
	String livinPlace = "toLive"; //para que buscas vivienda toInvest, toLive
    String planToBuy = "nineMonths"; // cuando planeas comprar nineMonths,sixMonths,threeMonths
	public contactPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void contactBuyNew() throws InterruptedException {
		try {
			Thread.sleep(6000);
			click(locator_buyNew);
			
			String numText = driver.findElement(locator_price).getText();
		    String numText2 = driver.findElement(locator_builtArea).getText();
		  
			
			if (numText.equals(price_property) && numText2.substring(0).startsWith(area_built)){
				
				
				click(locator_contact);
				Thread.sleep(5000);
				
				type(name, locator_name);
				type(email, locator_email);
				type(cellPhone, locator_cellPhone);
				click(locator_schedule);
				click(locator_monadayFridayam);
				click(locator_livingPlace);
				click(locator_toLive);
				click(locator_toBuy);
				click(locator_nineMonths);
				WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(30));
				ewait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator_reCapchat));
				ewait.until(ExpectedConditions.elementToBeClickable(locator_captcha)).click();
				WebElement cell = driver.findElement(locator_cellPhone);
				cell.sendKeys(Keys.ESCAPE);
				click(locator_buttonSend);
			
				
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


}
