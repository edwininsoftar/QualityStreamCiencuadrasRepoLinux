package CreatePage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CreatePropertyInmobiliaria_Test {
	
	private WebDriver driver;
	CreatePropertyInmobiliariaPage createPropertyInmobiliariaPage;

	@Before
	public void setUp() throws Exception {
		createPropertyInmobiliariaPage = new CreatePropertyInmobiliariaPage(driver);
		driver = createPropertyInmobiliariaPage.chromeDriverConnection();
		createPropertyInmobiliariaPage.visit("https://qa.ciencuadras.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		createPropertyInmobiliariaPage.login();
		createPropertyInmobiliariaPage.propertyPublication();
		createPropertyInmobiliariaPage.basicInformation();
		createPropertyInmobiliariaPage.load();
		createPropertyInmobiliariaPage.validation();
	}

}
