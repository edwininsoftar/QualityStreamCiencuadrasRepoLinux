package serviceToolsStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CertificateRequest_Test {
	private WebDriver driver;
	CertificateRequestPage certificateRequestPage;

	@Before
	public void setUp() throws Exception {
		certificateRequestPage = new CertificateRequestPage(driver);
		driver = certificateRequestPage.chromeDriverConnection();
		certificateRequestPage.visit("https://dev.ciencuadras.com/"); 
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		certificateRequestPage.inquiryForm();
	}

}
