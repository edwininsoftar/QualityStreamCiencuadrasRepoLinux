package contactStream;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class contactBuyUsedPage extends BasicWrap{
	
	//Localizadores para llegar al contactar
	By locator_buyUsed = By.linkText("COMPRA USADO");
	By locator_search = By.id("search");
	
	
	String Ciudad = "Cúcuta"; // ciudad para utilizar en el buscador

	public contactBuyUsedPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void contactBuyUsed() throws InterruptedException {
		try {
			Thread.sleep(8000);
			click(locator_buyUsed);
			Thread.sleep(8000);
			WebElement ciudad = driver.findElement(locator_search);
			type(Ciudad, locator_search);
			Thread.sleep(8000);
			/*text.sendKeys(Keys.DOWN);
			text.sendKeys(Keys.ENTER);
			click(locator_applyButton);
			Thread.sleep(8000);
			click(locator_cancelar);
			Thread.sleep(10000);
			if(Contact.equals("Contactar1")){
				click(locator_contact1);
			}if (Contact.equals("Contactar2")){
				click(locator_contact2);
			}if (Contact.equals("Contactar3")){
				click(locator_contact3);
			}if (Contact.equals("Contactar4")){
				click(locator_contact4);
			} else {
				System.out.println("no se envio el contactar");
			}*/
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
