package contactStream;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import Base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class contactPage extends BasicWrap{
	
	By locator_buyNew = By.linkText("Compra nuevo");
	By locator_contact = By.xpath("//*[@id=\"all-content\"]/app-card[2]/div/div/div[2]/div/button[3]");
	By locator_title = By.xpath("//*[@id=\"contactForm\"]/div[1]/h3");
	By locator_name = By.id("name");
	By locator_email = By.id("email");
	By locator_indicative = By
			.xpath("//*[@id=\"contactForm\"]/div[2]/div[4]/div[1]/div/mat-form-field/div/div[1]/div[3]");
	By locator_indicativeColombia = By.xpath("//*[@id=\"mat-option-18\"]/span/span[2]");
	By locator_cellPhone = By.id("cellPhone");
	By locator_schedule = By.cssSelector(
			"div[class=\"mat-form-field-infix\"]>mat-select[class=\"mat-select ng-tns-c29-21 mat-select-empty ng-pristine ng-valid ng-star-inserted ng-touched\"]");
	By locator_monadayFridayam = By.id("mat-option-32");
	By locator_livingPlace = By.cssSelector(
			"div[class=\"mat-form-field-infix\"]>mat-select[class=\"mat-select ng-tns-c29-184 mat-select-empty ng-pristine ng-valid ng-star-inserted ng-touched\"]");
	By locator_toLive = By.id("mat-option-37");
	By locator_toBuy = By.cssSelector(
			"div[class=\"mat-form-field-infix\"]>mat-select[class=\"mat-select ng-tns-c29-186 mat-select-empty ng-pristine ng-valid ng-star-inserted ng-touched\"]");
	By locator_inNineMonths = By.id("mat-option-40");
	By locator_captcha = By.cssSelector("div.rc-anchor-content");
	By locator_price = By.xpath("//*[@id=\"all-content\"]/app-card[2]/div/div/div[1]/div[1]/h3");
	By locator_builtArea = By.xpath("//*[@id=\"all-content\"]/app-card[2]/div/div/div[1]/div[2]/ul/li[3]");
	By locator_buttonSend = By.xpath("//*[@id=\"contactSalesForm\"]/div[7]/button[1]");

	String name = "fabian corrales"; // Nombre o razon social
	String email = "leonardo2121@yopmail.com";
	String cellPhone = "3123454345";
	

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
			
			if (numText.equals("$163.000.000") && numText2.equals("60 m")) {
				click(locator_contact);
				Thread.sleep(5000);

				type(name, locator_name);
				type(email, locator_email);
				type(cellPhone, locator_cellPhone);
				click(locator_indicative);
				click(locator_indicativeColombia);
				type(cellPhone, locator_cellPhone);
				click(locator_schedule);
				click(locator_monadayFridayam);
				click(locator_livingPlace);
				click(locator_toBuy);
				click(locator_inNineMonths);
				click(locator_captcha);
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
			System.out.println("Fin validacionesdel contactar");
		}
		
	
	
	}


}
