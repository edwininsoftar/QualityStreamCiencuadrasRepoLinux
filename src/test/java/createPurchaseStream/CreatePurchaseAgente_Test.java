package createPurchaseStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CreatePurchaseAgente_Test {
	private WebDriver driver;
	CreatePurchasePageAgente CreatePurchasePageAgente;

	@Before
	public void setUp() throws Exception {
		CreatePurchasePageAgente = new CreatePurchasePageAgente(driver);
		driver = CreatePurchasePageAgente.chromeDriverConnection();
		CreatePurchasePageAgente.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test()throws InterruptedException {
		CreatePurchasePageAgente.buys();
		CreatePurchasePageAgente.formMonths();
		CreatePurchasePageAgente.paymentSelection();
		CreatePurchasePageAgente.payFinish();
		CreatePurchasePageAgente.purchaseDetail();
	}

}
