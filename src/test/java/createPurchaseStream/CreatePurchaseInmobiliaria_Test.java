package createPurchaseStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CreatePurchaseInmobiliaria_Test {
	
	private WebDriver driver;
	CreatePurchasePageInmobiliaria createPurchasePageInmobiliaria;
	
	@Before
	public void setUp() throws Exception {
		createPurchasePageInmobiliaria = new CreatePurchasePageInmobiliaria(driver);
		driver = createPurchasePageInmobiliaria.chromeDriverConnection();
		createPurchasePageInmobiliaria.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		createPurchasePageInmobiliaria.buys();
		createPurchasePageInmobiliaria.formMonths();
		createPurchasePageInmobiliaria.paymentSelection();
		createPurchasePageInmobiliaria.billingData();
		createPurchasePageInmobiliaria.payFinish();
		createPurchasePageInmobiliaria.purchaseDetail();
	}

}
