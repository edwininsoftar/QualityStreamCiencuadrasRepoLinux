package serviceToolsStream;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BasicWrap;

public class CertificateRequestPage extends BasicWrap{
	
	//Solicita tu certificado 
	By locator_buttonCertificateRequest = By.xpath("/html/body/app-root/app-home/app-cards-services/section/owl-carousel-o/div/div[1]/owl-stage/div/div/div[3]/div/div[1]/div/div[2]/a"); 
	By locator_zoneSelect = By.id("mat-input-0");
	By locator_property_registration = By.id("mat-input-2");
	By locator_reCapchat = By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]");
	By locator_captcha = By.id("recaptcha-anchor");
	By locator_buttonContinue = By.xpath("//*[@id=\"cdk-step-content-0-0\"]/ccct-query-zone/div/ccct-query-zone-search/div/form/div[4]/button[2]");
	
	String zone = "MEDELLIN SUR - 001";// Ingrese la zona
	String propertyRegistration = "434944";//Ingrese el numero de matricula inmobiliaria 
	
	public CertificateRequestPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void inquiryForm() throws InterruptedException {
		try {
			Thread.sleep(8000);
			click(locator_buttonCertificateRequest);
			Thread.sleep(5000);
			//new tab
			String mainTab = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for (String actual: handles) {
				if(!actual.equalsIgnoreCase(mainTab)) {
					driver.switchTo().window(actual);
				}
			}
			WebElement zn = driver.findElement(locator_zoneSelect);
			Select sel = new Select(zn);
			sel.selectByVisibleText(zone);
			type(propertyRegistration, locator_property_registration);
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(30));
			ewait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator_reCapchat));
			ewait.until(ExpectedConditions.elementToBeClickable(locator_captcha)).click();
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			click(locator_buttonContinue);
		} catch (Exception e) {
			System.out.println("Error: "+e);
		}
	}
}
